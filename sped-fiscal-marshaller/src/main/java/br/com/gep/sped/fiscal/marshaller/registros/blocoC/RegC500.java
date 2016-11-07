package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF / Conta de Energia Elétrica, Gás e Água
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C500"),
    @Field(at = 28, name = "fimLinha")
})
public class RegC500 extends Registro {
    
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
    private Double vlCofins;
    
    @Field(at = 26)
    private String tpLigacao;
    
    @Field(at = 27)
    private String codGrupoTensao;
    
    /**
     * Obtém Tipo de operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Emitente
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
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
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>06=Nota Fiscal/Conta de Energia Elétrica;28=Nota Fiscal/Conta de Fornecimento de Gás Canalizado;29=Nota Fiscal/Conta de Fornecimento de Água Canalizada</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código da situação do documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
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
     * Obtém Classe de consumo energia/gás/água
     */
    public String getCodCons() {
        return codCons;
    }

    /**
     * Seta Classe de consumo energia/gás/água
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
     * Obtém Valor serviços não-tributados pelo ICMS
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor serviços não-tributados pelo ICMS
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Valor cobrado para terceiros
     */
    public Double getVlTerc() {
        return vlTerc;
    }

    /**
     * Seta Valor cobrado para terceiros
     */
    public void setVlTerc(Double vlTerc) {
        this.vlTerc = vlTerc;
    }
    
    /**
     * Obtém Valor de despesas acessórias
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor de despesas acessórias
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }
    
    /**
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Base de cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Código inf complementar (doc fiscal)
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Código inf complementar (doc fiscal)
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
     * Obtém Valor da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
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