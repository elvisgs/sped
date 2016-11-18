package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * PIS/COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C410"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC410 extends Registro {

    /**
     * Valor total do PIS
     */
    @Field(at = 2)
    private Double vlPis;

    /**
     * Valor total da COFINS
     */
    @Field(at = 3)
    private Double vlCofins;


}