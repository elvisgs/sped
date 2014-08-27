package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoAConfig;
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
public class FlowBlocoAConfig {

    @Autowired
    private StepsBlocoAConfig stepsBlocoA;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoA() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoA")
                .start(stepsBlocoA.stepRegA001())
                .next(stepsBlocoA.stepRegA010())
                .next(stepsBlocoA.stepRegA990())
                .end();
    }
}
