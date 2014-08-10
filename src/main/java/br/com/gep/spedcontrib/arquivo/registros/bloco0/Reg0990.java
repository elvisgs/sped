package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco 0
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0990")
})
public class Reg0990 {
    
    @Field(at = 1)
    private Integer qtdLin0;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco 0
     */
    public Integer getQtdLin0() {
        return qtdLin0;
    }

    /**
     * Seta Quantidade total de linhas do Bloco 0
     */
    public void setQtdLin0(Integer qtdLin0) {
        this.qtdLin0 = qtdLin0;
    }
    
    
}