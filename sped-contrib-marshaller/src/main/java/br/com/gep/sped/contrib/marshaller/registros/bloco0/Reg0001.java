package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0001 - Abertura do Bloco 0
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0001"),
    @Field(at = 3, name = "fimLinha")
})
public class Reg0001 extends RegistroAberturaBloco {
    
}