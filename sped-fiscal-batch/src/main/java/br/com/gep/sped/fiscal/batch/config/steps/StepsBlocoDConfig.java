package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoD.*;
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
public class StepsBlocoDConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD001() throws Exception {
        return stepFactory.create("stepRegD001", RegD001.class, Reg0000.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD100.class);

        return stepFactory.create("stepRegD100", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD110() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD110.class);

        return stepFactory.create("stepRegD110", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD120() throws Exception {
        return stepFactory.create("stepRegD120", RegD120.class, RegD110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD130() throws Exception {
        return stepFactory.create("stepRegD130", RegD130.class, RegD100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD140() throws Exception {
        return stepFactory.create("stepRegD140", RegD140.class, RegD100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD150() throws Exception {
        return stepFactory.create("stepRegD150", RegD150.class, RegD100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD160() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD160.class);

        return stepFactory.create("stepRegD160", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD161() throws Exception {
        return stepFactory.create("stepRegD161", RegD161.class, RegD160.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD162() throws Exception {
        return stepFactory.create("stepRegD162", RegD162.class, RegD160.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD170() throws Exception {
        return stepFactory.create("stepRegD170", RegD170.class, RegD100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD180() throws Exception {
        return stepFactory.create("stepRegD180", RegD180.class, RegD100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD190() throws Exception {
        return stepFactory.create("stepRegD190", RegD190.class, RegD100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD195() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD195.class);

        return stepFactory.create("stepRegD195", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD197() throws Exception {
        return stepFactory.create("stepRegD197", RegD197.class, RegD195.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD300.class);

        return stepFactory.create("stepRegD300", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD301() throws Exception {
        return stepFactory.create("stepRegD301", RegD301.class, RegD300.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD310() throws Exception {
        return stepFactory.create("stepRegD310", RegD310.class, RegD300.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD350.class);

        return stepFactory.create("stepRegD350", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD355() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD355.class);

        return stepFactory.create("stepRegD355", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD360() throws Exception {
        return stepFactory.create("stepRegD360", RegD360.class, RegD355.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD365() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD365.class);

        return stepFactory.create("stepRegD365", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD370() throws Exception {
        return stepFactory.create("stepRegD370", RegD370.class, RegD365.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD390() throws Exception {
        return stepFactory.create("stepRegD390", RegD390.class, RegD355.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD400() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD400.class);

        return stepFactory.create("stepRegD400", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD410() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD410.class);

        return stepFactory.create("stepRegD410", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD411() throws Exception {
        return stepFactory.create("stepRegD411", RegD411.class, RegD410.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD420() throws Exception {
        return stepFactory.create("stepRegD420", RegD420.class, RegD400.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD500.class);

        return stepFactory.create("stepRegD500", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD510() throws Exception {
        return stepFactory.create("stepRegD510", RegD510.class, RegD500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD530() throws Exception {
        return stepFactory.create("stepRegD530", RegD530.class, RegD500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD590() throws Exception {
        return stepFactory.create("stepRegD590", RegD590.class, RegD500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD600.class);

        return stepFactory.create("stepRegD600", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD610() throws Exception {
        return stepFactory.create("stepRegD610", RegD610.class, RegD600.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD690() throws Exception {
        return stepFactory.create("stepRegD690", RegD690.class, RegD600.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD695() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD695.class);

        return stepFactory.create("stepRegD695", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD696() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD696.class);

        return stepFactory.create("stepRegD696", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD697() throws Exception {
        return stepFactory.create("stepRegD697", RegD697.class, RegD696.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegD990.class, Arrays.asList(
                RegD001.class, RegD100.class, RegD110.class, RegD120.class, RegD130.class,
                RegD140.class, RegD150.class, RegD160.class, RegD161.class, RegD162.class,
                RegD170.class, RegD180.class, RegD190.class, RegD195.class, RegD197.class,
                RegD300.class, RegD301.class, RegD310.class, RegD350.class, RegD355.class,
                RegD360.class, RegD365.class, RegD370.class, RegD390.class, RegD400.class,
                RegD410.class, RegD411.class, RegD420.class, RegD500.class, RegD510.class,
                RegD530.class, RegD590.class, RegD600.class, RegD610.class, RegD690.class,
                RegD695.class, RegD696.class, RegD697.class));

        return stepFactory.create("stepRegD990", tasklet);
    }
}
