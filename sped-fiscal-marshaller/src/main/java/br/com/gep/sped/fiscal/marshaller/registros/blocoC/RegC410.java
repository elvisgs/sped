package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * PIS/COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C410"),
    @Field(at = 4, name = "fimLinha")
})
public class RegC410 extends Registro {
    
    @Field(at = 2)
    private Double vlPis;
    
    @Field(at = 3)
    private Double vlCofins;
    
    /**
     * Obtém Valor total do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor total do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor total da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor total da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
}