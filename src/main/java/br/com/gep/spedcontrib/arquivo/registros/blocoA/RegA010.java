package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Estabelecimento
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "A010")
})
public class RegA010 {
    
    @Field(at = 1)
    private String cnpj;
    
    
    /**
     * Obtém Número de inscrição do estabelecimento no CNPJ
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta Número de inscrição do estabelecimento no CNPJ
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}