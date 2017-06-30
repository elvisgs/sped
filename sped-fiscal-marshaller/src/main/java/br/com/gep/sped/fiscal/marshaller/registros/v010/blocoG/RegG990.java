package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco G
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G990"),
    @Field(at = 3, name = "fimLinha")
})
public class RegG990 extends RegistroEncerramentoBloco {

}
