package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação do item
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G140"),
    @Field(at = 4, name = "fimLinha")
})
public class RegG140 extends Registro {
    
    @Field(at = 2)
    private String numItem;
    
    @Field(at = 3)
    private String codItem;
    
    /**
     * Obtém Número seqüencial
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Seta Número seqüencial
     */
    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }
    
    /**
     * Obtém Código do item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
}