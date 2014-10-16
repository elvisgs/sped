package br.com.gep.sped.batch.common.config;

import org.springframework.core.task.TaskExecutor;

import javax.sql.DataSource;

public interface InfrastructureConfig {

    DataSource getDataSource();

    TaskExecutor getTaskExecutor();
}
