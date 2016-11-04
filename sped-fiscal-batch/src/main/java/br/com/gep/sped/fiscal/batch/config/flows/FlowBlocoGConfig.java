package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoG.RegG001;
import br.com.gep.sped.fiscal.marshaller.registros.blocoG.RegG110;
import br.com.gep.sped.fiscal.marshaller.registros.blocoG.RegG990;
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
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoG() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoG")
                .start(stepFactory.create(RegG001.class))
                .next(stepFactory.create(RegG110.class))
                .next(stepFactory.create(RegG990.class))
                .end();
    }
}
