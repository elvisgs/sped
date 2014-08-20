package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F509 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F509"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegF509 extends RegBase {
    
    @Field(at = 2)
    private String numProc;
    
    @Field(at = 3)
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