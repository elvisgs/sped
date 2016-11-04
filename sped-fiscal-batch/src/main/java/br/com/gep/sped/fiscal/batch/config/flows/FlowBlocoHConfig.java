package br.com.gep.sped.fiscal.batch.config.flows;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoH.RegH001;
import br.com.gep.sped.fiscal.marshaller.registros.blocoH.RegH005;
import br.com.gep.sped.fiscal.marshaller.registros.blocoH.RegH990;
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
public class FlowBlocoHConfig {

    @Autowired
    private StepFactory stepFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Flow flowBlocoH() throws Exception {
        return new FlowBuilder<SimpleFlow>("flowBlocoH")
                .start(stepFactory.create(RegH001.class))
                .next(stepFactory.create(RegH005.class))
                .next(stepFactory.create(RegH990.class))
                .end();
    }
}
