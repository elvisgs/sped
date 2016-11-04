package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoC.*;
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
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoC() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoC")
                .start(stepFactory.create(RegC001.class))
                .next(stepFactory.create(RegC100.class))
                .next(stepFactory.create(RegC300.class))
                .next(stepFactory.create(RegC350.class))
                .next(stepFactory.create(RegC400.class))
                .next(stepFactory.create(RegC500.class))
                .next(stepFactory.create(RegC600.class))
                .next(stepFactory.create(RegC700.class))
                .next(stepFactory.create(RegC800.class))
                .next(stepFactory.create(RegC860.class))
                .next(stepFactory.create(RegC990.class))
                .end();
    }
}
