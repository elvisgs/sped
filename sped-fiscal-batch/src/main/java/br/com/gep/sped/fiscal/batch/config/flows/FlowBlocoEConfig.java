package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBlocoEConfig;
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
public class FlowBlocoEConfig {

    @Autowired
    private StepsBlocoEConfig stepsBlocoE;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoE() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoE")
                .start(stepsBlocoE.stepRegE001())
                .next(stepsBlocoE.stepRegE100())
                .next(stepsBlocoE.stepRegE200())
                .next(stepsBlocoE.stepRegE500())
                .next(stepsBlocoE.stepRegE990())
                .end();
    }
}
