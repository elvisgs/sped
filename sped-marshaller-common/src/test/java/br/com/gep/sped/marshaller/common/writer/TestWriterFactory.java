package br.com.gep.sped.marshaller.common.writer;

import org.beanio.builder.StreamBuilder;

public class TestWriterFactory extends SpedWriterFactory {

    protected TestWriterFactory() {
        super("testStream");
        initializeFactory();
    }

    @Override
    protected void addRecords(StreamBuilder builder) {
        builder.addRecord(TestRecord.class);
    }
}
