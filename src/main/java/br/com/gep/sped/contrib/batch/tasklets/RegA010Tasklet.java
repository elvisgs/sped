package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.CustomExitStatus;
import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.config.ItemReadersBlocoAConfig;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.RegA010;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RegA010Tasklet implements Tasklet {

    @Autowired
    private ItemWriterConfig itemWriters;

    @Autowired
    private ItemReadersBlocoAConfig itemReaders;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private RegCounter regCounter;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        StepExecution stepExecution = chunkContext.getStepContext().getStepExecution();

        ItemStreamReader<RegA010> reader = itemReaders.regA010ItemReader();
        ItemStreamWriter writer = itemWriters.beanIOWriter();

        reader.open(stepExecution.getExecutionContext());

        RegA010 regA010 = reader.read();
        if (regA010 != null) {
            writer.open(stepExecution.getExecutionContext());
            writer.write(Arrays.asList(regA010));
            writer.close();

            regIdHolder.setId(RegA010.class, regA010.getId());
            regCounter.incrementCount(RegA010.class);

            stepExecution.setExitStatus(CustomExitStatus.ProcessChildReg);
        }
        else {
            stepExecution.setExitStatus(CustomExitStatus.NoMoreReg);
            reader.close();
        }

        return RepeatStatus.FINISHED;
    }
}
