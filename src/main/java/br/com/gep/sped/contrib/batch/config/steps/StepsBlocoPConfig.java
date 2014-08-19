package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.config.readers.ItemReadersBlocoPConfig;
import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoP.*;
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
public class StepsBlocoPConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersBlocoPConfig itemReaders;

    @Bean @Lazy(false)
    public Step stepRegP001() {
        return stepFactory.create("stepRegP001", itemReaders.regP001ItemReader(), 1);
    }

    @Bean @Lazy(false)
    public Step stepRegP010() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegP010.class);

        return stepFactory.create("stepRegP010", tasklet);
    }

    @Bean
    public Step stepRegP100() {
        Tasklet tasklet = taskletFactory
                .createRegTreeTasklet(RegP100.class);

        return stepFactory.create("stepRegP100", tasklet);
    }

    @Bean
    public Step stepRegP110() {
        return stepFactory.create("stepRegP110", itemReaders.regP110ItemReader());
    }

    @Bean
    public Step stepRegP199() {
        return stepFactory.create("stepRegP199", itemReaders.regP199ItemReader());
    }

    @Bean
    public Step stepRegP200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegP200.class);

        return stepFactory.create("stepRegP200", tasklet);
    }

    @Bean
    public Step stepRegP210() {
        return stepFactory.create("stepRegP210", itemReaders.regP210ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepRegP990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegP990.class, Arrays.asList(
                RegP001.class, RegP010.class, RegP100.class, RegP110.class,
                RegP199.class, RegP200.class, RegP210.class
        ));

        return stepFactory.create("stepRegP990", tasklet);
    }
}
