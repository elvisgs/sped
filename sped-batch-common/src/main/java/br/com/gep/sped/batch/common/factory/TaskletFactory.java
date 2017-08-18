package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.config.SpedProperties;
import br.com.gep.sped.batch.common.support.RegCounter;
import br.com.gep.sped.batch.common.support.RegInfoUpdater;
import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.batch.common.tasklets.Bloc9Tasklet;
import br.com.gep.sped.batch.common.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.batch.common.tasklets.RegTreeTasklet;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
@RequiredArgsConstructor
public class TaskletFactory {

    private final ItemReaderFactory itemReaderFactory;
    private final ItemProcessorLocator itemProcessorLocator;
    private final ItemWriterFactory itemWriterFactory;
    private final RegCounter regCounter;
    private final SpedTree spedTree;
    private final RegInfoUpdater regInfoUpdater;
    private final SpedProperties spedProperties;

    @SuppressWarnings("unchecked")
    public Tasklet create(Class<? extends Registro> regClass) {
        if (Reg9999.class.isAssignableFrom(regClass)) {
            return createBloc9Tasklet();
        } else if (RegistroEncerramentoBloco.class.isAssignableFrom(regClass)) {
            return createClosingBlocRegTasklet((Class<? extends RegistroEncerramentoBloco>) regClass);
        } else {
            return createRegTreeTasklet(regClass);
        }
    }

    private RegTreeTasklet createRegTreeTasklet(Class<? extends Registro> regClass) {
        RegNode rootNode = spedTree.getNode(regClass);

        return new RegTreeTasklet(rootNode)
            .setItemReaderFactory(itemReaderFactory)
            .setItemProcessorLocator(itemProcessorLocator)
            .setItemWriterFactory(itemWriterFactory)
            .setRegInfoUpdater(regInfoUpdater)
            .setChunkSize(spedProperties.getChunkSize());
    }

    private ClosingBlocRegTasklet createClosingBlocRegTasklet(Class<? extends RegistroEncerramentoBloco> regClass) {
        return new ClosingBlocRegTasklet(
            regClass,
            itemWriterFactory.create(Registro.class),
            regCounter,
            spedTree);
    }

    private Bloc9Tasklet createBloc9Tasklet() {
        return new Bloc9Tasklet(regCounter, itemWriterFactory.create(Registro.class));
    }
}
