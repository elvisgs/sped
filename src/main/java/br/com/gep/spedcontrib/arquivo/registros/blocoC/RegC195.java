package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C195 - Detalhamento da Consolidação - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C195")
})
public class RegC195 {
    
    @Field(at = 1)
    private String cnpjCpfPart;
    
    @Field(at = 2)
    private String cstCofins;
    
    @Field(at = 3)
    private String cfop;
    
    @Field(at = 4)
    private Double vlItem;
    
    @Field(at = 5)
    private Double vlDesc;
    
    @Field(at = 6)
    private Double vlBcCofins;
    
    @Field(at = 7)
    private Double aliqCofins;
    
    @Field(at = 8)
    private Double quantBcCofins;
    
    @Field(at = 9)
    private Double aliqCofinsQuant;
    
    @Field(at = 10)
    private Double vlCofins;
    
    @Field(at = 11)
    private String codCta;
    
    
    /**
     * Obtém CNPJ/CPF do Participante
     */
    public String getCnpjCpfPart() {
        return cnpjCpfPart;
    }

    /**
     * Seta CNPJ/CPF do Participante
     */
    public void setCnpjCpfPart(String cnpjCpfPart) {
        this.cnpjCpfPart = cnpjCpfPart;
    }
    
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
     * Obtém CFOP
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta CFOP
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
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
     * Obtém Valor do desconto comercial / Exclusão
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor do desconto comercial / Exclusão
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
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
     * Obtém Valor COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor COFINS
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