package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Analítico de Bilhetes de Passagem
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D300"),
    @Field(at = 21, name = "fimLinha")
})
@Getter
@Setter
public class RegD300 extends Registro {

    /**
     * Código do modelo do documento
     * <p>13=Bilhete de Passagem Rodoviário;14=Bilhete de Passagem Aquaviário;15=Bilhete de Passagem e Nota de Bagagem;16=Bilhete de Passagem Ferroviário</p>
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
     * Documento fiscal inicial
     */
    @Field(at = 5)
    private String numDocIni;

    /**
     * Documento fiscal final
     */
    @Field(at = 6)
    private Integer numDocFin;

    /**
     * CST/ICMS
     */
    @Field(at = 7)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 8)
    private String cfop;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 9)
    private Double aliqIcms;

    /**
     * Data da emissão
     */
    @Field(at = 10)
    private Date dtDoc;

    /**
     * Valor da operação
     */
    @Field(at = 11)
    private Double vlOpr;

    /**
     * Valor total dos descontos
     */
    @Field(at = 12)
    private Double vlDesc;

    /**
     * Valor total da prestação de serviço
     */
    @Field(at = 13)
    private Double vlServ;

    /**
     * Valor de seguro
     */
    @Field(at = 14)
    private Double vlSeg;

    /**
     * Valor de outras despesas
     */
    @Field(at = 15)
    private Double vlOutDesp;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 16)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 17)
    private Double vlIcms;

    /**
     * Valor não tributado base ICMS
     */
    @Field(at = 18)
    private Double vlRedBc;

    /**
     * Código observação lançamento
     */
    @Field(at = 19)
    private String codObs;

    /**
     * Código da conta analítica
     */
    @Field(at = 20)
    private String codCta;


}