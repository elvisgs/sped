package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Ressarcimento em ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C176"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class RegC176 extends Registro {
    
    @Field(at = 2)
    private String codModUltE;
    
    @Field(at = 3)
    private String numDocUltE;
    
    @Field(at = 4)
    private String serUltE;
    
    @Field(at = 5)
    private Date dtUltE;
    
    @Field(at = 6)
    private String codPartUltE;
    
    @Field(at = 7)
    private Double quantUltE;
    
    @Field(at = 8)
    private Double vlUnitUltE;
    
    @Field(at = 9)
    private Double vlUnitBcSt;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodModUltE() {
        return codModUltE;
    }

    /**
     * Seta Código do modelo do documento
     * <p>01=Nota Fiscal;55=Nota Fiscal Eletrônica</p>
     */
    public void setCodModUltE(String codModUltE) {
        this.codModUltE = codModUltE;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDocUltE() {
        return numDocUltE;
    }

    /**
     * Seta Número do documento
     */
    public void setNumDocUltE(String numDocUltE) {
        this.numDocUltE = numDocUltE;
    }
    
    /**
     * Obtém Série
     */
    public String getSerUltE() {
        return serUltE;
    }

    /**
     * Seta Série
     */
    public void setSerUltE(String serUltE) {
        this.serUltE = serUltE;
    }
    
    /**
     * Obtém Data da última entrada
     */
    public Date getDtUltE() {
        return dtUltE;
    }

    /**
     * Seta Data da última entrada
     */
    public void setDtUltE(Date dtUltE) {
        this.dtUltE = dtUltE;
    }
    
    /**
     * Obtém Código do participante
     */
    public String getCodPartUltE() {
        return codPartUltE;
    }

    /**
     * Seta Código do participante
     */
    public void setCodPartUltE(String codPartUltE) {
        this.codPartUltE = codPartUltE;
    }
    
    /**
     * Obtém Quantidade do item
     */
    public Double getQuantUltE() {
        return quantUltE;
    }

    /**
     * Seta Quantidade do item
     */
    public void setQuantUltE(Double quantUltE) {
        this.quantUltE = quantUltE;
    }
    
    /**
     * Obtém Valor unitário da mercadoria
     */
    public Double getVlUnitUltE() {
        return vlUnitUltE;
    }

    /**
     * Seta Valor unitário da mercadoria
     */
    public void setVlUnitUltE(Double vlUnitUltE) {
        this.vlUnitUltE = vlUnitUltE;
    }
    
    /**
     * Obtém Vr. unitário b. cálculo ICMS ST
     */
    public Double getVlUnitBcSt() {
        return vlUnitBcSt;
    }

    /**
     * Seta Vr. unitário b. cálculo ICMS ST
     */
    public void setVlUnitBcSt(Double vlUnitBcSt) {
        this.vlUnitBcSt = vlUnitBcSt;
    }
    
}