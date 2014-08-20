package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoI.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@Lazy
public class StepsBlocoIConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean @Lazy(false)
    public Step stepRegI001() {
        return stepFactory.create("stepRegI001", RegI001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegI010() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI010.class);

        return stepFactory.create("stepRegI010", tasklet);
    }

    @Bean
    public Step stepRegI100() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI100.class);

        return stepFactory.create("stepRegI100", tasklet);
    }

    @Bean
    public Step stepRegI200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI200.class);

        return stepFactory.create("stepRegI200", tasklet);
    }

    @Bean
    public Step stepRegI300() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegI300.class);

        return stepFactory.create("stepRegI300", tasklet);
    }

    @Bean
    public Step stepRegI399() {
        return stepFactory.create("stepRegI399", RegI399.class, RegI300.class);
    }

    @Bean
    public Step stepRegI299() {
        return stepFactory.create("stepRegI299", RegI299.class, RegI200.class);
    }

    @Bean
    public Step stepRegI199() {
        return stepFactory.create("stepRegI199", RegI199.class, RegI100.class);
    }

    @Bean @Lazy(false)
    public Step stepRegI990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegI990.class, Arrays.asList(
                RegI001.class, RegI010.class, RegI100.class, RegI200.class, RegI300.class,
                RegI399.class, RegI299.class, RegI199.class
        ));

        return stepFactory.create("stepRegI990", tasklet);
    }
}
