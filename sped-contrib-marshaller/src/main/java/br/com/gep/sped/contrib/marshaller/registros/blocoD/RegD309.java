package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * D309 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D309"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegD309 extends Registro {
    
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