package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Documentos Cancelados
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D411"),
    @Field(at = 3, name = "fimLinha")
})
public class RegD411 extends Registro {
    
    @Field(at = 2)
    private String numDocCanc;
    
    /**
     * Obtém Número do doc cancelado
     */
    public String getNumDocCanc() {
        return numDocCanc;
    }

    /**
     * Seta Número do doc cancelado
     */
    public void setNumDocCanc(String numDocCanc) {
        this.numDocCanc = numDocCanc;
    }
    
}