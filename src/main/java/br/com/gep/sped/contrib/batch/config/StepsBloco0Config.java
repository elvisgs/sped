package br.com.gep.sped.contrib.batch.config;

import br.com.gep.sped.contrib.batch.common.StepFactory;
import org.springframework.batch.core.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class StepsBloco0Config {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private ItemReadersBloco0Config itemReaders;

    @Bean
    public Step stepReg0000() {
        return stepFactory.create("stepReg0000", 1, itemReaders.reg0000ItemReader());
    }

    @Bean
    public Step stepReg0140() {
        return stepFactory.create("stepReg0140", 1, itemReaders.reg0140ItemReader());
    }
}
