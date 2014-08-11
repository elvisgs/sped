package br.com.gep.spedcontrib.arquivo.writer;

import br.com.gep.spedcontrib.arquivo.registros.bloco0.Reg0000;
import br.com.gep.spedcontrib.arquivo.registros.bloco0.Reg0001;
import br.com.gep.spedcontrib.arquivo.registros.blocoA.RegA170;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SpedContribWriterTest {

    private static SpedContribWriter writer;
    private static ByteArrayOutputStream stream;
    private String lineSeparator = System.getProperty("line.separator");

    @BeforeClass
    public static void initWriter() throws UnsupportedEncodingException {
        stream = new ByteArrayOutputStream();
        writer = new SpedContribWriter(new OutputStreamWriter(stream, "ISO-8859-1"));
    }

    @Test
    public void delimitaCamposUsandoPipe() throws IOException {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String[] campos = stream.toString().replaceAll("^\\||\\|$", "").split("\\|", 0);
        assertThat(campos.length, is(2));
    }

    @Test
    public void terminaLinhaComPipe() throws IOException {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = stream.toString();
        assertThat("Linha não termina com pipe", linha.endsWith("|" + lineSeparator), is(true));
    }

    @Test
    public void iniciaLinhaComPipe() throws IOException {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = stream.toString();
        assertThat("Linha não inicia com pipe", linha.startsWith("|"), is(true));
    }

    @Test
    public void usaFormatoDDMMYYYYNasDatas() throws ParseException, IOException {
        Reg0000 reg = new Reg0000();
        reg.setDtIni(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2014"));

        writer.writeAndFlush(reg);

        String[] campos = stream.toString().split("\\|");
        assertThat(campos[6], is("01012014"));
    }

    @Test
    public void formataDecimaisSemPontoEComVirgula() throws IOException {
        RegA170 reg = new RegA170();
        reg.setVlItem(1000D);

        writer.writeAndFlush(reg);

        String[] campos = stream.toString().split("\\|");
        assertThat(campos[5], is("1000,00"));
    }

    @After
    public void after() throws IOException {
        if (writer != null) {
            writer.flush();
        }
        if (stream != null) {
            stream.reset();
        }
    }

    @AfterClass
    public static void closeWriter() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}
