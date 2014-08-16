package br.com.gep.sped.contrib.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.NO_MORE_REG;
import static br.com.gep.sped.contrib.batch.common.CustomExitStatus.PROCESS_CHILD_REG;

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

    @Autowired
    private StepsBlocoFConfig stepsBlocoF;

    @Autowired
    private StepsBlocoIConfig stepsBlocoI;

    @Autowired
    private StepsBlocoMConfig stepsBlocoM;

    @Autowired
    private StepsBlocoPConfig stepsBlocoP;

    @Autowired
    private StepsBloco1Config stepsBloco1;

    @Bean
    public Job spedContribJob() {
        return jobBuilder.get("spedContribJob")
                .flow(stepsBloco0.stepReg0000())
                .next(flowBloco0())
                .next(flowBlocoA())
                .next(flowBlocoC())
                .next(flowBlocoD())
                .next(flowBlocoF())
                //.next(flowBlocoI()) // TODO: adicionar tabelas do bloco I no BD
                .next(flowBlocoM())
                .next(flowBlocoP())
                .next(flowBloco1())
                .end()
                .build();
    }

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

    @Bean
    public Flow flowBlocoA() {
        return new FlowBuilder<SimpleFlow>("flowBlocoA")
                .start(stepsBlocoA.stepRegA001())
                .next(stepsBlocoA.stepRegA010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoA.stepRegA100())
                    .from(stepsBlocoA.stepRegA010())
                    .on(NO_MORE_REG).to(stepsBlocoA.stepRegA990())
                .from(stepsBlocoA.stepRegA100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoA.stepRegA110())
                    .from(stepsBlocoA.stepRegA100())
                    .on(NO_MORE_REG).to(stepsBlocoA.stepRegA010())
                .from(stepsBlocoA.stepRegA110())
                .next(stepsBlocoA.stepRegA111())
                .next(stepsBlocoA.stepRegA120())
                .next(stepsBlocoA.stepRegA170())
                    .on("*").to(stepsBlocoA.stepRegA100())
                .from(stepsBlocoA.stepRegA990())
                .end();
    }

    @Bean
    public Flow flowBlocoC() {
        return new FlowBuilder<SimpleFlow>("flowBlocoC")
                .start(stepsBlocoC.stepRegC001())
                .next(stepsBlocoC.stepRegC010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC100())
                    .from(stepsBlocoC.stepRegC010())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC990())
                .from(stepsBlocoC.stepRegC100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC110())
                    .from(stepsBlocoC.stepRegC100())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC180())
                .from(stepsBlocoC.stepRegC110())
                .next(stepsBlocoC.stepRegC111())
                .next(stepsBlocoC.stepRegC120())
                .next(stepsBlocoC.stepRegC170())
                    .on("*").to(stepsBlocoC.stepRegC100())
                // TODO: verificar registro C175
                .from(stepsBlocoC.stepRegC180())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC181())
                    .from(stepsBlocoC.stepRegC180())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC190())
                .from(stepsBlocoC.stepRegC181())
                .next(stepsBlocoC.stepRegC185())
                .next(stepsBlocoC.stepRegC188())
                    .on("*").to(stepsBlocoC.stepRegC180())
                .from(stepsBlocoC.stepRegC190())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC191())
                    .from(stepsBlocoC.stepRegC190())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC380())
                .from(stepsBlocoC.stepRegC191())
                .next(stepsBlocoC.stepRegC195())
                .next(stepsBlocoC.stepRegC198())
                .next(stepsBlocoC.stepRegC199())
                    .on("*").to(stepsBlocoC.stepRegC190())
                .from(stepsBlocoC.stepRegC380())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC381())
                    .from(stepsBlocoC.stepRegC380())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC395())
                .from(stepsBlocoC.stepRegC381())
                .next(stepsBlocoC.stepRegC385())
                    .on("*").to(stepsBlocoC.stepRegC380())
                .from(stepsBlocoC.stepRegC395())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC396())
                    .from(stepsBlocoC.stepRegC395())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC400())
                .from(stepsBlocoC.stepRegC396())
                    .on("*").to(stepsBlocoC.stepRegC395())
                .from(stepsBlocoC.stepRegC400())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC405())
                    .from(stepsBlocoC.stepRegC400())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC490())
                .from(stepsBlocoC.stepRegC405())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC481())
                    .from(stepsBlocoC.stepRegC405())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC489())
                .from(stepsBlocoC.stepRegC481())
                .next(stepsBlocoC.stepRegC485())
                    .on("*").to(stepsBlocoC.stepRegC405())
                .from(stepsBlocoC.stepRegC489())
                    .on("*").to(stepsBlocoC.stepRegC400())
                .from(stepsBlocoC.stepRegC490())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC491())
                    .from(stepsBlocoC.stepRegC490())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC500())
                .from(stepsBlocoC.stepRegC491())
                .next(stepsBlocoC.stepRegC495())
                .next(stepsBlocoC.stepRegC499())
                    .on("*").to(stepsBlocoC.stepRegC490())
                .from(stepsBlocoC.stepRegC500())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC501())
                    .from(stepsBlocoC.stepRegC500())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC600())
                .from(stepsBlocoC.stepRegC501())
                .next(stepsBlocoC.stepRegC505())
                .next(stepsBlocoC.stepRegC509())
                    .on("*").to(stepsBlocoC.stepRegC500())
                .from(stepsBlocoC.stepRegC600())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoC.stepRegC601())
                    .from(stepsBlocoC.stepRegC600())
                    .on(NO_MORE_REG).to(stepsBlocoC.stepRegC010())
                .from(stepsBlocoC.stepRegC601())
                .next(stepsBlocoC.stepRegC605())
                .next(stepsBlocoC.stepRegC609())
                    .on("*").to(stepsBlocoC.stepRegC600())
                .from(stepsBlocoC.stepRegC990())
                .end();
    }

    @Bean
    public Flow flowBlocoD() {
        return new FlowBuilder<SimpleFlow>("flowBlocoD")
                .start(stepsBlocoD.stepRegD001())
                .next(stepsBlocoD.stepRegD010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD100())
                    .from(stepsBlocoD.stepRegD010())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD990())
                .from(stepsBlocoD.stepRegD100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD101())
                    .from(stepsBlocoD.stepRegD100())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD200())
                .from(stepsBlocoD.stepRegD101())
                .next(stepsBlocoD.stepRegD105())
                .next(stepsBlocoD.stepRegD111())
                    .on("*").to(stepsBlocoD.stepRegD100())
                .from(stepsBlocoD.stepRegD200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD201())
                    .from(stepsBlocoD.stepRegD200())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD300())
                .from(stepsBlocoD.stepRegD201())
                .next(stepsBlocoD.stepRegD205())
                .next(stepsBlocoD.stepRegD209())
                    .on("*").to(stepsBlocoD.stepRegD200())
                .from(stepsBlocoD.stepRegD300())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD309())
                    .from(stepsBlocoD.stepRegD300())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD350())
                .from(stepsBlocoD.stepRegD309())
                    .on("*").to(stepsBlocoD.stepRegD300())
                .from(stepsBlocoD.stepRegD350())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD359())
                    .from(stepsBlocoD.stepRegD350())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD500())
                .from(stepsBlocoD.stepRegD359())
                    .on("*").to(stepsBlocoD.stepRegD350())
                .from(stepsBlocoD.stepRegD500())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD501())
                    .from(stepsBlocoD.stepRegD500())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD600())
                .from(stepsBlocoD.stepRegD501())
                .next(stepsBlocoD.stepRegD505())
                .next(stepsBlocoD.stepRegD509())
                    .on("*").to(stepsBlocoD.stepRegD500())
                .from(stepsBlocoD.stepRegD600())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoD.stepRegD601())
                    .from(stepsBlocoD.stepRegD600())
                    .on(NO_MORE_REG).to(stepsBlocoD.stepRegD010())
                .from(stepsBlocoD.stepRegD601())
                .next(stepsBlocoD.stepRegD605())
                .next(stepsBlocoD.stepRegD609())
                    .on("*").to(stepsBlocoD.stepRegD600())
                .from(stepsBlocoD.stepRegD990())
                .end();
    }

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

    @Bean
    @Lazy
    public Flow flowBlocoI() {
        return new FlowBuilder<SimpleFlow>("flowBlocoI")
                .start(stepsBlocoI.stepRegI001())
                .next(stepsBlocoI.stepRegI010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI100())
                    .from(stepsBlocoI.stepRegI010())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI990())
                .from(stepsBlocoI.stepRegI100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI200())
                    .from(stepsBlocoI.stepRegI100())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI010())
                .from(stepsBlocoI.stepRegI200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI300())
                    .from(stepsBlocoI.stepRegI200())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI199())
                .from(stepsBlocoI.stepRegI300())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoI.stepRegI399())
                    .from(stepsBlocoI.stepRegI300())
                    .on(NO_MORE_REG).to(stepsBlocoI.stepRegI299())
                .from(stepsBlocoI.stepRegI399())
                    .on("*").to(stepsBlocoI.stepRegI300())
                .from(stepsBlocoI.stepRegI299())
                    .on("*").to(stepsBlocoI.stepRegI200())
                .from(stepsBlocoI.stepRegI199())
                    .on("*").to(stepsBlocoI.stepRegI100())
                .from(stepsBlocoI.stepRegI990())
                .end();
    }

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

    @Bean
    @Lazy
    public Flow flowBlocoP() {
        return new FlowBuilder<SimpleFlow>("flowBlocoP")
                .start(stepsBlocoP.stepRegP001())
                .next(stepsBlocoP.stepRegP010())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoP.stepRegP100())
                    .from(stepsBlocoP.stepRegP010())
                    .on(NO_MORE_REG).to(stepsBlocoP.stepRegP200())
                .from(stepsBlocoP.stepRegP100())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoP.stepRegP110())
                    .from(stepsBlocoP.stepRegP100())
                    .on(NO_MORE_REG).to(stepsBlocoP.stepRegP010())
                .from(stepsBlocoP.stepRegP110())
                .next(stepsBlocoP.stepRegP199())
                    .on("*").to(stepsBlocoP.stepRegP100())
                .from(stepsBlocoP.stepRegP200())
                    .on(PROCESS_CHILD_REG).to(stepsBlocoP.stepRegP210())
                    .from(stepsBlocoP.stepRegP200())
                    .on(NO_MORE_REG).to(stepsBlocoP.stepRegP990())
                .from(stepsBlocoP.stepRegP210())
                    .on("*").to(stepsBlocoP.stepRegP200())
                .from(stepsBlocoP.stepRegP990())
                .end();
    }

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
