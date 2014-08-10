package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * A110 - Informação Complementar da NF
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "A110")
})
public class RegA110 {
    
    @Field(at = 1)
    private String codInf;
    
    @Field(at = 2)
    private String txtCompl;
    
    
    /**
     * Obtém Código
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Código
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Texto
     */
    public String getTxtCompl() {
        return txtCompl;
    }

    /**
     * Seta Texto
     */
    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
    
}