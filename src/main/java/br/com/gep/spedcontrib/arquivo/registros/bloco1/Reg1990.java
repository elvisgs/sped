package br.com.gep.spedcontrib.arquivo.registros.bloco1;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco 1
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg1990 extends Registro {
    
    @Field(at = 2)
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