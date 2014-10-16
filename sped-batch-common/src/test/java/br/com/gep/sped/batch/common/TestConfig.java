package br.com.gep.sped.batch.common;

import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.jdbc.support.SpedExecutionDaoFactoryBean;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Configuration
@ComponentScan
@EnableBatchProcessing
public class TestConfig implements InfrastructureConfig {

    @Value("classpath:/schemas/schema-drop-hsqldb.sql")
    private Resource batchSpedSchemaDrop;

    @Value("classpath:org/springframework/batch/core/schema-drop-hsqldb.sql")
    private Resource batchSchemaDrop;

    @Value("classpath:org/springframework/batch/core/schema-hsqldb.sql")
    private Resource batchSchema;

    @Value("classpath:/schemas/schema-hsqldb.sql")
    private Resource batchSpedSchema;

    @Value("classpath:common-tests.sql")
    private Resource commonSchema;

    private DataSource dataSource;

    @PostConstruct
    protected void initialize() {
        // http://stackoverflow.com/a/24689709
        dataSource = new DriverManagerDataSource() {{
            setDriverClassName("org.hsqldb.jdbcDriver");
            setUrl("jdbc:hsqldb:mem:testdb;sql.enforce_strict_size=true;hsqldb.tx=mvcc");
            setUsername("sa");
            setPassword("");
        }};
    }

    @Bean
    public DataSourceInitializer dataSourceInitializer() {
        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(getDataSource());
        initializer.setDatabasePopulator(getDatabasePopulator());
        initializer.afterPropertiesSet();
        return initializer;
    }

    private DatabasePopulator getDatabasePopulator() {
        return new ResourceDatabasePopulator(
                commonSchema, batchSpedSchemaDrop, batchSchemaDrop, batchSchema,
                batchSpedSchema);
    }

    @Override
    @Bean
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    @Bean
    public TaskExecutor getTaskExecutor() {
        return new SyncTaskExecutor();
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public SpedExecutionDao spedExecutionDao() throws Exception {
        SpedExecutionDaoFactoryBean factory = new SpedExecutionDaoFactoryBean();
        factory.setDataSource(getDataSource());
        factory.afterPropertiesSet();

        return factory.getObject();
    }
}
