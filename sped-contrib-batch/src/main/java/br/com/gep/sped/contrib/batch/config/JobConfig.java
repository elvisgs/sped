package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.batch.common.config.MiscStepsConfig;
import br.com.gep.sped.batch.common.factory.FlowFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static br.com.gep.sped.contrib.batch.util.Blocs.*;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableBatchProcessing
public class JobConfig {

    @Autowired
    private JobBuilderFactory jobBuilder;

    @Autowired
    private FlowFactory flowFactory;

    @Autowired
    private MiscStepsConfig miscStepsConfig;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Job spedContribJob() throws Exception {
        return jobBuilder.get("spedContribJob")
                .flow(miscStepsConfig.cleanupStep())
                .next(flowFactory.create(BLOC_0))
                .next(flowFactory.create(BLOC_A))
                .next(flowFactory.create(BLOC_C))
                .next(flowFactory.create(BLOC_D))
                .next(flowFactory.create(BLOC_F))
                .next(flowFactory.create(BLOC_I))
                .next(flowFactory.create(BLOC_M))
                .next(flowFactory.create(BLOC_P))
                .next(flowFactory.create(BLOC_1))
                .next(flowFactory.create(BLOC_9))
                .next(miscStepsConfig.zipFileStep())
                .end()
                .build();
    }
}
