package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco C
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C990"),
    @Field(at = 3, name = "fimLinha")
})
public class RegC990 extends RegistroEncerramentoBloco {

}