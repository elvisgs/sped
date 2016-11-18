package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C491 - Detalhamento do PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C491"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegC491 extends Registro {

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 3)
    private String cstPis;

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
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 6)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 7)
    private Double aliqPis;

    /**
     * Base de cálculo em quantidade PIS/PASEP
     */
    @Field(at = 8)
    private Double quantBcPis;

    /**
     * Alíquota do PIS/PASEP (em reais)
     */
    @Field(at = 9)
    private Double aliqPisQuant;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 10)
    private Double vlPis;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 11)
    private String codCta;


}