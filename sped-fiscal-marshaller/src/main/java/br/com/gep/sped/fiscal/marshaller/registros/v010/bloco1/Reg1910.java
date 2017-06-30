package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período da Sub-apuração do ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1910"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg1910 extends Registro {

    /**
     * Data Inicial da sub-apuração
     */
    @Field(at = 2)
    private Date dtIni;

    /**
     * Data final da sub-apuração
     */
    @Field(at = 2)
    private Date dtFin;


}
