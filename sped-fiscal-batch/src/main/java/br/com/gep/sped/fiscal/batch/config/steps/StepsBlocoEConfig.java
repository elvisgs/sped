package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoE.*;
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
public class StepsBlocoEConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE001() throws Exception {
        return stepFactory.create("stepRegE001", RegE001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE100.class);

        return stepFactory.create("stepRegE100", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE110() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE110.class);

        return stepFactory.create("stepRegE110", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE111() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE111.class);

        return stepFactory.create("stepRegE111", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE112() throws Exception {
        return stepFactory.create("stepRegE112", RegE112.class, RegE111.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE113() throws Exception {
        return stepFactory.create("stepRegE113", RegE113.class, RegE111.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE115() throws Exception {
        return stepFactory.create("stepRegE115", RegE115.class, RegE110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE116() throws Exception {
        return stepFactory.create("stepRegE116", RegE116.class, RegE110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE200.class);

        return stepFactory.create("stepRegE200", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE210() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE210.class);

        return stepFactory.create("stepRegE210", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE220() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE220.class);

        return stepFactory.create("stepRegE220", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE230() throws Exception {
        return stepFactory.create("stepRegE230", RegE230.class, RegE220.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE240() throws Exception {
        return stepFactory.create("stepRegE240", RegE240.class, RegE220.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE250() throws Exception {
        return stepFactory.create("stepRegE250", RegE250.class, RegE210.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE500.class);

        return stepFactory.create("stepRegE500", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE510() throws Exception {
        return stepFactory.create("stepRegE510", RegE510.class, RegE500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE520() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegE520.class);

        return stepFactory.create("stepRegE520", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE530() throws Exception {
        return stepFactory.create("stepRegE530", RegE530.class, RegE520.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegE990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegE990.class, Arrays.asList(
                RegE001.class, RegE100.class, RegE110.class, RegE111.class, RegE112.class,
                RegE113.class, RegE115.class, RegE116.class, RegE200.class, RegE210.class,
                RegE220.class, RegE230.class, RegE240.class, RegE250.class, RegE500.class,
                RegE510.class, RegE520.class, RegE530.class));

        return stepFactory.create("stepRegE990", tasklet);
    }
}
