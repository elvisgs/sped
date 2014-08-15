package br.com.gep.spedcontrib.arquivo.registros.blocoI;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco I
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "I990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegI990 extends Registro {
    
    @Field(at = 2)
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