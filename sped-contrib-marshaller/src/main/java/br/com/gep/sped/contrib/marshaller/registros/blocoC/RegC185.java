package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C185 - Detalhamento da Consolidação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C185"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegC185 extends Registro {

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 2)
    private String cstCofins;

    /**
     * Código fiscal de operação e prestação
     */
    @Field(at = 3)
    private String cfop;

    /**
     * Valor total do item
     */
    @Field(at = 4)
    private Double vlItem;

    /**
     * Valor do desconto comercial / Exclusão
     */
    @Field(at = 5)
    private Double vlDesc;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 6)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 7)
    private Double aliqCofins;

    /**
     * Base de cálculo em quantidade COFINS
     */
    @Field(at = 8)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 9)
    private Double aliqCofinsQuant;

    /**
     * Valor da COFINS
     */
    @Field(at = 10)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 11)
    private String codCta;


}