package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D110"),
    @Field(at = 6, name = "fimLinha")
})
public class RegD110 extends Registro {
    
    @Field(at = 2)
    private String numItem;
    
    @Field(at = 3)
    private String codItem;
    
    @Field(at = 4)
    private Double vlServ;
    
    @Field(at = 5)
    private Double vlOut;
    
    /**
     * Obtém Número seqüencial do item
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Seta Número seqüencial do item
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
    
    /**
     * Obtém Valor do serviço
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor do serviço
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Outros valores
     */
    public Double getVlOut() {
        return vlOut;
    }

    /**
     * Seta Outros valores
     */
    public void setVlOut(Double vlOut) {
        this.vlOut = vlOut;
    }
    
}