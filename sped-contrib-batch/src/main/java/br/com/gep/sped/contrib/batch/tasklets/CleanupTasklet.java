package br.com.gep.sped.contrib.batch.tasklets;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@StepScope
public class CleanupTasklet implements Tasklet {

    @Value("#{jobParameters['output.file.name']}")
    private String outputFileName;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        File file = new File(outputFileName);
        if (file.exists()) {
            file.delete();
        }

        return RepeatStatus.FINISHED;
    }
}
