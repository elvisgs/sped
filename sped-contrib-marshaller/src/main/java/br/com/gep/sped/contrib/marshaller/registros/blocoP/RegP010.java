package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Escrituração das Receitas Sujeitas à Contribuição Previdenciária sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "P010"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegP010 extends Registro {
    
    @Field(at = 2)
    private String cnpj;
    
    
    /**
     * Obtém CNPJ (Informe/Selecione o CNPJ do estabelecimento a que se refere a receita bruta auferida)
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ (Informe/Selecione o CNPJ do estabelecimento a que se refere a receita bruta auferida)
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}