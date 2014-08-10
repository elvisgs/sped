package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C500 - NF de Energia Elétrica, Água e Gás
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C500")
})
public class RegC500 {
    
    @Field(at = 1)
    private String codPart;
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String codSit;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String sub;
    
    @Field(at = 6)
    private String numDoc;
    
    @Field(at = 7)
    private Date dtDoc;
    
    @Field(at = 8)
    private Date dtES;
    
    @Field(at = 9)
    private Double vlDoc;
    
    @Field(at = 10)
    private Double vlIcms;
    
    @Field(at = 11)
    private String codInf;
    
    @Field(at = 12)
    private Double vlPis;
    
    @Field(at = 13)
    private Double vlCofins;
    
    
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
     * Obtém Data da Emissão
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da Emissão
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Data da Entrada
     */
    public Date getDtES() {
        return dtES;
    }

    /**
     * Seta Data da Entrada
     */
    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }
    
    /**
     * Obtém Valor Total do Documento Fiscal
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total do Documento Fiscal
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor Acumulado do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor Acumulado do ICMS
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