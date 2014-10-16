package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBloco1Config;
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
public class FlowBloco1Config {

    @Autowired
    private StepsBloco1Config stepsBloco1;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBloco1() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBloco1")
                .start(stepsBloco1.stepReg1001())
                .next(stepsBloco1.stepReg1010())
                .next(stepsBloco1.stepReg1100())
                .next(stepsBloco1.stepReg1200())
                .next(stepsBloco1.stepReg1300())
                .next(stepsBloco1.stepReg1350())
                .next(stepsBloco1.stepReg1390())
                .next(stepsBloco1.stepReg1400())
                .next(stepsBloco1.stepReg1500())
                .next(stepsBloco1.stepReg1600())
                .next(stepsBloco1.stepReg1700())
                .next(stepsBloco1.stepReg1800())
                .next(stepsBloco1.stepReg1900())
                .next(stepsBloco1.stepReg1990())
                .end();
    }
}
