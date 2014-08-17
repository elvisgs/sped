package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoCConfig;
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
public class FlowBlocoCConfig {

    @Autowired
    private StepsBlocoCConfig stepsBlocoC;

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
}
