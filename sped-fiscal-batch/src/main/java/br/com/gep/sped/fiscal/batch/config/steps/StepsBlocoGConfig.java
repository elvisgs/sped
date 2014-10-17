package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoG.*;
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
public class StepsBlocoGConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG001() throws Exception {
        return stepFactory.create("stepRegG001", RegG001.class, Reg0000.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG110() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegG110.class);

        return stepFactory.create("stepRegG110", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG125() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegG125.class);

        return stepFactory.create("stepRegG125", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG126() throws Exception {
        return stepFactory.create("stepRegG126", RegG126.class, RegG125.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG130() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegG130.class);

        return stepFactory.create("stepRegG130", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG140() throws Exception {
        return stepFactory.create("stepRegG140", RegG140.class, RegG130.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegG990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegG990.class, Arrays.asList(
                RegG001.class, RegG110.class, RegG125.class, RegG126.class, RegG130.class,
                RegG140.class));

        return stepFactory.create("stepRegG990", tasklet);
    }
}
