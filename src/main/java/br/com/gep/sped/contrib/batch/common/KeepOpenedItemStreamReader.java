package br.com.gep.sped.contrib.batch.common;

import org.springframework.batch.item.*;

public class KeepOpenedItemStreamReader<T> implements ItemStreamReader<T> {

    private final ItemStreamReader<T> internalReader;
    private boolean isOpened = false;

    public KeepOpenedItemStreamReader(ItemStreamReader<T> internalReader) {
        this.internalReader = internalReader;
    }

    @Override
    public T read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        return internalReader.read();
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        if (!isOpened) {
            internalReader.open(executionContext);
            isOpened = true;
        }
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        internalReader.update(executionContext);
    }

    @Override
    public void close() throws ItemStreamException {
        internalReader.close();
        isOpened = false;
    }
}
