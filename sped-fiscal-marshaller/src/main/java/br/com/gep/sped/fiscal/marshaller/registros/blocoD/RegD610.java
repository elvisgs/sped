package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D610"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class RegD610 extends Registro {

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
     * Quantidade do item
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Unidade do item
     */
    @Field(at = 5)
    private String unid;

    /**
     * Valor do item
     */
    @Field(at = 6)
    private Double vlItem;

    /**
     * Valor dos descontos
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
     * Base de cálculo do ICMS de outras UFs
     */
    @Field(at = 13)
    private Double vlBcIcmsSt;

    /**
     * Valor do ICMS retido por de outras UFs
     */
    @Field(at = 14)
    private Double vlIcmsSt;

    /**
     * Valor não tributado base ICMS
     */
    @Field(at = 15)
    private Double vlRedBc;

    /**
     * Valor do PIS
     */
    @Field(at = 16)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 17)
    private Double vlCofins;

    /**
     * Código da conta analítica
     */
    @Field(at = 18)
    private String codCta;


}