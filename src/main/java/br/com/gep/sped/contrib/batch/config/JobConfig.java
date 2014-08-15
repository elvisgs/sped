package br.com.gep.sped.contrib.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.NO_MORE_REG_CODE;
import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.PROCESS_CHILD_REG_CODE;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class JobConfig {

    @Autowired
    private JobBuilderFactory jobBuilder;

    @Autowired
    private StepsBloco0Config stepsBloco0;

    @Autowired
    private StepsBlocoAConfig stepsBlocoA;

    @Bean
    public Job spedContribJob() {
        return jobBuilder.get("spedContribJob")

                // Bloco 0
                .flow(stepsBloco0.stepReg0000())
                .next(stepsBloco0.stepReg0140())

                // Bloco A
                .next(stepsBlocoA.stepRegA001())
                .next(stepsBlocoA.stepRegA010())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoA.stepRegA100())
                    .from(stepsBlocoA.stepRegA010())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoA.stepRegA990())
                .from(stepsBlocoA.stepRegA100())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoA.stepRegA110())
                    .from(stepsBlocoA.stepRegA100())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoA.stepRegA010())
                .from(stepsBlocoA.stepRegA110())
                .next(stepsBlocoA.stepRegA111())
                .next(stepsBlocoA.stepRegA120())
                .next(stepsBlocoA.stepRegA170())
                    .on("*").to(stepsBlocoA.stepRegA100())

                .end()
                .build();
    }
}
