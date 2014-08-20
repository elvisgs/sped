package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0001 - Abertura do Bloco 0
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0001"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg0001 extends Registro {
    
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