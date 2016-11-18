package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

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
    @Field(at = 1, name = "reg", rid = true, literal = "C170"),
    @Field(at = 38, name = "fimLinha")
})
@Getter
@Setter
public class RegC170 extends Registro {

    /**
     * Número seqüencial
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Descrição complementar
     */
    @Field(at = 4)
    private String descrCompl;

    /**
     * Quantidade do item
     */
    @Field(at = 5)
    private Double qtd;

    /**
     * Código da unidade de medida
     */
    @Field(at = 6)
    private String unid;

    /**
     * Valor total do item
     */
    @Field(at = 7)
    private Double vlItem;

    /**
     * Valor do desconto
     */
    @Field(at = 8)
    private Double vlDesc;

    /**
     * Movimentação física
     * <p>0=Sim;1=Não</p>
     */
    @Field(at = 9)
    private String indMov;

    /**
     * CST/ICMS
     */
    @Field(at = 10)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 11)
    private String cfop;

    /**
     * Código da Natureza da operação
     */
    @Field(at = 12)
    private String codNat;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 13)
    private Double vlBcIcms;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 14)
    private Double aliqIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 15)
    private Double vlIcms;

    /**
     * Base de cálculo do ICMS ST
     */
    @Field(at = 16)
    private Double vlBcIcmsSt;

    /**
     * Alíquota do ICMS ST(%)
     */
    @Field(at = 17)
    private Double aliqSt;

    /**
     * Valor do ICMS ST
     */
    @Field(at = 18)
    private Double vlIcmsSt;

    /**
     * Período apuração do IPI
     * <p>0=Mensal;1=Decendial</p>
     */
    @Field(at = 19)
    private String indApur;

    /**
     * CST/IPI
     */
    @Field(at = 20)
    private String cstIpi;

    /**
     * Código de enquadramento do IPI
     */
    @Field(at = 21)
    private String codEnq;

    /**
     * Base de cálculo do IPI
     */
    @Field(at = 22)
    private Double vlBcIpi;

    /**
     * Alíquota do IPI(%)
     */
    @Field(at = 23)
    private Double aliqIpi;

    /**
     * Valor do IPI
     */
    @Field(at = 24)
    private Double vlIpi;

    /**
     * CST/PIS
     */
    @Field(at = 25)
    private String cstPis;

    /**
     * Base de cálculo do PIS
     */
    @Field(at = 26)
    private Double vlBcPis;

    /**
     * Alíquota do PIS (%)
     */
    @Field(at = 27)
    private Double aliqPisPerc;

    /**
     * Qtde. base de cálculo do PIS
     */
    @Field(at = 28)
    private Double quantBcPis;

    /**
     * Alíquota do PIS (R$)
     */
    @Field(at = 29)
    private Double aliqPisReais;

    /**
     * Valor do PIS
     */
    @Field(at = 30)
    private Double vlPis;

    /**
     * CST/COFINS
     */
    @Field(at = 31)
    private String cstCofins;

    /**
     * Base de cálculo da COFINS
     */
    @Field(at = 32)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (%)
     */
    @Field(at = 33)
    private Double aliqCofinsPerc;

    /**
     * Qtde. base de cálculo da COFINS
     */
    @Field(at = 34)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (R$)
     */
    @Field(at = 35)
    private Double aliqCofinsReais;

    /**
     * Valor da COFINS
     */
    @Field(at = 36)
    private Double vlCofins;

    /**
     * Código da conta analítica
     */
    @Field(at = 37)
    private String codCta;


}