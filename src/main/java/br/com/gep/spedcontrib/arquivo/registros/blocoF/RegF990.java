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
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegF990 {
    
    @Field(at = 2)
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