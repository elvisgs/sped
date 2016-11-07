package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ST por UF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C791"),
    @Field(at = 5, name = "fimLinha")
})
public class RegC791 extends Registro {
    
    @Field(at = 2)
    private String uf;
    
    @Field(at = 3)
    private Double vlBcIcmsSt;
    
    @Field(at = 4)
    private Double vlIcmsSt;
    
    /**
     * Obtém UF
     */
    public String getUf() {
        return uf;
    }

    /**
     * Seta UF
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /**
     * Obtém Base de cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
}