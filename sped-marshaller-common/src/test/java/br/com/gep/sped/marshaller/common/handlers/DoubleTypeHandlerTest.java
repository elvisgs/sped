package br.com.gep.sped.marshaller.common.handlers;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleTypeHandlerTest {

    @Test
    public void formataIgnorandoCasasDecimaisZeradas() {
        DoubleTypeHandler handler = new DoubleTypeHandler();
        String valorCom1CasaZerada = handler.format(1000.90D);
        String valorCom2CasasZeradas = handler.format(1000.00D);
        String valorCom3CasasZeradas = handler.format(10.9000D);

        assertThat(valorCom1CasaZerada).isEqualTo("1000,9");
        assertThat(valorCom2CasasZeradas).isEqualTo("1000");
        assertThat(valorCom3CasasZeradas).isEqualTo("10,9");
    }

    @Test
    public void formataComAte5CasasDecimais() {
        DoubleTypeHandler handler = new DoubleTypeHandler();
        String valorCom3CasasDecimais = handler.format(1000.999D);
        String valorCom4CasasDecimais = handler.format(1000.9999D);
        String valorCom5CasasDecimais = handler.format(1000.99999D);

        assertThat(valorCom3CasasDecimais).isEqualTo("1000,999");
        assertThat(valorCom4CasasDecimais).isEqualTo("1000,9999");
        assertThat(valorCom5CasasDecimais).isEqualTo("1000,99999");
    }
}
