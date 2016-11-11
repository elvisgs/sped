package br.com.gep.sped.fiscal.batch.factory;

import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.fiscal.batch.config.ItemWriterConfig;
import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanIOItemWriterFactory implements ItemWriterFactory {

    @Autowired
    private ItemWriterConfig itemWriterConfig;

    @SuppressWarnings("unchecked")
    @Override
    public <R extends Registro, P extends Registro> ItemStreamWriter<R> create(Class<R> regClass, Class<P> parentRegClass) {
        return itemWriterConfig.beanIOWriter();
    }

    @Override
    public <R extends Registro> ItemStreamWriter<R> create(Class<R> regClass) {
        return create(regClass, null);
    }
}
