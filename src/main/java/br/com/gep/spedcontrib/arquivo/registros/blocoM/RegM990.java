package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro de Encerramento do Bloco M
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "M990")
})
public class RegM990 {
    
    @Field(at = 1)
    private Integer qtdLinM;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco M
     */
    public Integer getQtdLinM() {
        return qtdLinM;
    }

    /**
     * Seta Quantidade total de linhas do Bloco M
     */
    public void setQtdLinM(Integer qtdLinM) {
        this.qtdLinM = qtdLinM;
    }
    
    
}