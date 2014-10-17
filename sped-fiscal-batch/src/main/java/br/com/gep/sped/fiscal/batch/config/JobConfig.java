package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.config.MiscStepsConfig;
import br.com.gep.sped.fiscal.batch.config.flows.*;
import br.com.gep.sped.fiscal.batch.config.steps.*;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableBatchProcessing
public class JobConfig {

    @Autowired
    private JobBuilderFactory jobBuilder;

    @Autowired
    private MiscStepsConfig miscStepsConfig;

    @Autowired
    private StepsBloco0Config stepsBloco0;

    @Autowired
    private FlowBloco0Config flowBloco0Config;

    @Autowired
    private FlowBlocoCConfig flowBlocoCConfig;

    @Autowired
    private FlowBlocoDConfig flowBlocoDConfig;

    @Autowired
    private FlowBlocoEConfig flowBlocoEConfig;

    @Autowired
    private FlowBlocoGConfig flowBlocoGConfig;

    @Autowired
    private FlowBlocoHConfig flowBlocoHConfig;

    @Autowired
    private FlowBloco1Config flowBloco1Config;

    @Autowired
    private StepsBloco9Config stepsBloco9;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Job spedFiscalJob() throws Exception {
        return jobBuilder.get("spedFiscalJob")
                .flow(miscStepsConfig.cleanupStep())
                .next(stepsBloco0.stepReg0000())
                .next(flowBloco0Config.flowBloco0())
                .next(flowBlocoCConfig.flowBlocoC())
                .next(flowBlocoDConfig.flowBlocoD())
                .next(flowBlocoEConfig.flowBlocoE())
                .next(flowBlocoGConfig.flowBlocoG())
                .next(flowBlocoHConfig.flowBlocoH())
                .next(flowBloco1Config.flowBloco1())
                .next(stepsBloco9.stepBloco9())
                .next(miscStepsConfig.zipFileStep())
                .end()
                .build();
    }
}
