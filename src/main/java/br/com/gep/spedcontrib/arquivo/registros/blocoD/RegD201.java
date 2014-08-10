package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D201 - Totalização do Resumo Diário - PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "D201")
})
public class RegD201 {
    
    @Field(at = 1)
    private String cstPis;
    
    @Field(at = 2)
    private Double vlItem;
    
    @Field(at = 3)
    private Double vlBcPis;
    
    @Field(at = 4)
    private Double aliqPis;
    
    @Field(at = 5)
    private Double vlPis;
    
    @Field(at = 6)
    private String codCta;
    
    
    /**
     * Obtém CST do PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST do PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
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
     * Obtém Base de Cálculo do PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de Cálculo do PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP
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