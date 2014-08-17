package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoAConfig;
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
public class FlowBlocoAConfig {

    @Autowired
    private StepsBlocoAConfig stepsBlocoA;

    @Bean
    public Flow flowBlocoA() {
        return new FlowBuilder<SimpleFlow>("flowBlocoA")
                .start(stepsBlocoA.stepRegA001())
                .next(stepsBlocoA.stepRegA010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoA.stepRegA100())
                    .from(stepsBlocoA.stepRegA010())
                    .on(NO_MORE_REG).to(stepsBlocoA.stepRegA990())
                .from(stepsBlocoA.stepRegA100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoA.stepRegA110())
                    .from(stepsBlocoA.stepRegA100())
                    .on(NO_MORE_REG).to(stepsBlocoA.stepRegA010())
                .from(stepsBlocoA.stepRegA110())
                .next(stepsBlocoA.stepRegA111())
                .next(stepsBlocoA.stepRegA120())
                .next(stepsBlocoA.stepRegA170())
                    .on("*").to(stepsBlocoA.stepRegA100())
                .from(stepsBlocoA.stepRegA990())
                .end();
    }
}
