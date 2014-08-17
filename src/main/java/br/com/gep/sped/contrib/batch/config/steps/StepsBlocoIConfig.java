package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.config.readers.ItemReadersBlocoIConfig;
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
public class StepsBlocoIConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersBlocoIConfig itemReaders;

    @Bean
    @Lazy
    public Step stepRegI001() {
        return stepFactory.create("stepRegI001", itemReaders.regI001ItemReader(), 1);
    }

    @Bean
    @Lazy
    public Step stepRegI010() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegI010.class, itemReaders.regI010ItemReader());

        return stepFactory.create("stepRegI010", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegI100() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegI100.class, itemReaders.regI100ItemReader());

        return stepFactory.create("stepRegI100", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegI200() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegI200.class, itemReaders.regI200ItemReader());

        return stepFactory.create("stepRegI200", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegI300() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegI300.class, itemReaders.regI300ItemReader());

        return stepFactory.create("stepRegI300", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegI399() {
        return stepFactory.create("stepRegI399", itemReaders.regI399ItemReader());
    }

    @Bean
    @Lazy
    public Step stepRegI299() {
        return stepFactory.create("stepRegI299", itemReaders.regI299ItemReader());
    }

    @Bean
    @Lazy
    public Step stepRegI199() {
        return stepFactory.create("stepRegI199", itemReaders.regI199ItemReader());
    }

    @Bean
    @Lazy
    public Step stepRegI990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegI990.class, Arrays.asList(
                RegI001.class, RegI010.class, RegI100.class, RegI200.class, RegI300.class,
                RegI399.class, RegI299.class, RegI199.class
        ));

        return stepFactory.create("stepRegI990", tasklet);
    }
}
