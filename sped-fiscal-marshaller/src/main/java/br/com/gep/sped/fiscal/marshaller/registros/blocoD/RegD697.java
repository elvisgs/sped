package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro de Informações de ICMS por UF - TV via Satélite
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D697"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegD697 extends Registro {
    
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
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
}