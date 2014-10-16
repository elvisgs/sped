package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.batch.common.RegCounter;
import br.com.gep.sped.batch.common.RegIdHolder;
import br.com.gep.sped.batch.common.SpedProperties;
import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.batch.core.ItemWriteListener;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@SuppressWarnings("SpringJavaAutowiringInspection")
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

    @Autowired
    private SpedProperties spedProperties;

    public TaskletStep create(String name, Tasklet tasklet) {
        return stepBuilder.get(name)
                .tasklet(tasklet)
                .allowStartIfComplete(true)
                .build();
    }

    public <R extends Registro, P extends Registro> TaskletStep create(String name, Class<R> regClass, Class<P> parentRegClass) throws Exception {
        ItemStreamReader<R> reader = itemReaderFactory.create(regClass, parentRegClass);
        ItemStreamWriter<R> writer = itemWriterFactory.create(regClass, parentRegClass);

        return stepBuilder.get(name)
                .<R, R>chunk(spedProperties.getChunkSize())
                .reader(reader)
                .writer(writer)
                .listener(new UpdateRegInfoListener<R>())
                .allowStartIfComplete(true)
                .build();
    }

    public <R extends Registro> TaskletStep create(String name, Class<R> regClass) throws Exception {
        return create(name, regClass, null);
    }

    private class UpdateRegInfoListener<R extends Registro> implements ItemWriteListener<R> {

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