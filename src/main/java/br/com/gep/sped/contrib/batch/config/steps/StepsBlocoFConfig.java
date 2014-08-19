package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.config.readers.ItemReadersBlocoFConfig;
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

    @Autowired
    private ItemReadersBlocoFConfig itemReaders;

    @Bean @Lazy(false)
    public Step stepRegF001() {
        return stepFactory.create("stepRegF001", itemReaders.regF001ItemReader(), 1);
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
        return stepFactory.create("stepRegF111", itemReaders.regF111ItemReader());
    }

    @Bean
    public Step stepRegF120() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF120.class);

        return stepFactory.create("stepRegF120", tasklet);
    }

    @Bean
    public Step stepRegF129() {
        return stepFactory.create("stepRegF129", itemReaders.regF129ItemReader());
    }

    @Bean
    public Step stepRegF130() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF130.class);

        return stepFactory.create("stepRegF130", tasklet);
    }

    @Bean
    public Step stepRegF139() {
        return stepFactory.create("stepRegF139", itemReaders.regF139ItemReader());
    }

    @Bean
    public Step stepRegF150() {
        return stepFactory.create("stepRegF150", itemReaders.regF150ItemReader());
    }

    @Bean
    public Step stepRegF200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF200.class);

        return stepFactory.create("stepRegF200", tasklet);
    }

    @Bean
    public Step stepRegF205() {
        return stepFactory.create("stepRegF205", itemReaders.regF205ItemReader());
    }

    @Bean
    public Step stepRegF210() {
        return stepFactory.create("stepRegF210", itemReaders.regF210ItemReader());
    }

    @Bean
    public Step stepRegF211() {
        return stepFactory.create("stepRegF211", itemReaders.regF211ItemReader());
    }

    @Bean
    public Step stepRegF500() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF500.class);

        return stepFactory.create("stepRegF500", tasklet);
    }

    @Bean
    public Step stepRegF509() {
        return stepFactory.create("stepRegF509", itemReaders.regF509ItemReader());
    }

    @Bean
    public Step stepRegF510() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF510.class);

        return stepFactory.create("stepRegF510", tasklet);
    }

    @Bean
    public Step stepRegF519() {
        return stepFactory.create("stepRegF519", itemReaders.regF519ItemReader());
    }

    @Bean
    public Step stepRegF525() {
        return stepFactory.create("stepRegF525", itemReaders.regF525ItemReader());
    }

    @Bean
    public Step stepRegF550() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF550.class);

        return stepFactory.create("stepRegF550", tasklet);
    }

    @Bean
    public Step stepRegF559() {
        return stepFactory.create("stepRegF559", itemReaders.regF559ItemReader());
    }

    @Bean
    public Step stepRegF560() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegF560.class);

        return stepFactory.create("stepRegF560", tasklet);
    }

    @Bean
    public Step stepRegF569() {
        return stepFactory.create("stepRegF569", itemReaders.regF569ItemReader());
    }

    @Bean
    public Step stepRegF600() {
        return stepFactory.create("stepRegF600", itemReaders.regF600ItemReader());
    }

    @Bean
    public Step stepRegF700() {
        return stepFactory.create("stepRegF700", itemReaders.regF700ItemReader());
    }

    @Bean
    public Step stepRegF800() {
        return stepFactory.create("stepRegF800", itemReaders.regF800ItemReader());
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
