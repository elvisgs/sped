package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco D
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "D990")
})
public class RegD990 {
    
    @Field(at = 1)
    private Integer qtdLinD;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco D
     */
    public Integer getQtdLinD() {
        return qtdLinD;
    }

    /**
     * Seta Quantidade total de linhas do Bloco D
     */
    public void setQtdLinD(Integer qtdLinD) {
        this.qtdLinD = qtdLinD;
    }
    
    
}