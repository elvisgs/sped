package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.batch.common.RegIdHolder;
import br.com.gep.sped.batch.common.RegNode;
import br.com.gep.sped.batch.common.factory.ItemReaderFactory;
import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.marshaller.common.Registro;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RegTreeTasklet implements Tasklet {

    private final @NonNull RegNode root;
    private @NonNull @Setter ItemWriterFactory itemWriterFactory;
    private @NonNull @Setter ItemReaderFactory itemReaderFactory;
    private @NonNull @Setter RegIdHolder regIdHolder;
    private @NonNull @Setter RegCounter regCounter;
    private @NonNull @Setter EmptyTableChecker emptyTableChecker;
    private ItemStreamWriter writer;
    private int chunkSize = 1;
    private List chunk = new LinkedList();
    private Set<Class<?>> skipRegs = new HashSet<>();

    public RegTreeTasklet(RegNode root) {
        this.root = root;
    }

    public void setChunkSize(int chunkSize) {
        Assert.state(chunkSize > 0, "chunkSize must be greater than zero");
        this.chunkSize = chunkSize;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        ExecutionContext executionContext = chunkContext.getStepContext().getStepExecution().getExecutionContext();

        checkRegsToSkip(root);

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
}
