package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C180 - Consolidação de NF-e Emitidas - Operações de Venda
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C180"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegC180 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private Date dtDocIni;
    
    @Field(at = 4)
    private Date dtDocFin;
    
    @Field(at = 5)
    private String codItem;
    
    @Field(at = 6)
    private String codNcm;
    
    @Field(at = 7)
    private String exIpi;
    
    @Field(at = 8)
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
     * Obtém Data de Emissão Inicial dos Documentos
     */
    public Date getDtDocIni() {
        return dtDocIni;
    }

    /**
     * Seta Data de Emissão Inicial dos Documentos
     */
    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    
    /**
     * Obtém Data de Emissão Final dos Documentos
     */
    public Date getDtDocFin() {
        return dtDocFin;
    }

    /**
     * Seta Data de Emissão Final dos Documentos
     */
    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
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