package br.com.gep.sped.fiscal.batch.config;

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

import static br.com.gep.sped.fiscal.batch.util.Blocs.*;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableBatchProcessing
public class JobConfig {

    @Autowired
    private JobBuilderFactory jobBuilder;

    @Autowired
    private MiscStepsConfig miscStepsConfig;

    @Autowired
    private FlowFactory flowFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Job spedFiscalJob() throws Exception {
        return jobBuilder.get("spedFiscalJob")
            .flow(miscStepsConfig.cleanupStep())
            .next(flowFactory.create(BLOC_0))
            .next(flowFactory.create(BLOC_C))
            .next(flowFactory.create(BLOC_D))
            .next(flowFactory.create(BLOC_E))
            .next(flowFactory.create(BLOC_G))
            .next(flowFactory.create(BLOC_H))
            .next(flowFactory.create(BLOC_K))
            .next(flowFactory.create(BLOC_1))
            .next(flowFactory.create(BLOC_9))
            .next(miscStepsConfig.zipFileStep())
            .end()
            .build();
    }
}
