package br.com.gep.sped.contrib.batch.tasklets;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.common.RegNode;
import br.com.gep.sped.contrib.batch.factory.ItemReaderFactory;
import br.com.gep.sped.contrib.batch.factory.ItemWriterFactory;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
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

public class RegTreeTasklet implements Tasklet, InitializingBean {

    private final RegNode root;
    private ItemWriterFactory itemWriterFactory;
    private ItemReaderFactory itemReaderFactory;
    private RegIdHolder regIdHolder;
    private RegCounter regCounter;
    private ItemStreamWriter writer;

    public RegTreeTasklet(RegNode root) {
        this.root = root;
    }

    public void setItemReaderFactory(ItemReaderFactory itemReaderFactory) {
        this.itemReaderFactory = itemReaderFactory;
    }

    public void setItemWriterFactory(ItemWriterFactory itemWriterFactory) {
        this.itemWriterFactory = itemWriterFactory;
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

        // TODO: procurar uma maneira de o writer não precisar ser statefull durante o step (não depender de job parameters?)
        writer = itemWriterFactory.create(Registro.class);
        writer.open(stepExecution.getExecutionContext());

        processNode(root, stepExecution);

        writer.close();

        return RepeatStatus.FINISHED;
    }

    private void processNode(RegNode node, StepExecution stepExecution) throws Exception {
        ItemStreamReader<? extends Registro> reader;
        Class<? extends Registro> regClass = node.getRegClass();
        Class<? extends Registro> parentRegClass = null;

        if (node.hasParent()) {
            parentRegClass = node.getParent().getRegClass();
        }

        reader = itemReaderFactory.create(regClass, parentRegClass);

        reader.open(stepExecution.getExecutionContext());

        Registro reg;
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
        Assert.notNull(itemReaderFactory, "itemReaderFactory is null");
        Assert.notNull(itemWriterFactory, "itemWriterFactory is null");
        Assert.notNull(regIdHolder, "regIdHolder is null");
        Assert.notNull(regCounter, "regCounter is null");
    }
}
