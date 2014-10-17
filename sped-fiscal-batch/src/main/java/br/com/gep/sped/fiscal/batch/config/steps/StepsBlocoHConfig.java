package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoH.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBlocoHConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegH001() throws Exception {
        return stepFactory.create("stepRegH001", RegH001.class, Reg0000.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegH005() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegH005.class);

        return stepFactory.create("stepRegH005", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegH010() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegH010.class);

        return stepFactory.create("stepRegH010", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegH020() throws Exception {
        return stepFactory.create("stepRegH020", RegH020.class, RegH010.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegH990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegH990.class, Arrays.asList(
                RegH001.class, RegH005.class, RegH010.class, RegH020.class));

        return stepFactory.create("stepRegH990", tasklet);
    }
}
