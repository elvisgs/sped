package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C170 - Itens do Documento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C170"),
    @Field(at = 38, name = "fimLinha")
})
@Getter
@Setter
public class RegC170 extends Registro {

    /**
     * Número seqüencial do item no documento fiscal
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Descrição complementar do item como adotado no documento fiscal
     */
    @Field(at = 4)
    private String descrCompl;

    /**
     * Quantidade do item
     */
    @Field(at = 5)
    private Double qtd;

    /**
     * Unidade do item (Campo 02 do registro 0190)
     */
    @Field(at = 6)
    private String unid;

    /**
     * Valor total do item (mercadorias ou serviços)
     */
    @Field(at = 7)
    private Double vlItem;

    /**
     * Valor do desconto comercial
     */
    @Field(at = 8)
    private Double vlDesc;

    /**
     * Movimentação física do ITEM/PRODUTO
     * <p>0=Sim;1=Não</p>
     */
    @Field(at = 9)
    private String indMov;

    /**
     * Código da Situação Tributária referente ao ICMS, conforme a Tabela indicada no item 4.3.1
     */
    @Field(at = 10)
    private String cstIcms;

    /**
     * Código Fiscal de Operação e Prestação
     */
    @Field(at = 11)
    private String cfop;

    /**
     * Código da natureza da operação (campo 02 do Registro 0400)
     */
    @Field(at = 12)
    private String codNat;

    /**
     * Valor da base de cálculo do ICMS
     */
    @Field(at = 13)
    private Double vlBcIcms;

    /**
     * Alíquota do ICMS
     */
    @Field(at = 14)
    private Double aliqIcms;

    /**
     * Valor do ICMS creditado/debitado
     */
    @Field(at = 15)
    private Double vlIcms;

    /**
     * Valor da base de cálculo referente à substituição tributária
     */
    @Field(at = 16)
    private Double vlBcIcmsSt;

    /**
     * Alíquota do ICMS da substituição tributária na unidade da federação de destino
     */
    @Field(at = 17)
    private Double aliqSt;

    /**
     * Valor do ICMS referente à substituição tributária
     */
    @Field(at = 18)
    private Double vlIcmsSt;

    /**
     * Indicador de período de apuração do IPI
     * <p>0=Mensal;1=Decendial</p>
     */
    @Field(at = 19)
    private String indApur;

    /**
     * Código da Situação Tributária referente ao IPI, conforme a Tabela indicada no item 4.3.2.
     */
    @Field(at = 20)
    private String cstIpi;

    /**
     * Código de enquadramento legal do IPI, conforme tabela indicada no item 4.5.3.
     */
    @Field(at = 21)
    private String codEnq;

    /**
     * Valor da base de cálculo do IPI
     */
    @Field(at = 22)
    private Double vlBcIpi;

    /**
     * Alíquota do IPI
     */
    @Field(at = 23)
    private Double aliqIpi;

    /**
     * Valor do IPI creditado/debitado
     */
    @Field(at = 24)
    private Double vlIpi;

    /**
     * Código da Situação Tributária referente ao PIS
     */
    @Field(at = 25)
    private String cstPis;

    /**
     * Valor da base de cálculo do PIS
     */
    @Field(at = 26)
    private Double vlBcPis;

    /**
     * Alíquota do PIS (em percentual)
     */
    @Field(at = 27)
    private Double aliqPis;

    /**
     * Base de cálculo em quantidade PIS/PASEP
     */
    @Field(at = 28)
    private Double quantBcPis;

    /**
     * Alíquota do PIS (em reais)
     */
    @Field(at = 29)
    private Double aliqPisQuant;

    /**
     * Valor do PIS
     */
    @Field(at = 30)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente ao COFINS
     */
    @Field(at = 31)
    private String cstCofins;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 32)
    private Double vlBcCofins;

    /**
     * Alíquota do COFINS (em percentual)
     */
    @Field(at = 33)
    private Double aliqCofins;

    /**
     * Base de cálculo em quantidade COFINS
     */
    @Field(at = 34)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 35)
    private Double aliqCofinsQuant;

    /**
     * Valor da COFINS
     */
    @Field(at = 36)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 37)
    private String codCta;


}