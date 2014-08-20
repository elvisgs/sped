package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * A110 - Informação Complementar da NF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A110"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegA110 extends RegBase {
    
    @Field(at = 2)
    private String codInf;
    
    @Field(at = 3)
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