package br.com.gep.sped.contrib.batch.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:sped-batch.properties")
public class StandaloneConfig implements InfrastructureConfig {

    @Autowired
    private Environment env;

    @Override
    @Bean
    public DataSource dataSource() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(env.getProperty("sped.jdbc.driver"));
        dataSource.setJdbcUrl(env.getProperty("sped.jdbc.url"));
        dataSource.setUsername(env.getProperty("sped.jdbc.user"));
        dataSource.setPassword(env.getProperty("sped.jdbc.password"));

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
