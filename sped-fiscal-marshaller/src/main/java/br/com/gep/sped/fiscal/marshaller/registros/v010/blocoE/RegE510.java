package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Valores Consolidados
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E510"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegE510 extends Registro {

    /**
     * CFOP
     */
    @Field(at = 2)
    private String cfop;

    /**
     * CST/IPI
     */
    @Field(at = 3)
    private String cstIpi;

    /**
     * Valor Contábil
     */
    @Field(at = 4)
    private Double vlContIpi;

    /**
     * Base de cálculo do IPI
     */
    @Field(at = 5)
    private Double vlBcIpi;

    /**
     * Valor do IPI
     */
    @Field(at = 6)
    private Double vlIpi;


}
