package br.com.gep.sped.contrib.marshaller.writer;

import br.com.gep.sped.contrib.marshaller.WriterTestBase;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0000;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0001;
import br.com.gep.sped.contrib.marshaller.registros.blocoA.RegA170;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.assertj.core.api.Assertions.*;

public class SpedContribWriterTest extends WriterTestBase {

    @Test
    public void delimitaCamposUsandoPipe() {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().replaceAll("^\\||\\|$", "").split("\\|", 0);
        assertThat(campos.length).isEqualTo(2);
    }

    @Test
    public void terminaLinhaComPipe() {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = resultStream.toString();
        assertThat(linha).endsWith("|" + lineSeparator);
    }

    @Test
    public void iniciaLinhaComPipe() throws IOException {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = resultStream.toString();
        assertThat(linha).startsWith("|");
    }

    @Test
    public void usaFormatoDDMMYYYYNasDatas() throws ParseException {
        Reg0000 reg = new Reg0000();
        reg.setDtIni(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2014"));

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[6]);
    }

    @Test
    public void formataDoubleIgnorandoCasasDecimaisZeradas() {
        RegA170 reg = new RegA170();
        reg.setVlItem(1000.00D);
        reg.setVlBcPis(1000.90D);
        reg.setAliqPis(10.9000D);

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[5]).isEqualTo("1000");
        assertThat(campos[10]).isEqualTo("1000,9");
        assertThat(campos[11]).isEqualTo("10,9");
    }

    @Test
    public void formataDoubleComAte5CasasDecimais() {
        RegA170 reg = new RegA170();
        reg.setVlItem(1000.999D);
        reg.setVlDesc(1000.9999D);
        reg.setAliqPis(1000.99999D);

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[5]).isEqualTo("1000,999");
        assertThat(campos[6]).isEqualTo("1000,9999");
        assertThat(campos[11]).isEqualTo("1000,99999");
    }
}
