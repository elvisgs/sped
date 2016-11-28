package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.support.RegNode;
import br.com.gep.sped.batch.common.support.SpedTree;
import br.com.gep.sped.batch.common.config.SpedProperties;
import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.batch.common.support.RegCounter;
import br.com.gep.sped.batch.common.support.RegInfoUpdater;
import br.com.gep.sped.batch.common.tasklets.Bloc9Tasklet;
import br.com.gep.sped.batch.common.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.batch.common.tasklets.RegTreeTasklet;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TaskletFactory {

    private final ItemReaderFactory itemReaderFactory;
    private final ItemWriterFactory itemWriterFactory;
    private final RegCounter regCounter;
    private final SpedTree spedTree;
    private final RegInfoUpdater regInfoUpdater;
    private final SpedProperties spedProperties;
    private final EmptyTableChecker emptyTableChecker;

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
        RegTreeTasklet tasklet = new RegTreeTasklet(rootNode);
        tasklet.setItemReaderFactory(itemReaderFactory);
        tasklet.setItemWriterFactory(itemWriterFactory);
        tasklet.setRegInfoUpdater(regInfoUpdater);
        tasklet.setEmptyTableChecker(emptyTableChecker);
        tasklet.setChunkSize(spedProperties.getChunkSize());

        return tasklet;
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
