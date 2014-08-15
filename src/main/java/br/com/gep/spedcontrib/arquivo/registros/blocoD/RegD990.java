package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Encerramento do Bloco D
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegD990 extends Registro {
    
    @Field(at = 2)
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