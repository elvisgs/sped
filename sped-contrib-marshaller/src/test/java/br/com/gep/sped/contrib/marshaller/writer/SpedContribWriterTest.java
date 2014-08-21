package br.com.gep.sped.contrib.marshaller.writer;

import br.com.gep.sped.contrib.marshaller.WriterTestBase;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0001;
import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA170;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SpedContribWriterTest extends WriterTestBase {

    @Test
    public void delimitaCamposUsandoPipe() {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().replaceAll("^\\||\\|$", "").split("\\|", 0);
        assertThat(campos.length, is(2));
    }

    @Test
    public void terminaLinhaComPipe() {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = resultStream.toString();
        assertThat("Linha não termina com pipe", linha.endsWith("|" + lineSeparator), is(true));
    }

    @Test
    public void iniciaLinhaComPipe() throws IOException {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = resultStream.toString();
        assertThat("Linha não inicia com pipe", linha.startsWith("|"), is(true));
    }

    @Test
    public void usaFormatoDDMMYYYYNasDatas() throws ParseException {
        Reg0000 reg = new Reg0000();
        reg.setDtIni(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2014"));

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[6], is("01012014"));
    }

    @Test
    public void formataDecimaisSemPontoEComVirgula() {
        RegA170 reg = new RegA170();
        reg.setVlItem(1000D);

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[5], is("1000,00"));
    }
}
