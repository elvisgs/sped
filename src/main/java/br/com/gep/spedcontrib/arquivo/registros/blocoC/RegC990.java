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
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegC990 {
    
    @Field(at = 2)
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