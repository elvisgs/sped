package br.com.gep.sped.contrib.marshaller.writer;

import br.com.gep.sped.marshaller.common.writer.SpedWriter;
import org.beanio.BeanWriter;

import java.io.*;

public class SpedContribWriter extends SpedWriter {

    public SpedContribWriter(Writer writer) {
        super(writer);
    }

    public SpedContribWriter(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    protected BeanWriter createBeanWriter(Writer writer) {
        return SpedContribWriterFactory.getInstance().createBeanWriter(writer);
    }
}
