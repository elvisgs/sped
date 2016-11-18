package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de Comunicação e de Telecomunicação - Consolidadas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D600"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class RegD600 extends Registro {

    /**
     * Código do modelo do documento
     * <p>21=Nota Fiscal de Serviço de Comunicação;22=Nota Fiscal de Serviço de Telecomunicação</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Código do município
     */
    @Field(at = 3)
    private String codMun;

    /**
     * Série do documento fiscal
     */
    @Field(at = 4)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 5)
    private String sub;

    /**
     * Código de classe de consumo
     */
    @Field(at = 6)
    private String codCons;

    /**
     * Quantidade doc consolidados
     */
    @Field(at = 7)
    private Integer qtdCons;

    /**
     * Data dos documentos
     */
    @Field(at = 8)
    private Date dtDoc;

    /**
     * Valor total dos doc fiscais
     */
    @Field(at = 9)
    private Double vlDoc;

    /**
     * Valor dos descontos
     */
    @Field(at = 10)
    private Double vlDesc;

    /**
     * Valor tributado pelo ICMS
     */
    @Field(at = 11)
    private Double vlServ;

    /**
     * Valor não-tributado pelo ICMS
     */
    @Field(at = 12)
    private Double vlServNt;

    /**
     * Valores cobrados para terceiros
     */
    @Field(at = 13)
    private Double vlTerc;

    /**
     * Valor despesas acessórias
     */
    @Field(at = 14)
    private Double vlDa;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 15)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 16)
    private Double vlIcms;

    /**
     * Valor do PIS
     */
    @Field(at = 17)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 18)
    private Double vlCofins;


}