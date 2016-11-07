package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro Analitico do CF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C850"),
    @Field(at = 9, name = "fimLinha")
})
public class RegC850 extends Registro {
    
    @Field(at = 2)
    private String cstIcms;
    
    @Field(at = 3)
    private String cfop;
    
    @Field(at = 4)
    private Double aliqIcms;
    
    @Field(at = 5)
    private Double vlOpr;
    
    @Field(at = 6)
    private Double vlBcIcms;
    
    @Field(at = 7)
    private Double vlIcms;
    
    @Field(at = 8)
    private String codObs;
    
    /**
     * Obtém Código da Situação Tributária
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta Código da Situação Tributária
     */
    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }
    
    /**
     * Obtém Código Fiscal de Operação e Prestação
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta Código Fiscal de Operação e Prestação
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }
    
    /**
     * Obtém Alíquota do ICMS
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Alíquota do ICMS
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
     * Obtém Base de Cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de Cálculo do ICMS
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
     * Obtém Código da observação do lançamento fiscal (Campo 02 do regisro 0460)
     */
    public String getCodObs() {
        return codObs;
    }

    /**
     * Seta Código da observação do lançamento fiscal (Campo 02 do regisro 0460)
     */
    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
    
}