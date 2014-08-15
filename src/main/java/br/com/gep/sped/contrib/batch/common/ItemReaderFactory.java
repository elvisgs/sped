package br.com.gep.sped.contrib.batch.common;

import br.com.gep.sped.contrib.batch.config.DatabaseConfig;
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

    public <T> JdbcCursorItemReader<T> createJdbcCursorItemReader(Class<T> regClass, Class<?> parentClass, String sql) {
        JdbcCursorItemReader<T> reader = new JdbcCursorItemReader<T>();
        reader.setDataSource(databaseConfig.dataSource());
        reader.setSql(replaceSchema(sql));
        reader.setRowMapper(new BeanPropertyRowMapper<T>(regClass));

        if (parentClass != null) {
            reader.setPreparedStatementSetter(new ParentIdStatementSetter(parentClass, regIdHolder));
        }

        return reader;
    }

    public <T> JdbcCursorItemReader<T> createJdbcCursorItemReader(Class<T> regClass, String sql) {
        return createJdbcCursorItemReader(regClass, null, sql);
    }

    public String replaceSchema(String sql) {
        return sql.replaceAll(SCHEMA_TOKEN, SCHEMA);
    }
}
