package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C395 - Nota Fiscal de Venda a Consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C395")
})
public class RegC395 {
    
    @Field(at = 1)
    private String codMod;
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private String subSer;
    
    @Field(at = 5)
    private String numDoc;
    
    @Field(at = 6)
    private Date dtDoc;
    
    @Field(at = 7)
    private Double vlDoc;
    
    
    /**
     * Obtém Modelo do Documento Fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Modelo do Documento Fiscal
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
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
    public String getSubSer() {
        return subSer;
    }

    /**
     * Seta Subsérie
     */
    public void setSubSer(String subSer) {
        this.subSer = subSer;
    }
    
    /**
     * Obtém Número do Documento
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do Documento
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
     * Obtém Valor total
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    
}