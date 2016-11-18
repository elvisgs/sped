package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Complemento ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C179"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegC179 extends Registro {

    /**
     * Base de cálculo ST
     */
    @Field(at = 2)
    private Double bcStOrigDest;

    /**
     * Valor ICMS ST a repassar/deduzir
     */
    @Field(at = 3)
    private Double icmsStRep;

    /**
     * Valor ICMS ST a complementar
     */
    @Field(at = 4)
    private Double icmsStCompl;

    /**
     * Valor da BC de retenção
     */
    @Field(at = 5)
    private Double bcRet;

    /**
     * Valor parcela ICMS ST retido
     */
    @Field(at = 6)
    private Double icmsRet;


}