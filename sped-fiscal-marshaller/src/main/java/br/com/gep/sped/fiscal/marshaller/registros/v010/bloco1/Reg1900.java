package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Indicador de Sub-apuração do ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1900"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg1900 extends Registro {

    /**
     * Indicador de apuração do ICMS
     * <p>3=APURAÇÃO 1;4=APURAÇÃO 2;5=APURAÇÃO 3;6=APURAÇÃO 4;7=APURAÇÃO 5;8=APURAÇÃO 6</p>
     */
    @Field(at = 2)
    private String indApurIcms;

    /**
     * Descrição complementar de Outra Apuração do ICMS
     */
    @Field(at = 3)
    private String descrComplOutApur;


}
