package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoMConfig;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBlocoMConfig {

    @Autowired
    private StepsBlocoMConfig stepsBlocoM;

    @Bean
    public Flow flowBlocoM() {
        return new FlowBuilder<SimpleFlow>("flowBlocoM")
                .start(stepsBlocoM.stepRegM001())
                .next(stepsBlocoM.stepRegM100())
                .next(stepsBlocoM.stepRegM200())
                .next(stepsBlocoM.stepRegM300())
                .next(stepsBlocoM.stepRegM350())
                .next(stepsBlocoM.stepRegM400())
                .next(stepsBlocoM.stepRegM500())
                .next(stepsBlocoM.stepRegM600())
                .next(stepsBlocoM.stepRegM700())
                .next(stepsBlocoM.stepRegM800())
                .next(stepsBlocoM.stepRegM990())
                .end();
    }
}
