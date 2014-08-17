package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.sped.contrib.batch.tasklets.Bloco9Tasklet;
import br.com.gep.sped.contrib.batch.tasklets.ClosingBlocRegTasklet;
import br.com.gep.sped.contrib.batch.tasklets.RegWithChildrenTasklet;
import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TaskletFactory {

    @Autowired
    private ItemWriterConfig itemWriters;

    @Autowired
    private RegIdHolder regIdHolder;

    @Autowired
    private RegCounter regCounter;

    public <T extends RegBase> RegWithChildrenTasklet<T> createRegWithChildrenTasklet(Class<T> regClass, ItemStreamReader<T> reader) {
        RegWithChildrenTasklet tasklet = new RegWithChildrenTasklet(regClass);
        tasklet.setReader(reader);
        tasklet.setWriter(itemWriters.<T>beanIOWriter());
        tasklet.setRegIdHolder(regIdHolder);
        tasklet.setRegCounter(regCounter);

        return tasklet;
    }

    public <T extends RegEncerramentoBlocoBase> ClosingBlocRegTasklet createClosingBlocRegTasklet(Class<T> closingBlocRegClass, List<Class<? extends RegBase>> regClassesToCount) {
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
