package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de Comunicação e de Telecomunicação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D500"),
    @Field(at = 25, name = "fimLinha")
})
@Getter
@Setter
public class RegD500 extends Registro {

    /**
     * Tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    @Field(at = 3)
    private String indEmit;

    /**
     * Código do participante
     */
    @Field(at = 4)
    private String codPart;

    /**
     * Código do modelo do documento
     * <p>21=Nota Fiscal de Serviço de Comunicação;22=Nota Fiscal de Serviço de Telecomunicação</p>
     */
    @Field(at = 5)
    private String codMod;

    /**
     * Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    @Field(at = 6)
    private String codSit;

    /**
     * Série
     */
    @Field(at = 7)
    private String ser;

    /**
     * Subsérie
     */
    @Field(at = 8)
    private String sub;

    /**
     * Número do documento
     */
    @Field(at = 9)
    private String numDoc;

    /**
     * Data da emissão
     */
    @Field(at = 10)
    private Date dtDoc;

    /**
     * Data da entrada/saída
     */
    @Field(at = 11)
    private Date dtAP;

    /**
     * Valor do documento fiscal
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
     * Valor não-tributados pelo ICMS
     */
    @Field(at = 15)
    private Double vlServNt;

    /**
     * Valores cobrados para terceiros
     */
    @Field(at = 16)
    private Double vlTerc;

    /**
     * Valor de outras despesas
     */
    @Field(at = 17)
    private Double vlDa;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 18)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 19)
    private Double vlIcms;

    /**
     * Código inf complementar (doc fiscal)
     */
    @Field(at = 20)
    private String codInf;

    /**
     * Valor do PIS
     */
    @Field(at = 21)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 22)
    private Double vlCofins;

    /**
     * Código da conta analítica
     */
    @Field(at = 23)
    private String codCta;

    /**
     * Código do Tipo de Assinante
     * <p>1=Comercial/Industrial;2=Poder Público;3=Residencial/Pessoa física;4=Público;5=Semi-Público;6=Outros</p>
     */
    @Field(at = 24)
    private String tpAssinante;


}
