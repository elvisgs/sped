package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Informação Complementar
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0450"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg0450 extends Registro {
    
    @Field(at = 2)
    private String codInf;
    
    @Field(at = 3)
    private String txt;
    
    /**
     * Obtém Código da informação complementar
     */
    public String getCodInf() {
        return codInf;
    }

    /**
     * Seta Código da informação complementar
     */
    public void setCodInf(String codInf) {
        this.codInf = codInf;
    }
    
    /**
     * Obtém Texto da informação complementar
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Seta Texto da informação complementar
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }
    
}