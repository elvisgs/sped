package br.com.gep.sped.contrib.batch.jdbc.dao;

import br.com.gep.sped.contrib.batch.jdbc.SchemaInjector;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;

public class Reg0000Dao implements InitializingBean {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private String selectQuery;
    private String schema;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setSelectQuery(String query) {
        this.selectQuery = query;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Reg0000 getUnique() {
        String sql = selectQuery;
        if (schema != null) {
            sql = new SchemaInjector(schema).injectSchema(selectQuery);
        }

        return jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Reg0000.class));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(dataSource, "dataSource não deve ser nulo");
        Assert.hasText(selectQuery, "selectQuery não deve ser nula ou vazia");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
