package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.ParentIdStatementSetter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.common.Selects;
import br.com.gep.sped.contrib.batch.config.DatabaseConfig;
import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.springframework.batch.item.ItemStreamReader;
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

    public <R extends RegBase, P extends RegBase> ItemStreamReader<R> create(Class<R> regClass, Class<P> parentRegClass) {
        return create(regClass, parentRegClass, selects.get(regClass));
    }

    public <R extends RegBase> ItemStreamReader<R> create(Class<R> regClass) {
        return create(regClass, null, selects.get(regClass));
    }

    private <R extends RegBase, P extends RegBase> ItemStreamReader<R> create(Class<R> regClass, Class<P> parentRegClass, String sql) {
        JdbcCursorItemReader<R> reader = new JdbcCursorItemReader<R>();
        reader.setDataSource(databaseConfig.dataSource());
        reader.setSql(replaceSchema(sql));
        reader.setRowMapper(new BeanPropertyRowMapper<R>(regClass));

        if (parentRegClass != null) {
            reader.setPreparedStatementSetter(new ParentIdStatementSetter(parentRegClass, regIdHolder));
        }

        return reader;
    }

    private String replaceSchema(String sql) {
        return sql.replaceAll(SCHEMA_TOKEN, SCHEMA);
    }
}
