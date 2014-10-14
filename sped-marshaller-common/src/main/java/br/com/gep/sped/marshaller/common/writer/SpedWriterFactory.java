package br.com.gep.sped.marshaller.common.writer;

import br.com.gep.sped.marshaller.common.handlers.DoubleTypeHandler;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.beanio.types.DateTypeHandler;

import java.io.Writer;
import java.util.Date;

public abstract class SpedWriterFactory {

    private String streamName;
    private StreamFactory streamFactory;

    protected SpedWriterFactory(String streamName) {
        if (streamName == null || "".equals(streamName))
            throw new IllegalArgumentException("streamName nao pode ser nulo nem vazio");

        this.streamName = streamName;
    }

    public String getStreamName() {
        return streamName;
    }

    public StreamFactory getStreamFactory() {
        return streamFactory;
    }

    public BeanWriter createBeanWriter(Writer writer) {
        return streamFactory.createWriter(streamName, writer);
    }

    protected SpedWriterFactory initializeFactory() {
        streamFactory = StreamFactory.newInstance();

        StreamBuilder builder = new StreamBuilder(streamName)
                .writeOnly()
                .format("delimited")
                .parser(new DelimitedParserBuilder('|'))

                .addTypeHandler(Date.class, new DateTypeHandler("ddMMyyyy"))
                .addTypeHandler(Double.class, new DoubleTypeHandler());

        addRecords(builder);
        addGroups(builder);

        streamFactory.define(builder);

        return this;
    }

    protected abstract void addRecords(StreamBuilder builder);

    protected void addGroups(StreamBuilder builder) {
    }
}
