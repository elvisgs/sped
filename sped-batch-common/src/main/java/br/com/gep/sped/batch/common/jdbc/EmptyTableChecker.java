package br.com.gep.sped.batch.common.jdbc;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.PagingQueryProvider;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
@StepScope
@RequiredArgsConstructor
public class EmptyTableChecker {

    private final InfrastructureConfig infraConfig;
    private final QueryPartsProvider queryPartsProvider;
    private final SchemaInjector schemaInjector;

    public boolean isEmpty(Class<? extends Registro> regClass) {
        QueryParts queryParts = queryPartsProvider.getQueryParts(regClass);

        SqlPagingQueryProviderFactoryBean factory = new SqlPagingQueryProviderFactoryBean();
        factory.setDataSource(infraConfig.getDataSource());
        factory.setSelectClause("SELECT 1");
        factory.setFromClause(queryParts.getFrom());
        factory.setSortKey("1");
        PagingQueryProvider provider;

        try {
            provider = factory.getObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String sql = provider.generateFirstPageQuery(1);
        sql = schemaInjector.injectSchema(sql);

        try {
            jdbcTemplate().queryForObject(sql, Integer.class);
        } catch (EmptyResultDataAccessException e) {
            return true;
        }

        return false;
    }

    private JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(infraConfig.getDataSource());
    }
}
