package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * A170 - Itens do Documento
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "A170")
})
public class RegA170 {
    
    @Field(at = 1)
    private String numItem;
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private String descrCompl;
    
    @Field(at = 4)
    private Double vlItem;
    
    @Field(at = 5)
    private Double vlDesc;
    
    @Field(at = 6)
    private String natBcCred;
    
    @Field(at = 7)
    private String indOrigCred;
    
    @Field(at = 8)
    private String cstPis;
    
    @Field(at = 9)
    private Double vlBcPis;
    
    @Field(at = 10)
    private Double aliqPis;
    
    @Field(at = 11)
    private Double vlPis;
    
    @Field(at = 12)
    private String cstCofins;
    
    @Field(at = 13)
    private Double vlBcCofins;
    
    @Field(at = 14)
    private Double aliqCofins;
    
    @Field(at = 15)
    private Double vlCofins;
    
    @Field(at = 16)
    private String codCta;
    
    @Field(at = 17)
    private String codCcus;
    
    
    /**
     * Obtém Número sequencial
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Seta Número sequencial
     */
    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }
    
    /**
     * Obtém Código do Item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do Item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getDescrCompl() {
        return descrCompl;
    }

    /**
     * Seta Descrição complementar
     */
    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }
    
    /**
     * Obtém Valor total do item
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor total do item
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Valor do desconto do item / Exclusão
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor do desconto do item / Exclusão
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
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
     * Obtém Origem do crédito
     */
    public String getIndOrigCred() {
        return indOrigCred;
    }

    /**
     * Seta Origem do crédito
     */
    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    
    /**
     * Obtém CST PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Base de cálculo PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de cálculo PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota PIS/PASEP
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota PIS/PASEP
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    
    /**
     * Obtém Valor do PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
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
     * Obtém Conta analítica contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta analítica contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Centro de custos
     */
    public String getCodCcus() {
        return codCcus;
    }

    /**
     * Seta Centro de custos
     */
    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    
    
}