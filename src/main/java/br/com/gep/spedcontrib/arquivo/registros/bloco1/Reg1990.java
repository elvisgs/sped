package br.com.gep.spedcontrib.arquivo.registros.bloco1;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco 1
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "1990")
})
public class Reg1990 {
    
    @Field(at = 1)
    private Integer qtdLin1;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco 1
     */
    public Integer getQtdLin1() {
        return qtdLin1;
    }

    /**
     * Seta Quantidade total de linhas do Bloco 1
     */
    public void setQtdLin1(Integer qtdLin1) {
        this.qtdLin1 = qtdLin1;
    }
    
    
}