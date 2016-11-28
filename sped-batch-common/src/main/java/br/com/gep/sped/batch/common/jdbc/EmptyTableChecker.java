package br.com.gep.sped.batch.common.jdbc;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.PagingQueryProvider;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.sql.DataSource;

@Component
@StepScope
@RequiredArgsConstructor
public class EmptyTableChecker implements InitializingBean {

    private final DataSource dataSource;
    private final QueryPartsProvider queryPartsProvider;
    private final SchemaInjector schemaInjector;

    public boolean isEmpty(Class<? extends Registro> regClass) throws Exception {
        QueryParts queryParts = queryPartsProvider.getQueryParts(regClass);

        SqlPagingQueryProviderFactoryBean factory = new SqlPagingQueryProviderFactoryBean();
        factory.setDataSource(dataSource);
        factory.setSelectClause("SELECT 1");
        factory.setFromClause(queryParts.getFrom());
        factory.setSortKey("1");
        PagingQueryProvider provider = factory.getObject();
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
        return new JdbcTemplate(dataSource);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(queryPartsProvider, "queryPartsProvider não deve ser nulo");
        Assert.notNull(dataSource, "dataSource não deve ser nulo");
        Assert.notNull(schemaInjector, "schemaInjector não deve ser nulo");
    }
}
