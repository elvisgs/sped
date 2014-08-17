package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoFConfig;
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
public class FlowBlocoFConfig {

    @Autowired
    private StepsBlocoFConfig stepsBlocoF;

    @Bean
    public Flow flowBlocoF() {
        return new FlowBuilder<SimpleFlow>("flowBlocoF")
                .start(stepsBlocoF.stepRegF001())
                .next(stepsBlocoF.stepRegF010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF100())
                    .from(stepsBlocoF.stepRegF010())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF990())
                .from(stepsBlocoF.stepRegF100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF111())
                    .from(stepsBlocoF.stepRegF100())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF120())
                .from(stepsBlocoF.stepRegF111())
                    .on("*").to(stepsBlocoF.stepRegF100())
                .from(stepsBlocoF.stepRegF120())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF129())
                    .from(stepsBlocoF.stepRegF120())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF130())
                .from(stepsBlocoF.stepRegF129())
                    .on("*").to(stepsBlocoF.stepRegF120())
                .from(stepsBlocoF.stepRegF130())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF139())
                    .from(stepsBlocoF.stepRegF130())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF150())
                .from(stepsBlocoF.stepRegF139())
                    .on("*").to(stepsBlocoF.stepRegF130())
                .from(stepsBlocoF.stepRegF150())
                .next(stepsBlocoF.stepRegF200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF205())
                    .from(stepsBlocoF.stepRegF200())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF600()) // aqui deve ir pro regF500, se ele existir
                .from(stepsBlocoF.stepRegF205())
                .next(stepsBlocoF.stepRegF210())
                .next(stepsBlocoF.stepRegF211())
                    .on("*").to(stepsBlocoF.stepRegF200())
                // TODO: esses registros dependem da versão do SPED e estão relacionados ao registro 0110
                /*
                .from(stepsBlocoF.stepRegF500())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF509())
                    .from(stepsBlocoF.stepRegF500())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF510())
                .from(stepsBlocoF.stepRegF509())
                    .on("*").to(stepsBlocoF.stepRegF500())
                .from(stepsBlocoF.stepRegF510())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF519())
                    .from(stepsBlocoF.stepRegF510())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF525())
                .from(stepsBlocoF.stepRegF519())
                    .on("*").to(stepsBlocoF.stepRegF510())
                .from(stepsBlocoF.stepRegF525())
                .next(stepsBlocoF.stepRegF550())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF559())
                    .from(stepsBlocoF.stepRegF550())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF560())
                .from(stepsBlocoF.stepRegF559())
                    .on("*").to(stepsBlocoF.stepRegF550())
                .from(stepsBlocoF.stepRegF560())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoF.stepRegF569())
                    .from(stepsBlocoF.stepRegF560())
                    .on(NO_MORE_REG).to(stepsBlocoF.stepRegF600())
                .from(stepsBlocoF.stepRegF569())
                    .on("*").to(stepsBlocoF.stepRegF560())
                */
                .from(stepsBlocoF.stepRegF600())
                .next(stepsBlocoF.stepRegF700())
                .next(stepsBlocoF.stepRegF800())
                    .on("*").to(stepsBlocoF.stepRegF010())
                .from(stepsBlocoF.stepRegF990())
                .end();
    }
}
