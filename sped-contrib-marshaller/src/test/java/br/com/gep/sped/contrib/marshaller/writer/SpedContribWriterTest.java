package br.com.gep.sped.contrib.marshaller.writer;

import br.com.gep.sped.contrib.marshaller.WriterTestBase;
import br.com.gep.sped.contrib.marshaller.registros.bloco0.Reg0001;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class SpedContribWriterTest extends WriterTestBase {

    @Test
    public void terminaLinhaComPipe() {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = result.toString();
        assertThat(linha).endsWith("|" + lineSeparator);
    }

    @Test
    public void iniciaLinhaComPipe() throws IOException {
        Reg0001 reg = new Reg0001();
        reg.setIndMov("1");

        writer.writeAndFlush(reg);

        String linha = result.toString();
        assertThat(linha).startsWith("|");
    }
}
