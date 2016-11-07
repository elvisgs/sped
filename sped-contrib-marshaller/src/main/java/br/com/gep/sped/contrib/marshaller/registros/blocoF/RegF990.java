package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco F
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F990"),
    @Field(at = 3, name = "fimLinha")
})
public class RegF990 extends RegistroEncerramentoBloco {
}