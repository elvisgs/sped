package br.com.gep.sped.batch.common.config;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.tasklets.CleanupTasklet;
import br.com.gep.sped.batch.common.tasklets.ZipFileTasklet;
import org.springframework.batch.core.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
public class MiscStepsConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private CleanupTasklet cleanupTasklet;

    @Autowired
    private ZipFileTasklet zipFileTasklet;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step cleanupStep() {
        return stepFactory.create("cleanup", cleanupTasklet);
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Step zipFileStep() {
        return stepFactory.create("zipFile", zipFileTasklet);
    }
}
