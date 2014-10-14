package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.*;
import br.com.gep.sped.contrib.batch.jdbc.EmptyTableChecker;
import br.com.gep.sped.contrib.batch.tasklets.Bloco9Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.contrib.batch.tasklets.RegTreeTasklet;
import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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

    public <T extends RegistroEncerramentoBloco> ClosingBlocRegTasklet createClosingBlocRegTasklet(Class<T> closingBlocRegClass, List<Class<? extends Registro>> regClassesToCount) throws Exception {
        ClosingBlocRegTasklet tasklet = new ClosingBlocRegTasklet(closingBlocRegClass, regClassesToCount);
        tasklet.setWriter(itemWriterFactory.create(closingBlocRegClass));
        tasklet.setRegCounter(regCounter);

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
