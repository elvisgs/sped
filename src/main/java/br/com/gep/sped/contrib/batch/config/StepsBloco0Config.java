package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.StepFactory;
import br.com.gep.sped.contrib.batch.tasklets.Reg0110Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.Reg0140Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.Reg0200Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.Reg0990Tasklet;
import org.springframework.batch.core.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBloco0Config {

    private static final int PAGE_SIZE = 10;

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private Reg0110Tasklet reg0110Tasklet;

    @Autowired
    private Reg0140Tasklet reg0140Tasklet;

    @Autowired
    private Reg0200Tasklet reg0200Tasklet;

    @Autowired
    private Reg0990Tasklet reg0990Tasklet;

    @Autowired
    private ItemReadersBloco0Config itemReaders;

    @Bean
    public Step stepReg0000() {
        return stepFactory.create("stepReg0000", 1, itemReaders.reg0000ItemReader());
    }

    @Bean
    public Step stepReg0001() {
        return stepFactory.create("stepReg0001", 1, itemReaders.reg0001ItemReader());
    }
    @Bean
    public Step stepReg0035() {
        return stepFactory.create("stepReg0035", PAGE_SIZE, itemReaders.reg0035ItemReader());
    }

    @Bean
    public Step stepReg0100() {
        return stepFactory.create("stepReg0100", PAGE_SIZE, itemReaders.reg0100ItemReader());
    }

    @Bean
    public Step stepReg0110() {
        return stepFactory.create("stepReg0110", reg0110Tasklet);
    }

    @Bean
    public Step stepReg0111() {
        return stepFactory.create("stepReg0111", PAGE_SIZE, itemReaders.reg0111ItemReader());
    }

    @Bean
    public Step stepReg0120() {
        return stepFactory.create("stepReg0120", PAGE_SIZE, itemReaders.reg0120ItemReader());
    }

    @Bean
    public Step stepReg0140() {
        return stepFactory.create("stepReg0140", reg0140Tasklet);
    }

    @Bean
    public Step stepReg0145() {
        return stepFactory.create("stepReg0145", PAGE_SIZE, itemReaders.reg0145ItemReader());
    }

    @Bean
    public Step stepReg0150() {
        return stepFactory.create("stepReg0150", PAGE_SIZE, itemReaders.reg0150ItemReader());
    }

    @Bean
    public Step stepReg0190() {
        return stepFactory.create("stepReg0190", PAGE_SIZE, itemReaders.reg0190ItemReader());
    }

    @Bean
    public Step stepReg0200() {
        return stepFactory.create("stepReg0200", reg0200Tasklet);
    }

    @Bean
    public Step stepReg0205() {
        return stepFactory.create("stepReg0205", PAGE_SIZE, itemReaders.reg0205ItemReader());
    }

    @Bean
    public Step stepReg0206() {
        return stepFactory.create("stepReg0206", PAGE_SIZE, itemReaders.reg0206ItemReader());
    }

    @Bean
    public Step stepReg0208() {
        return stepFactory.create("stepReg0208", PAGE_SIZE, itemReaders.reg0208ItemReader());
    }

    @Bean
    public Step stepReg0400() {
        return stepFactory.create("stepReg0400", PAGE_SIZE, itemReaders.reg0400ItemReader());
    }

    @Bean
    public Step stepReg0450() {
        return stepFactory.create("stepReg0450", PAGE_SIZE, itemReaders.reg0450ItemReader());
    }

    @Bean
    public Step stepReg0500() {
        return stepFactory.create("stepReg0500", PAGE_SIZE, itemReaders.reg0500ItemReader());
    }

    @Bean
    public Step stepReg0600() {
        return stepFactory.create("stepReg0600", PAGE_SIZE, itemReaders.reg0600ItemReader());
    }

    @Bean
    public Step stepReg0990() {
        return stepFactory.create("stepReg0990", reg0990Tasklet);
    }
}
