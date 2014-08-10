package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C385 - Detalhamento da Consolidação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C385")
})
public class RegC385 {
    
    @Field(at = 1)
    private String cstCofins;
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private Double vlItem;
    
    @Field(at = 4)
    private Double vlBcCofins;
    
    @Field(at = 5)
    private Double aliqCofins;
    
    @Field(at = 6)
    private Double quantBcCofins;
    
    @Field(at = 7)
    private Double aliqCofinsQuant;
    
    @Field(at = 8)
    private Double vlCofins;
    
    @Field(at = 9)
    private String codCta;
    
    
    /**
     * Obtém CST COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
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
     * Obtém Valor Total do Item
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor Total do Item
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Base de cálculo COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de cálculo COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota COFINS
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota COFINS
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Base de cálculo em quantidade COFINS
     */
    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    /**
     * Seta Base de cálculo em quantidade COFINS
     */
    public void setQuantBcCofins(Double quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    
    /**
     * Obtém Alíquota COFINS (R$)
     */
    public Double getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    /**
     * Seta Alíquota COFINS (R$)
     */
    public void setAliqCofinsQuant(Double aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    
    /**
     * Obtém Valor do COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor do COFINS
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