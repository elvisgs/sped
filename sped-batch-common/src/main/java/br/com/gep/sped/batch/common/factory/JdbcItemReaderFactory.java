package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.RegIdHolder;
import br.com.gep.sped.batch.common.SpedProperties;
import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.QueryParts;
import br.com.gep.sped.batch.common.jdbc.QueryPartsProvider;
import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.marshaller.common.Registro;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.AbstractLazyCreationTargetSource;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class JdbcItemReaderFactory implements ItemReaderFactory {

    @Autowired
    private BeanFactory beanFactory;

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Autowired
    private SchemaInjector schemaInjector;

    @Autowired
    private SpedProperties spedProperties;

    @Autowired
    private IRowMapperFactory IRowMapperFactory;

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Registro, P extends Registro> ItemStreamReader<R> create(
        Class<R> regClass, Class<P> parentRegClass) {

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
                String regName = regClass.getSimpleName();

                // se o registro é abertura de arquivo (0000) ou abertura de bloco (*001),
                // retorna um cursor, pois não há necessidade de paginação
                if (isAberturaArquivo(regName) || isAberturaBloco(regName))
                    return createCursorItemReader(regClass, parentRegClass);

                return createPagingItemReader(regClass, parentRegClass);
            }
        });
    }

    private boolean isAberturaBloco(String regName) {
        return regName.endsWith("001");
    }

    private boolean isAberturaArquivo(String regName) {
        return regName.endsWith("000");
    }

    @Override
    public <R extends Registro> ItemStreamReader<R> create(Class<R> regClass) {
        return create(regClass, null);
    }

    public <R extends Registro, P extends Registro> JdbcCursorItemReader<R> createCursorItemReader(
        Class<R> regClass, Class<P> parentRegClass) throws Exception {

        JdbcCursorItemReader<R> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(infraConfig.getDataSource());

        String sql = queryPartsProvider.getQueryParts(regClass).toString();
        reader.setSql(schemaInjector.injectSchema(sql));

        reader.setRowMapper(createRowMapper(regClass));

        if (parentRegClass != null) {
            reader.setPreparedStatementSetter(preparedStatement ->
                preparedStatement.setInt(1, regIdHolder.getId(parentRegClass)));
        }

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }

    public <R extends Registro, P extends Registro> JdbcPagingItemReader<R> createPagingItemReader(
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

        if (parentRegClass != null) {
            Map<String, Object> params = new HashMap<>();
            params.put("1", regIdHolder.getId(parentRegClass));
            reader.setParameterValues(params);
        }

        reader.setPageSize(spedProperties.getChunkSize());
        reader.setRowMapper(createRowMapper(regClass));

        reader.setSaveState(false);
        reader.afterPropertiesSet();

        return reader;
    }

    private <R extends Registro> RowMapper<R> createRowMapper(Class<R> regClass) {
        try {
            return IRowMapperFactory.create(regClass);
        }
        catch (ClassNotFoundException e) {
            return new BeanPropertyRowMapper<>(regClass);
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
