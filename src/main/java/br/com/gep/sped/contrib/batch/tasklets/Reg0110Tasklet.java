package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.CustomExitStatus;
import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.config.ItemReadersBloco0Config;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.Reg0110;
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
public class Reg0110Tasklet implements Tasklet {

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

        ItemStreamReader<Reg0110> reader = itemReaders.reg0110ItemReader();
        ItemStreamWriter writer = itemWriters.beanIOWriter();

        reader.open(stepExecution.getExecutionContext());

        Reg0110 reg0110 = reader.read();
        if (reg0110 != null) {
            writer.open(stepExecution.getExecutionContext());
            writer.write(Arrays.asList(reg0110));
            writer.close();

            regIdHolder.setId(Reg0110.class, reg0110.getId());
            regCounter.incrementCount(Reg0110.class);

            stepExecution.setExitStatus(CustomExitStatus.ProcessChildReg);
        }
        else {
            stepExecution.setExitStatus(CustomExitStatus.NoMoreReg);
            reader.close();
        }

        return RepeatStatus.FINISHED;
    }
}
