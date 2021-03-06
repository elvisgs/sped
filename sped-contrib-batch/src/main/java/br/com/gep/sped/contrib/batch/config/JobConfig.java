package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.batch.common.factory.JobFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@Lazy
@EnableBatchProcessing
@RequiredArgsConstructor
public class JobConfig {

    private final JobFactory jobFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Job spedContribJob() throws Exception {
        return jobFactory.create("spedContribJob");
    }
}
