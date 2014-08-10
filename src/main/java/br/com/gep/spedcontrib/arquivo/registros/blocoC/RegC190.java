package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C190 - Consolidação das NF-E - Operações de Aquisição com Direito a Crédito, e Operações de Devolução de Compras e Devolução de Vendas
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C190")
})
public class RegC190 {
    
    @Field(at = 1)
    private String codMod;
    
    @Field(at = 2)
    private Date dtRefIni;
    
    @Field(at = 3)
    private Date dtRefFin;
    
    @Field(at = 4)
    private String codItem;
    
    @Field(at = 5)
    private String codNcm;
    
    @Field(at = 6)
    private String exIpi;
    
    @Field(at = 7)
    private Double vlTotItem;
    
    
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
     * Obtém Data Inicial de Referencia
     */
    public Date getDtRefIni() {
        return dtRefIni;
    }

    /**
     * Seta Data Inicial de Referencia
     */
    public void setDtRefIni(Date dtRefIni) {
        this.dtRefIni = dtRefIni;
    }
    
    /**
     * Obtém Data Final de Referencia
     */
    public Date getDtRefFin() {
        return dtRefFin;
    }

    /**
     * Seta Data Final de Referencia
     */
    public void setDtRefFin(Date dtRefFin) {
        this.dtRefFin = dtRefFin;
    }
    
    /**
     * Obtém Item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Código NCM
     */
    public String getCodNcm() {
        return codNcm;
    }

    /**
     * Seta Código NCM
     */
    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }
    
    /**
     * Obtém Código EX
     */
    public String getExIpi() {
        return exIpi;
    }

    /**
     * Seta Código EX
     */
    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }
    
    /**
     * Obtém Valor Total do Item
     */
    public Double getVlTotItem() {
        return vlTotItem;
    }

    /**
     * Seta Valor Total do Item
     */
    public void setVlTotItem(Double vlTotItem) {
        this.vlTotItem = vlTotItem;
    }
    
    
}