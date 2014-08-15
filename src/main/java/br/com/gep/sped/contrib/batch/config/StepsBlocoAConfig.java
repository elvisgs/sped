package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.StepFactory;
import br.com.gep.sped.contrib.batch.tasklets.RegA010Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.RegA100Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.RegA990Tasklet;
import org.springframework.batch.core.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBlocoAConfig {

    private static int PAGE_SIZE = 10;

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private RegA010Tasklet regA010Tasklet;

    @Autowired
    private RegA100Tasklet regA100Tasklet;

    @Autowired
    private RegA990Tasklet regA990Tasklet;

    @Autowired
    private ItemReadersBlocoAConfig itemReaders;

    @Bean
    public Step stepRegA001() {
        return stepFactory.create("stepRegA001", 1, itemReaders.regA001ItemReader());
    }

    @Bean
    public Step stepRegA010() {
        return stepFactory.create("stepRegA010", regA010Tasklet);
    }

    @Bean
    public Step stepRegA100() {
        return stepFactory.create("stepRegA100", regA100Tasklet);
    }

    @Bean
    public Step stepRegA110() {
        return stepFactory.create("stepRegA110", PAGE_SIZE, itemReaders.regA110ItemReader());
    }

    @Bean
    public Step stepRegA111() {
        return stepFactory.create("stepRegA111", PAGE_SIZE, itemReaders.regA111ItemReader());
    }

    @Bean
    public Step stepRegA120() {
        return stepFactory.create("stepRegA120", PAGE_SIZE, itemReaders.regA120ItemReader());
    }

    @Bean
    public Step stepRegA170() {
        return stepFactory.create("stepRegA170", PAGE_SIZE, itemReaders.regA170ItemReader());
    }

    @Bean
    public Step stepRegA990() {
        return stepFactory.create("stepRegA990", regA990Tasklet);
    }
}
