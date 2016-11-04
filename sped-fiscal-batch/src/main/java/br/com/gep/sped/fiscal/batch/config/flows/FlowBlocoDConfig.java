package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoD.*;
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
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoD() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoD")
                .start(stepFactory.create(RegD001.class))
                .next(stepFactory.create(RegD100.class))
                .next(stepFactory.create(RegD300.class))
                .next(stepFactory.create(RegD350.class))
                .next(stepFactory.create(RegD400.class))
                .next(stepFactory.create(RegD500.class))
                .next(stepFactory.create(RegD600.class))
                .next(stepFactory.create(RegD695.class))
                .next(stepFactory.create(RegD990.class))
                .end();
    }
}
