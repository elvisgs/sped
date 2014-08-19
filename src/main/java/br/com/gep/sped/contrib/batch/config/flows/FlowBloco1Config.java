package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBloco1Config;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBloco1Config {

    @Autowired
    private StepsBloco1Config stepsBloco1;

    @Bean
    public Flow flowBloco1() {
        // TODO: existem vários registros que não estão mapeados aqui. Ver necessidade de implementá-los
        return new FlowBuilder<SimpleFlow>("flowBloco1")
                .start(stepsBloco1.stepReg1001())
                .next(stepsBloco1.stepReg1010())
                .next(stepsBloco1.stepReg1020())
                .next(stepsBloco1.stepReg1100())
                .next(stepsBloco1.stepReg1300())
                .next(stepsBloco1.stepReg1500())
                .next(stepsBloco1.stepReg1700())
                .next(stepsBloco1.stepReg1800())
                //.next(stepsBloco1.stepReg1900()) // TODO: criar tabela do reg1900 no BD
                .next(stepsBloco1.stepReg1990())
                .end();
    }
}
