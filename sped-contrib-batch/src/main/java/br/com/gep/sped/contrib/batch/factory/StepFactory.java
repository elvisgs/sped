package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StepFactory {

    @Autowired
    private StepBuilderFactory stepBuilder;

    @Autowired
    private ItemReaderFactory itemReaderFactory;

    @Autowired
    private ItemWriterFactory itemWriterFactory;

    @Autowired
    private RegCounter regCounter;

    @Autowired
    private RegIdHolder regIdHolder;

    public TaskletStep create(String name, Tasklet tasklet) {
        return stepBuilder.get(name)
                .tasklet(tasklet)
                .allowStartIfComplete(true)
                .build();
    }

    public <R extends Registro, P extends Registro> TaskletStep create(String name, Class<R> regClass, Class<P> parentRegClass) {
        ItemStreamReader<R> reader = itemReaderFactory.create(regClass, parentRegClass);
        ItemStreamWriter<R> writer = itemWriterFactory.create(regClass, parentRegClass);

        return stepBuilder.get(name)
                .<R, R>chunk(Constants.CHUNK_SIZE)
                .reader(reader)
                .writer(writer)
                .listener(new IncrementRegCountListener<R>())
                .allowStartIfComplete(true)
                .build();
    }

    public <R extends Registro> TaskletStep create(String name, Class<R> regClass) {
        return create(name, regClass, null);
    }

    private class IncrementRegCountListener<R extends Registro> implements ItemWriteListener<R> {

        @Override
        public void beforeWrite(List<? extends R> items) {
        }

        @Override
        public void afterWrite(List<? extends R> items) {
            Class<? extends Registro> regClass = items.get(0).getClass();
            R lastItem = items.get(items.size() - 1);
            regIdHolder.setId(regClass, lastItem.getId());
            regCounter.incrementCount(regClass, items.size());
        }

        @Override
        public void onWriteError(Exception exception, List<? extends R> items) {
        }
    }
}
