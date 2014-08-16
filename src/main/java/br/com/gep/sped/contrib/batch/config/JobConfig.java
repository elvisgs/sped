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

    @Autowired
    private StepsBlocoCConfig stepsBlocoC;

    @Autowired
    private StepsBlocoDConfig stepsBlocoD;

    @Bean
    public Job spedContribJob() {
        return jobBuilder.get("spedContribJob")

                // Bloco 0
                .flow(stepsBloco0.stepReg0000())
                .next(stepsBloco0.stepReg0001())
                //.next(stepsBloco0.stepReg0035()) // TODO: verificar porque tabela não existe
                .next(stepsBloco0.stepReg0100())
                .next(stepsBloco0.stepReg0110())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBloco0.stepReg0111())
                    .from(stepsBloco0.stepReg0110())
                    .on(NO_MORE_REG_CODE).to(stepsBloco0.stepReg0120())
                .from(stepsBloco0.stepReg0111())
                    .on("*").to(stepsBloco0.stepReg0110())
                .from(stepsBloco0.stepReg0120())
                .next(stepsBloco0.stepReg0140())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBloco0.stepReg0145())
                    .from(stepsBloco0.stepReg0140())
                    .on(NO_MORE_REG_CODE).to(stepsBloco0.stepReg0500())
                .from(stepsBloco0.stepReg0145())
                .next(stepsBloco0.stepReg0150())
                .next(stepsBloco0.stepReg0190())
                .next(stepsBloco0.stepReg0200())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBloco0.stepReg0205())
                    .from(stepsBloco0.stepReg0200())
                    .on(NO_MORE_REG_CODE).to(stepsBloco0.stepReg0400())
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
                .from(stepsBlocoA.stepRegA990())

                // Bloco C
                .next(stepsBlocoC.stepRegC001())
                .next(stepsBlocoC.stepRegC010())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC100())
                    .from(stepsBlocoC.stepRegC010())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC990())
                .from(stepsBlocoC.stepRegC100())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC110())
                    .from(stepsBlocoC.stepRegC100())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC180())
                .from(stepsBlocoC.stepRegC110())
                .next(stepsBlocoC.stepRegC111())
                .next(stepsBlocoC.stepRegC120())
                .next(stepsBlocoC.stepRegC170())
                    .on("*").to(stepsBlocoC.stepRegC100())
                // TODO: verificar registro C175
                .from(stepsBlocoC.stepRegC180())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC181())
                    .from(stepsBlocoC.stepRegC180())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC190())
                .from(stepsBlocoC.stepRegC181())
                .next(stepsBlocoC.stepRegC185())
                .next(stepsBlocoC.stepRegC188())
                    .on("*").to(stepsBlocoC.stepRegC180())
                .from(stepsBlocoC.stepRegC190())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC191())
                    .from(stepsBlocoC.stepRegC190())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC380())
                .from(stepsBlocoC.stepRegC191())
                .next(stepsBlocoC.stepRegC195())
                .next(stepsBlocoC.stepRegC198())
                .next(stepsBlocoC.stepRegC199())
                    .on("*").to(stepsBlocoC.stepRegC190())
                .from(stepsBlocoC.stepRegC380())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC381())
                    .from(stepsBlocoC.stepRegC380())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC395())
                .from(stepsBlocoC.stepRegC381())
                .next(stepsBlocoC.stepRegC385())
                    .on("*").to(stepsBlocoC.stepRegC380())
                .from(stepsBlocoC.stepRegC395())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC396())
                    .from(stepsBlocoC.stepRegC395())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC400())
                .from(stepsBlocoC.stepRegC396())
                    .on("*").to(stepsBlocoC.stepRegC395())
                .from(stepsBlocoC.stepRegC400())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC405())
                    .from(stepsBlocoC.stepRegC400())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC490())
                .from(stepsBlocoC.stepRegC405())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC481())
                    .from(stepsBlocoC.stepRegC405())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC489())
                .from(stepsBlocoC.stepRegC481())
                .next(stepsBlocoC.stepRegC485())
                    .on("*").to(stepsBlocoC.stepRegC405())
                .from(stepsBlocoC.stepRegC489())
                    .on("*").to(stepsBlocoC.stepRegC400())
                .from(stepsBlocoC.stepRegC490())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC491())
                    .from(stepsBlocoC.stepRegC490())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC500())
                .from(stepsBlocoC.stepRegC491())
                .next(stepsBlocoC.stepRegC495())
                .next(stepsBlocoC.stepRegC499())
                    .on("*").to(stepsBlocoC.stepRegC490())
                .from(stepsBlocoC.stepRegC500())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC501())
                    .from(stepsBlocoC.stepRegC500())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC600())
                .from(stepsBlocoC.stepRegC501())
                .next(stepsBlocoC.stepRegC505())
                .next(stepsBlocoC.stepRegC509())
                    .on("*").to(stepsBlocoC.stepRegC500())
                .from(stepsBlocoC.stepRegC600())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoC.stepRegC601())
                    .from(stepsBlocoC.stepRegC600())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoC.stepRegC010())
                .from(stepsBlocoC.stepRegC601())
                .next(stepsBlocoC.stepRegC605())
                .next(stepsBlocoC.stepRegC609())
                    .on("*").to(stepsBlocoC.stepRegC600())
                .from(stepsBlocoC.stepRegC990())

                // Bloco D
                .next(stepsBlocoD.stepRegD001())
                .next(stepsBlocoD.stepRegD010())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD100())
                    .from(stepsBlocoD.stepRegD010())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD990())
                .from(stepsBlocoD.stepRegD100())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD101())
                    .from(stepsBlocoD.stepRegD100())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD200())
                .from(stepsBlocoD.stepRegD101())
                .next(stepsBlocoD.stepRegD105())
                .next(stepsBlocoD.stepRegD111())
                    .on("*").to(stepsBlocoD.stepRegD100())
                .from(stepsBlocoD.stepRegD200())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD201())
                    .from(stepsBlocoD.stepRegD200())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD300())
                .from(stepsBlocoD.stepRegD201())
                .next(stepsBlocoD.stepRegD205())
                .next(stepsBlocoD.stepRegD209())
                    .on("*").to(stepsBlocoD.stepRegD200())
                .from(stepsBlocoD.stepRegD300())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD309())
                    .from(stepsBlocoD.stepRegD300())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD350())
                .from(stepsBlocoD.stepRegD309())
                    .on("*").to(stepsBlocoD.stepRegD300())
                .from(stepsBlocoD.stepRegD350())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD359())
                    .from(stepsBlocoD.stepRegD350())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD500())
                .from(stepsBlocoD.stepRegD359())
                    .on("*").to(stepsBlocoD.stepRegD350())
                .from(stepsBlocoD.stepRegD500())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD501())
                    .from(stepsBlocoD.stepRegD500())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD600())
                .from(stepsBlocoD.stepRegD501())
                .next(stepsBlocoD.stepRegD505())
                .next(stepsBlocoD.stepRegD509())
                    .on("*").to(stepsBlocoD.stepRegD500())
                .from(stepsBlocoD.stepRegD600())
                    .on(PROCESS_CHILD_REG_CODE).to(stepsBlocoD.stepRegD601())
                    .from(stepsBlocoD.stepRegD600())
                    .on(NO_MORE_REG_CODE).to(stepsBlocoD.stepRegD010())
                .from(stepsBlocoD.stepRegD601())
                .next(stepsBlocoD.stepRegD605())
                .next(stepsBlocoD.stepRegD609())
                    .on("*").to(stepsBlocoD.stepRegD600())
                .from(stepsBlocoD.stepRegD990())

                .end()
                .build();
    }
}
