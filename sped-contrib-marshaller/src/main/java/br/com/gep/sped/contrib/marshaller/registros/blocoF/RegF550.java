package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F550 - Regime de Competência - Escrituração consolidada das receitas auferidas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F550"),
    @Field(at = 17, name = "fimLinha")
})
@Getter
@Setter
public class RegF550 extends Registro {

    /**
     * Valor total da receita auferida, referente à combinação de CST e Alíquota
     */
    @Field(at = 2)
    private Double vlRecComp;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 3)
    private String cstPis;

    /**
     * Valor do desconto / exclusão da base de cálculo
     */
    @Field(at = 4)
    private Double vlDescPis;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 5)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 6)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 7)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 8)
    private String cstCofins;

    /**
     * Valor do desconto / exclusão da base de cálculo
     */
    @Field(at = 9)
    private Double vlDescCofins;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 10)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 11)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 12)
    private Double vlCofins;

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    @Field(at = 13)
    private String codMod;

    /**
     * Código Fiscal de Operação e Prestação
     */
    @Field(at = 14)
    private String cfop;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 15)
    private String codCta;

    /**
     * Informação complementar
     */
    @Field(at = 16)
    private String infoCompl;


}