package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoDConfig;
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
                .next(stepsBlocoD.stepRegD010())
                .next(stepsBlocoD.stepRegD990())
                .end();
    }
}
