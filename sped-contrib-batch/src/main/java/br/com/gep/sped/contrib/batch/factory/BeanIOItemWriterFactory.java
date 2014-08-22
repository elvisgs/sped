package br.com.gep.sped.contrib.batch.factory;

import br.com.gep.sped.contrib.batch.config.ItemWriterConfig;
import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanIOItemWriterFactory implements ItemWriterFactory {

    @Autowired
    private ItemWriterConfig itemWriterConfig;

    @Override
    public <R extends Registro, P extends Registro> ItemStreamWriter<R> create(Class<R> regClass, Class<P> parentRegClass) {
        return itemWriterConfig.beanIOWriter();
    }

    @Override
    public <R extends Registro> ItemStreamWriter<R> create(Class<R> regClass) {
        return create(regClass, null);
    }
}
