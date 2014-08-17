package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoMConfig;
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
public class FlowBlocoMConfig {

    @Autowired
    private StepsBlocoMConfig stepsBlocoM;

    @Bean
    public Flow flowBlocoM() {
        return new FlowBuilder<SimpleFlow>("flowBlocoM")
                .start(stepsBlocoM.stepRegM001())
                .next(stepsBlocoM.stepRegM100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM105())
                    .from(stepsBlocoM.stepRegM100())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM200())
                .from(stepsBlocoM.stepRegM105())
                .next(stepsBlocoM.stepRegM110())
                    .on("*").to(stepsBlocoM.stepRegM100())
                .from(stepsBlocoM.stepRegM200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM210()) // daqui deve ir pro regM205, se existir
                    .from(stepsBlocoM.stepRegM200())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM300())
                // TODO: esse registro depende da versão do SPED
                //.from(stepsBlocoM.stepRegM205())
                .from(stepsBlocoM.stepRegM210())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM211())
                    .from(stepsBlocoM.stepRegM210())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM200())
                .from(stepsBlocoM.stepRegM211())
                .next(stepsBlocoM.stepRegM220())
                .next(stepsBlocoM.stepRegM230())
                    .on("*").to(stepsBlocoM.stepRegM210())
                .from(stepsBlocoM.stepRegM300())
                .next(stepsBlocoM.stepRegM350())
                .next(stepsBlocoM.stepRegM400())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM410())
                    .from(stepsBlocoM.stepRegM400())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM500())
                .from(stepsBlocoM.stepRegM410())
                    .on("*").to(stepsBlocoM.stepRegM400())
                .from(stepsBlocoM.stepRegM500())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM505())
                    .from(stepsBlocoM.stepRegM500())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM600())
                .from(stepsBlocoM.stepRegM505())
                .next(stepsBlocoM.stepRegM510())
                    .on("*").to(stepsBlocoM.stepRegM500())
                .from(stepsBlocoM.stepRegM600())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM610()) // daqui deveria ir pro regM605, se existir
                    .from(stepsBlocoM.stepRegM600())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM700())
                // TODO: esse registro depende da versão do SPED
                //.from(stepsBlocoM.stepRegM605())
                .from(stepsBlocoM.stepRegM610())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM611())
                    .from(stepsBlocoM.stepRegM610())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM700())
                .from(stepsBlocoM.stepRegM611())
                .next(stepsBlocoM.stepRegM620())
                .next(stepsBlocoM.stepRegM630())
                    .on("*").to(stepsBlocoM.stepRegM610())
                .from(stepsBlocoM.stepRegM700())
                .next(stepsBlocoM.stepRegM800())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoM.stepRegM810())
                    .from(stepsBlocoM.stepRegM800())
                    .on(NO_MORE_REG).to(stepsBlocoM.stepRegM990())
                .from(stepsBlocoM.stepRegM810())
                    .on("*").to(stepsBlocoM.stepRegM800())
                .from(stepsBlocoM.stepRegM990())
                .end();
    }
}
