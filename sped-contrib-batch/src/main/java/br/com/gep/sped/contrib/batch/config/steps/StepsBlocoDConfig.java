package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.blocoD.*;
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
public class StepsBlocoDConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD001() throws Exception {
        return stepFactory.create("stepRegD001", RegD001.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD010() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD010.class);

        return stepFactory.create("stepRegD010", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD100() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD100.class);

        return stepFactory.create("stepRegD100", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD101() throws Exception {
        return stepFactory.create("stepRegD101", RegD101.class, RegD100.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD105() throws Exception {
        return stepFactory.create("stepRegD105", RegD105.class, RegD100.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD111() throws Exception {
        return stepFactory.create("stepRegD111", RegD111.class, RegD100.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD200.class);

        return stepFactory.create("stepRegD200", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD201() throws Exception {
        return stepFactory.create("stepRegD201", RegD201.class, RegD200.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD205() throws Exception {
        return stepFactory.create("stepRegD205", RegD205.class, RegD200.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD209() throws Exception {
        return stepFactory.create("stepRegD209", RegD209.class, RegD200.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD300() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD300.class);

        return stepFactory.create("stepRegD300", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD309() throws Exception {
        return stepFactory.create("stepRegD309", RegD309.class, RegD300.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD350() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD350.class);

        return stepFactory.create("stepRegD350", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD359() throws Exception {
        return stepFactory.create("stepRegD359", RegD359.class, RegD350.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD500() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD500.class);

        return stepFactory.create("stepRegD500", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD501() throws Exception {
        return stepFactory.create("stepRegD501", RegD501.class, RegD500.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD505() throws Exception {
        return stepFactory.create("stepRegD505", RegD505.class, RegD500.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD509() throws Exception {
        return stepFactory.create("stepRegD509", RegD509.class, RegD500.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD600() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(RegD600.class);

        return stepFactory.create("stepRegD600", tasklet);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD601() throws Exception {
        return stepFactory.create("stepRegD601", RegD601.class, RegD600.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD605() throws Exception {
        return stepFactory.create("stepRegD605", RegD605.class, RegD600.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD609() throws Exception {
        return stepFactory.create("stepRegD609", RegD609.class, RegD600.class);
    }

    @Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepRegD990() throws Exception {
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
