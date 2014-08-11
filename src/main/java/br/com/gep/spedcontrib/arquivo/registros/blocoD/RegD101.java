package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D101 - Complemento do Documento PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D101"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class RegD101 {
    
    @Field(at = 2)
    private String indNatFrt;
    
    @Field(at = 3)
    private Double vlItem;
    
    @Field(at = 4)
    private String cstPis;
    
    @Field(at = 5)
    private String natBcCred;
    
    @Field(at = 6)
    private Double vlBcPis;
    
    @Field(at = 7)
    private Double aliqPis;
    
    @Field(at = 8)
    private Double vlPis;
    
    @Field(at = 9)
    private String codCta;
    
    
    /**
     * Obtém Natureza do Frete
     */
    public String getIndNatFrt() {
        return indNatFrt;
    }

    /**
     * Seta Natureza do Frete
     */
    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
    }
    
    /**
     * Obtém Valor Total dos Itens
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor Total dos Itens
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
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
     * Obtém Código da conta analítica contábil debitada/creditada
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica contábil debitada/creditada
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}