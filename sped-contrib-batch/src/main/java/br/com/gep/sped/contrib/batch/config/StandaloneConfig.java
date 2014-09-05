package br.com.gep.sped.contrib.batch.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:sped-batch.properties")
public class StandaloneConfig implements InfrastructureConfig {

    @Autowired
    private Environment env;

    @Override
    @Bean
    public DataSource spedDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("sped.jdbc.driver"));
        dataSource.setUrl(env.getProperty("sped.jdbc.url"));
        dataSource.setUsername(env.getProperty("sped.jdbc.user"));
        dataSource.setPassword(env.getProperty("sped.jdbc.password"));

        return dataSource;
    }

    @Override
    @Bean
    public DataSource batchDataSource() {
        String spedJdbcUrl = env.getProperty("sped.jdbc.url", "");
        String batchJdbcUrl = env.getProperty("batch.jdbc.url", "");

        if ("".equals(batchJdbcUrl) || spedJdbcUrl.equals(batchJdbcUrl))
            return spedDataSource();

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("batch.jdbc.driver"));
        dataSource.setUrl(batchJdbcUrl);
        dataSource.setUsername(env.getProperty("batch.jdbc.user"));
        dataSource.setPassword(env.getProperty("batch.jdbc.password"));

        return dataSource;
    }

    @Override
    @Bean
    public TaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(env.getProperty("batch.taskExecutor.corePoolSize", Integer.class, 4));
        taskExecutor.setMaxPoolSize(env.getProperty("batch.taskExecutor.maxPoolSize", Integer.class, 4));
        taskExecutor.afterPropertiesSet();
        return taskExecutor;
    }
}
