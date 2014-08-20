package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C181 - Detalhamento da Consolidação -PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C181"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegC181 extends RegBase {
    
    @Field(at = 2)
    private String cstPis;
    
    @Field(at = 3)
    private String cfop;
    
    @Field(at = 4)
    private Double vlItem;
    
    @Field(at = 5)
    private Double vlDesc;
    
    @Field(at = 6)
    private Double vlBcPis;
    
    @Field(at = 7)
    private Double aliqPis;
    
    @Field(at = 8)
    private Double quantBcPis;
    
    @Field(at = 9)
    private Double aliqPisQuant;
    
    @Field(at = 10)
    private Double vlPis;
    
    @Field(at = 11)
    private String codCta;
    
    
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
     * Obtém Base de cálculo em quantidade PIS/PASEP
     */
    public Double getQuantBcPis() {
        return quantBcPis;
    }

    /**
     * Seta Base de cálculo em quantidade PIS/PASEP
     */
    public void setQuantBcPis(Double quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    
    /**
     * Obtém Alíquota PIS/PASEP (R$)
     */
    public Double getAliqPisQuant() {
        return aliqPisQuant;
    }

    /**
     * Seta Alíquota PIS/PASEP (R$)
     */
    public void setAliqPisQuant(Double aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    
    /**
     * Obtém Valor PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
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