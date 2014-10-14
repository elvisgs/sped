package br.com.gep.sped.marshaller.common.writer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

public class SpedWriterTest {

    protected SpedWriter writer;
    protected ByteArrayOutputStream stream;

    @Before
    public void initWriter() throws UnsupportedEncodingException {
        stream = new ByteArrayOutputStream();
        writer = new TestWriter(new OutputStreamWriter(stream, "ISO-8859-1"));
    }

    @After
    public void closeWriter() {
        if (writer != null) {
            writer.flush();
            writer.close();
        }
    }

    @Test
    public void delimitaCamposUsandoPipe() {
        TestRecord record = new TestRecord();
        record.setStringField("Test1");
        record.setDateField(new Date());
        record.setDoubleField(100D);
        record.setIntField(1);

        writer.writeAndFlush(record);

        String[] campos = stream.toString().replaceAll("^\\||\\|$", "").split("\\|", 0);
        assertThat(campos.length).isEqualTo(4);
    }

    @Test
    public void usaFormatoDDMMYYYYNasDatas() throws ParseException {
        TestRecord record = new TestRecord();
        record.setDateField(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2014"));

        writer.writeAndFlush(record);

        String[] campos = stream.toString().split("\\|");
        assertThat(campos[2]).isEqualTo("01012014");
    }

    @Test
    public void formataDoubleUsandoVirgulaParaSepararCasasDecimais() {
        TestRecord record = new TestRecord();
        record.setDoubleField(99.99D);

        writer.writeAndFlush(record);

        String[] campos = stream.toString().split("\\|");
        assertThat(campos[3]).isEqualTo("99,99");
    }
}
