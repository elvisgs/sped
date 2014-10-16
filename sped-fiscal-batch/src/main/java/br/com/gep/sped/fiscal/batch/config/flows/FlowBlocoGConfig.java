package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBlocoGConfig;
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
public class FlowBlocoGConfig {

    @Autowired
    private StepsBlocoGConfig stepsBlocoG;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoG() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoG")
                .start(stepsBlocoG.stepRegG001())
                .next(stepsBlocoG.stepRegG110())
                .next(stepsBlocoG.stepRegG990())
                .end();
    }
}
