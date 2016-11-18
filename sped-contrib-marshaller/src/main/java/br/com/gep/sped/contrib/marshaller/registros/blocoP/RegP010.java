package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Escrituração das Receitas Sujeitas à Contribuição Previdenciária sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P010"),
    @Field(at = 3, name = "fimLinha")
})
@Getter
@Setter
public class RegP010 extends Registro {

    /**
     * CNPJ (Informe/Selecione o CNPJ do estabelecimento a que se refere a receita bruta auferida)
     */
    @Field(at = 2)
    private String cnpj;


}