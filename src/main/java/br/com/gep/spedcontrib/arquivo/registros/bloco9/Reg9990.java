package br.com.gep.spedcontrib.arquivo.registros.bloco9;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco 9
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "9990")
})
public class Reg9990 {
    
    @Field(at = 1)
    private Integer qtdLin9;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco 9
     */
    public Integer getQtdLin9() {
        return qtdLin9;
    }

    /**
     * Seta Quantidade total de linhas do Bloco 9
     */
    public void setQtdLin9(Integer qtdLin9) {
        this.qtdLin9 = qtdLin9;
    }
    
    
}