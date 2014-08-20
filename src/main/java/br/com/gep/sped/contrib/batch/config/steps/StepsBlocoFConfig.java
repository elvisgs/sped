package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoF.*;
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
public class StepsBlocoFConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean @Lazy(false)
    public Step stepRegF001() {
        return stepFactory.create("stepRegF001", RegF001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegF010() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF010.class);

        return stepFactory.create("stepRegF010", tasklet);
    }

    @Bean
    public Step stepRegF100() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF100.class);

        return stepFactory.create("stepRegF100", tasklet);
    }

    @Bean
    public Step stepRegF111() {
        return stepFactory.create("stepRegF111", RegF111.class, RegF100.class);
    }

    @Bean
    public Step stepRegF120() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF120.class);

        return stepFactory.create("stepRegF120", tasklet);
    }

    @Bean
    public Step stepRegF129() {
        return stepFactory.create("stepRegF129", RegF129.class, RegF120.class);
    }

    @Bean
    public Step stepRegF130() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF130.class);

        return stepFactory.create("stepRegF130", tasklet);
    }

    @Bean
    public Step stepRegF139() {
        return stepFactory.create("stepRegF139", RegF139.class, RegF130.class);
    }

    @Bean
    public Step stepRegF150() {
        return stepFactory.create("stepRegF150", RegF150.class, RegF010.class);
    }

    @Bean
    public Step stepRegF200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF200.class);

        return stepFactory.create("stepRegF200", tasklet);
    }

    @Bean
    public Step stepRegF205() {
        return stepFactory.create("stepRegF205", RegF205.class, RegF200.class);
    }

    @Bean
    public Step stepRegF210() {
        return stepFactory.create("stepRegF210", RegF210.class, RegF200.class);
    }

    @Bean
    public Step stepRegF211() {
        return stepFactory.create("stepRegF211", RegF211.class, RegF200.class);
    }

    @Bean
    public Step stepRegF500() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF500.class);

        return stepFactory.create("stepRegF500", tasklet);
    }

    @Bean
    public Step stepRegF509() {
        return stepFactory.create("stepRegF509", RegF509.class, RegF500.class);
    }

    @Bean
    public Step stepRegF510() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF510.class);

        return stepFactory.create("stepRegF510", tasklet);
    }

    @Bean
    public Step stepRegF519() {
        return stepFactory.create("stepRegF519", RegF519.class, RegF510.class);
    }

    @Bean
    public Step stepRegF525() {
        return stepFactory.create("stepRegF525", RegF525.class, RegF010.class);
    }

    @Bean
    public Step stepRegF550() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF550.class);

        return stepFactory.create("stepRegF550", tasklet);
    }

    @Bean
    public Step stepRegF559() {
        return stepFactory.create("stepRegF559", RegF559.class, RegF550.class);
    }

    @Bean
    public Step stepRegF560() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF560.class);

        return stepFactory.create("stepRegF560", tasklet);
    }

    @Bean
    public Step stepRegF569() {
        return stepFactory.create("stepRegF569", RegF569.class, RegF560.class);
    }

    @Bean
    public Step stepRegF600() {
        return stepFactory.create("stepRegF600", RegF600.class, RegF010.class);
    }

    @Bean
    public Step stepRegF700() {
        return stepFactory.create("stepRegF700", RegF700.class, RegF010.class);
    }

    @Bean
    public Step stepRegF800() {
        return stepFactory.create("stepRegF800", RegF800.class, RegF010.class);
    }

    @Bean @Lazy(false)
    public Step stepRegF990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegF990.class, Arrays.asList(
                RegF001.class, RegF010.class, RegF100.class, RegF111.class, RegF120.class,
                RegF129.class, RegF130.class, RegF139.class, RegF150.class, RegF200.class,
                RegF205.class, RegF210.class, RegF211.class, RegF500.class, RegF509.class,
                RegF510.class, RegF519.class, RegF525.class, RegF550.class, RegF559.class,
                RegF560.class, RegF569.class, RegF600.class, RegF700.class, RegF800.class
        ));

        return stepFactory.create("stepRegF990", tasklet);
    }
}
