package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.*;
import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.batch.common.tasklets.Bloc9Tasklet;
import br.com.gep.sped.batch.common.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.batch.common.tasklets.RegTreeTasklet;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import br.com.gep.sped.marshaller.common.bloco9.Reg9999;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Component
public class TaskletFactory {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Autowired
    private ItemWriterFactory itemWriterFactory;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private RegCounter regCounter;

    @Autowired
    private SpedTree spedTree;

    @Autowired
    private SpedProperties spedProperties;

    @Autowired
    private EmptyTableChecker emptyTableChecker;

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
        tasklet.setRegIdHolder(regIdHolder);
        tasklet.setRegCounter(regCounter);
        tasklet.setEmptyTableChecker(emptyTableChecker);
        tasklet.setChunkSize(spedProperties.getChunkSize());

        return tasklet;
    }

    private ClosingBlocRegTasklet createClosingBlocRegTasklet(Class<? extends RegistroEncerramentoBloco> regClass) {
        ClosingBlocRegTasklet tasklet = new ClosingBlocRegTasklet(regClass);
        tasklet.setWriter(itemWriterFactory.create(regClass));
        tasklet.setRegCounter(regCounter);
        tasklet.setSpedTree(spedTree);

        return tasklet;
    }

    private Bloc9Tasklet createBloc9Tasklet() {
        return new Bloc9Tasklet(regCounter, itemWriterFactory.create(Registro.class));
    }
}
