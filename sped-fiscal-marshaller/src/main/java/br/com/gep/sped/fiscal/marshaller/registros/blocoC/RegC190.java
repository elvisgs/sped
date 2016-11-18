package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Analítico
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C190"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class RegC190 extends Registro {

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
     * Valor da operação
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
     * Base de cálculo do ICMS ST
     */
    @Field(at = 8)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 9)
    private Double vlIcmsSt;

    /**
     * Valor não tributado base do ICMS
     */
    @Field(at = 10)
    private Double vlRedBc;

    /**
     * Valor do IPI
     */
    @Field(at = 11)
    private Double vlIpi;

    /**
     * Código observação lançamento
     */
    @Field(at = 12)
    private String codObs;


}