package br.com.gep.sped.batch.common.config;

import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.explore.support.JobExplorerFactoryBean;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.JobRepositoryFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

public class SpedBatchConfigurer implements BatchConfigurer {

    @Autowired
    private InfrastructureConfig infrastructureConfig;

    @Override
    public JobRepository getJobRepository() throws Exception {
        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
        factory.setDataSource(infrastructureConfig.getDataSource());
        factory.setTransactionManager(getTransactionManager());
        factory.afterPropertiesSet();
        return  factory.getObject();
    }

    @Override
    public PlatformTransactionManager getTransactionManager() throws Exception {
        return new DataSourceTransactionManager(infrastructureConfig.getDataSource());
    }

    @Override
    public JobLauncher getJobLauncher() throws Exception {
        SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
        jobLauncher.setJobRepository(getJobRepository());
        jobLauncher.setTaskExecutor(infrastructureConfig.getTaskExecutor());
        jobLauncher.afterPropertiesSet();
        return jobLauncher;
    }

    @Override
    public JobExplorer getJobExplorer() throws Exception {
        JobExplorerFactoryBean factory = new JobExplorerFactoryBean();
        factory.setDataSource(infrastructureConfig.getDataSource());
        factory.afterPropertiesSet();
        return factory.getObject();
    }
}
