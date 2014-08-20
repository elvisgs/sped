package br.com.gep.sped.contrib.marshaller.registros.bloco9;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Abertura do Bloco 9
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "9001"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg9001 extends Registro {
    
    @Field(at = 2)
    private String indMov;
    
    
    /**
     * Obtém Indicador de movimento: 0- Bloco com dados informados; 1- Bloco sem dados informados.
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento: 0- Bloco com dados informados; 1- Bloco sem dados informados.
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    
}