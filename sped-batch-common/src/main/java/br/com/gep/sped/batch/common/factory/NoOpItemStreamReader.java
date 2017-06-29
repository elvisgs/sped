package br.com.gep.sped.batch.common.factory;

import org.springframework.batch.item.*;

public class NoOpItemStreamReader<T> implements ItemStreamReader<T> {

    @Override
    public T read() throws Exception {
        return null;
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {

    }

    @Override
    public void close() throws ItemStreamException {

    }
}
