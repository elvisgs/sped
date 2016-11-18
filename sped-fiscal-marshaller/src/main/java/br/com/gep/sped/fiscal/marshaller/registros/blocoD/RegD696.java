package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D696"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegD696 extends Registro {

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
     * Base de cálculo do ICMS de outras UFs
     */
    @Field(at = 8)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS de outras UFs
     */
    @Field(at = 9)
    private Double vlIcmsSt;

    /**
     * Valor não-tributado pelo ICMS
     */
    @Field(at = 10)
    private Double vlRedBc;

    /**
     * Código observação lançamento
     */
    @Field(at = 11)
    private String codObs;


}