package br.com.gep.sped.contrib.batch.config.steps;

import br.com.gep.sped.contrib.batch.config.readers.ItemReadersBloco0Config;
import br.com.gep.sped.contrib.batch.factory.StepFactory;
import br.com.gep.sped.contrib.batch.factory.TaskletFactory;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.*;
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
public class StepsBloco0Config {

    @Autowired
    private StepFactory stepFactory;
    
    @Autowired
    private TaskletFactory taskletFactory;
    
    @Autowired
    private ItemReadersBloco0Config itemReaders;

    @Bean @Lazy(false)
    public Step stepReg0000() {
        return stepFactory.create("stepReg0000", itemReaders.reg0000ItemReader(), 1);
    }

    @Bean @Lazy(false)
    public Step stepReg0001() {
        return stepFactory.create("stepReg0001", itemReaders.reg0001ItemReader(), 1);
    }

    @Bean
    public Step stepReg0035() {
        return stepFactory.create("stepReg0035", itemReaders.reg0035ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0100() {
        return stepFactory.create("stepReg0100", itemReaders.reg0100ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0110() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0110.class);

        return stepFactory.create("stepReg0110", tasklet);
    }

    @Bean
    public Step stepReg0111() {
        return stepFactory.create("stepReg0111", itemReaders.reg0111ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0120() {
        return stepFactory.create("stepReg0120", itemReaders.reg0120ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0140() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0140.class);

        return stepFactory.create("stepReg0140", tasklet);
    }

    @Bean
    public Step stepReg0145() {
        return stepFactory.create("stepReg0145", itemReaders.reg0145ItemReader());
    }

    @Bean
    public Step stepReg0150() {
        return stepFactory.create("stepReg0150", itemReaders.reg0150ItemReader());
    }

    @Bean
    public Step stepReg0190() {
        return stepFactory.create("stepReg0190", itemReaders.reg0190ItemReader());
    }

    @Bean
    public Step stepReg0200() {
        Tasklet tasklet = taskletFactory.createRegTreeTasklet(Reg0200.class);

        return stepFactory.create("stepReg0200", tasklet);
    }

    @Bean
    public Step stepReg0205() {
        return stepFactory.create("stepReg0205", itemReaders.reg0205ItemReader());
    }

    @Bean
    public Step stepReg0206() {
        return stepFactory.create("stepReg0206", itemReaders.reg0206ItemReader());
    }

    @Bean
    public Step stepReg0208() {
        return stepFactory.create("stepReg0208", itemReaders.reg0208ItemReader());
    }

    @Bean
    public Step stepReg0400() {
        return stepFactory.create("stepReg0400", itemReaders.reg0400ItemReader());
    }

    @Bean
    public Step stepReg0450() {
        return stepFactory.create("stepReg0450", itemReaders.reg0450ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0500() {
        return stepFactory.create("stepReg0500", itemReaders.reg0500ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0600() {
        return stepFactory.create("stepReg0600", itemReaders.reg0600ItemReader());
    }

    @Bean @Lazy(false)
    public Step stepReg0990() {
        Tasklet tasklet = taskletFactory.createClosingBlocRegTasklet(Reg0990.class, Arrays.asList(
                Reg0000.class, Reg0001.class, Reg0035.class, Reg0100.class, Reg0110.class, Reg0111.class,
                Reg0120.class, Reg0140.class, Reg0145.class, Reg0150.class, Reg0190.class, Reg0200.class,
                Reg0205.class, Reg0206.class, Reg0208.class, Reg0400.class, Reg0450.class, Reg0500.class,
                Reg0600.class));

        return stepFactory.create("stepReg0990", tasklet);
    }
}
