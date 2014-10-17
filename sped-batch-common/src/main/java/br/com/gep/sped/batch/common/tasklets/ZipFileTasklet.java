package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.jdbc.dao.SpedExecutionDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;

import static br.com.gep.sped.batch.common.SpedJobParameterBuilder.*;

@Component
@StepScope
public class ZipFileTasklet implements Tasklet {

    private static final Log logger = LogFactory.getLog(ZipFileTasklet.class);

    @Value(OUTPUT_FILE_NAME_EL)
    private String outputFileName;

    @Value(COMPRESS_FILE_EL)
    private Boolean compressFile = true;

    @Value(DELETE_FILE_AFTER_COMPRESSION_EL)
    private Boolean deleteFileAfterCompression = true;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired(required = false)
    private SpedExecutionDao spedExecutionDao;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        if (compressFile) {
            String zipFileName = outputFileName.replaceAll("\\..+$", "") + ".zip";

            File outputFile = new File(outputFileName);
            ZipUtil.packEntry(outputFile, new File(zipFileName));

            logger.info("Arquivo compactado [" + zipFileName + "]");

            if (deleteFileAfterCompression) {
                outputFile.delete();
            }

            Long jobExecutionId = chunkContext.getStepContext().getStepExecution().getJobExecutionId();
            spedExecutionDao.updateFile(jobExecutionId, zipFileName);
        }

        return RepeatStatus.FINISHED;
    }
}
