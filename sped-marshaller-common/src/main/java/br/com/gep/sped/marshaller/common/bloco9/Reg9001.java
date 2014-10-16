package br.com.gep.sped.marshaller.common.bloco9;

import br.com.gep.sped.marshaller.common.Registro;
import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Abertura do Bloco 9
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "9001"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg9001 extends RegistroAberturaBloco {

}