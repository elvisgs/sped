package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK;

import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * ABERTURA DO BLOCO K
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K001"),
    @Field(at = 3, name = "fimLinha")
})
public class RegK001 extends RegistroAberturaBloco {

}
