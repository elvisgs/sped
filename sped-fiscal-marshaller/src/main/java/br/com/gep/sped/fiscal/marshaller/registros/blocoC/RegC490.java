package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

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
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C490"),
    @Field(at = 9, name = "fimLinha")
})
public class RegC490 extends Registro {
    
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
     * Obtém Carga tributária ICMS(%)
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Carga tributária ICMS(%)
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
     * Obtém Valor acumulado do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor acumulado do ICMS
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