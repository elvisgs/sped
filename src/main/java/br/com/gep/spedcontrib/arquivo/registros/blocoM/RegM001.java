package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro de Abertura do Bloco M
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "M001")
})
public class RegM001 {
    
    @Field(at = 1)
    private String indMov;
    
    
    /**
     * Obtém Indicador de movimento:0- Bloco com dados informados;1- Bloco sem dados informados
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento:0- Bloco com dados informados;1- Bloco sem dados informados
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    
}