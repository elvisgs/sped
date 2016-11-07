package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F010 - Estabelecimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F010"),
    @Field(at = 3, name = "fimLinha")
})
public class RegF010 extends Registro {
    
    @Field(at = 2)
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