package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;

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

    public Estabelecimento obterUnico() {
        String sql = new SchemaInjector(schema).injectSchema(selectQuery);
        sql = removerClausulaWhere(sql);

        return jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Estabelecimento.class));
    }

    public Estabelecimento obterUnico(String cnpj) {
        Assert.hasText(cnpj, "cnpj não deve ser nulo ou vazio");

        String sql = new SchemaInjector(schema).injectSchema(selectQuery);

        return jdbcTemplate.queryForObject(sql,
                BeanPropertyRowMapper.newInstance(Estabelecimento.class),
                cnpj);
    }

    public List<Estabelecimento> obterTodos() {
        String sql = new SchemaInjector(schema).injectSchema(selectQuery);
        sql = removerClausulaWhere(sql);

        return jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Estabelecimento.class));
    }

    private String removerClausulaWhere(String sql) {
        int index = sql.toUpperCase().indexOf("WHERE");
        if (index != -1)
            return sql.substring(0, index + 1);

        return sql;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(dataSource, "dataSource não deve ser nulo");
        Assert.hasText(selectQuery, "selectQuery não deve ser nula ou vazia");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
