package br.com.gep.sped.marshaller.common.writer;

import org.beanio.BeanWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;

public class TestWriter extends SpedWriter {

    protected TestWriter(Writer writer) {
        super(writer);
    }

    protected TestWriter(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    protected BeanWriter createBeanWriter(Writer writer) {
        return new TestWriterFactory().createBeanWriter(writer);
    }
}
