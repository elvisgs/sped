package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * ST por UF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C791"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC791 extends Registro {

    /**
     * UF
     */
    @Field(at = 2)
    private String uf;

    /**
     * Base de cálculo do ICMS ST
     */
    @Field(at = 3)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 4)
    private Double vlIcmsSt;


}
