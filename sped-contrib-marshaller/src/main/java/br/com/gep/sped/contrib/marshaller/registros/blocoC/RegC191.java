package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C191 - Detalhamento da Consolidação -PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C191"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class RegC191 extends Registro {

    /**
     * CNPJ/CPF do Participante a que se referem as operações consolidadas neste registro (pessoa jurídica ou pessoa física vendedora/remetente)
     */
    @Field(at = 2)
    private String cnpjCpfPart;

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
     * Valor total do item
     */
    @Field(at = 5)
    private Double vlItem;

    /**
     * Valor do desconto comercial / Exclusão
     */
    @Field(at = 6)
    private Double vlDesc;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 7)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 8)
    private Double aliqPis;

    /**
     * Base de cálculo em quantidade PIS/PASEP
     */
    @Field(at = 9)
    private Double quantBcPis;

    /**
     * Alíquota do PIS/PASEP (em reais)
     */
    @Field(at = 10)
    private Double aliqPisQuant;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 11)
    private Double vlPis;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 12)
    private String codCta;


}