package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco A
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegA990 {
    
    @Field(at = 2)
    private Integer qtdLinA;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco A
     */
    public Integer getQtdLinA() {
        return qtdLinA;
    }

    /**
     * Seta Quantidade total de linhas do Bloco A
     */
    public void setQtdLinA(Integer qtdLinA) {
        this.qtdLinA = qtdLinA;
    }
    
    
}