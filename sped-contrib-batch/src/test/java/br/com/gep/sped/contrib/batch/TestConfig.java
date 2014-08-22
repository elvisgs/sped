package br.com.gep.sped.contrib.batch;

import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ComponentScan(excludeFilters =
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = AppConfig.class))
public class TestConfig {

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .addScripts(
                        "classpath:org/springframework/batch/core/schema-drop-hsqldb.sql",
                        "classpath:org/springframework/batch/core/schema-hsqldb.sql",
                        "classpath:sped_contrib_teste_hsqldb.sql")
                .setType(EmbeddedDatabaseType.HSQL)
                .build();
    }

    @Bean
    public JobLauncherTestUtils jobLauncherTestUtils() {
        return new JobLauncherTestUtils();
    }
}
