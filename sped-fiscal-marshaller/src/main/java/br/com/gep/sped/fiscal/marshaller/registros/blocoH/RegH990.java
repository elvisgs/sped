package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * ENCERRAMENTO DO BLOCO H
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "H990"),
    @Field(at = 3, name = "fimLinha")
})
public class RegH990 extends RegistroEncerramentoBloco {

}