package br.com.gep.sped.contrib.marshaller.registros.bloco9;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Arquivo Digital
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "9999"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg9999 extends RegistroEncerramentoBloco {
}