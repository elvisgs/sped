package br.com.gep.sped.contrib.batch.common;

import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
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
    protected RegCounter regCounter;

    public TaskletStep create(String name, Tasklet tasklet) {
        return stepBuilder.get(name)
                .tasklet(tasklet)
                .allowStartIfComplete(true)
                .build();
    }

    public <T> TaskletStep create(String name, int chunk, ItemReader<T> reader) {
        TaskletStep step = stepBuilder.get(name)
                .<T, T>chunk(chunk)
                .reader(reader)
                .writer(itemWriters.<T>beanIOWriter())
                .listener(new IncrementRegCountListener<T>())
                .build();

        step.setAllowStartIfComplete(true);

        return step;
    }

    private class IncrementRegCountListener<T> implements ItemWriteListener<T> {

        @Override
        public void beforeWrite(List<? extends T> items) {
        }

        @Override
        public void afterWrite(List<? extends T> items) {
            regCounter.incrementCount(items.get(0).getClass(), items.size());
        }

        @Override
        public void onWriteError(Exception exception, List<? extends T> items) {
        }
    }
}
