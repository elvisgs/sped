package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C509 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C509")
})
public class RegC509 {
    
    @Field(at = 1)
    private String numProc;
    
    @Field(at = 2)
    private String indProc;
    
    
    /**
     * Obtém Identificação do processo ou ato concessório
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Identificação do processo ou ato concessório
     */
    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    
    /**
     * Obtém Origem do Processo
     */
    public String getIndProc() {
        return indProc;
    }

    /**
     * Seta Origem do Processo
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    
}