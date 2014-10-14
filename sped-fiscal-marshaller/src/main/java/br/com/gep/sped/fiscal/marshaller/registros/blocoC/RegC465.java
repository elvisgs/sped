package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C465"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegC465 extends Registro {
    
    @Field(at = 2)
    private String chvCfe;
    
    @Field(at = 3)
    private String numCcf;
    
    /**
     * Obtém Chave do CFe
     */
    public String getChvCfe() {
        return chvCfe;
    }

    /**
     * Seta Chave do CFe
     */
    public void setChvCfe(String chvCfe) {
        this.chvCfe = chvCfe;
    }
    
    /**
     * Obtém Número do Contador do Cupom Fiscal
     */
    public String getNumCcf() {
        return numCcf;
    }

    /**
     * Seta Número do Contador do Cupom Fiscal
     */
    public void setNumCcf(String numCcf) {
        this.numCcf = numCcf;
    }
    
}