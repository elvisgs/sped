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
    @Field(at = 1, name = "reg", rid = true, literal = "C110"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegC110 extends Registro {
    
    @Field(at = 2)
    private String codInf;
    
    @Field(at = 3)
    private String txtCompl;
    
    /**
     * Obtém Código inf complementar (doc fiscal)
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Código inf complementar (doc fiscal)
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getTxtCompl() {
        return txtCompl;
    }

    /**
     * Seta Descrição complementar
     */
    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
}