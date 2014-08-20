package br.com.gep.sped.contrib.marshaller.writer;

import org.beanio.BeanWriter;

import java.io.*;

public class SpedContribWriter {

    private BeanWriter beanWriter;

    public SpedContribWriter(Writer writer) {
        this.beanWriter = SpedContribWriterFactory.getInstance().createBeanWriter(writer);
    }

    public SpedContribWriter(File file) throws FileNotFoundException {
        Writer fw = null;
        try {
            fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        this.beanWriter = SpedContribWriterFactory.getInstance().createBeanWriter(fw);
    }

    public void write(Object obj) {
        beanWriter.write(obj);
    }

    public void writeAndFlush(Object obj) {
        write(obj);
        flush();
    }

    public void flush() {
        beanWriter.flush();
    }

    public void close() {
        beanWriter.close();
    }
}
