package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.CustomExitStatus;
import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.Arrays;

public class RegWithChildrenTasklet<T extends RegBase> implements Tasklet, InitializingBean {

    private final Class<T> regClass;
    private ItemStreamReader<T> reader;
    private ItemStreamWriter<T> writer;
    private RegIdHolder regIdHolder;
    private RegCounter regCounter;

    public RegWithChildrenTasklet(Class<T> regClass) {
        this.regClass = regClass;
    }

    public void setWriter(ItemStreamWriter<T> writer) {
        this.writer = writer;
    }

    public void setReader(ItemStreamReader<T> reader) {
        this.reader = reader;
    }

    public void setRegCounter(RegCounter regCounter) {
        this.regCounter = regCounter;
    }

    public void setRegIdHolder(RegIdHolder regIdHolder) {
        this.regIdHolder = regIdHolder;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        StepExecution stepExecution = chunkContext.getStepContext().getStepExecution();

        reader.open(stepExecution.getExecutionContext());

        T reg = reader.read();
        if (reg != null) {
            writer.open(stepExecution.getExecutionContext());
            writer.write(Arrays.asList(reg));
            writer.close();

            regIdHolder.setId(regClass, reg.getId());
            regCounter.incrementCount(regClass);

            stepExecution.setExitStatus(CustomExitStatus.ProcessChildReg);
        }
        else {
            stepExecution.setExitStatus(CustomExitStatus.NoMoreReg);
            reader.close();
        }

        return RepeatStatus.FINISHED;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(regClass);
        Assert.notNull(reader);
        Assert.notNull(writer);
        Assert.notNull(regIdHolder);
        Assert.notNull(regCounter);
    }
}
