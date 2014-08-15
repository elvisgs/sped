package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.*;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.*;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Reg0990Tasklet implements Tasklet {

    @Autowired
    private ItemWriterConfig itemWriters;

    @Autowired
    private RegCounter regCounter;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        int count = regCounter.getCount(Reg0000.class);
        count += regCounter.getCount(Reg0001.class);
        count += regCounter.getCount(Reg0035.class);
        count += regCounter.getCount(Reg0100.class);
        count += regCounter.getCount(Reg0110.class);
        count += regCounter.getCount(Reg0111.class);
        count += regCounter.getCount(Reg0120.class);
        count += regCounter.getCount(Reg0140.class);
        count += regCounter.getCount(Reg0145.class);
        count += regCounter.getCount(Reg0150.class);
        count += regCounter.getCount(Reg0190.class);
        count += regCounter.getCount(Reg0200.class);
        count += regCounter.getCount(Reg0205.class);
        count += regCounter.getCount(Reg0206.class);
        count += regCounter.getCount(Reg0208.class);
        count += regCounter.getCount(Reg0400.class);
        count += regCounter.getCount(Reg0450.class);
        count += regCounter.getCount(Reg0500.class);
        count += regCounter.getCount(Reg0600.class);
        count += 1;

        Reg0990 reg = new Reg0990();
        reg.setQtdLin0(count);

        ItemStreamWriter writer = itemWriters.beanIOWriter();
        writer.open(chunkContext.getStepContext().getStepExecution().getExecutionContext());
        writer.write(Arrays.asList(reg));
        writer.close();

        return RepeatStatus.FINISHED;
    }
}
