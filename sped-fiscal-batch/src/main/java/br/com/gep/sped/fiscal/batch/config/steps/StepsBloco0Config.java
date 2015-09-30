package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.batch.config.ItemReadersConfig;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBloco0Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersConfig itemReaders;

    @Autowired
    private ItemWriterFactory itemWriterFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0000() throws Exception {
        return stepFactory.create("stepReg0000", Reg0000.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0001() throws Exception {
        return stepFactory.create("stepReg0001", Reg0001.class, Reg0000.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0005() throws Exception {
        return stepFactory.create("stepReg0005", Reg0005.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0015() throws Exception {
        return stepFactory.create("stepReg0015", Reg0015.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0100() throws Exception {
        return stepFactory.create("stepReg0100", Reg0100.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0150() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0150.class);

        return stepFactory.create("stepReg0150", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0175() throws Exception {
        return stepFactory.create("stepReg0175", Reg0175.class, Reg0150.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0190() throws Exception {
        return stepFactory.create("stepReg0190", Reg0190.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0200.class);

        return stepFactory.create("stepReg0200", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0205() throws Exception {
        return stepFactory.create("stepReg0205", Reg0205.class, Reg0200.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0206() throws Exception {
        return stepFactory.create("stepReg0206", Reg0206.class, Reg0200.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0220() throws Exception {
        return stepFactory.create("stepReg0220", Reg0220.class, Reg0200.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0300.class);

        return stepFactory.create("stepReg0300", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0305() throws Exception {
        return stepFactory.create("stepReg0305", Reg0305.class, Reg0300.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0400() throws Exception {
        return stepFactory.create("stepReg0400", Reg0400.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0450() throws Exception {
        return stepFactory.create("stepReg0450", Reg0450.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0460() throws Exception {
        return stepFactory.create("stepReg0460", Reg0460.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0500() throws Exception {
        return stepFactory.create("stepReg0500", Reg0500.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0600() throws Exception {
        return stepFactory.create("stepReg0600", Reg0600.class, Reg0001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(Reg0990.class, Arrays.asList(
                Reg0000.class, Reg0001.class, Reg0005.class, Reg0015.class, Reg0100.class,
                Reg0150.class, Reg0175.class, Reg0190.class, Reg0200.class, Reg0205.class,
                Reg0206.class, Reg0220.class, Reg0300.class, Reg0305.class, Reg0400.class,
                Reg0450.class, Reg0460.class, Reg0500.class, Reg0600.class));

        return stepFactory.create("stepReg0990", tasklet);
    }
}
