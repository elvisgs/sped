package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro Analítico
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C320"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegC320 extends Registro {

    /**
     * CST/ICMS
     */
    @Field(at = 2)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 3)
    private String cfop;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 4)
    private Double aliqIcms;

    /**
     * Valor total das operações
     */
    @Field(at = 5)
    private Double vlOpr;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 6)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 7)
    private Double vlIcms;

    /**
     * Valor não tributado base do ICMS
     */
    @Field(at = 8)
    private Double vlRedBc;

    /**
     * Código observação lançamento
     */
    @Field(at = 9)
    private String codObs;


}
