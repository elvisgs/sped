package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBloco0Config;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBloco0Config {

    @Autowired
    private StepsBloco0Config stepsBloco0;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBloco0() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBloco0")
                .start(stepsBloco0.stepReg0001())
                .next(stepsBloco0.stepReg0005())
                .next(stepsBloco0.stepReg0015())
                .next(stepsBloco0.stepReg0100())
                .next(stepsBloco0.stepReg0150())
                .next(stepsBloco0.stepReg0190())
                .next(stepsBloco0.stepReg0200())
                .next(stepsBloco0.stepReg0300())
                .next(stepsBloco0.stepReg0400())
                .next(stepsBloco0.stepReg0450())
                .next(stepsBloco0.stepReg0460())
                .next(stepsBloco0.stepReg0500())
                .next(stepsBloco0.stepReg0600())
                .next(stepsBloco0.stepReg0990())
                .end();
    }
}
