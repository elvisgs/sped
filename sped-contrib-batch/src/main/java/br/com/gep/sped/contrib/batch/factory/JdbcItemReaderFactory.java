package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.config.InfrastructureConfig;
import br.com.gep.sped.contrib.batch.jdbc.QueryParts;
import br.com.gep.sped.contrib.batch.jdbc.QueryPartsProvider;
import br.com.gep.sped.contrib.batch.jdbc.SchemaInjector;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.AbstractLazyCreationTargetSource;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Component
public class JdbcItemReaderFactory implements ItemReaderFactory {

    @Autowired
    private InfrastructureConfig infraConfig;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Autowired
    private SchemaInjector schemaInjector;

    @Override
    public <R extends Registro, P extends Registro> ItemStreamReader<R> create(final Class<R> regClass, final Class<P> parentRegClass) throws Exception {
        // retorna um lazy proxy, pois o item reader utiliza o SchemaInjector e o RegIdHolder que são job scoped
        // e só serão instanciados durante a execução do job

        //noinspection unchecked
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
    public <R extends Registro> ItemStreamReader<R> create(Class<R> regClass) throws Exception {
        return create(regClass, null);
    }

    private <R extends Registro, P extends Registro> ItemStreamReader<R> createCursorItemReader(Class<R> regClass, final Class<P> parentRegClass) throws Exception {
        JdbcCursorItemReader<R> reader = new JdbcCursorItemReader<R>();
        reader.setDataSource(infraConfig.spedDataSource());

        String sql = queryPartsProvider.getQueryParts(regClass).toString();
        reader.setSql(schemaInjector.injectSchema(sql));

        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        if (parentRegClass != null) {
            reader.setPreparedStatementSetter(new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement preparedStatement) throws SQLException {
                    preparedStatement.setInt(1, regIdHolder.getId(parentRegClass));
                }
            });
        }

        reader.afterPropertiesSet();

        return reader;
    }

    private <R extends Registro, P extends Registro> ItemStreamReader<R> createPagingItemReader(Class<R> regClass, Class<P> parentRegClass) throws Exception {
        JdbcPagingItemReader<R> reader = new JdbcPagingItemReader<R>();
        reader.setDataSource(infraConfig.spedDataSource());

        QueryParts queryParts = queryPartsProvider.getQueryParts(regClass);
        SqlPagingQueryProviderFactoryBean queryProviderFactory = new SqlPagingQueryProviderFactoryBean();
        queryProviderFactory.setDataSource(infraConfig.spedDataSource());
        queryProviderFactory.setSelectClause(queryParts.getSelect());
        String fromClause = schemaInjector.injectSchema(queryParts.getFrom());
        queryProviderFactory.setFromClause(fromClause);

        if (parentRegClass != null) {
            queryProviderFactory.setWhereClause(queryParts.getWhere());

            Map<String, Object> params = new HashMap<String, Object>();
            params.put("1", regIdHolder.getId(parentRegClass));
            reader.setParameterValues(params);
        }

        queryProviderFactory.setSortKey("id");

        reader.setQueryProvider(queryProviderFactory.getObject());

        reader.setPageSize(Constants.CHUNK_SIZE);
        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        reader.afterPropertiesSet();

        return reader;
    }

    private <T> T createLazyProxy(Class<T> type, TargetSource targetSource) {
        ProxyFactory factory = new ProxyFactory();
        factory.setTargetSource(targetSource);
        factory.addAdvice(new PassthruAdvice());
        factory.setInterfaces(new Class<?>[]{type});
        @SuppressWarnings("unchecked")
        T proxy = (T) factory.getProxy();

        return proxy;
    }

    private class PassthruAdvice implements MethodInterceptor {

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            return invocation.proceed();
        }
    }
}
