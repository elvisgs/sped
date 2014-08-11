package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M350 - PIS/PASEP - Folha de Salários
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M350"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegM350 {
    
    @Field(at = 2)
    private Double vlTotFol;
    
    @Field(at = 3)
    private Double vlExcBc;
    
    @Field(at = 4)
    private Double vlTotBc;
    
    @Field(at = 5)
    private Double aliqPisFol;
    
    @Field(at = 6)
    private Double vlTotContFol;
    
    
    /**
     * Obtém Valor Total da Folha de Salários
     */
    public Double getVlTotFol() {
        return vlTotFol;
    }

    /**
     * Seta Valor Total da Folha de Salários
     */
    public void setVlTotFol(Double vlTotFol) {
        this.vlTotFol = vlTotFol;
    }
    
    /**
     * Obtém Valor Total das Exclusões à Base de Cálculo
     */
    public Double getVlExcBc() {
        return vlExcBc;
    }

    /**
     * Seta Valor Total das Exclusões à Base de Cálculo
     */
    public void setVlExcBc(Double vlExcBc) {
        this.vlExcBc = vlExcBc;
    }
    
    /**
     * Obtém Valor Total da Base de Cálculo
     */
    public Double getVlTotBc() {
        return vlTotBc;
    }

    /**
     * Seta Valor Total da Base de Cálculo
     */
    public void setVlTotBc(Double vlTotBc) {
        this.vlTotBc = vlTotBc;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP - Folha de Salários
     */
    public Double getAliqPisFol() {
        return aliqPisFol;
    }

    /**
     * Seta Alíquota do PIS/PASEP - Folha de Salários
     */
    public void setAliqPisFol(Double aliqPisFol) {
        this.aliqPisFol = aliqPisFol;
    }
    
    /**
     * Obtém Valor Total da Contribuição Social sobre a Folha de Salários
     */
    public Double getVlTotContFol() {
        return vlTotContFol;
    }

    /**
     * Seta Valor Total da Contribuição Social sobre a Folha de Salários
     */
    public void setVlTotContFol(Double vlTotContFol) {
        this.vlTotContFol = vlTotContFol;
    }
    
    
}