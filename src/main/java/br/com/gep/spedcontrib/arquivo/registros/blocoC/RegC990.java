package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco C
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "C990")
})
public class RegC990 {
    
    @Field(at = 1)
    private Integer qtdLinC;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco C
     */
    public Integer getQtdLinC() {
        return qtdLinC;
    }

    /**
     * Seta Quantidade total de linhas do Bloco C
     */
    public void setQtdLinC(Integer qtdLinC) {
        this.qtdLinC = qtdLinC;
    }
    
    
}