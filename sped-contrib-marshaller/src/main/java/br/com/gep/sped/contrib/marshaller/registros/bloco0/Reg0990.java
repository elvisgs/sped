package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco 0
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0990"),
    @Field(at = 3, name = "fimLinha")
})
public class Reg0990 extends RegistroEncerramentoBloco {
}