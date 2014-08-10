package br.com.gep.spedcontrib.arquivo.registros.blocoI;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * I299 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "I299")
})
public class RegI299 {
    
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
     * Obtém Indicador da origem do processo
     */
    public String getIndProc() {
        return indProc;
    }

    /**
     * Seta Indicador da origem do processo
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    
}