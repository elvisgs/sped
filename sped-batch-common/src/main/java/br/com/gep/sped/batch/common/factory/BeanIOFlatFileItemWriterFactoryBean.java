package br.com.gep.sped.batch.common.factory;

import br.com.gep.sped.marshaller.common.writer.SpedWriterFactory;
import org.beanio.spring.BeanIOFlatFileItemWriter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.Assert;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class BeanIOFlatFileItemWriterFactoryBean implements FactoryBean<BeanIOFlatFileItemWriter>, InitializingBean {

    private SpedWriterFactory spedWriterFactory;
    private Charset encoding = StandardCharsets.UTF_8;
    private File outputFile;

    public BeanIOFlatFileItemWriterFactoryBean setSpedWriterFactory(SpedWriterFactory spedWriterFactory) {
        this.spedWriterFactory = spedWriterFactory;
        return this;
    }

    public BeanIOFlatFileItemWriterFactoryBean setEncoding(Charset encoding) {
        this.encoding = encoding;
        return this;
    }

    public BeanIOFlatFileItemWriterFactoryBean setOutputFile(File outputFile) {
        this.outputFile = outputFile;
        return this;
    }

    @Override
    public BeanIOFlatFileItemWriter getObject() {
        BeanIOFlatFileItemWriter writer = new BeanIOFlatFileItemWriter();
        writer.setStreamFactory(spedWriterFactory.getStreamFactory());
        writer.setStreamName(spedWriterFactory.getStreamName());
        writer.setEncoding(encoding.displayName());
        writer.setResource(new FileSystemResource(outputFile));
        writer.setTransactional(false);
        writer.setAppendAllowed(true);
        writer.setSaveState(false);

        return writer;
    }

    @Override
    public Class<?> getObjectType() {
        return BeanIOFlatFileItemWriter.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(spedWriterFactory);
        Assert.notNull(encoding);
        Assert.notNull(outputFile);
    }
}
