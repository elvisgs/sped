package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C880 - Resumo Diário de Documentos Emitidos por Equipamento SAT-CF-e (Código 59) - PIS/Pasep e Cofins Apurado por Unidade de Medida de Produto
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C880"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegC880 extends Registro {

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Código Fiscal de Operação e Prestação
     */
    @Field(at = 3)
    private String cfop;

    /**
     * Valor total dos itens
     */
    @Field(at = 4)
    private Double vlItem;

    /**
     * Valor da exclusão / desconto comercial dos itens
     */
    @Field(at = 5)
    private Double vlDesc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 6)
    private String cstPis;

    /**
     * Base de cálculo em quantidade - PIS/PASEP
     */
    @Field(at = 7)
    private Double quantBcPis;

    /**
     * Alíquota do PIS (em reais)
     */
    @Field(at = 8)
    private Double aliqPisQuant;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 9)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 10)
    private String cstCofins;

    /**
     * Base de cálculo em quantidade COFINS
     */
    @Field(at = 11)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 12)
    private Double aliqCofinsQuant;

    /**
     * Valor da COFINS
     */
    @Field(at = 13)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 14)
    private String codCta;


}