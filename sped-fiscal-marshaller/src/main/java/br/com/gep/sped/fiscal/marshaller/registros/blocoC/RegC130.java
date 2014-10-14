package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ISS, IR e Previdência
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C130"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegC130 extends Registro {
    
    @Field(at = 2)
    private Double vlServNt;
    
    @Field(at = 3)
    private Double vlBcIssqn;
    
    @Field(at = 4)
    private Double vlIssqn;
    
    @Field(at = 5)
    private Double vlBcIrrf;
    
    @Field(at = 6)
    private Double vlIrrf;
    
    @Field(at = 7)
    private Double vlBcPrev;
    
    @Field(at = 8)
    private Double vlPrev;
    
    /**
     * Obtém Valor dos serviços NT
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor dos serviços NT
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Base cálculo do ISSQN
     */
    public Double getVlBcIssqn() {
        return vlBcIssqn;
    }

    /**
     * Seta Base cálculo do ISSQN
     */
    public void setVlBcIssqn(Double vlBcIssqn) {
        this.vlBcIssqn = vlBcIssqn;
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
     * Obtém Base cálculo do IRRF
     */
    public Double getVlBcIrrf() {
        return vlBcIrrf;
    }

    /**
     * Seta Base cálculo do IRRF
     */
    public void setVlBcIrrf(Double vlBcIrrf) {
        this.vlBcIrrf = vlBcIrrf;
    }
    
    /**
     * Obtém Valor do IRRF
     */
    public Double getVlIrrf() {
        return vlIrrf;
    }

    /**
     * Seta Valor do IRRF
     */
    public void setVlIrrf(Double vlIrrf) {
        this.vlIrrf = vlIrrf;
    }
    
    /**
     * Obtém Base cálculo Previdência Social
     */
    public Double getVlBcPrev() {
        return vlBcPrev;
    }

    /**
     * Seta Base cálculo Previdência Social
     */
    public void setVlBcPrev(Double vlBcPrev) {
        this.vlBcPrev = vlBcPrev;
    }
    
    /**
     * Obtém Valor retido Previdência Social
     */
    public Double getVlPrev() {
        return vlPrev;
    }

    /**
     * Seta Valor retido Previdência Social
     */
    public void setVlPrev(Double vlPrev) {
        this.vlPrev = vlPrev;
    }
    
}