package br.com.gep.sped.fiscal.marshaller.writer;

import br.com.gep.sped.fiscal.marshaller.WriterTestBase;
import br.com.gep.sped.fiscal.marshaller.registros.bloco0.Reg0001;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.*;

public class SpedFiscalWriterTest extends WriterTestBase {

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
}
