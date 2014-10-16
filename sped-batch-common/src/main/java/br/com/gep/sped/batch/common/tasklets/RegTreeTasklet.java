package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.batch.common.RegIdHolder;
import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.factory.ItemReaderFactory;
import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import java.util.*;

public class RegTreeTasklet implements Tasklet, InitializingBean {

    private final RegNode root;
    private ItemWriterFactory itemWriterFactory;
    private ItemReaderFactory itemReaderFactory;
    private RegIdHolder regIdHolder;
    private RegCounter regCounter;
    private EmptyTableChecker emptyTableChecker;
    private ItemStreamWriter writer;
    private int chunkSize = 1;
    private List chunk = new LinkedList();
    private Set<Class<?>> skipRegs = new HashSet<>();

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

    public void setEmptyTableChecker(EmptyTableChecker emptyTableChecker) {
        this.emptyTableChecker = emptyTableChecker;
    }

    public void setChunkSize(int chunkSize) {
        this.chunkSize = chunkSize;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        ExecutionContext executionContext = chunkContext.getStepContext().getStepExecution().getExecutionContext();

        checkRegsToSkip(root);

        // TODO: procurar uma maneira de o writer não precisar ser statefull durante o step (não depender de job parameters?)
        writer = itemWriterFactory.create(Registro.class);
        writer.open(executionContext);

        processNode(root, contribution, executionContext);

        writer.close();

        return RepeatStatus.FINISHED;
    }

    private void checkRegsToSkip(RegNode root) throws Exception {
        for (RegNode child : root.getChildren()) {
            boolean shouldSkip = emptyTableChecker.isEmpty(child.getRegClass());
            if (shouldSkip) {
                skipRegs.add(child.getRegClass());
            }

            if (!shouldSkip && child.hasChildren()) {
                checkRegsToSkip(child);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void processNode(RegNode node, StepContribution contribution, ExecutionContext executionContext) throws Exception {
        if (skipRegs.contains(node.getRegClass())) return;

        ItemStreamReader<? extends Registro> reader;
        Class<? extends Registro> regClass = node.getRegClass();
        Class<? extends Registro> parentRegClass = null;

        if (node.hasParent()) {
            parentRegClass = node.getParent().getRegClass();
        }

        reader = itemReaderFactory.create(regClass, parentRegClass);

        reader.open(executionContext);

        Registro reg;
        while((reg = reader.read()) != null) {
            chunk.add(reg);
            contribution.incrementReadCount();

            if (chunk.size() == chunkSize) {
                writer.write(chunk);
                contribution.incrementWriteCount(chunkSize);
                chunk.clear();
            }

            regIdHolder.setId(reg.getClass(), reg.getId());
            regCounter.incrementCount(reg.getClass());

            if (node.hasChildren()) {
                for(RegNode regChild : node.getChildren()) {
                    processNode(regChild, contribution, executionContext);
                }
            }
        }

        if (!chunk.isEmpty()) {
            writer.write(chunk);
            contribution.incrementWriteCount(chunk.size());
            chunk.clear();
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
        Assert.notNull(emptyTableChecker, "emptyTableChecker is null");
        Assert.state(chunkSize > 0, "chunkSize must be greater than zero");
    }
}