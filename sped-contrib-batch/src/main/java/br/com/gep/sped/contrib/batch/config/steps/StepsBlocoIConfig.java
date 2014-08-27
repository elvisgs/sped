package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.blocoI.*;
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
public class StepsBlocoIConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI001() throws Exception {
        return stepFactory.create("stepRegI001", RegI001.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI010() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI010.class);

        return stepFactory.create("stepRegI010", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI100.class);

        return stepFactory.create("stepRegI100", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI200.class);

        return stepFactory.create("stepRegI200", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI300.class);

        return stepFactory.create("stepRegI300", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI399() throws Exception {
        return stepFactory.create("stepRegI399", RegI399.class, RegI300.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI299() throws Exception {
        return stepFactory.create("stepRegI299", RegI299.class, RegI200.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI199() throws Exception {
        return stepFactory.create("stepRegI199", RegI199.class, RegI100.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegI990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegI990.class, Arrays.asList(
                RegI001.class, RegI010.class, RegI100.class, RegI200.class, RegI300.class,
                RegI399.class, RegI299.class, RegI199.class
        ));

        return stepFactory.create("stepRegI990", tasklet);
    }
}
