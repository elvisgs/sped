package br.com.gep.sped.batch.common.config;

import br.com.gep.sped.batch.common.factory.StepFactory;
import br.com.gep.sped.batch.common.tasklets.CleanupTasklet;
import br.com.gep.sped.batch.common.tasklets.ZipFileTasklet;
import org.springframework.batch.core.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class MiscStepsConfig {

    @Autowired
    private StepFactory stepFactory;

    @Autowired
    private CleanupTasklet cleanupTasklet;

    @Autowired
    private ZipFileTasklet zipFileTasklet;

    public Step cleanupStep() {
        return stepFactory.create("cleanup", cleanupTasklet);
    }

    public Step zipFileStep() {
        return stepFactory.create("zipFile", zipFileTasklet);
    }
}
