package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco1.*;
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
public class StepsBloco1Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1001() throws Exception {
        return stepFactory.create("stepReg1001", Reg1001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1010() throws Exception {
        return stepFactory.create("stepReg1010", Reg1010.class, Reg1001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1100.class);

        return stepFactory.create("stepReg1100", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1105() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1105.class);

        return stepFactory.create("stepReg1105", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1110() throws Exception {
        return stepFactory.create("stepReg1110", Reg1110.class, Reg1105.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1200.class);

        return stepFactory.create("stepReg1200", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1210() throws Exception {
        return stepFactory.create("stepReg1210", Reg1210.class, Reg1200.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1300.class);

        return stepFactory.create("stepReg1300", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1310() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1310.class);

        return stepFactory.create("stepReg1310", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1320() throws Exception {
        return stepFactory.create("stepReg1320", Reg1320.class, Reg1310.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1350.class);

        return stepFactory.create("stepReg1350", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1360() throws Exception {
        return stepFactory.create("stepReg1360", Reg1360.class, Reg1350.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1370() throws Exception {
        return stepFactory.create("stepReg1370", Reg1370.class, Reg1350.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1390() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1390.class);

        return stepFactory.create("stepReg1390", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1391() throws Exception {
        return stepFactory.create("stepReg1391", Reg1391.class, Reg1390.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1400() throws Exception {
        return stepFactory.create("stepReg1400", Reg1400.class, Reg1001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1500.class);

        return stepFactory.create("stepReg1500", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1510() throws Exception {
        return stepFactory.create("stepReg1510", Reg1510.class, Reg1500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1600() throws Exception {
        return stepFactory.create("stepReg1600", Reg1600.class, Reg1001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1700() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1700.class);

        return stepFactory.create("stepReg1700", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1710() throws Exception {
        return stepFactory.create("stepReg1710", Reg1710.class, Reg1700.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1800() throws Exception {
        return stepFactory.create("stepReg1800", Reg1800.class, Reg1001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1900() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1900.class);

        return stepFactory.create("stepReg1900", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1910() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1910.class);

        return stepFactory.create("stepReg1910", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1920() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1920.class);

        return stepFactory.create("stepReg1920", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1921() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg1921.class);

        return stepFactory.create("stepReg1921", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1922() throws Exception {
        return stepFactory.create("stepReg1922", Reg1922.class, Reg1921.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1923() throws Exception {
        return stepFactory.create("stepReg1923", Reg1923.class, Reg1921.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1925() throws Exception {
        return stepFactory.create("stepReg1925", Reg1925.class, Reg1920.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1926() throws Exception {
        return stepFactory.create("stepReg1926", Reg1926.class, Reg1920.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg1990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(Reg1990.class, Arrays.asList(
                Reg1001.class, Reg1010.class, Reg1100.class, Reg1105.class, Reg1110.class,
                Reg1200.class, Reg1210.class, Reg1300.class, Reg1310.class, Reg1320.class,
                Reg1350.class, Reg1360.class, Reg1370.class, Reg1390.class, Reg1391.class,
                Reg1400.class, Reg1500.class, Reg1510.class, Reg1600.class, Reg1700.class,
                Reg1710.class, Reg1800.class, Reg1900.class, Reg1910.class, Reg1920.class,
                Reg1921.class, Reg1922.class, Reg1923.class, Reg1925.class, Reg1926.class));

        return stepFactory.create("stepReg1990", tasklet);
    }
}
