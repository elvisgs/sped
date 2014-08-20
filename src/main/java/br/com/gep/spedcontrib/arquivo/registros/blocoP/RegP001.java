package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro de Abertura do Bloco P
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "P001"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegP001 extends RegBase {
    
    @Field(at = 2)
    private String indMov;
    
    
    /**
     * Obtém Indicador de movimento:0- Bloco com dados informados;1- Bloco sem dados informados
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Indicador de movimento:0- Bloco com dados informados;1- Bloco sem dados informados
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    
}