package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro Analítico
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D390"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegD390 extends Registro {
    
    @Field(at = 2)
    private String cstIcms;
    
    @Field(at = 3)
    private String cfop;
    
    @Field(at = 4)
    private Double aliqIcms;
    
    @Field(at = 5)
    private Double vlOpr;
    
    @Field(at = 6)
    private Double vlBcIssqn;
    
    @Field(at = 7)
    private Double aliqIssqn;
    
    @Field(at = 8)
    private Double vlIssqn;
    
    @Field(at = 9)
    private Double vlBcIcms;
    
    @Field(at = 10)
    private Double vlIcms;
    
    @Field(at = 11)
    private String codObs;
    
    /**
     * Obtém CST/ICMS
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta CST/ICMS
     */
    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
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
     * Obtém Alíquota do ICMS(%)
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Alíquota do ICMS(%)
     */
    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }
    
    /**
     * Obtém Valor da operação
     */
    public Double getVlOpr() {
        return vlOpr;
    }

    /**
     * Seta Valor da operação
     */
    public void setVlOpr(Double vlOpr) {
        this.vlOpr = vlOpr;
    }
    
    /**
     * Obtém Base de cálculo do ISSQN
     */
    public Double getVlBcIssqn() {
        return vlBcIssqn;
    }

    /**
     * Seta Base de cálculo do ISSQN
     */
    public void setVlBcIssqn(Double vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
    }
    
    /**
     * Obtém Alíquota do ISSQN(%)
     */
    public Double getAliqIssqn() {
        return aliqIssqn;
    }

    /**
     * Seta Alíquota do ISSQN(%)
     */
    public void setAliqIssqn(Double aliqIssqn) {
        this.aliqIssqn = aliqIssqn;
    }
    
    /**
     * Obtém Valor do ISSQN
     */
    public Double getVlIssqn() {
        return vlIssqn;
    }

    /**
     * Seta Valor do ISSQN
     */
    public void setVlIssqn(Double vlIssqn) {
        this.vlIssqn = vlIssqn;
    }
    
    /**
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Código observação lançamento
     */
    public String getCodObs() {
        return codObs;
    }

    /**
     * Seta Código observação lançamento
     */
    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
    
}