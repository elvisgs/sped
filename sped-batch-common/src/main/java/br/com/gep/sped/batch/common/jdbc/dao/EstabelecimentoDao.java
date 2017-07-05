package br.com.gep.sped.batch.common.jdbc.dao;

import br.com.gep.sped.batch.common.jdbc.SchemaInjector;
import br.com.gep.sped.batch.common.jdbc.entity.Estabelecimento;
import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;

public class EstabelecimentoDao implements InitializingBean {

    private @Setter DataSource dataSource;
    private @Setter String selectQuery;
    private @Setter String schema;
    private NamedParameterJdbcTemplate jdbcTemplate;

    public Estabelecimento obterUnico() {
        String sql = new SchemaInjector(schema).injectSchema(selectQuery);
        sql = removerClausulaWhere(sql);

        return jdbcTemplate.queryForObject(sql, new EmptySqlParameterSource(),
            BeanPropertyRowMapper.newInstance(Estabelecimento.class));
    }

    public Estabelecimento obterUnico(String cnpj) {
        Assert.hasText(cnpj, "cnpj não deve ser nulo ou vazio");

        String sql = new SchemaInjector(schema).injectSchema(selectQuery);

        return jdbcTemplate.queryForObject(sql,
            new MapSqlParameterSource("cnpj", cnpj),
            BeanPropertyRowMapper.newInstance(Estabelecimento.class));
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

        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
}
