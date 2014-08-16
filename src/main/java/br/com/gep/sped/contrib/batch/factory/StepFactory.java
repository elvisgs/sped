package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.common.Constants;
import br.com.gep.sped.contrib.batch.common.RegCounter;
import br.com.gep.sped.contrib.batch.common.RegIdHolder;
import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StepFactory {

    @Autowired
    private StepBuilderFactory stepBuilder;

    @Autowired
    private ItemWriterConfig itemWriters;

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

    public <R extends RegBase> TaskletStep create(String name, ItemReader<R> reader, int chunkSize) {
        TaskletStep step = stepBuilder.get(name)
                .<R, R>chunk(chunkSize)
                .reader(reader)
                .writer(itemWriters.<R>beanIOWriter())
                .listener(new IncrementRegCountListener<R>())
                .build();

        step.setAllowStartIfComplete(true);

        return step;
    }

    public <R extends RegBase> TaskletStep create(String name, ItemReader<R> reader) {
        return create(name, reader, Constants.CHUNK_SIZE);
    }

    private class IncrementRegCountListener<R extends RegBase> implements ItemWriteListener<R> {

        @Override
        public void beforeWrite(List<? extends R> items) {
        }

        @Override
        public void afterWrite(List<? extends R> items) {
            Class<? extends RegBase> regClass = items.get(0).getClass();
            regIdHolder.setId(regClass, items.get(items.size() - 1).getId());
            regCounter.incrementCount(regClass, items.size());
        }

        @Override
        public void onWriteError(Exception exception, List<? extends R> items) {
        }
    }
}
