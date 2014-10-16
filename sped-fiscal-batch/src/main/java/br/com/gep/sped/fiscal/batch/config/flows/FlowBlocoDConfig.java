package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBlocoDConfig;
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
public class FlowBlocoDConfig {

    @Autowired
    private StepsBlocoDConfig stepsBlocoD;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoD() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoD")
                .start(stepsBlocoD.stepRegD001())
                .next(stepsBlocoD.stepRegD100())
                .next(stepsBlocoD.stepRegD300())
                .next(stepsBlocoD.stepRegD350())
                .next(stepsBlocoD.stepRegD400())
                .next(stepsBlocoD.stepRegD500())
                .next(stepsBlocoD.stepRegD600())
                .next(stepsBlocoD.stepRegD695())
                .next(stepsBlocoD.stepRegD990())
                .end();
    }
}
