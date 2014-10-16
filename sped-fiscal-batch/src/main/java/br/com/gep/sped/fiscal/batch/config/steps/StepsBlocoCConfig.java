package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.blocoC.*;
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
public class StepsBlocoCConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC001() throws Exception {
        return stepFactory.create("stepRegC001", RegC001.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC100.class);

        return stepFactory.create("stepRegC100", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC105() throws Exception {
        return stepFactory.create("stepRegC105", RegC105.class, RegC100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC110() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC110.class);

        return stepFactory.create("stepRegC110", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC111() throws Exception {
        return stepFactory.create("stepRegC111", RegC111.class, RegC110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC112() throws Exception {
        return stepFactory.create("stepRegC112", RegC112.class, RegC110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC113() throws Exception {
        return stepFactory.create("stepRegC113", RegC113.class, RegC110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC114() throws Exception {
        return stepFactory.create("stepRegC114", RegC114.class, RegC110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC115() throws Exception {
        return stepFactory.create("stepRegC115", RegC115.class, RegC110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC116() throws Exception {
        return stepFactory.create("stepRegC116", RegC116.class, RegC110.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC120() throws Exception {
        return stepFactory.create("stepRegC120", RegC120.class, RegC100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC130() throws Exception {
        return stepFactory.create("stepRegC130", RegC130.class, RegC100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC140() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC140.class);

        return stepFactory.create("stepRegC140", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC141() throws Exception {
        return stepFactory.create("stepRegC141", RegC141.class, RegC140.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC160() throws Exception {
        return stepFactory.create("stepRegC160", RegC160.class, RegC100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC165() throws Exception {
        return stepFactory.create("stepRegC165", RegC165.class, RegC100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC170() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC170.class);

        return stepFactory.create("stepRegC170", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC171() throws Exception {
        return stepFactory.create("stepRegC171", RegC171.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC172() throws Exception {
        return stepFactory.create("stepRegC172", RegC172.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC173() throws Exception {
        return stepFactory.create("stepRegC173", RegC173.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC174() throws Exception {
        return stepFactory.create("stepRegC174", RegC174.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC175() throws Exception {
        return stepFactory.create("stepRegC175", RegC175.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC176() throws Exception {
        return stepFactory.create("stepRegC176", RegC176.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC177() throws Exception {
        return stepFactory.create("stepRegC177", RegC177.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC178() throws Exception {
        return stepFactory.create("stepRegC178", RegC178.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC179() throws Exception {
        return stepFactory.create("stepRegC179", RegC179.class, RegC170.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC190() throws Exception {
        return stepFactory.create("stepRegC190", RegC190.class, RegC100.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC195() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC195.class);

        return stepFactory.create("stepRegC195", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC197() throws Exception {
        return stepFactory.create("stepRegC197", RegC197.class, RegC195.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC300.class);

        return stepFactory.create("stepRegC300", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC310() throws Exception {
        return stepFactory.create("stepRegC310", RegC310.class, RegC300.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC320() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC320.class);

        return stepFactory.create("stepRegC320", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC321() throws Exception {
        return stepFactory.create("stepRegC321", RegC321.class, RegC320.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC350.class);

        return stepFactory.create("stepRegC350", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC370() throws Exception {
        return stepFactory.create("stepRegC370", RegC370.class, RegC350.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC390() throws Exception {
        return stepFactory.create("stepRegC390", RegC390.class, RegC350.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC400() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC400.class);

        return stepFactory.create("stepRegC400", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC405() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC405.class);

        return stepFactory.create("stepRegC405", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC410() throws Exception {
        return stepFactory.create("stepRegC410", RegC410.class, RegC405.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC420() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC420.class);

        return stepFactory.create("stepRegC420", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC425() throws Exception {
        return stepFactory.create("stepRegC425", RegC425.class, RegC420.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC460() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC460.class);

        return stepFactory.create("stepRegC460", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC465() throws Exception {
        return stepFactory.create("stepRegC465", RegC465.class, RegC460.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC470() throws Exception {
        return stepFactory.create("stepRegC470", RegC470.class, RegC460.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC490() throws Exception {
        return stepFactory.create("stepRegC490", RegC490.class, RegC405.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC500.class);

        return stepFactory.create("stepRegC500", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC510() throws Exception {
        return stepFactory.create("stepRegC510", RegC510.class, RegC500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC590() throws Exception {
        return stepFactory.create("stepRegC590", RegC590.class, RegC500.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC600.class);

        return stepFactory.create("stepRegC600", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC601() throws Exception {
        return stepFactory.create("stepRegC601", RegC601.class, RegC600.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC610() throws Exception {
        return stepFactory.create("stepRegC610", RegC610.class, RegC600.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC690() throws Exception {
        return stepFactory.create("stepRegC690", RegC690.class, RegC600.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC700() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC700.class);

        return stepFactory.create("stepRegC700", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC790() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC790.class);

        return stepFactory.create("stepRegC790", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC791() throws Exception {
        return stepFactory.create("stepRegC791", RegC791.class, RegC790.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC800() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC800.class);

        return stepFactory.create("stepRegC800", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC850() throws Exception {
        return stepFactory.create("stepRegC850", RegC850.class, RegC800.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC860() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC860.class);

        return stepFactory.create("stepRegC860", tasklet);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC890() throws Exception {
        return stepFactory.create("stepRegC890", RegC890.class, RegC860.class);
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegC990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegC990.class, Arrays.asList(
                RegC001.class, RegC100.class, RegC105.class, RegC110.class, RegC111.class,
                RegC112.class, RegC113.class, RegC114.class, RegC115.class, RegC116.class,
                RegC120.class, RegC130.class, RegC140.class, RegC141.class, RegC160.class,
                RegC165.class, RegC170.class, RegC171.class, RegC172.class, RegC173.class,
                RegC174.class, RegC175.class, RegC176.class, RegC177.class, RegC178.class,
                RegC179.class, RegC190.class, RegC195.class, RegC197.class, RegC300.class,
                RegC310.class, RegC320.class, RegC321.class, RegC350.class, RegC370.class,
                RegC390.class, RegC400.class, RegC405.class, RegC410.class, RegC420.class,
                RegC425.class, RegC460.class, RegC465.class, RegC470.class, RegC490.class,
                RegC500.class, RegC510.class, RegC590.class, RegC600.class, RegC601.class,
                RegC610.class, RegC690.class, RegC700.class, RegC790.class, RegC791.class,
                RegC800.class, RegC850.class, RegC860.class, RegC890.class));

        return stepFactory.create("stepRegC990", tasklet);
    }
}
