package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Vencimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C141"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegC141 extends Registro {
    
    @Field(at = 2)
    private String numParc;
    
    @Field(at = 3)
    private Date dtVcto;
    
    @Field(at = 4)
    private Double vlParc;
    
    /**
     * Obtém Número da parcela
     */
    public String getNumParc() {
        return numParc;
    }

    /**
     * Seta Número da parcela
     */
    public void setNumParc(String numParc) {
        this.numParc = numParc;
    }
    
    /**
     * Obtém Data de vencimento
     */
    public Date getDtVcto() {
        return dtVcto;
    }

    /**
     * Seta Data de vencimento
     */
    public void setDtVcto(Date dtVcto) {
        this.dtVcto = dtVcto;
    }
    
    /**
     * Obtém Valor da parcela
     */
    public Double getVlParc() {
        return vlParc;
    }

    /**
     * Seta Valor da parcela
     */
    public void setVlParc(Double vlParc) {
        this.vlParc = vlParc;
    }
    
}