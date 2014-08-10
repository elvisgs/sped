package br.com.gep.spedcontrib.arquivo.registros.bloco9;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Arquivo Digital
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "9999")
})
public class Reg9999 {
    
    @Field(at = 1)
    private Integer qtdLin;
    
    
    /**
     * Obtém Quantidade total de linhas do arquivo digital.
     */
    public Integer getQtdLin() {
        return qtdLin;
    }

    /**
     * Seta Quantidade total de linhas do arquivo digital.
     */
    public void setQtdLin(Integer qtdLin) {
        this.qtdLin = qtdLin;
    }
    
    
}