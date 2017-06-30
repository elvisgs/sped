package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C610"),
    @Field(at = 18, name = "fimLinha")
})
@Getter
@Setter
public class RegC610 extends Registro {

    /**
     * Código de classificação
     */
    @Field(at = 2)
    private String codClass;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade acumulada
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Unidade do item
     */
    @Field(at = 5)
    private String unid;

    /**
     * Valor acumulado do item
     */
    @Field(at = 6)
    private Double vlItem;

    /**
     * Valor acumulado dos descontos
     */
    @Field(at = 7)
    private Double vlDesc;

    /**
     * CST/ICMS
     */
    @Field(at = 8)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 9)
    private String cfop;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 10)
    private Double aliqIcms;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 11)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 12)
    private Double vlIcms;

    /**
     * Base de cálculo do ICMS ST
     */
    @Field(at = 13)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 14)
    private Double vlIcmsSt;

    /**
     * Valor do PIS
     */
    @Field(at = 15)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 16)
    private Double vlCofins;

    /**
     * Código da conta analítica
     */
    @Field(at = 17)
    private String codCta;


}
