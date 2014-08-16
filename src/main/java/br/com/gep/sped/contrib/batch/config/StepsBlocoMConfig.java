package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoM.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBlocoMConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersBlocoMConfig itemReaders;

    @Bean
    public Step stepRegM001() {
        return stepFactory.create("stepRegM001", itemReaders.regM001ItemReader(), 1);
    }

    @Bean
    public Step stepRegM100() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM100.class, itemReaders.regM100ItemReader());

        return stepFactory.create("stepRegM100", tasklet);
    }

    @Bean
    public Step stepRegM105() {
        return stepFactory.create("stepRegM105", itemReaders.regM105ItemReader());
    }

    @Bean
    public Step stepRegM110() {
        return stepFactory.create("stepRegM110", itemReaders.regM110ItemReader());
    }

    @Bean
    public Step stepRegM200() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM200.class, itemReaders.regM200ItemReader());

        return stepFactory.create("stepRegM200", tasklet);
    }

    @Bean
    public Step stepRegM205() {
        return stepFactory.create("stepRegM205", itemReaders.regM205ItemReader());
    }

    @Bean
    public Step stepRegM210() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM210.class, itemReaders.regM210ItemReader());

        return stepFactory.create("stepRegM210", tasklet);
    }

    @Bean
    public Step stepRegM211() {
        return stepFactory.create("stepRegM211", itemReaders.regM211ItemReader());
    }

    @Bean
    public Step stepRegM220() {
        return stepFactory.create("stepRegM220", itemReaders.regM220ItemReader());
    }

    @Bean
    public Step stepRegM230() {
        return stepFactory.create("stepRegM230", itemReaders.regM230ItemReader());
    }

    @Bean
    public Step stepRegM300() {
        return stepFactory.create("stepRegM300", itemReaders.regM300ItemReader());
    }

    @Bean
    public Step stepRegM350() {
        return stepFactory.create("stepRegM350", itemReaders.regM350ItemReader());
    }

    @Bean
    public Step stepRegM400() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM400.class, itemReaders.regM400ItemReader());

        return stepFactory.create("stepRegM400", tasklet);
    }

    @Bean
    public Step stepRegM410() {
        return stepFactory.create("stepRegM410", itemReaders.regM410ItemReader());
    }

    @Bean
    public Step stepRegM500() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM500.class, itemReaders.regM500ItemReader());

        return stepFactory.create("stepRegM500", tasklet);
    }

    @Bean
    public Step stepRegM505() {
        return stepFactory.create("stepRegM505", itemReaders.regM505ItemReader());
    }

    @Bean
    public Step stepRegM510() {
        return stepFactory.create("stepRegM510", itemReaders.regM510ItemReader());
    }

    @Bean
    public Step stepRegM600() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM600.class, itemReaders.regM600ItemReader());

        return stepFactory.create("stepRegM600", tasklet);
    }

    @Bean
    public Step stepRegM605() {
        return stepFactory.create("stepRegM605", itemReaders.regM605ItemReader());
    }

    @Bean
    public Step stepRegM610() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM610.class, itemReaders.regM610ItemReader());

        return stepFactory.create("stepRegM610", tasklet);
    }

    @Bean
    public Step stepRegM611() {
        return stepFactory.create("stepRegM611", itemReaders.regM611ItemReader());
    }

    @Bean
    public Step stepRegM620() {
        return stepFactory.create("stepRegM620", itemReaders.regM620ItemReader());
    }

    @Bean
    public Step stepRegM630() {
        return stepFactory.create("stepRegM630", itemReaders.regM630ItemReader());
    }

    @Bean
    public Step stepRegM700() {
        return stepFactory.create("stepRegM700", itemReaders.regM700ItemReader());
    }

    @Bean
    public Step stepRegM800() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegM800.class, itemReaders.regM800ItemReader());

        return stepFactory.create("stepRegM800", tasklet);
    }

    @Bean
    public Step stepRegM810() {
        return stepFactory.create("stepRegM810", itemReaders.regM810ItemReader());
    }

    @Bean
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
