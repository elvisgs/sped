package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.contrib.marshaller.WriterTestBase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Reg0200Test extends WriterTestBase {

    @Test
    public void quandoCodNcmNaoEhNuloDeveSerEscritoCom8caracteresComZerosAEsquerda() {
        Reg0200 reg = new Reg0200();
        reg.setCodNcm("1");

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[8], is("00000001"));
    }

    @Test
    public void quandoCodNcmEhNuloNadaEhEscrito() {
        Reg0200 reg = new Reg0200();
        reg.setCodNcm(null);

        writer.writeAndFlush(reg);

        String[] campos = resultStream.toString().split("\\|");
        assertThat(campos[8], is(""));
    }
}
