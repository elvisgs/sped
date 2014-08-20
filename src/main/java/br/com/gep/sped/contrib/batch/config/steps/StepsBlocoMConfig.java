package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoM.*;
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
public class StepsBlocoMConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean @Lazy(false)
    public Step stepRegM001() {
        return stepFactory.create("stepRegM001", RegM001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM100() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM100.class);

        return stepFactory.create("stepRegM100", tasklet);
    }

    @Bean
    public Step stepRegM105() {
        return stepFactory.create("stepRegM105", RegM105.class, RegM100.class);
    }

    @Bean
    public Step stepRegM110() {
        return stepFactory.create("stepRegM110", RegM110.class, RegM100.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM200.class);

        return stepFactory.create("stepRegM200", tasklet);
    }

    @Bean
    public Step stepRegM205() {
        return stepFactory.create("stepRegM205", RegM205.class, RegM200.class);
    }

    @Bean
    public Step stepRegM210() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM210.class);

        return stepFactory.create("stepRegM210", tasklet);
    }

    @Bean
    public Step stepRegM211() {
        return stepFactory.create("stepRegM211", RegM211.class, RegM210.class);
    }

    @Bean
    public Step stepRegM220() {
        return stepFactory.create("stepRegM220", RegM220.class, RegM210.class);
    }

    @Bean
    public Step stepRegM230() {
        return stepFactory.create("stepRegM230", RegM230.class, RegM210.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM300() {
        return stepFactory.create("stepRegM300", RegM300.class, RegM001.class);
    }

    @Bean
    public Step stepRegM350() {
        return stepFactory.create("stepRegM350", RegM350.class, RegM001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM400() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM400.class);

        return stepFactory.create("stepRegM400", tasklet);
    }

    @Bean
    public Step stepRegM410() {
        return stepFactory.create("stepRegM410", RegM410.class, RegM400.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM500() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM500.class);

        return stepFactory.create("stepRegM500", tasklet);
    }

    @Bean
    public Step stepRegM505() {
        return stepFactory.create("stepRegM505", RegM505.class, RegM500.class);
    }

    @Bean
    public Step stepRegM510() {
        return stepFactory.create("stepRegM510", RegM510.class, RegM500.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM600() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM600.class);

        return stepFactory.create("stepRegM600", tasklet);
    }

    @Bean
    public Step stepRegM605() {
        return stepFactory.create("stepRegM605", RegM605.class, RegM600.class);
    }

    @Bean
    public Step stepRegM610() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM610.class);

        return stepFactory.create("stepRegM610", tasklet);
    }

    @Bean
    public Step stepRegM611() {
        return stepFactory.create("stepRegM611", RegM611.class, RegM610.class);
    }

    @Bean
    public Step stepRegM620() {
        return stepFactory.create("stepRegM620", RegM620.class, RegM610.class);
    }

    @Bean
    public Step stepRegM630() {
        return stepFactory.create("stepRegM630", RegM630.class, RegM610.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM700() {
        return stepFactory.create("stepRegM700", RegM700.class, RegM001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM800() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM800.class);

        return stepFactory.create("stepRegM800", tasklet);
    }

    @Bean
    public Step stepRegM810() {
        return stepFactory.create("stepRegM810", RegM810.class, RegM800.class);
    }

    @Bean @Lazy(false)
    public Step stepRegM990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegM990.class, Arrays.asList(
                RegM001.class, RegM100.class, RegM105.class, RegM110.class, RegM200.class,
                RegM205.class, RegM210.class, RegM211.class, RegM220.class, RegM230.class,
                RegM300.class, RegM350.class, RegM400.class, RegM410.class, RegM500.class,
                RegM505.class, RegM510.class, RegM600.class, RegM605.class, RegM610.class,
                RegM611.class, RegM620.class, RegM630.class, RegM700.class, RegM800.class,
                RegM810.class
        ));

        return stepFactory.create("stepRegM990", tasklet);
    }
}
