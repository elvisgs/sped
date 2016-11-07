package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C380 - Consolidação de NF de Venda a Consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C380"),
    @Field(at = 9, name = "fimLinha")
})
public class RegC380 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private Date dtDocIni;
    
    @Field(at = 4)
    private Date dtDocFin;
    
    @Field(at = 5)
    private String numDocIni;
    
    @Field(at = 6)
    private String numDocFin;
    
    @Field(at = 7)
    private Double vlDoc;
    
    @Field(at = 8)
    private Double vlDocCanc;
    
    
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
     * Obtém Valor Total
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor total dos Documentos Cancelados
     */
    public Double getVlDocCanc() {
        return vlDocCanc;
    }

    /**
     * Seta Valor total dos Documentos Cancelados
     */
    public void setVlDocCanc(Double vlDocCanc) {
        this.vlDocCanc = vlDocCanc;
    }
    
    
}