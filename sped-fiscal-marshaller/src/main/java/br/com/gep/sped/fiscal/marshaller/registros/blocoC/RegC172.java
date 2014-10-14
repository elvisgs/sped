package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ISSQN
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C172"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegC172 extends Registro {
    
    @Field(at = 2)
    private Double vlBcIssqn;
    
    @Field(at = 3)
    private Double aliqIssqn;
    
    @Field(at = 4)
    private Double vlIssqn;
    
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
    
}