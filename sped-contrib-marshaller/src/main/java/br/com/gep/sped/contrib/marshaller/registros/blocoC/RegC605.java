package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C605 - Complemento da consolidação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C605"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegC605 extends Registro {

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
     * Valor da COFINS
     */
    @Field(at = 6)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 7)
    private String codCta;


}