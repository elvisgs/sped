package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.common.RegNode;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.Arrays;

public class RegTreeTasklet implements Tasklet, InitializingBean {

    private final RegNode root;
    private ItemStreamWriter writer;
    private ItemReaderFactory itemReaderFactory;
    private RegIdHolder regIdHolder;
    private RegCounter regCounter;

    public RegTreeTasklet(RegNode root) {
        this.root = root;
    }

    public void setWriter(ItemStreamWriter writer) {
        this.writer = writer;
    }

    public void setItemReaderFactory(ItemReaderFactory itemReaderFactory) {
        this.itemReaderFactory = itemReaderFactory;
    }

    public void setRegIdHolder(RegIdHolder regIdHolder) {
        this.regIdHolder = regIdHolder;
    }

    public void setRegCounter(RegCounter regCounter) {
        this.regCounter = regCounter;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        StepExecution stepExecution = chunkContext.getStepContext().getStepExecution();
        ExecutionContext executionContext = stepExecution.getExecutionContext();

        writer.open(executionContext);
        processNode(root, stepExecution);
        writer.close();

        return RepeatStatus.FINISHED;
    }

    private void processNode(RegNode node, StepExecution stepExecution) throws Exception {
        ItemStreamReader<? extends RegBase> reader;
        if (node.hasParent()) {
            Class<? extends RegBase> parentRegClass = node.getParent().getRegClass();
            reader = itemReaderFactory.create(node.getRegClass(), parentRegClass);
        }
        else {
            reader = itemReaderFactory.create(node.getRegClass());
        }

        reader.open(stepExecution.getExecutionContext());

        RegBase reg;
        while((reg = reader.read()) != null) {
            writer.write(Arrays.asList(reg));

            regIdHolder.setId(reg.getClass(), reg.getId());
            regCounter.incrementCount(reg.getClass());

            if (node.hasChildren()) {
                for(RegNode regChild : node.getChildren()) {
                    processNode(regChild, stepExecution);
                }
            }
        }

        reader.close();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(root, "root regNode is null");
        Assert.notNull(writer, "writer is null");
        Assert.notNull(itemReaderFactory, "itemReaderFactory is null");
        Assert.notNull(regIdHolder, "regIdHolder is null");
        Assert.notNull(regCounter, "regCounter is null");
    }
}
