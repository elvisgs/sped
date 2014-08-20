package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D500 - NF de Serviço de Comunicação e Telecomunicação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D500"),
    @Field(at = 23, name = "fimLinha", literal = "")
})
public class RegD500 extends RegBase {
    
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
    private String numDoc;
    
    @Field(at = 10)
    private Date dtDoc;
    
    @Field(at = 11)
    private Date dtAP;
    
    @Field(at = 12)
    private Double vlDoc;
    
    @Field(at = 13)
    private Double vlDesc;
    
    @Field(at = 14)
    private Double vlServ;
    
    @Field(at = 15)
    private Double vlServNt;
    
    @Field(at = 16)
    private Double vlTerc;
    
    @Field(at = 17)
    private Double vlDa;
    
    @Field(at = 18)
    private Double vlBcIcms;
    
    @Field(at = 19)
    private Double vlIcms;
    
    @Field(at = 20)
    private String codInf;
    
    @Field(at = 21)
    private Double vlPis;
    
    @Field(at = 22)
    private Double vlCofins;
    
    
    /**
     * Obtém Tipo de Operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Tipo de Operação
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Indicador do emitente do documento
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Indicador do emitente do documento
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém Participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Modelo do Documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Modelo do Documento
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Situação do Documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Situação do Documento
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
     * Obtém Número
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Data da emissão do Documento
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da emissão do Documento
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Data da entrada (aquisição)
     */
    public Date getDtAP() {
        return dtAP;
    }

    /**
     * Seta Data da entrada (aquisição)
     */
    public void setDtAP(Date dtAP) {
        this.dtAP = dtAP;
    }
    
    /**
     * Obtém Valor total do Documento
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total do Documento
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor Total do Desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor Total do Desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor da Prestação de Serviços
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor da Prestação de Serviços
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Valor Total dos Serviços não-tributados pelo ICMS
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor Total dos Serviços não-tributados pelo ICMS
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Valores Cobrados em Nome de Terceiros
     */
    public Double getVlTerc() {
        return vlTerc;
    }

    /**
     * Seta Valores Cobrados em Nome de Terceiros
     */
    public void setVlTerc(Double vlTerc) {
        this.vlTerc = vlTerc;
    }
    
    /**
     * Obtém Valor de outras despesas
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor de outras despesas
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }
    
    /**
     * Obtém Base de Cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de Cálculo do ICMS
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
     * Obtém Informação Complementar do Documento
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Informação Complementar do Documento
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Valor do PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS/PASEP
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
    
    
}