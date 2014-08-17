package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoDConfig;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.NO_MORE_REG;
import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.PROCESS_CHILD_REG;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBlocoDConfig {

    @Autowired
    private StepsBlocoDConfig stepsBlocoD;

    @Bean
    public Flow flowBlocoD() {
        return new FlowBuilder<SimpleFlow>("flowBlocoD")
                .start(stepsBlocoD.stepRegD001())
                .next(stepsBlocoD.stepRegD010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD100())
                    .from(stepsBlocoD.stepRegD010())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD990())
                .from(stepsBlocoD.stepRegD100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD101())
                    .from(stepsBlocoD.stepRegD100())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD200())
                .from(stepsBlocoD.stepRegD101())
                .next(stepsBlocoD.stepRegD105())
                .next(stepsBlocoD.stepRegD111())
                    .on("*").to(stepsBlocoD.stepRegD100())
                .from(stepsBlocoD.stepRegD200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD201())
                    .from(stepsBlocoD.stepRegD200())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD300())
                .from(stepsBlocoD.stepRegD201())
                .next(stepsBlocoD.stepRegD205())
                .next(stepsBlocoD.stepRegD209())
                    .on("*").to(stepsBlocoD.stepRegD200())
                .from(stepsBlocoD.stepRegD300())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD309())
                    .from(stepsBlocoD.stepRegD300())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD350())
                .from(stepsBlocoD.stepRegD309())
                    .on("*").to(stepsBlocoD.stepRegD300())
                .from(stepsBlocoD.stepRegD350())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD359())
                    .from(stepsBlocoD.stepRegD350())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD500())
                .from(stepsBlocoD.stepRegD359())
                    .on("*").to(stepsBlocoD.stepRegD350())
                .from(stepsBlocoD.stepRegD500())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD501())
                    .from(stepsBlocoD.stepRegD500())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD600())
                .from(stepsBlocoD.stepRegD501())
                .next(stepsBlocoD.stepRegD505())
                .next(stepsBlocoD.stepRegD509())
                    .on("*").to(stepsBlocoD.stepRegD500())
                .from(stepsBlocoD.stepRegD600())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD601())
                    .from(stepsBlocoD.stepRegD600())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD010())
                .from(stepsBlocoD.stepRegD601())
                .next(stepsBlocoD.stepRegD605())
                .next(stepsBlocoD.stepRegD609())
                    .on("*").to(stepsBlocoD.stepRegD600())
                .from(stepsBlocoD.stepRegD990())
                .end();
    }
}
