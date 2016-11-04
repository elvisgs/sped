package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.*;
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
public class FlowBloco0Config {

    @Autowired
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBloco0() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBloco0")
                .start(stepFactory.create(Reg0000.class))
                .next(stepFactory.create(Reg0001.class))
                .next(stepFactory.create(Reg0005.class))
                .next(stepFactory.create(Reg0015.class))
                .next(stepFactory.create(Reg0100.class))
                .next(stepFactory.create(Reg0150.class))
                .next(stepFactory.create(Reg0190.class))
                .next(stepFactory.create(Reg0200.class))
                .next(stepFactory.create(Reg0300.class))
                .next(stepFactory.create(Reg0400.class))
                .next(stepFactory.create(Reg0450.class))
                .next(stepFactory.create(Reg0460.class))
                .next(stepFactory.create(Reg0500.class))
                .next(stepFactory.create(Reg0600.class))
                .next(stepFactory.create(Reg0990.class))
                .end();
    }
}
