package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.config.flows.*;
import br.com.gep.sped.contrib.batch.config.steps.StepsBloco0Config;
import br.com.gep.sped.contrib.batch.config.steps.StepsBloco9Config;
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
    private StepsBloco0Config stepsBloco0;

    @Autowired
    private FlowBloco0Config flowBloco0Config;

    @Autowired
    private FlowBlocoAConfig flowBlocoAConfig;

    @Autowired
    private FlowBlocoCConfig flowBlocoCConfig;

    @Autowired
    private FlowBlocoDConfig flowBlocoDConfig;

    @Autowired
    private FlowBlocoFConfig flowBlocoFConfig;

    @Autowired
    private FlowBlocoIConfig flowBlocoIConfig;

    @Autowired
    private FlowBlocoMConfig flowBlocoMConfig;

    @Autowired
    private FlowBlocoPConfig flowBlocoPConfig;

    @Autowired
    private FlowBloco1Config flowBloco1Config;

    @Autowired
    private StepsBloco9Config stepsBloco9;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Job spedContribJob() throws Exception {
        return jobBuilder.get("spedContribJob")
                .flow(stepsBloco0.stepReg0000())
                .next(flowBloco0Config.flowBloco0())
                .next(flowBlocoAConfig.flowBlocoA())
                .next(flowBlocoCConfig.flowBlocoC())
                .next(flowBlocoDConfig.flowBlocoD())
                .next(flowBlocoFConfig.flowBlocoF())
                //.next(flowBlocoIConfig.flowBlocoI()) // TODO: adicionar tabelas do bloco I no BD
                .next(flowBlocoMConfig.flowBlocoM())
                .next(flowBlocoPConfig.flowBlocoP())
                .next(flowBloco1Config.flowBloco1())
                .next(stepsBloco9.stepBloco9())
                .end()
                .build();
    }
}
