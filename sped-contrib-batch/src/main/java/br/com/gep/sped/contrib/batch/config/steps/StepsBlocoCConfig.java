package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.blocoC.*;
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
public class StepsBlocoCConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean @Lazy(false)
    public Step stepRegC001() throws Exception {
        return stepFactory.create("stepRegC001", RegC001.class);
    }

    @Bean @Lazy(false)
    public Step stepRegC010() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC010.class);

        return stepFactory.create("stepRegC010", tasklet);
    }

    @Bean
    public Step stepRegC100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC100.class);

        return stepFactory.create("stepRegC100", tasklet);
    }

    @Bean
    public Step stepRegC110() throws Exception {
        return stepFactory.create("stepRegC110", RegC110.class, RegC100.class);
    }

    @Bean
    public Step stepRegC111() throws Exception {
        return stepFactory.create("stepRegC111", RegC111.class, RegC100.class);
    }

    @Bean
    public Step stepRegC120() throws Exception {
        return stepFactory.create("stepRegC120", RegC120.class, RegC100.class);
    }

    @Bean
    public Step stepRegC170() throws Exception {
        return stepFactory.create("stepRegC170", RegC170.class, RegC100.class);
    }

    @Bean
    public Step stepRegC180() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC180.class);

        return stepFactory.create("stepRegC180", tasklet);
    }

    @Bean
    public Step stepRegC181() throws Exception {
        return stepFactory.create("stepRegC181", RegC181.class, RegC180.class);
    }

    @Bean
    public Step stepRegC185() throws Exception {
        return stepFactory.create("stepRegC185", RegC185.class, RegC180.class);
    }

    @Bean
    public Step stepRegC188() throws Exception {
        return stepFactory.create("stepRegC188", RegC188.class, RegC180.class);
    }

    @Bean
    public Step stepRegC190() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC190.class);

        return stepFactory.create("stepRegC190", tasklet);
    }

    @Bean
    public Step stepRegC191() throws Exception {
        return stepFactory.create("stepRegC191", RegC191.class, RegC190.class);
    }

    @Bean
    public Step stepRegC195() throws Exception {
        return stepFactory.create("stepRegC195", RegC195.class, RegC190.class);
    }

    @Bean
    public Step stepRegC198() throws Exception {
        return stepFactory.create("stepRegC198", RegC198.class, RegC190.class);
    }

    @Bean
    public Step stepRegC199() throws Exception {
        return stepFactory.create("stepRegC199", RegC199.class, RegC190.class);
    }

    @Bean
    public Step stepRegC380() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC380.class);

        return stepFactory.create("stepRegC380", tasklet);
    }

    @Bean
    public Step stepRegC381() throws Exception {
        return stepFactory.create("stepRegC381", RegC381.class, RegC380.class);
    }

    @Bean
    public Step stepRegC385() throws Exception {
        return stepFactory.create("stepRegC385", RegC385.class, RegC380.class);
    }

    @Bean
    public Step stepRegC395() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC395.class);

        return stepFactory.create("stepRegC395", tasklet);
    }

    @Bean
    public Step stepRegC396() throws Exception {
        return stepFactory.create("stepRegC396", RegC396.class, RegC395.class);
    }

    @Bean
    public Step stepRegC400() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC400.class);

        return stepFactory.create("stepRegC400", tasklet);
    }

    @Bean
    public Step stepRegC405() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC405.class);

        return stepFactory.create("stepRegC405", tasklet);
    }

    @Bean
    public Step stepRegC481() throws Exception {
        return stepFactory.create("stepRegC481", RegC481.class, RegC405.class);
    }

    @Bean
    public Step stepRegC485() throws Exception {
        return stepFactory.create("stepRegC485", RegC485.class, RegC405.class);
    }

    @Bean
    public Step stepRegC489() throws Exception {
        return stepFactory.create("stepRegC489", RegC489.class, RegC400.class);
    }

    @Bean
    public Step stepRegC490() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC490.class);

        return stepFactory.create("stepRegC490", tasklet);
    }

    @Bean
    public Step stepRegC491() throws Exception {
        return stepFactory.create("stepRegC491", RegC491.class, RegC490.class);
    }

    @Bean
    public Step stepRegC495() throws Exception {
        return stepFactory.create("stepRegC495", RegC495.class, RegC490.class);
    }

    @Bean
    public Step stepRegC499() throws Exception {
        return stepFactory.create("stepRegC499", RegC499.class, RegC490.class);
    }

    @Bean
    public Step stepRegC500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC500.class);

        return stepFactory.create("stepRegC500", tasklet);
    }

    @Bean
    public Step stepRegC501() throws Exception {
        return stepFactory.create("stepRegC501", RegC501.class, RegC500.class);
    }

    @Bean
    public Step stepRegC505() throws Exception {
        return stepFactory.create("stepRegC505", RegC505.class, RegC500.class);
    }

    @Bean
    public Step stepRegC509() throws Exception {
        return stepFactory.create("stepRegC509", RegC509.class, RegC500.class);
    }

    @Bean
    public Step stepRegC600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegC600.class);

        return stepFactory.create("stepRegC600", tasklet);
    }

    @Bean
    public Step stepRegC601() throws Exception {
        return stepFactory.create("stepRegC601", RegC601.class, RegC600.class);
    }

    @Bean
    public Step stepRegC605() throws Exception {
        return stepFactory.create("stepRegC605", RegC605.class, RegC600.class);
    }

    @Bean
    public Step stepRegC609() throws Exception {
        return stepFactory.create("stepRegC609", RegC609.class, RegC600.class);
    }

    @Bean @Lazy(false)
    public Step stepRegC990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(RegC990.class, Arrays.asList(
                RegC001.class, RegC010.class, RegC100.class, RegC110.class, RegC111.class,
                RegC120.class, RegC170.class, RegC180.class, RegC181.class, RegC185.class,
                RegC188.class, RegC190.class, RegC191.class, RegC195.class, RegC198.class,
                RegC199.class, RegC380.class, RegC381.class, RegC385.class, RegC395.class,
                RegC396.class, RegC400.class, RegC405.class, RegC481.class, RegC485.class,
                RegC489.class, RegC490.class, RegC491.class, RegC495.class, RegC499.class,
                RegC500.class, RegC501.class, RegC505.class, RegC509.class, RegC600.class,
                RegC601.class, RegC605.class, RegC609.class
        ));

        return stepFactory.create("stepRegC990", tasklet);
    }
}
