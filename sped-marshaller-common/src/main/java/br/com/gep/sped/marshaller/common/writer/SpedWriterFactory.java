package br.com.gep.sped.marshaller.common.writer;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.beanio.types.BigDecimalTypeHandler;
import org.beanio.types.DateTypeHandler;
import org.beanio.types.DoubleTypeHandler;

import java.io.Writer;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;

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

        String locale = new Locale("pt", "BR").toString();
        String decimalPattern = "#0.#####";

        BigDecimalTypeHandler decimalHandler = new BigDecimalTypeHandler();
        decimalHandler.setLocale(locale);
        decimalHandler.setPattern(decimalPattern);

        DoubleTypeHandler doubleHandler = new DoubleTypeHandler();
        doubleHandler.setLocale(locale);
        doubleHandler.setPattern(decimalPattern);

        StreamBuilder builder = new StreamBuilder(streamName)
            .writeOnly()
            .format("delimited")
            .parser(new DelimitedParserBuilder('|'))

            .addTypeHandler(Date.class, new DateTypeHandler("ddMMyyyy"))
            .addTypeHandler(Double.class, doubleHandler)
            .addTypeHandler(BigDecimal.class, decimalHandler);

        customizeBuilder(builder);
        addRecords(builder);
        addGroups(builder);

        streamFactory.define(builder);

        return this;
    }

    protected void customizeBuilder(StreamBuilder builder) {
    }

    protected abstract void addRecords(StreamBuilder builder);

    protected void addGroups(StreamBuilder builder) {
    }
}
