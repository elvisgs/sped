package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Registro de Encerramento do Bloco P
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "P990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegP990 {
    
    @Field(at = 2)
    private Integer qtdLinP;
    
    
    /**
     * Obtém Quantidade total de linhas do Bloco P
     */
    public Integer getQtdLinP() {
        return qtdLinP;
    }

    /**
     * Seta Quantidade total de linhas do Bloco P
     */
    public void setQtdLinP(Integer qtdLinP) {
        this.qtdLinP = qtdLinP;
    }
    
    
}