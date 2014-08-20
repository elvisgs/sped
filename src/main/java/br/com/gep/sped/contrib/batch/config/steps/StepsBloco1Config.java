package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.bloco1.*;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBloco1Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private TaskletFactory taskletFactory;

    @Bean
    public Step stepReg1001() {
        return stepFactory.create("stepReg1001", Reg1001.class);
    }

    @Bean
    public Step stepReg1010() {
        return stepFactory.create("stepReg1010", Reg1010.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1020() {
        return stepFactory.create("stepReg1020", Reg1020.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1100() {
        return stepFactory.create("stepReg1100", Reg1100.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1300() {
        return stepFactory.create("stepReg1300", Reg1300.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1500() {
        return stepFactory.create("stepReg1500", Reg1500.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1700() {
        return stepFactory.create("stepReg1700", Reg1700.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1800() {
        return stepFactory.create("stepReg1800", Reg1800.class, Reg1001.class);
    }

    @Bean
    public Step stepReg1900() {
        return stepFactory.create("stepReg1900", Reg1900.class);
    }

    @Bean
    public Step stepReg1990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(Reg1990.class, Arrays.asList(
                Reg1001.class, Reg1010.class, Reg1020.class, Reg1100.class, Reg1300.class,
                Reg1500.class, Reg1700.class, Reg1800.class, Reg1900.class
        ));

        return stepFactory.create("stepReg1990", tasklet);
    }
}
