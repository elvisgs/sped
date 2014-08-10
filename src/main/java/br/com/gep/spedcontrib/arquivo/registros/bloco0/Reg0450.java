package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0450 - Informação Complementar do DF
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0450")
})
public class Reg0450 {
    
    @Field(at = 1)
    private String codInf;
    
    @Field(at = 2)
    private String txt;
    
    
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
     * Obtém Descrição
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Seta Descrição
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }
    
    
}