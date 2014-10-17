package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;

public class EstabelecimentoDao implements InitializingBean {

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

    public Estabelecimento getPrimeiro() {
        String sql = new SchemaInjector(schema).injectSchema(selectQuery);

        return jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Estabelecimento.class));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(dataSource, "dataSource não deve ser nulo");
        Assert.hasText(selectQuery, "selectQuery não deve ser nula ou vazia");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
