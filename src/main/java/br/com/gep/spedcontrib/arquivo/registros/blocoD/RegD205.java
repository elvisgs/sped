package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * D205 - Totalização do Resumo Diário - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D205"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegD205 extends RegBase {
    
    @Field(at = 2)
    private String cstCofins;
    
    @Field(at = 3)
    private Double vlItem;
    
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
     * Obtém Base de Cálculo da COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de Cálculo da COFINS
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