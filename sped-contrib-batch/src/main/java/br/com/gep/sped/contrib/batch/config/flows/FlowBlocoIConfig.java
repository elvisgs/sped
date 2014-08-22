package br.com.gep.sped.contrib.batch.config.flows;

import br.com.gep.sped.contrib.batch.config.steps.StepsBlocoIConfig;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.job.flow.support.SimpleFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class FlowBlocoIConfig {

    @Autowired
    private StepsBlocoIConfig stepsBlocoI;

    @Bean
    @Lazy
    public Flow flowBlocoI() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoI")
                .start(stepsBlocoI.stepRegI001())
                .next(stepsBlocoI.stepRegI010())
                .next(stepsBlocoI.stepRegI990())
                .end();
    }
}
