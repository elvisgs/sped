package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
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
@Getter
@Setter
public class RegF010 extends Registro {

    /**
     * Número de inscrição do estabelecimento no CNPJ
     */
    @Field(at = 2)
    private String cnpj;


}