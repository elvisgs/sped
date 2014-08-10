package br.com.gep.spedcontrib.arquivo.registros.bloco1;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro de Abertura do Bloco 1
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "1001")
})
public class Reg1001 {
    
    @Field(at = 1)
    private String indMov;
    
    
    /**
     * Obtém Indicador de movimento:0 - Bloco com dados informados;1 - Bloco sem dados informados
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento:0 - Bloco com dados informados;1 - Bloco sem dados informados
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    
}