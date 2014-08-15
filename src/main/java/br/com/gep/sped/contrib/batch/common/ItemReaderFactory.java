package br.com.gep.sped.contrib.batch.common;

import br.com.gep.sped.contrib.batch.config.DatabaseConfig;
import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

@Component
public class ItemReaderFactory {

    public static final String SCHEMA = "sped_contrib_teste";
    public static final String SCHEMA_TOKEN = "@schema@";

    @Autowired
    private DatabaseConfig databaseConfig;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private Selects selects;

    public <R extends RegBase, P extends RegBase> JdbcCursorItemReader<R> createJdbcCursorItemReader(Class<R> regClass, Class<P> parentClass, String sql) {
        JdbcCursorItemReader<R> reader = new JdbcCursorItemReader<R>();
        reader.setDataSource(databaseConfig.dataSource());
        reader.setSql(replaceSchema(sql));
        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        if (parentClass != null) {
            reader.setPreparedStatementSetter(new ParentIdStatementSetter(parentClass, regIdHolder));
        }

        return reader;
    }

    public <R extends RegBase> JdbcCursorItemReader<R> createJdbcCursorItemReader(Class<R> regClass, String sql) {
        return createJdbcCursorItemReader(regClass, null, sql);
    }

    public <R extends RegBase, P extends RegBase> JdbcCursorItemReader<R> createJdbcCursorItemReader(Class<R> regClass, Class<P> parentClass) {
        return createJdbcCursorItemReader(regClass, parentClass, selects.get(regClass));
    }

    public <R extends RegBase> JdbcCursorItemReader<R> createJdbcCursorItemReader(Class<R> regClass) {
        return createJdbcCursorItemReader(regClass, null, selects.get(regClass));
    }

    public String replaceSchema(String sql) {
        return sql.replaceAll(SCHEMA_TOKEN, SCHEMA);
    }
}
