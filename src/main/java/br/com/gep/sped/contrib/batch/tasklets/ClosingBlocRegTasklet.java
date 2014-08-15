package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;

public class ClosingBlocRegTasklet<C extends RegEncerramentoBlocoBase> implements Tasklet, InitializingBean {

    private final Class<C> closingBlocRegClass;
    private final List<Class<? extends RegBase>> regsToCount;
    private RegCounter regCounter;
    private ItemStreamWriter writer;

    public ClosingBlocRegTasklet(Class<C> closingBlocRegClass, List<Class<? extends RegBase>> regClassesToCount) {
        this.closingBlocRegClass = closingBlocRegClass;
        this.regsToCount = regClassesToCount;
    }

    public void setRegCounter(RegCounter regCounter) {
        this.regCounter = regCounter;
    }

    public void setWriter(ItemStreamWriter<C> writer) {
        this.writer = writer;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        int count = 1;
        for (Class klass : regsToCount) {
            count += regCounter.getCount(klass);
        }

        C reg = closingBlocRegClass.newInstance();
        reg.setQtdLin(count);

        writer.open(chunkContext.getStepContext().getStepExecution().getExecutionContext());
        writer.write(Arrays.asList(reg));
        writer.close();

        return RepeatStatus.FINISHED;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(regsToCount);
        Assert.notNull(writer);
        Assert.notNull(regCounter);
    }
}
