package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoD.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBlocoDConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersBlocoDConfig itemReaders;

    @Bean
    public Step stepRegD001() {
        return stepFactory.create("stepRegD001", 1, itemReaders.regD001ItemReader());
    }

    @Bean
    public Step stepRegD010() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD010.class, itemReaders.regD010ItemReader());

        return stepFactory.create("stepRegD010", tasklet);
    }

    @Bean
    public Step stepRegD100() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD100.class, itemReaders.regD100ItemReader());

        return stepFactory.create("stepRegD100", tasklet);
    }

    @Bean
    public Step stepRegD101() {
        return stepFactory.create("stepRegD101", Constants.CHUNK_SIZE, itemReaders.regD101ItemReader());
    }

    @Bean
    public Step stepRegD105() {
        return stepFactory.create("stepRegD105", Constants.CHUNK_SIZE, itemReaders.regD105ItemReader());
    }

    @Bean
    public Step stepRegD111() {
        return stepFactory.create("stepRegD111", Constants.CHUNK_SIZE, itemReaders.regD111ItemReader());
    }

    @Bean
    public Step stepRegD200() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD200.class, itemReaders.regD200ItemReader());

        return stepFactory.create("stepRegD200", tasklet);
    }

    @Bean
    public Step stepRegD201() {
        return stepFactory.create("stepRegD201", Constants.CHUNK_SIZE, itemReaders.regD201ItemReader());
    }

    @Bean
    public Step stepRegD205() {
        return stepFactory.create("stepRegD205", Constants.CHUNK_SIZE, itemReaders.regD205ItemReader());
    }

    @Bean
    public Step stepRegD209() {
        return stepFactory.create("stepRegD209", Constants.CHUNK_SIZE, itemReaders.regD209ItemReader());
    }

    @Bean
    public Step stepRegD300() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD300.class, itemReaders.regD300ItemReader());

        return stepFactory.create("stepRegD300", tasklet);
    }

    @Bean
    public Step stepRegD309() {
        return stepFactory.create("stepRegD309", Constants.CHUNK_SIZE, itemReaders.regD309ItemReader());
    }

    @Bean
    public Step stepRegD350() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD350.class, itemReaders.regD350ItemReader());

        return stepFactory.create("stepRegD350", tasklet);
    }

    @Bean
    public Step stepRegD359() {
        return stepFactory.create("stepRegD359", Constants.CHUNK_SIZE, itemReaders.regD359ItemReader());
    }

    @Bean
    public Step stepRegD500() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD500.class, itemReaders.regD500ItemReader());

        return stepFactory.create("stepRegD500", tasklet);
    }

    @Bean
    public Step stepRegD501() {
        return stepFactory.create("stepRegD501", Constants.CHUNK_SIZE, itemReaders.regD501ItemReader());
    }

    @Bean
    public Step stepRegD505() {
        return stepFactory.create("stepRegD505", Constants.CHUNK_SIZE, itemReaders.regD505ItemReader());
    }

    @Bean
    public Step stepRegD509() {
        return stepFactory.create("stepRegD509", Constants.CHUNK_SIZE, itemReaders.regD509ItemReader());
    }

    @Bean
    public Step stepRegD600() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegD600.class, itemReaders.regD600ItemReader());

        return stepFactory.create("stepRegD600", tasklet);
    }

    @Bean
    public Step stepRegD601() {
        return stepFactory.create("stepRegD601", Constants.CHUNK_SIZE, itemReaders.regD601ItemReader());
    }

    @Bean
    public Step stepRegD605() {
        return stepFactory.create("stepRegD605", Constants.CHUNK_SIZE, itemReaders.regD605ItemReader());
    }

    @Bean
    public Step stepRegD609() {
        return stepFactory.create("stepRegD609", Constants.CHUNK_SIZE, itemReaders.regD609ItemReader());
    }

    @Bean
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
