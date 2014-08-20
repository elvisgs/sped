package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
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
public class StepsBlocoAConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean @Lazy(false)
    public Step stepRegA001() {
        return stepFactory.create("stepRegA001", RegA001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegA010() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegA010.class);

        return stepFactory.create("stepRegA010", tasklet);
    }

    @Bean
    public Step stepRegA100() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegA100.class);

        return stepFactory.create("stepRegA100", tasklet);
    }

    @Bean
    public Step stepRegA110() {
        return stepFactory.create("stepRegA110", RegA110.class, RegA100.class);
    }

    @Bean
    public Step stepRegA111() {
        return stepFactory.create("stepRegA111", RegA111.class, RegA100.class);
    }

    @Bean
    public Step stepRegA120() {
        return stepFactory.create("stepRegA120", RegA120.class, RegA100.class);
    }

    @Bean
    public Step stepRegA170() {
        return stepFactory.create("stepRegA170", RegA170.class, RegA100.class);
    }


    @Bean @Lazy(false)
    public Step stepRegA990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegA990.class, Arrays.asList(
                RegA001.class, RegA010.class, RegA100.class, RegA110.class,
                RegA111.class, RegA120.class, RegA170.class));

        return stepFactory.create("stepRegA990", tasklet);
    }
}
