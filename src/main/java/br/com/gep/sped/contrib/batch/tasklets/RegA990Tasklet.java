package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
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
public class RegA990Tasklet implements Tasklet {

    @Autowired
    private ItemWriterConfig itemWriters;

    @Autowired
    private RegCounter regCounter;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        int count = regCounter.getCount(RegA010.class);
        count += regCounter.getCount(RegA100.class);
        count += regCounter.getCount(RegA110.class);
        count += regCounter.getCount(RegA111.class);
        count += regCounter.getCount(RegA120.class);
        count += regCounter.getCount(RegA170.class);
        count += 2;

        RegA990 regA990 = new RegA990();
        regA990.setQtdLinA(count);

        ItemStreamWriter writer = itemWriters.beanIOWriter();
        writer.open(chunkContext.getStepContext().getStepExecution().getExecutionContext());
        writer.write(Arrays.asList(regA990));
        writer.close();

        return RepeatStatus.FINISHED;
    }
}
