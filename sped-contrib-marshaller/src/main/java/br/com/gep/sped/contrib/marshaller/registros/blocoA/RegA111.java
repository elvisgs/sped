package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * A111 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A111"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegA111 extends Registro {
    
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