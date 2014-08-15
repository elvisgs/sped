package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.CustomExitStatus;
import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.config.ItemReadersBloco0Config;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.Reg0140;
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
public class Reg0140Tasklet implements Tasklet {

    @Autowired
    private ItemWriterConfig itemWriters;

    @Autowired
    private ItemReadersBloco0Config itemReaders;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private RegCounter regCounter;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        StepExecution stepExecution = chunkContext.getStepContext().getStepExecution();

        ItemStreamReader<Reg0140> reader = itemReaders.reg0140ItemReader();
        ItemStreamWriter writer = itemWriters.beanIOWriter();

        reader.open(stepExecution.getExecutionContext());

        Reg0140 reg0140 = reader.read();
        if (reg0140 != null) {
            writer.open(stepExecution.getExecutionContext());
            writer.write(Arrays.asList(reg0140));
            writer.close();

            regIdHolder.setId(Reg0140.class, reg0140.getId());
            regCounter.incrementCount(Reg0140.class);

            stepExecution.setExitStatus(CustomExitStatus.ProcessChildReg);
        }
        else {
            stepExecution.setExitStatus(CustomExitStatus.NoMoreReg);
            reader.close();
        }

        return RepeatStatus.FINISHED;
    }
}
