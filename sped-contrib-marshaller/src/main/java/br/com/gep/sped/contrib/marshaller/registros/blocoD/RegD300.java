package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D300 - Consolidação Diária - Bilhetes de Passagem
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D300"),
    @Field(at = 20, name = "fimLinha")
})
@Getter
@Setter
public class RegD300 extends Registro {

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>13=D300 - Bilhete de Passagem Rodoviário;14=D300 - Bilhete de Passagem Aquaviário;15=D300 - Bilhete de Passagem e Nota de Bagagem;16=D300 - Bilhete de Passagem Ferroviário;18=D300 - Resumo de Movimento Diário</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Série do documento fiscal
     */
    @Field(at = 3)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 4)
    private String sub;

    /**
     * Número do primeiro documento fiscal emitido (mesmo modelo, série e subsérie)
     */
    @Field(at = 5)
    private String numDocIni;

    /**
     * Número do último documento fiscal emitido (mesmo modelo, série e subsérie)
     */
    @Field(at = 6)
    private Integer numDocFin;

    /**
     * Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2
     */
    @Field(at = 7)
    private String cfop;

    /**
     * Data do dia de referência do resumo diário
     */
    @Field(at = 8)
    private Date dtRef;

    /**
     * Valor total dos documentos fiscais emitidos
     */
    @Field(at = 9)
    private Double vlDoc;

    /**
     * Valor total dos descontos
     */
    @Field(at = 10)
    private Double vlDesc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 11)
    private String cstPis;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 12)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 13)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 14)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS
     */
    @Field(at = 15)
    private String cstCofins;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 16)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 17)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 18)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 19)
    private String codCta;


}