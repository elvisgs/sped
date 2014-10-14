package br.com.gep.sped.marshaller.common.writer;

import org.beanio.BeanWriter;

import java.io.*;

public abstract class SpedWriter {

    protected BeanWriter beanWriter;

    protected SpedWriter(Writer writer) {
        this.beanWriter = createBeanWriter(writer);
    }

    protected SpedWriter(File file) throws FileNotFoundException {
        Writer fw = null;
        try {
            fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        this.beanWriter = createBeanWriter(fw);
    }

    protected abstract BeanWriter createBeanWriter(Writer writer);

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
