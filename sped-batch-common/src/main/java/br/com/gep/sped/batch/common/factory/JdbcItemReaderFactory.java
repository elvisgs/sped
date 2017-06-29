package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.config.SpedProperties;
import br.com.gep.sped.batch.common.filters.CompositeReadFilter;
import br.com.gep.sped.batch.common.jdbc.QueryParts;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.batch.common.support.RegIdHolder;
import br.com.gep.sped.batch.common.support.SpedJobParameters;
import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.AbstractLazyCreationTargetSource;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class JdbcItemReaderFactory implements ItemReaderFactory {

    private final BeanFactory beanFactory;
    private final InfrastructureConfig infraConfig;
    private final RegIdHolder regIdHolder;
    private final QueryPartsProvider queryPartsProvider;
    private final SchemaInjector schemaInjector;
    private final SpedProperties spedProperties;
    private final IRowMapperFactory rowMapperFactory;
    private final CompositeReadFilter readFilter;
    private final SpedJobParameters spedJobParameters;

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Registro, P extends Registro> ItemStreamReader<R> create(Class<R> regClass, Class<P> parentRegClass) {
        // Procura uma implementação específica de item reader que esteja registrada na Bean Factory.
        // A classe ou bean deve usar a convenção de nome [rR]egXXXXItemReader
        String beanName = regClass.getSimpleName().replaceFirst("^R", "r") + "ItemReader";
        if (beanFactory.containsBean(beanName))
            return beanFactory.getBean(beanName, ItemStreamReader.class);

        // retorna um lazy proxy, pois o item reader utiliza o SchemaInjector e o RegIdHolder que são job scoped
        // e só serão instanciados durante a execução do job
        return createLazyProxy(ItemStreamReader.class, new AbstractLazyCreationTargetSource() {
            @Override
            protected Object createObject() throws Exception {
                if (!readFilter.shouldRead(regClass))
                    return new NoOpItemStreamReader<>();

                return createPagingItemReader(regClass, parentRegClass);
            }
        });
    }

    @Override
    public <R extends Registro> ItemStreamReader<R> create(Class<R> regClass) {
        return create(regClass, null);
    }

    private <R extends Registro, P extends Registro> JdbcPagingItemReader<R> createPagingItemReader(
        Class<R> regClass, Class<P> parentRegClass) throws Exception {

        JdbcPagingItemReader<R> reader = new JdbcPagingItemReader<>();
        reader.setDataSource(infraConfig.getDataSource());

        QueryParts queryParts = queryPartsProvider.getQueryParts(regClass);
        SqlPagingQueryProviderFactoryBean queryProviderFactory = new SqlPagingQueryProviderFactoryBean();
        queryProviderFactory.setDataSource(infraConfig.getDataSource());

        String selectClause = schemaInjector.injectSchema(queryParts.getSelect());
        queryProviderFactory.setSelectClause(selectClause);

        String fromClause = schemaInjector.injectSchema(queryParts.getFrom());
        queryProviderFactory.setFromClause(fromClause);

        queryProviderFactory.setWhereClause(queryParts.getWhere());

        queryProviderFactory.setGroupClause(queryParts.getGroupBy());

        String sortKey = queryParts.getOrderBy();
        queryProviderFactory.setSortKey(sortKey != null ? sortKey : "id");

        reader.setQueryProvider(queryProviderFactory.getObject());

        Map<String, Object> params = getSqlParams(parentRegClass, queryParts);
        reader.setParameterValues(params);

        reader.setPageSize(spedProperties.getChunkSize());
        reader.setRowMapper(createRowMapper(regClass));

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }

    private <P extends Registro> Map<String, Object> getSqlParams(Class<P> parentRegClass, QueryParts queryParts) {
        Map<String, Object> params = new HashMap<>();
        String sql = queryParts.toString();
        boolean cnpjParamIsPresent = sql.contains(":cnpj");
        boolean cnpjPaiParamIsPresent = sql.contains(":cnpj_pai");
        boolean idPaiParamIsPresent = sql.contains(":id_pai");

        if (cnpjParamIsPresent) params.put("cnpj", spedJobParameters.getCnpj());
        if (cnpjPaiParamIsPresent) params.put("cnpj_pai", spedJobParameters.getCnpj());
        if (idPaiParamIsPresent) params.put("id_pai", regIdHolder.getId(parentRegClass));

        return params;
    }

    private <R extends Registro> RowMapper<R> createRowMapper(Class<R> regClass) throws Exception {
        try {
            return rowMapperFactory.create(regClass);
        }
        catch (Exception e) {
            if (e instanceof ClassNotFoundException) {
                return new BeanPropertyRowMapper<>(regClass);
            }

            throw e;
        }
    }

    @SuppressWarnings("unchecked")
    private <T> T createLazyProxy(Class<T> type, TargetSource targetSource) {
        ProxyFactory factory = new ProxyFactory();
        factory.setTargetSource(targetSource);
        factory.addAdvice(new PassthruAdvice());
        factory.setInterfaces(type);

        return (T) factory.getProxy();
    }

    private class PassthruAdvice implements MethodInterceptor {

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            return invocation.proceed();
        }
    }
}
