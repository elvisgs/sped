package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

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
    @Field(at = 1, name = "reg", rid = true, literal = "C310"),
    @Field(at = 3, name = "fimLinha")
})
public class RegC310 extends Registro {
    
    @Field(at = 2)
    private String numDocCanc;
    
    /**
     * Obtém Número do documento fiscal
     */
    public String getNumDocCanc() {
        return numDocCanc;
    }

    /**
     * Seta Número do documento fiscal
     */
    public void setNumDocCanc(String numDocCanc) {
        this.numDocCanc = numDocCanc;
    }
    
}