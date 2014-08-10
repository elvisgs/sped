package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0001 - Abertura do Bloco 0
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0001")
})
public class Reg0001 {
    
    @Field(at = 1)
    private String indMov;
    
    
    /**
     * Obtém Indicador de movimento
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    
}