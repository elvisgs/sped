package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.blocoD.*;
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
public class StepsBlocoDConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean @Lazy(false)
    public Step stepRegD001() {
        return stepFactory.create("stepRegD001", RegD001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegD010() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD010.class);

        return stepFactory.create("stepRegD010", tasklet);
    }

    @Bean
    public Step stepRegD100() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD100.class);

        return stepFactory.create("stepRegD100", tasklet);
    }

    @Bean
    public Step stepRegD101() {
        return stepFactory.create("stepRegD101", RegD101.class, RegD100.class);
    }

    @Bean
    public Step stepRegD105() {
        return stepFactory.create("stepRegD105", RegD105.class, RegD100.class);
    }

    @Bean
    public Step stepRegD111() {
        return stepFactory.create("stepRegD111", RegD111.class, RegD100.class);
    }

    @Bean
    public Step stepRegD200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD200.class);

        return stepFactory.create("stepRegD200", tasklet);
    }

    @Bean
    public Step stepRegD201() {
        return stepFactory.create("stepRegD201", RegD201.class, RegD200.class);
    }

    @Bean
    public Step stepRegD205() {
        return stepFactory.create("stepRegD205", RegD205.class, RegD200.class);
    }

    @Bean
    public Step stepRegD209() {
        return stepFactory.create("stepRegD209", RegD209.class, RegD200.class);
    }

    @Bean
    public Step stepRegD300() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD300.class);

        return stepFactory.create("stepRegD300", tasklet);
    }

    @Bean
    public Step stepRegD309() {
        return stepFactory.create("stepRegD309", RegD309.class, RegD300.class);
    }

    @Bean
    public Step stepRegD350() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD350.class);

        return stepFactory.create("stepRegD350", tasklet);
    }

    @Bean
    public Step stepRegD359() {
        return stepFactory.create("stepRegD359", RegD359.class, RegD350.class);
    }

    @Bean
    public Step stepRegD500() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD500.class);

        return stepFactory.create("stepRegD500", tasklet);
    }

    @Bean
    public Step stepRegD501() {
        return stepFactory.create("stepRegD501", RegD501.class, RegD500.class);
    }

    @Bean
    public Step stepRegD505() {
        return stepFactory.create("stepRegD505", RegD505.class, RegD500.class);
    }

    @Bean
    public Step stepRegD509() {
        return stepFactory.create("stepRegD509", RegD509.class, RegD500.class);
    }

    @Bean
    public Step stepRegD600() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD600.class);

        return stepFactory.create("stepRegD600", tasklet);
    }

    @Bean
    public Step stepRegD601() {
        return stepFactory.create("stepRegD601", RegD601.class, RegD600.class);
    }

    @Bean
    public Step stepRegD605() {
        return stepFactory.create("stepRegD605", RegD605.class, RegD600.class);
    }

    @Bean
    public Step stepRegD609() {
        return stepFactory.create("stepRegD609", RegD609.class, RegD600.class);
    }

    @Bean @Lazy(false)
    public Step stepRegD990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegD990.class, Arrays.asList(
                RegD001.class, RegD010.class, RegD100.class, RegD101.class, RegD105.class,
                RegD111.class, RegD200.class, RegD201.class, RegD205.class, RegD209.class,
                RegD300.class, RegD309.class, RegD350.class, RegD359.class, RegD500.class,
                RegD501.class, RegD505.class, RegD509.class, RegD600.class, RegD601.class,
                RegD605.class, RegD609.class
        ));

        return stepFactory.create("stepRegD990", tasklet);
    }
}
