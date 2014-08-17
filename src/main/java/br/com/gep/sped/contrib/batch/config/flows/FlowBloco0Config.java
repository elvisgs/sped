package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBloco0Config;
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
                    .on(PROCESS_CHILD_REG).to(stepsBloco0.stepReg0111())
                    .from(stepsBloco0.stepReg0110())
                    .on(NO_MORE_REG).to(stepsBloco0.stepReg0120())
                .from(stepsBloco0.stepReg0111())
                    .on("*").to(stepsBloco0.stepReg0110())
                .from(stepsBloco0.stepReg0120())
                .next(stepsBloco0.stepReg0140())
                    .on(PROCESS_CHILD_REG).to(stepsBloco0.stepReg0145())
                    .from(stepsBloco0.stepReg0140())
                    .on(NO_MORE_REG).to(stepsBloco0.stepReg0500())
                .from(stepsBloco0.stepReg0145())
                .next(stepsBloco0.stepReg0150())
                .next(stepsBloco0.stepReg0190())
                .next(stepsBloco0.stepReg0200())
                    .on(PROCESS_CHILD_REG).to(stepsBloco0.stepReg0205())
                    .from(stepsBloco0.stepReg0200())
                    .on(NO_MORE_REG).to(stepsBloco0.stepReg0400())
                .from(stepsBloco0.stepReg0205())
                .next(stepsBloco0.stepReg0206())
                .next(stepsBloco0.stepReg0208())
                    .on("*").to(stepsBloco0.stepReg0200())
                .from(stepsBloco0.stepReg0400())
                .next(stepsBloco0.stepReg0450())
                    .on("*").to(stepsBloco0.stepReg0140())
                .from(stepsBloco0.stepReg0500())
                .next(stepsBloco0.stepReg0600())
                .next(stepsBloco0.stepReg0990())
                .end();
    }
}
