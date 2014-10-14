package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C405 - Redução Z
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C405"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegC405 extends Registro {
    
    @Field(at = 2)
    private Date dtDoc;
    
    @Field(at = 3)
    private String cro;
    
    @Field(at = 4)
    private String crz;
    
    @Field(at = 5)
    private String numCooFin;
    
    @Field(at = 6)
    private Double gtFin;
    
    @Field(at = 7)
    private Double vlBrt;
    
    
    /**
     * Obtém Data da Redução Z
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da Redução Z
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Posição do CRO
     */
    public String getCro() {
        return cro;
    }

    /**
     * Seta Posição do CRO
     */
    public void setCro(String cro) {
        this.cro = cro;
    }
    
    /**
     * Obtém Posição do CRZ
     */
    public String getCrz() {
        return crz;
    }

    /**
     * Seta Posição do CRZ
     */
    public void setCrz(String crz) {
        this.crz = crz;
    }
    
    /**
     * Obtém COO da Redução Z
     */
    public String getNumCooFin() {
        return numCooFin;
    }

    /**
     * Seta COO da Redução Z
     */
    public void setNumCooFin(String numCooFin) {
        this.numCooFin = numCooFin;
    }
    
    /**
     * Obtém Valor do Grande Total Final
     */
    public Double getGtFin() {
        return gtFin;
    }

    /**
     * Seta Valor do Grande Total Final
     */
    public void setGtFin(Double gtFin) {
        this.gtFin = gtFin;
    }
    
    /**
     * Obtém Valor da Venda Bruta
     */
    public Double getVlBrt() {
        return vlBrt;
    }

    /**
     * Seta Valor da Venda Bruta
     */
    public void setVlBrt(Double vlBrt) {
        this.vlBrt = vlBrt;
    }
    
    
}