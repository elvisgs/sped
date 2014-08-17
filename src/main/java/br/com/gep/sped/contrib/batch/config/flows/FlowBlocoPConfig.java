package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoPConfig;
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
public class FlowBlocoPConfig {

    @Autowired
    private StepsBlocoPConfig stepsBlocoP;

    @Bean
    @Lazy
    public Flow flowBlocoP() {
        return new FlowBuilder<SimpleFlow>("flowBlocoP")
                .start(stepsBlocoP.stepRegP001())
                .next(stepsBlocoP.stepRegP010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoP.stepRegP100())
                    .from(stepsBlocoP.stepRegP010())
                    .on(NO_MORE_REG).to(stepsBlocoP.stepRegP200())
                .from(stepsBlocoP.stepRegP100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoP.stepRegP110())
                    .from(stepsBlocoP.stepRegP100())
                    .on(NO_MORE_REG).to(stepsBlocoP.stepRegP010())
                .from(stepsBlocoP.stepRegP110())
                .next(stepsBlocoP.stepRegP199())
                    .on("*").to(stepsBlocoP.stepRegP100())
                .from(stepsBlocoP.stepRegP200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoP.stepRegP210())
                    .from(stepsBlocoP.stepRegP200())
                    .on(NO_MORE_REG).to(stepsBlocoP.stepRegP990())
                .from(stepsBlocoP.stepRegP210())
                    .on("*").to(stepsBlocoP.stepRegP200())
                .from(stepsBlocoP.stepRegP990())
                .end();
    }
}
