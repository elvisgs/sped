package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.*;
import br.com.gep.sped.batch.common.jdbc.EmptyTableChecker;
import br.com.gep.sped.batch.common.tasklets.Bloco9Tasklet;
import br.com.gep.sped.batch.common.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.batch.common.tasklets.RegTreeTasklet;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
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

    public RegTreeTasklet createRegTreeTasklet(Class<? extends Registro> regClass) throws Exception {
        RegNode rootNode = spedTree.getNode(regClass);
        RegTreeTasklet tasklet = new RegTreeTasklet(rootNode);
        tasklet.setItemReaderFactory(itemReaderFactory);
        tasklet.setItemWriterFactory(itemWriterFactory);
        tasklet.setRegIdHolder(regIdHolder);
        tasklet.setRegCounter(regCounter);
        tasklet.setEmptyTableChecker(emptyTableChecker);
        tasklet.setChunkSize(spedProperties.getChunkSize());

        tasklet.afterPropertiesSet();

        return tasklet;
    }

    @SuppressWarnings("unchecked")
    public ClosingBlocRegTasklet createClosingBlocRegTasklet(Class<? extends RegistroEncerramentoBloco> regClass)
        throws Exception {

        ClosingBlocRegTasklet tasklet = new ClosingBlocRegTasklet(regClass);
        tasklet.setWriter(itemWriterFactory.create(regClass));
        tasklet.setRegCounter(regCounter);
        tasklet.setSpedTree(spedTree);

        tasklet.afterPropertiesSet();

        return tasklet;
    }

    public Bloco9Tasklet createBloc9Tasklet() throws Exception {
        Bloco9Tasklet tasklet = new Bloco9Tasklet();
        tasklet.setWriter(itemWriterFactory.create(Registro.class));
        tasklet.setRegCounter(regCounter);
        tasklet.afterPropertiesSet();

        return tasklet;
    }
}
