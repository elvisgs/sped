package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.contrib.batch.config.InfrastructureConfig;
import br.com.gep.sped.contrib.batch.config.StandaloneConfig;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
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
@Primary
@ComponentScan(excludeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        value = {StandaloneConfig.class, StandaloneConfigTest.class}))
public class TestInfrastructureConfig implements InfrastructureConfig {

    @Value("classpath:/schemas/schema-drop-hsqldb.sql")
    private Resource batchSpedSchemaDrop;

    @Value("classpath:org/springframework/batch/core/schema-drop-hsqldb.sql")
    private Resource batchSchemaDrop;

    @Value("classpath:org/springframework/batch/core/schema-hsqldb.sql")
    private Resource batchSchema;

    @Value("classpath:/schemas/schema-hsqldb.sql")
    private Resource batchSpedSchema;

    @Value("classpath:sped_contrib_teste_hsqldb.sql")
    private Resource spedSchema;

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
        initializer.setDataSource(spedDataSource());
        initializer.setDatabasePopulator(getDatabasePopulator());
        initializer.afterPropertiesSet();
        return initializer;
    }

    private DatabasePopulator getDatabasePopulator() {
        return new ResourceDatabasePopulator(
                batchSpedSchemaDrop, batchSchemaDrop, batchSchema,
                batchSpedSchema, spedSchema);
    }

    @Override
    @Bean(name = "spedDataSourceTest")
    public DataSource spedDataSource() {
        return dataSource;
    }

    @Override
    @Bean(name = "batchDataSourceTest")
    public DataSource batchDataSource() {
        return dataSource;
    }

    @Bean
    public JobLauncherTestUtils jobLauncherTestUtils() {
        return new JobLauncherTestUtils();
    }

    @Override
    @Bean(name = "taskExecutorTest")
    public TaskExecutor taskExecutor() {
        return new SyncTaskExecutor();
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(batchDataSource());
    }
}
