package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.factory.TaskletFactory;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.*;
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
public class StepsBloco0Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0000() throws Exception {
        return stepFactory.create("stepReg0000", Reg0000.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0001() throws Exception {
        return stepFactory.create("stepReg0001", Reg0001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0035() throws Exception {
        return stepFactory.create("stepReg0035", Reg0035.class, Reg0001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0100() throws Exception {
        return stepFactory.create("stepReg0100", Reg0100.class, Reg0001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0110() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0110.class);

        return stepFactory.create("stepReg0110", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0111() throws Exception {
        return stepFactory.create("stepReg0111", Reg0111.class, Reg0110.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0120() throws Exception {
        return stepFactory.create("stepReg0120", Reg0120.class, Reg0001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0140() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0140.class);

        return stepFactory.create("stepReg0140", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0145() throws Exception {
        return stepFactory.create("stepReg0145", Reg0145.class, Reg0140.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0150() throws Exception {
        return stepFactory.create("stepReg0150", Reg0150.class, Reg0140.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0190() throws Exception {
        return stepFactory.create("stepReg0190", Reg0190.class, Reg0140.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0200() throws Exception {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0200.class);

        return stepFactory.create("stepReg0200", tasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0205() throws Exception {
        return stepFactory.create("stepReg0205", Reg0205.class, Reg0200.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0206() throws Exception {
        return stepFactory.create("stepReg0206", Reg0206.class, Reg0200.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0208() throws Exception {
        return stepFactory.create("stepReg0208", Reg0208.class, Reg0200.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0400() throws Exception {
        return stepFactory.create("stepReg0400", Reg0400.class, Reg0140.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0450() throws Exception {
        return stepFactory.create("stepReg0450", Reg0450.class, Reg0140.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0500() throws Exception {
        return stepFactory.create("stepReg0500", Reg0500.class, Reg0001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0600() throws Exception {
        return stepFactory.create("stepReg0600", Reg0600.class, Reg0001.class);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step stepReg0990() throws Exception {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(Reg0990.class, Arrays.asList(
                Reg0000.class, Reg0001.class, Reg0035.class, Reg0100.class, Reg0110.class, Reg0111.class,
                Reg0120.class, Reg0140.class, Reg0145.class, Reg0150.class, Reg0190.class, Reg0200.class,
                Reg0205.class, Reg0206.class, Reg0208.class, Reg0400.class, Reg0450.class, Reg0500.class,
                Reg0600.class));

        return stepFactory.create("stepReg0990", tasklet);
    }
}
