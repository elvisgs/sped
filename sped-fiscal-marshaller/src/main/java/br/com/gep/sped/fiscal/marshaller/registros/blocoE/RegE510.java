package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Valores Consolidados
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E510"),
    @Field(at = 7, name = "fimLinha")
})
public class RegE510 extends Registro {
    
    @Field(at = 2)
    private String cfop;
    
    @Field(at = 3)
    private String cstIpi;
    
    @Field(at = 4)
    private Double vlContIpi;
    
    @Field(at = 5)
    private Double vlBcIpi;
    
    @Field(at = 6)
    private Double vlIpi;
    
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
     * Obtém CST/IPI
     */
    public String getCstIpi() {
        return cstIpi;
    }

    /**
     * Seta CST/IPI
     */
    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }
    
    /**
     * Obtém Valor Contábil
     */
    public Double getVlContIpi() {
        return vlContIpi;
    }

    /**
     * Seta Valor Contábil
     */
    public void setVlContIpi(Double vlContIpi) {
        this.vlContIpi = vlContIpi;
    }
    
    /**
     * Obtém Base de cálculo do IPI
     */
    public Double getVlBcIpi() {
        return vlBcIpi;
    }

    /**
     * Seta Base de cálculo do IPI
     */
    public void setVlBcIpi(Double vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }
    
    /**
     * Obtém Valor do IPI
     */
    public Double getVlIpi() {
        return vlIpi;
    }

    /**
     * Seta Valor do IPI
     */
    public void setVlIpi(Double vlIpi) {
        this.vlIpi = vlIpi;
    }
    
}