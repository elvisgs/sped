package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0206 - Código do Item na ANP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0206"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg0206 extends Registro {
    
    @Field(at = 2)
    private String codComb;
    
    
    /**
     * Obtém Código do combustível
     */
    public String getCodComb() {
        return codComb;
    }

    /**
     * Seta Código do combustível
     */
    public void setCodComb(String codComb) {
        this.codComb = codComb;
    }
    
    
}