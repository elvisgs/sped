package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D200 - Prestação de Serviços de Transporte
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D200"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegD200 {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String codSit;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String sub;
    
    @Field(at = 6)
    private String numDocIni;
    
    @Field(at = 7)
    private String numDocFin;
    
    @Field(at = 8)
    private String cfop;
    
    @Field(at = 9)
    private Date dtRef;
    
    @Field(at = 10)
    private Double vlDoc;
    
    @Field(at = 11)
    private Double vlDesc;
    
    
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
     * Obtém Número do Documento Fiscal Inicial
     */
    public String getNumDocIni() {
        return numDocIni;
    }

    /**
     * Seta Número do Documento Fiscal Inicial
     */
    public void setNumDocIni(String numDocIni) {
        this.numDocIni = numDocIni;
    }
    
    /**
     * Obtém Número do Documento Fiscal Final
     */
    public String getNumDocFin() {
        return numDocFin;
    }

    /**
     * Seta Número do Documento Fiscal Final
     */
    public void setNumDocFin(String numDocFin) {
        this.numDocFin = numDocFin;
    }
    
    /**
     * Obtém CFOP
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta CFOP
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }
    
    /**
     * Obtém Data do Dia de Referência do Resumo Diário
     */
    public Date getDtRef() {
        return dtRef;
    }

    /**
     * Seta Data do Dia de Referência do Resumo Diário
     */
    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
    }
    
    /**
     * Obtém Valor Total dos Documentos
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total dos Documentos
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor Total dos Descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor Total dos Descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    
}