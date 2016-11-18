package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C175 - Registro Analítico da NFC-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C175"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class RegC175 extends Registro {

    /**
     * Código fiscal de operação e prestação
     */
    @Field(at = 2)
    private String cfop;

    /**
     * Valor da operação na combinação de CFOP, CST e alíquotas, correspondente ao somatório do valor das mercadorias e produtos constantes no documento
     */
    @Field(at = 3)
    private Double vlOper;

    /**
     * Valor do desconto comercial/Exclusão
     */
    @Field(at = 4)
    private Double vlDesc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
     */
    @Field(at = 5)
    private String cstPis;

    /**
     * Valor da base de cálculo do PIS/PASEP (em valor)
     */
    @Field(at = 6)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 7)
    private Double aliqPis;

    /**
     * Base de cálculo PIS/PASEP (em quantidade)
     */
    @Field(at = 8)
    private Double quantBcPis;

    /**
     * Alíquota do PIS/PASEP (em Reais)
     */
    @Field(at = 9)
    private Double aliqPisQuant;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 10)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS conforme a Tabela indicada no item 4.3.4.
     */
    @Field(at = 11)
    private String cstCofins;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 12)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 13)
    private Double aliqCofins;

    /**
     * Base de cálculo COFINS (em quantidade)
     */
    @Field(at = 14)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 15)
    private Double aliqCofinsQuant;

    /**
     * Valor da COFINS
     */
    @Field(at = 16)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 17)
    private String codCta;

    /**
     * Informação complementar
     */
    @Field(at = 18)
    private String infoCompl;


}