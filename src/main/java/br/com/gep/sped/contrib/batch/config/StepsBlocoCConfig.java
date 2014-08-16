package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.blocoC.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBlocoCConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Autowired
    private ItemReadersBlocoCConfig itemReaders;

    @Bean
    public Step stepRegC001() {
        return stepFactory.create("stepRegC001", 1, itemReaders.regC001ItemReader());
    }

    @Bean
    public Step stepRegC010() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC010.class, itemReaders.regC010ItemReader());

        return stepFactory.create("stepRegC010", tasklet);
    }

    @Bean
    public Step stepRegC100() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC100.class, itemReaders.regC100ItemReader());

        return stepFactory.create("stepRegC100", tasklet);
    }

    @Bean
    public Step stepRegC110() {
        return stepFactory.create("stepRegC110", Constants.PAGE_SIZE, itemReaders.regC110ItemReader());
    }

    @Bean
    public Step stepRegC111() {
        return stepFactory.create("stepRegC111", Constants.PAGE_SIZE, itemReaders.regC111ItemReader());
    }

    @Bean
    public Step stepRegC120() {
        return stepFactory.create("stepRegC120", Constants.PAGE_SIZE, itemReaders.regC120ItemReader());
    }

    @Bean
    public Step stepRegC170() {
        return stepFactory.create("stepRegC170", Constants.PAGE_SIZE, itemReaders.regC170ItemReader());
    }

    @Bean
    public Step stepRegC180() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC180.class, itemReaders.regC180ItemReader());

        return stepFactory.create("stepRegC180", tasklet);
    }

    @Bean
    public Step stepRegC181() {
        return stepFactory.create("stepRegC181", Constants.PAGE_SIZE, itemReaders.regC181ItemReader());
    }

    @Bean
    public Step stepRegC185() {
        return stepFactory.create("stepRegC185", Constants.PAGE_SIZE, itemReaders.regC185ItemReader());
    }

    @Bean
    public Step stepRegC188() {
        return stepFactory.create("stepRegC188", Constants.PAGE_SIZE, itemReaders.regC188ItemReader());
    }

    @Bean
    public Step stepRegC190() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC190.class, itemReaders.regC190ItemReader());

        return stepFactory.create("stepRegC190", tasklet);
    }

    @Bean
    public Step stepRegC191() {
        return stepFactory.create("stepRegC191", Constants.PAGE_SIZE, itemReaders.regC191ItemReader());
    }

    @Bean
    public Step stepRegC195() {
        return stepFactory.create("stepRegC195", Constants.PAGE_SIZE, itemReaders.regC195ItemReader());
    }

    @Bean
    public Step stepRegC198() {
        return stepFactory.create("stepRegC198", Constants.PAGE_SIZE, itemReaders.regC198ItemReader());
    }

    @Bean
    public Step stepRegC199() {
        return stepFactory.create("stepRegC199", Constants.PAGE_SIZE, itemReaders.regC199ItemReader());
    }

    @Bean
    public Step stepRegC380() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC380.class, itemReaders.regC380ItemReader());

        return stepFactory.create("stepRegC380", tasklet);
    }

    @Bean
    public Step stepRegC381() {
        return stepFactory.create("stepRegC381", Constants.PAGE_SIZE, itemReaders.regC381ItemReader());
    }

    @Bean
    public Step stepRegC385() {
        return stepFactory.create("stepRegC385", Constants.PAGE_SIZE, itemReaders.regC385ItemReader());
    }

    @Bean
    public Step stepRegC395() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC395.class, itemReaders.regC395ItemReader());

        return stepFactory.create("stepRegC395", tasklet);
    }

    @Bean
    public Step stepRegC396() {
        return stepFactory.create("stepRegC396", Constants.PAGE_SIZE, itemReaders.regC396ItemReader());
    }

    @Bean
    public Step stepRegC400() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC400.class, itemReaders.regC400ItemReader());

        return stepFactory.create("stepRegC400", tasklet);
    }

    @Bean
    public Step stepRegC405() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC405.class, itemReaders.regC405ItemReader());

        return stepFactory.create("stepRegC405", tasklet);
    }

    @Bean
    public Step stepRegC481() {
        return stepFactory.create("stepRegC481", Constants.PAGE_SIZE, itemReaders.regC481ItemReader());
    }

    @Bean
    public Step stepRegC485() {
        return stepFactory.create("stepRegC485", Constants.PAGE_SIZE, itemReaders.regC485ItemReader());
    }

    @Bean
    public Step stepRegC489() {
        return stepFactory.create("stepRegC489", Constants.PAGE_SIZE, itemReaders.regC489ItemReader());
    }

    @Bean
    public Step stepRegC490() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC490.class, itemReaders.regC490ItemReader());

        return stepFactory.create("stepRegC490", tasklet);
    }

    @Bean
    public Step stepRegC491() {
        return stepFactory.create("stepRegC491", Constants.PAGE_SIZE, itemReaders.regC491ItemReader());
    }

    @Bean
    public Step stepRegC495() {
        return stepFactory.create("stepRegC495", Constants.PAGE_SIZE, itemReaders.regC495ItemReader());
    }

    @Bean
    public Step stepRegC499() {
        return stepFactory.create("stepRegC499", Constants.PAGE_SIZE, itemReaders.regC499ItemReader());
    }

    @Bean
    public Step stepRegC500() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC500.class, itemReaders.regC500ItemReader());

        return stepFactory.create("stepRegC500", tasklet);
    }

    @Bean
    public Step stepRegC501() {
        return stepFactory.create("stepRegC501", Constants.PAGE_SIZE, itemReaders.regC501ItemReader());
    }

    @Bean
    public Step stepRegC505() {
        return stepFactory.create("stepRegC505", Constants.PAGE_SIZE, itemReaders.regC505ItemReader());
    }

    @Bean
    public Step stepRegC509() {
        return stepFactory.create("stepRegC509", Constants.PAGE_SIZE, itemReaders.regC509ItemReader());
    }

    @Bean
    public Step stepRegC600() {
        Tasklet tasklet = taskletFactory
                .createRegWithChildrenTasklet(RegC600.class, itemReaders.regC600ItemReader());

        return stepFactory.create("stepRegC600", tasklet);
    }

    @Bean
    public Step stepRegC601() {
        return stepFactory.create("stepRegC601", Constants.PAGE_SIZE, itemReaders.regC601ItemReader());
    }

    @Bean
    public Step stepRegC605() {
        return stepFactory.create("stepRegC605", Constants.PAGE_SIZE, itemReaders.regC605ItemReader());
    }

    @Bean
    public Step stepRegC609() {
        return stepFactory.create("stepRegC609", Constants.PAGE_SIZE, itemReaders.regC609ItemReader());
    }

    @Bean
    public Step stepRegC990() {
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
