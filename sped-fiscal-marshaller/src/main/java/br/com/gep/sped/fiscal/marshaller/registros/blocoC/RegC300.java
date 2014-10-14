package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Resumo Diário das NF de Venda a Consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C300"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegC300 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private String sub;
    
    @Field(at = 5)
    private String numDocIni;
    
    @Field(at = 6)
    private String numDocFin;
    
    @Field(at = 7)
    private Date dtDoc;
    
    @Field(at = 8)
    private Double vlDoc;
    
    @Field(at = 9)
    private Double vlPis;
    
    @Field(at = 10)
    private Double vlCofins;
    
    @Field(at = 11)
    private String codCta;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>02=Nota Fiscal de Venda a Consumidor;</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série do documento fiscal
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série do documento fiscal
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie do documento fiscal
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie do documento fiscal
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Documento fiscal inicial
     */
    public String getNumDocIni() {
        return numDocIni;
    }

    /**
     * Seta Documento fiscal inicial
     */
    public void setNumDocIni(String numDocIni) {
        this.numDocIni = numDocIni;
    }
    
    /**
     * Obtém Documento fiscal final
     */
    public String getNumDocFin() {
        return numDocFin;
    }

    /**
     * Seta Documento fiscal final
     */
    public void setNumDocFin(String numDocFin) {
        this.numDocFin = numDocFin;
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
     * Obtém Valor total dos documentos
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total dos documentos
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor total do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor total do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor total da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor total da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém Código da conta analítica
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}