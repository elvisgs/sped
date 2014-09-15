package br.com.gep.sped.contrib.batch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.task.TaskExecutor;

import javax.sql.DataSource;

public interface InfrastructureConfig {

    @Bean
    DataSource dataSource();

    @Bean
    TaskExecutor taskExecutor();
}
