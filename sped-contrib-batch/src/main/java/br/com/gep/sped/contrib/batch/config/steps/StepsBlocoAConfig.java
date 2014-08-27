package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.blocoA.*;
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
public class StepsBlocoAConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA001() throws Exception {
        return stepFactory.create("stepRegA001", RegA001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA010() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegA010.class);

        return stepFactory.create("stepRegA010", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegA100.class);

        return stepFactory.create("stepRegA100", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA110() throws Exception {
        return stepFactory.create("stepRegA110", RegA110.class, RegA100.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA111() throws Exception {
        return stepFactory.create("stepRegA111", RegA111.class, RegA100.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA120() throws Exception {
        return stepFactory.create("stepRegA120", RegA120.class, RegA100.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA170() throws Exception {
        return stepFactory.create("stepRegA170", RegA170.class, RegA100.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegA990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegA990.class, Arrays.asList(
                RegA001.class, RegA010.class, RegA100.class, RegA110.class,
                RegA111.class, RegA120.class, RegA170.class));

        return stepFactory.create("stepRegA990", tasklet);
    }
}
