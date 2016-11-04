package br.com.gep.sped.fiscal.batch.config;

import br.com.gep.sped.batch.common.config.MiscStepsConfig;
import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.batch.config.flows.*;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
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
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

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
    private FlowBlocoKConfig flowBlocoKConfig;

    @Autowired
    private FlowBloco1Config flowBloco1Config;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Job spedFiscalJob() throws Exception {
        return jobBuilder.get("spedFiscalJob")
                .flow(miscStepsConfig.cleanupStep())
                .next(flowBloco0Config.flowBloco0())
                .next(flowBlocoCConfig.flowBlocoC())
                .next(flowBlocoDConfig.flowBlocoD())
                .next(flowBlocoEConfig.flowBlocoE())
                .next(flowBlocoGConfig.flowBlocoG())
                .next(flowBlocoHConfig.flowBlocoH())
                .next(flowBlocoKConfig.flowBlocoK())
                .next(flowBloco1Config.flowBloco1())
                .next(stepBloco9())
                .next(miscStepsConfig.zipFileStep())
                .end()
                .build();
    }

    private Step stepBloco9() throws Exception {
        Tasklet tasklet = taskletFactory.createBloc9Tasklet();

        return stepFactory.create("stepBloco9", tasklet);
    }
}
