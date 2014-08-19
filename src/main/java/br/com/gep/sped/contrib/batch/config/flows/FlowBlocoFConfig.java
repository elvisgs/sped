package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoFConfig;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBlocoFConfig {

    @Autowired
    private StepsBlocoFConfig stepsBlocoF;

    @Bean
    public Flow flowBlocoF() {
        return new FlowBuilder<SimpleFlow>("flowBlocoF")
                .start(stepsBlocoF.stepRegF001())
                .next(stepsBlocoF.stepRegF010())
                .next(stepsBlocoF.stepRegF990())
                .end();
    }
}
