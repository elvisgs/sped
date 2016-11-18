package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C495 - Detalhamento da COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C495"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegC495 extends Registro {

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 3)
    private String cstCofins;

    /**
     * Código fiscal de operação e prestação
     */
    @Field(at = 4)
    private String cfop;

    /**
     * Valor total dos itens
     */
    @Field(at = 5)
    private Double vlItem;

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