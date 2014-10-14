package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Saídas Interestaduais - Energia Elétrica
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1500"),
    @Field(at = 28, name = "fimLinha", literal = "")
})
public class Reg1500 extends Registro {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String indEmit;
    
    @Field(at = 4)
    private String codPart;
    
    @Field(at = 5)
    private String codMod;
    
    @Field(at = 6)
    private String codSit;
    
    @Field(at = 7)
    private String ser;
    
    @Field(at = 8)
    private String sub;
    
    @Field(at = 9)
    private String codCons;
    
    @Field(at = 10)
    private String numDoc;
    
    @Field(at = 11)
    private Date dtDoc;
    
    @Field(at = 12)
    private Date dtES;
    
    @Field(at = 13)
    private Double vlDoc;
    
    @Field(at = 14)
    private Double vlDesc;
    
    @Field(at = 15)
    private Double vlForn;
    
    @Field(at = 16)
    private Double vlServNt;
    
    @Field(at = 17)
    private Double vlTerc;
    
    @Field(at = 18)
    private Double vlDa;
    
    @Field(at = 19)
    private Double vlBcIcms;
    
    @Field(at = 20)
    private Double vlIcms;
    
    @Field(at = 21)
    private Double vlBcIcmsSt;
    
    @Field(at = 22)
    private Double vlIcmsSt;
    
    @Field(at = 23)
    private String codInf;
    
    @Field(at = 24)
    private Double vlPis;
    
    @Field(at = 25)
    private Double vlCofis;
    
    @Field(at = 26)
    private String tpLigacao;
    
    @Field(at = 27)
    private String codGrupoTensao;
    
    /**
     * Obtém Indicador do tipo de operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Indicador do tipo de operação
     * <p>1=Saída</p>
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Indicador do emitente do documento fiscal
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Indicador do emitente do documento fiscal
     * <p>0=Emissão própria</p>
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém Código do participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Código do modelo do documento fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento fiscal
     * <p>06=Nota Fiscal/Conta de Energia Elétrica</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código da Situação do documento fiscal
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Código da Situação do documento fiscal
     * <p>00=Documento regular;01=Documento regular extemporâneo;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
    }
    
    /**
     * Obtém Série
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Código de Classe de consumo de energia elétrica
     */
    public String getCodCons() {
        return codCons;
    }

    /**
     * Seta Código de Classe de consumo de energia elétrica
     */
    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Data da emissão
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da emissão
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Data da entrada/saída
     */
    public Date getDtES() {
        return dtES;
    }

    /**
     * Seta Data da entrada/saída
     */
    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }
    
    /**
     * Obtém Valor total do documento fiscal
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total do documento fiscal
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor total do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor total do desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor total fornecido/consumido
     */
    public Double getVlForn() {
        return vlForn;
    }

    /**
     * Seta Valor total fornecido/consumido
     */
    public void setVlForn(Double vlForn) {
        this.vlForn = vlForn;
    }
    
    /**
     * Obtém Valor total dos serviços não-tributados pelo ICMS
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor total dos serviços não-tributados pelo ICMS
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Valor total cobrado em nome de terceiros
     */
    public Double getVlTerc() {
        return vlTerc;
    }

    /**
     * Seta Valor total cobrado em nome de terceiros
     */
    public void setVlTerc(Double vlTerc) {
        this.vlTerc = vlTerc;
    }
    
    /**
     * Obtém Valor total de despesas acessórias
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor total de despesas acessórias
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }
    
    /**
     * Obtém Valor acumulado da base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Valor acumulado da base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor acumulado do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor acumulado do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Valor acumulado da base de cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Valor acumulado da base de cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor acumulado do ICMS retido por ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor acumulado do ICMS retido por ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Código da informação complementar do doc. fiscal
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Código da informação complementar do doc. fiscal
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Valor do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor do COFIS
     */
    public Double getVlCofis() {
        return vlCofis;
    }

    /**
     * Seta Valor do COFIS
     */
    public void setVlCofis(Double vlCofis) {
        this.vlCofis = vlCofis;
    }
    
    /**
     * Obtém Código de tipo de Ligação
     */
    public String getTpLigacao() {
        return tpLigacao;
    }

    /**
     * Seta Código de tipo de Ligação
     * <p>1=Monofásico;2=Bifásico;3=Trifásico</p>
     */
    public void setTpLigacao(String tpLigacao) {
        this.tpLigacao = tpLigacao;
    }
    
    /**
     * Obtém Código de grupo de tensão
     */
    public String getCodGrupoTensao() {
        return codGrupoTensao;
    }

    /**
     * Seta Código de grupo de tensão
     * <p>01=A1 - Alta Tensão (230kV ou mais);02=A2 - Alta Tensão (88 a 138kV);03=A3 - Alta Tensão (69kV);04=A3a - Alta Tensão (30kV a 44kV);05=A4 - Alta Tensão (2,3kV a 25kV);06=AS - Alta Tensão Subterrâneo 06;07=B1 - Residencial 07;08=B1 - Residencial Baixa Renda 08;09=B2 - Rural 09;10=B2 - Cooperativa de Eletrificação Rural;11=B2 - Serviço Público de Irrigação;12=B3 - Demais Classes;13=B4a - Iluminação Pública - rede de distribuição;14=B4b - Iluminação Pública - bulbo de lâmpada</p>
     */
    public void setCodGrupoTensao(String codGrupoTensao) {
        this.codGrupoTensao = codGrupoTensao;
    }
    
}