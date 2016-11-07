package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Resumo diário de CF-e por equipamento SAT-CF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C890"),
    @Field(at = 9, name = "fimLinha")
})
public class RegC890 extends Registro {
    
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
    
    @Field(at = 6)
    private Double vlIcms;
    
    @Field(at = 6)
    private String codObs;
    
    /**
     * Obtém Código da situação Tributária
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta Código da situação Tributária
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
     * Obtém Valor da Operação
     */
    public Double getVlOpr() {
        return vlOpr;
    }

    /**
     * Seta Valor da Operação
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
     * Obtém Código da observação do Lançamento Fiscal
     */
    public String getCodObs() {
        return codObs;
    }

    /**
     * Seta Código da observação do Lançamento Fiscal
     */
    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
    
}