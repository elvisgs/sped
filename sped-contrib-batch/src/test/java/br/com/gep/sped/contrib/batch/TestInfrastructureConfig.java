package br.com.gep.sped.contrib.batch;

import br.com.gep.sped.contrib.batch.config.InfrastructureConfig;
import br.com.gep.sped.contrib.batch.config.StandaloneConfig;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@Primary
@ComponentScan(excludeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        value = {StandaloneConfig.class, StandaloneConfigTest.class}))
public class TestInfrastructureConfig implements InfrastructureConfig {

    @Override
    @Bean(name = "spedDataSourceTest")
    public DataSource spedDataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScripts(
                        "classpath:org/springframework/batch/core/schema-drop-hsqldb.sql",
                        "classpath:org/springframework/batch/core/schema-hsqldb.sql",
                        "classpath:sped_contrib_teste_hsqldb.sql")
                .setType(EmbeddedDatabaseType.HSQL)
                .build();
    }

    @Override
    @Bean(name = "batchDataSourceTest")
    public DataSource batchDataSource() {
        return spedDataSource();
    }

    @Bean
    public JobLauncherTestUtils jobLauncherTestUtils() {
        return new JobLauncherTestUtils();
    }
}
