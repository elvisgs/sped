package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK001;
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK100;
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.RegK990;
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
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoK() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoK")
                .start(stepFactory.create(RegK001.class))
                .next(stepFactory.create(RegK100.class))
                .next(stepFactory.create(RegK990.class))
                .end();
    }
}
