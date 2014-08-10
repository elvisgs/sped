package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D605 - Complemento da Operação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "D605")
})
public class RegD605 {
    
    @Field(at = 1)
    private String codClass;
    
    @Field(at = 2)
    private Double vlItem;
    
    @Field(at = 3)
    private Double vlDesc;
    
    @Field(at = 4)
    private String cstCofins;
    
    @Field(at = 5)
    private Double vlBcCofins;
    
    @Field(at = 6)
    private Double aliqCofins;
    
    @Field(at = 7)
    private Double vlCofins;
    
    @Field(at = 8)
    private String codCta;
    
    
    /**
     * Obtém Classificação do Item do Serviço
     */
    public String getCodClass() {
        return codClass;
    }

    /**
     * Seta Classificação do Item do Serviço
     */
    public void setCodClass(String codClass) {
        this.codClass = codClass;
    }
    
    /**
     * Obtém Valor Acumulado do Item
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor Acumulado do Item
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Valor Acumulado dos Descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor Acumulado dos Descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
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