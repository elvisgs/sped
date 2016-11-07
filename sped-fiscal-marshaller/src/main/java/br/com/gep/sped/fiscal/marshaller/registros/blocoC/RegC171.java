package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Combustível
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C171"),
    @Field(at = 4, name = "fimLinha")
})
public class RegC171 extends Registro {
    
    @Field(at = 2)
    private String numTanque;
    
    @Field(at = 3)
    private Double qtde;
    
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
    
    /**
     * Obtém Quantidade armazenada
     */
    public Double getQtde() {
        return qtde;
    }

    /**
     * Seta Quantidade armazenada
     */
    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }
    
}