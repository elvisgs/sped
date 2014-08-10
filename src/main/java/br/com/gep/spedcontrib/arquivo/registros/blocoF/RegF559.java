package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F559 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "F559")
})
public class RegF559 {
    
    @Field(at = 1)
    private String numProc;
    
    @Field(at = 2)
    private String indProc;
    
    
    /**
     * Obtém Processo ou Ato concessório
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Processo ou Ato concessório
     */
    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    
    /**
     * Obtém Origem do processo
     */
    public String getIndProc() {
        return indProc;
    }

    /**
     * Seta Origem do processo
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    
}