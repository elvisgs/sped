package br.com.gep.sped.batch.common.tasklets;

import br.com.gep.sped.batch.common.factory.ItemProcessorLocator;
import br.com.gep.sped.batch.common.factory.ItemReaderFactory;
import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.batch.common.support.RegInfoUpdater;
import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.marshaller.common.Registro;
import lombok.NonNull;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.util.Assert;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Accessors(chain = true)
public class RegTreeTasklet implements Tasklet {

    private final @NonNull RegNode root;
    private @NonNull @Setter ItemReaderFactory itemReaderFactory;
    private @NonNull @Setter ItemProcessorLocator itemProcessorLocator;
    private @NonNull @Setter ItemWriterFactory itemWriterFactory;
    private @NonNull @Setter RegInfoUpdater regInfoUpdater;
    private ItemStreamWriter writer;
    private int chunkSize = 1;
    private List chunk = new LinkedList();

    public RegTreeTasklet(RegNode root) {
        this.root = root;
    }

    public RegTreeTasklet setChunkSize(int chunkSize) {
        Assert.state(chunkSize > 0, "chunkSize must be greater than zero");
        this.chunkSize = chunkSize;
        return this;
    }

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        ExecutionContext executionContext = chunkContext.getStepContext().getStepExecution().getExecutionContext();

        writer = itemWriterFactory.create(Registro.class);
        writer.open(executionContext);

        processNode(root, contribution, executionContext);

        writer.close();

        return RepeatStatus.FINISHED;
    }

    @SuppressWarnings("unchecked")
    private void processNode(RegNode node, StepContribution contribution, ExecutionContext executionContext) throws Exception {
        ItemStreamReader<? extends Registro> reader;
        Class regClass = node.getRegClass();
        Class parentRegClass = null;

        if (node.hasParent()) {
            parentRegClass = node.getParent().getRegClass();
        }

        reader = itemReaderFactory.create(regClass, parentRegClass);

        Optional<ItemProcessor> processor = itemProcessorLocator.find(regClass);

        reader.open(executionContext);

        Registro reg;
        while((reg = reader.read()) != null) {
            if (processor.isPresent()) reg = (Registro) processor.get().process(reg);

            chunk.add(reg);
            contribution.incrementReadCount();

            if (chunk.size() == chunkSize) {
                writer.write(chunk);
                contribution.incrementWriteCount(chunkSize);
                chunk.clear();
            }

            regInfoUpdater.updateLastIdAndCount(reg);

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
