package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBlocoHConfig;
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
public class FlowBlocoHConfig {

    @Autowired
    private StepsBlocoHConfig stepsBlocoH;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoH() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoH")
                .start(stepsBlocoH.stepRegH001())
                .next(stepsBlocoH.stepRegH005())
                .next(stepsBlocoH.stepRegH990())
                .end();
    }
}