package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Abertura do Bloco A
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A001"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegA001 extends RegBase {
    
    @Field(at = 2)
    private String indMov;
    
    
    /**
     * Obtém Indicador de movimento
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    
}