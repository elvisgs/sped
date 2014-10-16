package br.com.gep.sped.batch.common.mocks;

import br.com.gep.sped.batch.common.factory.ItemWriterFactory;
import br.com.gep.sped.marshaller.common.Registro;
import org.springframework.batch.item.ItemStreamWriter;
import org.springframework.stereotype.Component;

@Component
public class TestItemWriterFactory implements ItemWriterFactory {

    @Override
    public <R extends Registro, P extends Registro> ItemStreamWriter<R> create(Class<R> regClass, Class<P> parentRegClass) {
        return null;
    }

    @Override
    public <R extends Registro> ItemStreamWriter<R> create(Class<R> regClass) {
        return null;
    }
}
