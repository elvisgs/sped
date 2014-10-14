package br.com.gep.sped.fiscal.marshaller;

import br.com.gep.sped.fiscal.marshaller.writer.SpedFiscalWriter;
import br.com.gep.sped.marshaller.common.writer.SpedWriter;
import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class WriterTestBase {

    protected SpedWriter writer;
    protected ByteArrayOutputStream resultStream;
    protected String lineSeparator = System.getProperty("line.separator");

    @Before
    public void initWriter() throws UnsupportedEncodingException {
        resultStream = new ByteArrayOutputStream();
        writer = new SpedFiscalWriter(new OutputStreamWriter(resultStream, "ISO-8859-1"));
    }

    @After
    public void closeWriter() {
        if (writer != null) {
            writer.flush();
            writer.close();
        }
    }
}
