package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.jdbc.LateParentIdJdbcPagingItemReader;
import br.com.gep.sped.contrib.batch.jdbc.ParentIdStatementSetter;
import br.com.gep.sped.contrib.batch.jdbc.QueryParts;
import br.com.gep.sped.contrib.batch.jdbc.QueryPartsProvider;
import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class ItemReaderFactory {

    private static final Log logger = LogFactory.getLog(ItemReaderFactory.class);

    public static final String SCHEMA = "sped_contrib_teste";//"carga_15103047000158_2014_03";//
    public static final String SCHEMA_TOKEN = "@schema@";

    @Autowired
    private DataSource dataSource;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private QueryPartsProvider queryPartsProvider;

    public <R extends RegBase, P extends RegBase> ItemStreamReader<R> create(Class<R> regClass, Class<P> parentRegClass) {
        String regName = regClass.getSimpleName();
        if (regName.endsWith("000") || regName.endsWith("001"))
            return createCursorItemReader(regClass, parentRegClass);

        return createPagingItemReader(regClass, parentRegClass);
    }

    public <R extends RegBase> ItemStreamReader<R> create(Class<R> regClass) {
        return create(regClass, null);
    }

    private <R extends RegBase, P extends RegBase> ItemStreamReader<R> createCursorItemReader(Class<R> regClass, Class<P> parentRegClass) {
        JdbcCursorItemReader<R> reader = new JdbcCursorItemReader<R>();
        reader.setDataSource(dataSource);

        String sql = queryPartsProvider.getQueryParts(regClass).toString();
        reader.setSql(injectSchema(sql));

        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        if (parentRegClass != null) {
            reader.setPreparedStatementSetter(new ParentIdStatementSetter(parentRegClass, regIdHolder));
        }

        return reader;
    }

    private <R extends RegBase, P extends RegBase> ItemStreamReader<R> createPagingItemReader(Class<R> regClass, Class<P> parentRegClass) {
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

        try {
            reader.setQueryProvider(queryProviderFactory.getObject());
        } catch (Exception e) {
            logger.error("Can't create paging query provider", e);
        }

        reader.setPageSize(Constants.CHUNK_SIZE);
        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        try {
            reader.afterPropertiesSet();
        } catch (Exception e) {
            logger.error("Can't create item reader for class " + regClass.toString(), e);
        }

        return reader;
    }

    private String injectSchema(String sql) {
        return sql.replaceAll(SCHEMA_TOKEN, SCHEMA + ".");
    }
}
