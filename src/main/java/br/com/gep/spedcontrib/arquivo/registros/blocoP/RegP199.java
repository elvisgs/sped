package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * P199 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "P199")
})
public class RegP199 {
    
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