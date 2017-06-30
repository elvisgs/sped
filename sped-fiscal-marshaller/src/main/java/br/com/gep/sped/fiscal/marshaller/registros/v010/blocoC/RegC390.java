package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

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
    @Field(at = 1, name = "reg", rid = true, literal = "C390"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegC390 extends Registro {

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
     * Alíquota do ICMS
     */
    @Field(at = 4)
    private Double aliqIcms;

    /**
     * Valor total
     */
    @Field(at = 5)
    private Double vlOpr;

    /**
     * Valor acumulado da base de cálculo
     */
    @Field(at = 6)
    private Double vlBcIcms;

    /**
     * Valor acumulado do ICMS
     */
    @Field(at = 7)
    private Double vlIcms;

    /**
     * Valor não tributado
     */
    @Field(at = 8)
    private Double vlRedBc;

    /**
     * Código da observação do lançamento fiscal
     */
    @Field(at = 9)
    private String codObs;


}
