package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F560 - Incidência do Pis/Pasep e da Cofins pelo regime de competência (apuração da contribuição por unidade de medida de produto - alíquota em reais)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F560"),
    @Field(at = 17, name = "fimLinha")
})
@Getter
@Setter
public class RegF560 extends Registro {

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
     * Base de cálculo em quantidade - PIS/PASEP
     */
    @Field(at = 5)
    private Double quantBcPis;

    /**
     * Alíquota do PIS/PASEP (em reais)
     */
    @Field(at = 6)
    private Double aliqPisQuant;

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
     * Base de cálculo em quantidade - COFINS
     */
    @Field(at = 10)
    private Double quantBcCofins;

    /**
     * Alíquota da COFINS (em reais)
     */
    @Field(at = 11)
    private Double aliqCofinsQuant;

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