package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C499 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C499"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegC499 extends RegBase {
    
    @Field(at = 2)
    private String numProc;
    
    @Field(at = 3)
    private String indProc;
    
    
    /**
     * Obtém Processo ou Ato Concessório
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Processo ou Ato Concessório
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