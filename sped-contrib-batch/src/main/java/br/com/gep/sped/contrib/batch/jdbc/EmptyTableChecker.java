package br.com.gep.sped.contrib.batch.jdbc;

import br.com.gep.sped.contrib.batch.config.InfrastructureConfig;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.database.PagingQueryProvider;
import org.springframework.batch.item.database.support.SqlPagingQueryProviderFactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
@StepScope
public class EmptyTableChecker implements InitializingBean {

    private InfrastructureConfig infraConfig;
    private QueryPartsProvider queryPartsProvider;
    private SchemaInjector schemaInjector;
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setInfraConfig(InfrastructureConfig infraConfig) {
        this.infraConfig = infraConfig;
        jdbcTemplate = new JdbcTemplate(infraConfig.getDataSource());
    }

    @Autowired
    public void setQueryPartsProvider(QueryPartsProvider queryPartsProvider) {
        this.queryPartsProvider = queryPartsProvider;
    }

    @Autowired
    public void setSchemaInjector(SchemaInjector schemaInjector) {
        this.schemaInjector = schemaInjector;
    }

    public boolean isEmpty(Class<? extends Registro> regClass) throws Exception {
        QueryParts queryParts = queryPartsProvider.getQueryParts(regClass);

        SqlPagingQueryProviderFactoryBean factory = new SqlPagingQueryProviderFactoryBean();
        factory.setDataSource(infraConfig.getDataSource());
        factory.setSelectClause("SELECT 1");
        factory.setFromClause(queryParts.getFrom());
        factory.setSortKey("1");
        PagingQueryProvider provider = factory.getObject();
        String sql = provider.generateFirstPageQuery(1);
        sql = schemaInjector.injectSchema(sql);

        try {
            jdbcTemplate.queryForObject(sql, Integer.class);
        } catch (EmptyResultDataAccessException e) {
            return true;
        }

        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(queryPartsProvider, "queryPartsProvider não deve ser nulo");
        Assert.notNull(infraConfig, "infraConfig não deve ser nulo");
        Assert.notNull(schemaInjector, "schemaInjector não deve ser nulo");
    }
}
