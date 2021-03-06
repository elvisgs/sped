package br.com.gep.sped.batch.common.tasklets;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.nio.file.Files;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.OUTPUT_FILE_NAME_EL;

@Component
@StepScope
public class CleanupTasklet implements Tasklet {

    @Value(OUTPUT_FILE_NAME_EL)
    private String outputFileName;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        File outputFile = new File(outputFileName);
        Files.deleteIfExists(outputFile.toPath());

        String zipFileName = outputFileName.replaceAll("\\..+$", "") + ".zip";
        File zipFile = new File(zipFileName);
        Files.deleteIfExists(zipFile.toPath());

        return RepeatStatus.FINISHED;
    }
}
