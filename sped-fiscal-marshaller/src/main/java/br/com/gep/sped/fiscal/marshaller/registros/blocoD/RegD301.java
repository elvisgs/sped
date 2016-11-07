package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Documentos Cancelado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D301"),
    @Field(at = 3, name = "fimLinha")
})
public class RegD301 extends Registro {
    
    @Field(at = 2)
    private Integer numDocCanc;
    
    /**
     * Obtém Número do doc cancelado
     */
    public Integer getNumDocCanc() {
        return numDocCanc;
    }

    /**
     * Seta Número do doc cancelado
     */
    public void setNumDocCanc(Integer numDocCanc) {
        this.numDocCanc = numDocCanc;
    }
    
}