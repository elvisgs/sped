package br.com.gep.sped.fiscal.marshaller.writer;

import br.com.gep.sped.marshaller.common.writer.SpedWriter;
import org.beanio.BeanWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;

public class SpedFiscalWriter extends SpedWriter {

    public SpedFiscalWriter(Writer writer) {
        super(writer);
    }

    public SpedFiscalWriter(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    protected BeanWriter createBeanWriter(Writer writer) {
        return SpedFiscalWriterFactory.getInstance().createBeanWriter(writer);
    }
}
