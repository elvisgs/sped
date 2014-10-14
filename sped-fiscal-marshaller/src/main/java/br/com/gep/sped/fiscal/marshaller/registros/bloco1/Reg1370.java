package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Bicos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1370"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class Reg1370 extends Registro {
    
    @Field(at = 2)
    private String numBico;
    
    @Field(at = 3)
    private String codItem;
    
    @Field(at = 4)
    private String numTanque;
    
    /**
     * Obtém Bico ligado à bomba
     */
    public String getNumBico() {
        return numBico;
    }

    /**
     * Seta Bico ligado à bomba
     */
    public void setNumBico(String numBico) {
        this.numBico = numBico;
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
    
    /**
     * Obtém Número do tanque
     */
    public String getNumTanque() {
        return numTanque;
    }

    /**
     * Seta Número do tanque
     */
    public void setNumTanque(String numTanque) {
        this.numTanque = numTanque;
    }
    
}