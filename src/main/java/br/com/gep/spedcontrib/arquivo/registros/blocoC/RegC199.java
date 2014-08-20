package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C199 - Operações de Importação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C199"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegC199 extends RegBase {
    
    @Field(at = 2)
    private String codDocImp;
    
    @Field(at = 3)
    private String numDocImp;
    
    @Field(at = 4)
    private Double vlPisImp;
    
    @Field(at = 5)
    private Double vlCofinsImp;
    
    @Field(at = 6)
    private String numAcdraw;
    
    
    /**
     * Obtém Documento de Importação
     */
    public String getCodDocImp() {
        return codDocImp;
    }

    /**
     * Seta Documento de Importação
     */
    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }
    
    /**
     * Obtém Número do Documento
     */
    public String getNumDocImp() {
        return numDocImp;
    }

    /**
     * Seta Número do Documento
     */
    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }
    
    /**
     * Obtém Valor do PIS/PASEP
     */
    public Double getVlPisImp() {
        return vlPisImp;
    }

    /**
     * Seta Valor do PIS/PASEP
     */
    public void setVlPisImp(Double vlPisImp) {
        this.vlPisImp = vlPisImp;
    }
    
    /**
     * Obtém Valor da COFINS
     */
    public Double getVlCofinsImp() {
        return vlCofinsImp;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofinsImp(Double vlCofinsImp) {
        this.vlCofinsImp = vlCofinsImp;
    }
    
    /**
     * Obtém Número do Ato Concessório do Regime Drawback
     */
    public String getNumAcdraw() {
        return numAcdraw;
    }

    /**
     * Seta Número do Ato Concessório do Regime Drawback
     */
    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }
    
    
}