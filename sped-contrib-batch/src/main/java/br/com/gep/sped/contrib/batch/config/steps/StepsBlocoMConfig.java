package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.blocoM.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBlocoMConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM001() throws Exception {
        return stepFactory.create("stepRegM001", RegM001.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM100.class);

        return stepFactory.create("stepRegM100", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM105() throws Exception {
        return stepFactory.create("stepRegM105", RegM105.class, RegM100.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM110() throws Exception {
        return stepFactory.create("stepRegM110", RegM110.class, RegM100.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM200.class);

        return stepFactory.create("stepRegM200", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM205() throws Exception {
        return stepFactory.create("stepRegM205", RegM205.class, RegM200.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM210() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM210.class);

        return stepFactory.create("stepRegM210", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM211() throws Exception {
        return stepFactory.create("stepRegM211", RegM211.class, RegM210.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM220() throws Exception {
        return stepFactory.create("stepRegM220", RegM220.class, RegM210.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM230() throws Exception {
        return stepFactory.create("stepRegM230", RegM230.class, RegM210.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM300() throws Exception {
        return stepFactory.create("stepRegM300", RegM300.class, RegM001.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM350() throws Exception {
        return stepFactory.create("stepRegM350", RegM350.class, RegM001.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM400() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM400.class);

        return stepFactory.create("stepRegM400", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM410() throws Exception {
        return stepFactory.create("stepRegM410", RegM410.class, RegM400.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM500.class);

        return stepFactory.create("stepRegM500", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM505() throws Exception {
        return stepFactory.create("stepRegM505", RegM505.class, RegM500.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM510() throws Exception {
        return stepFactory.create("stepRegM510", RegM510.class, RegM500.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM600.class);

        return stepFactory.create("stepRegM600", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM605() throws Exception {
        return stepFactory.create("stepRegM605", RegM605.class, RegM600.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM610() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM610.class);

        return stepFactory.create("stepRegM610", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM611() throws Exception {
        return stepFactory.create("stepRegM611", RegM611.class, RegM610.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM620() throws Exception {
        return stepFactory.create("stepRegM620", RegM620.class, RegM610.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM630() throws Exception {
        return stepFactory.create("stepRegM630", RegM630.class, RegM610.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM700() throws Exception {
        return stepFactory.create("stepRegM700", RegM700.class, RegM001.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM800() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegM800.class);

        return stepFactory.create("stepRegM800", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM810() throws Exception {
        return stepFactory.create("stepRegM810", RegM810.class, RegM800.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegM990() throws Exception {
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
