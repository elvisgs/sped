package br.com.gep.spedcontrib.arquivo.registros.blocoI;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco I
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "I990")
})
public class RegI990 {
    
    @Field(at = 1)
    private Integer qtdLinI;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco I
     */
    public Integer getQtdLinI() {
        return qtdLinI;
    }

    /**
     * Seta Quantidade total de linhas do Bloco I
     */
    public void setQtdLinI(Integer qtdLinI) {
        this.qtdLinI = qtdLinI;
    }
    
    
}