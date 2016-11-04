package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco1.*;
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
public class FlowBloco1Config {

    @Autowired
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBloco1() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBloco1")
                .start(stepFactory.create(Reg1001.class))
                .next(stepFactory.create(Reg1010.class))
                .next(stepFactory.create(Reg1100.class))
                .next(stepFactory.create(Reg1200.class))
                .next(stepFactory.create(Reg1300.class))
                .next(stepFactory.create(Reg1350.class))
                .next(stepFactory.create(Reg1390.class))
                .next(stepFactory.create(Reg1400.class))
                .next(stepFactory.create(Reg1500.class))
                .next(stepFactory.create(Reg1600.class))
                .next(stepFactory.create(Reg1700.class))
                .next(stepFactory.create(Reg1800.class))
                .next(stepFactory.create(Reg1900.class))
                .next(stepFactory.create(Reg1990.class))
                .end();
    }
}
