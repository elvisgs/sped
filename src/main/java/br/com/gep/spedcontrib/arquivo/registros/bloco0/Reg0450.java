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
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0450"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg0450 {
    
    @Field(at = 2)
    private String codInf;
    
    @Field(at = 3)
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