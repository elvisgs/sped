package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco D
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D990"),
    @Field(at = 3, name = "fimLinha")
})
public class RegD990 extends RegistroEncerramentoBloco {
}