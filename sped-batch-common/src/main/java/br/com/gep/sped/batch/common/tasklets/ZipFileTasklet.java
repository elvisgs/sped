package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import br.com.gep.sped.batch.common.support.SpedJobParameters;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.nio.file.Files;

@Component
@StepScope
@CommonsLog
public class ZipFileTasklet implements Tasklet {

    @Autowired
    private SpedJobParameters jobParameters;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired(required = false)
    private SpedExecutionDao spedExecutionDao;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        if (jobParameters.getCompressFile()) {
            File outputFile = new File(jobParameters.getOutputFileName());
            File dir = outputFile.getParentFile();
            String zipFileName = outputFile.getName().replaceAll("\\..+$", "") + ".zip";
            String zipFilePath = new File(dir, zipFileName).getAbsolutePath();

            ZipUtil.packEntry(outputFile, new File(zipFilePath));

            log.info("Arquivo compactado [" + zipFilePath + "]");

            if (jobParameters.getDeleteFileAfterCompression()) {
                Files.delete(outputFile.toPath());
            }

            if (spedExecutionDao != null) {
                Long jobExecutionId = chunkContext.getStepContext().getStepExecution().getJobExecutionId();
                spedExecutionDao.updateFile(jobExecutionId, zipFilePath);
            }
            else {
                log.warn("SpedExecutionDao nao foi setado. SpedExecution nao sera atualizado.");
            }
        }

        return RepeatStatus.FINISHED;
    }
}
