package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.fiscal.batch.config.steps.StepsBlocoKConfig;
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
public class FlowBlocoKConfig {

    @Autowired
    private StepsBlocoKConfig stepsBlocoK;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoK() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoK")
                .start(stepsBlocoK.stepRegK001())
                .next(stepsBlocoK.stepRegK100())
                .next(stepsBlocoK.stepRegK990())
                .end();
    }
}
