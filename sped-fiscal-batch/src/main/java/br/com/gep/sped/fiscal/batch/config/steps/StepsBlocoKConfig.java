package br.com.gep.sped.fiscal.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.fiscal.marshaller.registros.blocoK.*;
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
public class StepsBlocoKConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK001() throws Exception {
        return stepFactory.create("stepRegK001", RegK001.class, Reg0000.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegK100.class);

        return stepFactory.create("stepRegK100", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK200() throws Exception {
        return stepFactory.create("stepRegK200", RegK200.class, RegK100.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK220() throws Exception {
        return stepFactory.create("stepRegK220", RegK220.class, RegK100.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK230() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegK230.class);

        return stepFactory.create("stepRegK230", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK235() throws Exception {
        return stepFactory.create("stepRegK235", RegK235.class, RegK230.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK250() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegK250.class);

        return stepFactory.create("stepRegK250", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK255() throws Exception {
        return stepFactory.create("stepRegK255", RegK255.class, RegK250.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegK990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegK990.class, Arrays.asList(
            RegK001.class, RegK100.class, RegK200.class, RegK220.class, RegK230.class, RegK235.class,
            RegK250.class, RegK255.class));

        return stepFactory.create("stepRegK990", tasklet);
    }
}
