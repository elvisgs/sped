package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C505 - Complemento da operação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C505")
})
public class RegC505 {
    
    @Field(at = 1)
    private String cstCofins;
    
    @Field(at = 2)
    private Double vlItem;
    
    @Field(at = 3)
    private String natBcCred;
    
    @Field(at = 4)
    private Double vlBcCofins;
    
    @Field(at = 5)
    private Double aliqCofins;
    
    @Field(at = 6)
    private Double vlCofins;
    
    @Field(at = 7)
    private String codCta;
    
    
    /**
     * Obtém CST da COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST da COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Valor total dos itens
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor total dos itens
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Natureza da Base de Cálculo do Crédito
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Natureza da Base de Cálculo do Crédito
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Base de cálculo da COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de cálculo da COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Valor da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém Conta Analítica Contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta Analítica Contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}