package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.config.SpedProperties;
import br.com.gep.sped.batch.common.support.RegInfoUpdater;
import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.*;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@RequiredArgsConstructor
public class StepFactory {

    private final StepBuilderFactory stepBuilder;
    private final ItemReaderFactory itemReaderFactory;
    private final ItemWriterFactory itemWriterFactory;
    private final ItemProcessorLocator itemProcessorLocator;
    private final TaskletFactory taskletFactory;
    private final RegInfoUpdater regInfoUpdater;
    private final SpedProperties spedProperties;
    private final SpedTree spedTree;

    @SuppressWarnings("unchecked")
    public Step create(Class<? extends Registro> regClass) {
        boolean isClosingBloc = RegistroEncerramentoBloco.class.isAssignableFrom(regClass);
        String stepName = String.format("step%s", regClass.getSimpleName());

        RegNode regNode = spedTree.getNode(regClass);

        if (isClosingBloc || regNode.hasChildren()) {
            Tasklet tasklet = taskletFactory.create(regClass);

            return create(stepName, tasklet);
        } else {
            RegNode parentNode = regNode.getParent();
            Class regParentClass = parentNode != null ? parentNode.getRegClass() : null;

            return create(stepName, regClass, regParentClass);
        }
    }

    public TaskletStep create(String name, Tasklet tasklet) {
        return stepBuilder.get(name)
            .tasklet(tasklet)
            .allowStartIfComplete(true)
            .build();
    }

    public <R extends Registro> TaskletStep create(String name, ItemReader<R> reader, ItemProcessor<R, R> processor,
                                                   ItemWriter<R> writer) {

        return stepBuilder.get(name)
            .<R, R>chunk(spedProperties.getChunkSize())
            .reader(reader)
            .processor(processor)
            .writer(writer)
            .allowStartIfComplete(true)
            .listener(regInfoUpdater)
            .build();
    }

    public <R extends Registro, P extends Registro> TaskletStep create(String name, Class<R> regClass,
                                                                       Class<P> parentRegClass) {

        ItemStreamReader<R> reader = itemReaderFactory.create(regClass, parentRegClass);
        ItemProcessor<R, R> processor = itemProcessorLocator.find(regClass).orElse(null);
        ItemStreamWriter<R> writer = itemWriterFactory.create(regClass, parentRegClass);

        return create(name, reader, processor, writer);
    }

    public <R extends Registro> TaskletStep create(String name, Class<R> regClass) throws Exception {
        return create(name, regClass, null);
    }
}
