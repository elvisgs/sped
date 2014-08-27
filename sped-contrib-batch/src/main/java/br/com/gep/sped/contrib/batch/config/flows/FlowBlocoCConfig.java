package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoCConfig;
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
public class FlowBlocoCConfig {

    @Autowired
    private StepsBlocoCConfig stepsBlocoC;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoC() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoC")
                .start(stepsBlocoC.stepRegC001())
                .next(stepsBlocoC.stepRegC010())
                .next(stepsBlocoC.stepRegC990())
                .end();
    }
}
