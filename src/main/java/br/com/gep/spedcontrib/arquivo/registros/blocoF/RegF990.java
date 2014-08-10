package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco F
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "F990")
})
public class RegF990 {
    
    @Field(at = 1)
    private Integer qtdLinF;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco F
     */
    public Integer getQtdLinF() {
        return qtdLinF;
    }

    /**
     * Seta Quantidade total de linhas do Bloco F
     */
    public void setQtdLinF(Integer qtdLinF) {
        this.qtdLinF = qtdLinF;
    }
    
    
}