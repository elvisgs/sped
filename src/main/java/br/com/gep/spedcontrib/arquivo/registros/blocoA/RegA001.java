package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Abertura do Bloco A
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "A001")
})
public class RegA001 {
    
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