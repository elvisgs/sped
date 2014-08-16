package br.com.gep.sped.contrib.batch.config;

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
public class StepsBlocoPConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersBlocoPConfig itemReaders;

    @Bean
    @Lazy
    public Step stepRegP001() {
        return stepFactory.create("stepRegP001", itemReaders.regP001ItemReader(), 1);
    }

    @Bean
    @Lazy
    public Step stepRegP010() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegP010.class, itemReaders.regP010ItemReader());

        return stepFactory.create("stepRegP010", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegP100() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegP100.class, itemReaders.regP100ItemReader());

        return stepFactory.create("stepRegP100", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegP110() {
        return stepFactory.create("stepRegP110", itemReaders.regP110ItemReader());
    }

    @Bean
    @Lazy
    public Step stepRegP199() {
        return stepFactory.create("stepRegP199", itemReaders.regP199ItemReader());
    }

    @Bean
    @Lazy
    public Step stepRegP200() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegP200.class, itemReaders.regP200ItemReader());

        return stepFactory.create("stepRegP200", tasklet);
    }

    @Bean
    @Lazy
    public Step stepRegP210() {
        return stepFactory.create("stepRegP210", itemReaders.regP210ItemReader());
    }

    @Bean
    @Lazy
    public Step stepRegP990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegP990.class, Arrays.asList(
                RegP001.class, RegP010.class, RegP100.class, RegP110.class,
                RegP199.class, RegP200.class, RegP210.class
        ));

        return stepFactory.create("stepRegP990", tasklet);
    }
}
