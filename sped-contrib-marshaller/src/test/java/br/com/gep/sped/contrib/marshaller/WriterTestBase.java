package br.com.gep.sped.contrib.marshaller;

import br.com.gep.sped.contrib.marshaller.writer.SpedContribWriter;
import br.com.gep.sped.marshaller.common.writer.SpedWriter;
import org.junit.After;
import org.junit.Before;

import java.io.StringWriter;

public class WriterTestBase {

    protected SpedWriter writer;
    protected StringWriter result;
    protected String lineSeparator = System.getProperty("line.separator");

    @Before
    public void initWriter() {
        result = new StringWriter();
        writer = new SpedContribWriter(result);
    }

    @After
    public void closeWriter() {
        if (writer != null) {
            writer.flush();
            writer.close();
        }
    }
}
