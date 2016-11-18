package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C485 - Detalhamento da COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C485"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegC485 extends Registro {

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 2)
    private String cstCofins;

    /**
     * Valor total dos itens
     */
    @Field(at = 3)
    private Double vlItem;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 4)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 5)
    private Double aliqCofins;

    /**
     * Base de cálculo em quantidade COFINS
     */
    @Field(at = 6)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 7)
    private Double aliqCofinsQuant;

    /**
     * Valor da COFINS
     */
    @Field(at = 8)
    private Double vlCofins;

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 9)
    private String codItem;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 10)
    private String codCta;


}