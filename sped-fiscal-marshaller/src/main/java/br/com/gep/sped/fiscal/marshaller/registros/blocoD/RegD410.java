package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D410"),
    @Field(at = 16, name = "fimLinha")
})
@Getter
@Setter
public class RegD410 extends Registro {

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
    private String numDocFin;

    /**
     * Data da emissão
     */
    @Field(at = 7)
    private Date dtDoc;

    /**
     * CST/ICMS
     */
    @Field(at = 8)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 9)
    private String cfop;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 10)
    private Double aliqIcms;

    /**
     * Valor da operação
     */
    @Field(at = 11)
    private Double vlOpr;

    /**
     * Valor dos descontos
     */
    @Field(at = 12)
    private Double vlDesc;

    /**
     * Valor da prestação de serviço
     */
    @Field(at = 13)
    private Double vlServ;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 14)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 15)
    private Double vlIcms;


}