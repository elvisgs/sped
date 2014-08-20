package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F139 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F139"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegF139 extends RegBase {
    
    @Field(at = 2)
    private String numProc;
    
    @Field(at = 3)
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
     * Obtém Indicador da origem do processo.
     */
    public String getIndProc() {
        return indProc;
    }

    /**
     * Seta Indicador da origem do processo.
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    
}