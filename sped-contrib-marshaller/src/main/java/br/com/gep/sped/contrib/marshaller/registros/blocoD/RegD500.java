package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D500 - NF de Serviço de Comunicação e Telecomunicação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D500"),
    @Field(at = 23, name = "fimLinha")
})
@Getter
@Setter
public class RegD500 extends Registro {

    /**
     * Indicador do tipo de operação
     * <p>0=Aquisição</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Indicador do emitente do documento fiscal
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * Código do participante prestador do serviço (campo 02 do Registro 0150)
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     * <p>21=D500 - Nota Fiscal de Serviço de Comunicação;22=D500 - Nota Fiscal de Serviço de Telecomunicação;55=D500 - Nota Fiscal Eletrônica</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Çódigo da situação do documento fiscal, conforme a Tabela 4.1.2
     * <p>00=Documento regular;02=Documento cancelado;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Série do documento fiscal
     */
    @Field(at = 7)
    private String ser;

    /**
     * Subsérie do documento fiscal
     */
    @Field(at = 8)
    private String sub;

    /**
     * Número do documento fiscal
     */
    @Field(at = 9)
    private String numDoc;

    /**
     * Data da emissão do documento fiscal
     */
    @Field(at = 10)
    private Date dtDoc;

    /**
     * Data da entrada (aquisição)
     */
    @Field(at = 11)
    private Date dtAP;

    /**
     * Valor total do documento fiscal
     */
    @Field(at = 12)
    private Double vlDoc;

    /**
     * Valor total do desconto
     */
    @Field(at = 13)
    private Double vlDesc;

    /**
     * Valor da prestação de serviços
     */
    @Field(at = 14)
    private Double vlServ;

    /**
     * Valor total dos serviços não-tributados pelo ICMS
     */
    @Field(at = 15)
    private Double vlServNt;

    /**
     * Valores cobrados em nome de terceiros
     */
    @Field(at = 16)
    private Double vlTerc;

    /**
     * Valor de outras despesas indicadas no documento fiscal
     */
    @Field(at = 17)
    private Double vlDa;

    /**
     * Valor da base de cálculo do ICMS
     */
    @Field(at = 18)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 19)
    private Double vlIcms;

    /**
     * Código da informação complementar (campo 02 do Registro 0450)
     */
    @Field(at = 20)
    private String codInf;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 21)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 22)
    private Double vlCofins;


}