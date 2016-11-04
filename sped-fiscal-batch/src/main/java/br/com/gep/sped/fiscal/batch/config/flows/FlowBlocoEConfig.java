package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoE.*;
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
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoE() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoE")
                .start(stepFactory.create(RegE001.class))
                .next(stepFactory.create(RegE100.class))
                .next(stepFactory.create(RegE200.class))
                .next(stepFactory.create(RegE500.class))
                .next(stepFactory.create(RegE990.class))
                .end();
    }
}
