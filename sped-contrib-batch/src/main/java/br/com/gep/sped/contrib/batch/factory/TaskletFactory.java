package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.common.RegNode;
import br.com.gep.sped.contrib.batch.common.SpedTree;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.sped.contrib.batch.tasklets.Bloco9Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.contrib.batch.tasklets.RegTreeTasklet;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
import br.com.gep.sped.contrib.marshaller.registros.RegistroEncerramentoBloco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskletFactory {

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Autowired
    private ItemWriterConfig itemWriters;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private RegCounter regCounter;

    @Autowired
    private SpedTree spedTree;

    public RegTreeTasklet createRegTreeTasklet(Class<? extends Registro> regClass) {
        RegNode rootNode = spedTree.getNode(regClass);
        RegTreeTasklet tasklet = new RegTreeTasklet(rootNode);
        tasklet.setItemReaderFactory(itemReaderFactory);
        tasklet.setWriter(itemWriters.beanIOWriter());
        tasklet.setRegIdHolder(regIdHolder);
        tasklet.setRegCounter(regCounter);

        return tasklet;
    }

    public <T extends RegistroEncerramentoBloco> ClosingBlocRegTasklet createClosingBlocRegTasklet(Class<T> closingBlocRegClass, List<Class<? extends Registro>> regClassesToCount) {
        ClosingBlocRegTasklet tasklet = new ClosingBlocRegTasklet(closingBlocRegClass, regClassesToCount);
        tasklet.setWriter(itemWriters.<T>beanIOWriter());
        tasklet.setRegCounter(regCounter);

        return tasklet;
    }

    public Bloco9Tasklet createBloc9Tasklet() {
        Bloco9Tasklet tasklet = new Bloco9Tasklet();
        tasklet.setWriter(itemWriters.beanIOWriter());
        tasklet.setRegCounter(regCounter);

        return tasklet;
    }
}
