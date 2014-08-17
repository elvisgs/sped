package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoIConfig;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.NO_MORE_REG;
import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.PROCESS_CHILD_REG;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBlocoIConfig {

    @Autowired
    private StepsBlocoIConfig stepsBlocoI;

    @Bean
    @Lazy
    public Flow flowBlocoI() {
        return new FlowBuilder<SimpleFlow>("flowBlocoI")
                .start(stepsBlocoI.stepRegI001())
                .next(stepsBlocoI.stepRegI010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI100())
                    .from(stepsBlocoI.stepRegI010())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI990())
                .from(stepsBlocoI.stepRegI100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI200())
                    .from(stepsBlocoI.stepRegI100())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI010())
                .from(stepsBlocoI.stepRegI200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI300())
                    .from(stepsBlocoI.stepRegI200())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI199())
                .from(stepsBlocoI.stepRegI300())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI399())
                    .from(stepsBlocoI.stepRegI300())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI299())
                .from(stepsBlocoI.stepRegI399())
                    .on("*").to(stepsBlocoI.stepRegI300())
                .from(stepsBlocoI.stepRegI299())
                    .on("*").to(stepsBlocoI.stepRegI200())
                .from(stepsBlocoI.stepRegI199())
                    .on("*").to(stepsBlocoI.stepRegI100())
                .from(stepsBlocoI.stepRegI990())
                .end();
    }
}
