package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBloco0Config;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBloco0Config {

    @Autowired
    private StepsBloco0Config stepsBloco0;

    @Bean
    public Flow flowBloco0() {
        return new FlowBuilder<SimpleFlow>("flowBloco0")
                .start(stepsBloco0.stepReg0001())
                //.next(stepsBloco0.stepReg0035()) // TODO: verificar porque tabela não existe
                .next(stepsBloco0.stepReg0100())
                .next(stepsBloco0.stepReg0110())
                .next(stepsBloco0.stepReg0120())
                .next(stepsBloco0.stepReg0140())
                .next(stepsBloco0.stepReg0500())
                .next(stepsBloco0.stepReg0600())
                .next(stepsBloco0.stepReg0990())
                .end();
    }
}
