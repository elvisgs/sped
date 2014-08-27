package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoPConfig;
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
public class FlowBlocoPConfig {

    @Autowired
    private StepsBlocoPConfig stepsBlocoP;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoP() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoP")
                .start(stepsBlocoP.stepRegP001())
                .next(stepsBlocoP.stepRegP010())
                .next(stepsBlocoP.stepRegP200())
                .next(stepsBlocoP.stepRegP990())
                .end();
    }
}
