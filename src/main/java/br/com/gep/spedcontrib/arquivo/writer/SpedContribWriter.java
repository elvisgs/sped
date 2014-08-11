package br.com.gep.spedcontrib.arquivo.writer;

import org.beanio.BeanWriter;

import java.io.*;

public class SpedContribWriter {

    private BeanWriter beanWriter;

    public SpedContribWriter(Writer writer) {
        this.beanWriter = SpedContribWriterFactory.createBeanWriter(writer);
    }

    public SpedContribWriter(File file) throws IOException {
        Writer fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
        this.beanWriter = SpedContribWriterFactory.createBeanWriter(fw);
    }

    public void write(Object obj) throws IOException {
        beanWriter.write(obj);
    }

    public void writeAndFlush(Object obj) throws IOException {
        write(obj);
        flush();
    }

    public void flush() throws IOException {
        beanWriter.flush();
    }

    public void close() throws IOException {
        beanWriter.close();
    }
}
