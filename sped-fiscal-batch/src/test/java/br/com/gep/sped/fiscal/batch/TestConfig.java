package br.com.gep.sped.fiscal.batch;

import br.com.gep.sped.batch.common.SpedLauncher;
import br.com.gep.sped.batch.common.config.InfrastructureConfig;
import br.com.gep.sped.batch.common.support.BeansByLayoutVersionConfigurer;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
import java.nio.charset.StandardCharsets;

@Configuration
@Primary
@ComponentScan(
    basePackageClasses = {TestConfig.class, SpedLauncher.class}
)
public class TestConfig implements InfrastructureConfig {

    @Autowired
    protected BeansByLayoutVersionConfigurer versionConfigurer;

    @Value("classpath:/schemas/schema-drop-hsqldb.sql")
    private Resource batchSpedSchemaDrop;

    @Value("classpath:org/springframework/batch/core/schema-drop-hsqldb.sql")
    private Resource batchSchemaDrop;

    @Value("classpath:org/springframework/batch/core/schema-hsqldb.sql")
    private Resource batchSchema;

    @Value("classpath:/schemas/schema-hsqldb.sql")
    private Resource batchSpedSchema;

    @Value("classpath:sped_fiscal_test_schema.sql")
    private Resource spedSchema;

    @Value("classpath:sped_fiscal_test_data.sql")
    private Resource spedData;

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

        configureLayoutVersion();
    }

    protected void configureLayoutVersion() {
        versionConfigurer.configure("010");
    }

    @Bean
    public DataSourceInitializer dataSourceInitializer() {
        DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(getDataSource());
        initializer.setDatabasePopulator(getDatabasePopulator());
        initializer.afterPropertiesSet();
        return initializer;
    }

    protected DatabasePopulator getDatabasePopulator() {
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator(
            batchSpedSchemaDrop, batchSchemaDrop, batchSchema,
            batchSpedSchema, spedSchema, spedData);
        populator.setSqlScriptEncoding(StandardCharsets.UTF_8.displayName());

        return populator;
    }

    @Override
    @Bean
    public DataSource getDataSource() {
        return dataSource;
    }

    @Bean
    @Lazy
    public JobLauncherTestUtils jobLauncherTestUtils() {
        return new JobLauncherTestUtils();
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
}
