package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.jdbc.LateParentIdJdbcPagingItemReader;
import br.com.gep.sped.contrib.batch.jdbc.ParentIdStatementSetter;
import br.com.gep.sped.contrib.batch.jdbc.QueryParts;
import br.com.gep.sped.contrib.batch.jdbc.QueryPartsProvider;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class JdbcItemReaderFactory implements ItemReaderFactory {
    public static final String SCHEMA = "public";
    public static final String SCHEMA_TOKEN = "@schema@";

    @Autowired
    private DataSource dataSource;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    @Override
    public <R extends Registro, P extends Registro> ItemStreamReader<R> create(Class<R> regClass, Class<P> parentRegClass) throws Exception {
        String regName = regClass.getSimpleName();
        if (regName.endsWith("000") || regName.endsWith("001"))
            return createCursorItemReader(regClass, parentRegClass);

        return createPagingItemReader(regClass, parentRegClass);
    }

    @Override
    public <R extends Registro> ItemStreamReader<R> create(Class<R> regClass) throws Exception {
        return create(regClass, null);
    }

    private <R extends Registro, P extends Registro> ItemStreamReader<R> createCursorItemReader(Class<R> regClass, Class<P> parentRegClass) throws Exception {
        JdbcCursorItemReader<R> reader = new JdbcCursorItemReader<R>();
        reader.setDataSource(dataSource);

        String sql = queryPartsProvider.getQueryParts(regClass).toString();
        reader.setSql(injectSchema(sql));

        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        if (parentRegClass != null) {
            reader.setPreparedStatementSetter(new ParentIdStatementSetter(parentRegClass, regIdHolder));
        }

        reader.afterPropertiesSet();

        return reader;
    }

    private <R extends Registro, P extends Registro> ItemStreamReader<R> createPagingItemReader(Class<R> regClass, Class<P> parentRegClass) throws Exception {
        JdbcPagingItemReader<R> reader;
        if (parentRegClass != null) {
            reader = new LateParentIdJdbcPagingItemReader(parentRegClass, regIdHolder);
        }
        else {
            reader = new JdbcPagingItemReader<R>();
        }

        reader.setDataSource(dataSource);

        QueryParts queryParts = queryPartsProvider.getQueryParts(regClass);
        SqlPagingQueryProviderFactoryBean queryProviderFactory = new SqlPagingQueryProviderFactoryBean();
        queryProviderFactory.setDataSource(dataSource);
        queryProviderFactory.setSelectClause(queryParts.getSelect());
        queryProviderFactory.setFromClause(injectSchema(queryParts.getFrom()));

        if (parentRegClass != null)
            queryProviderFactory.setWhereClause(queryParts.getWhere());

        queryProviderFactory.setSortKey("id");

        reader.setQueryProvider(queryProviderFactory.getObject());

        reader.setPageSize(Constants.CHUNK_SIZE);
        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        reader.afterPropertiesSet();

        return reader;
    }

    private String injectSchema(String sql) {
        return sql.replaceAll(SCHEMA_TOKEN, SCHEMA + ".");
    }
}
