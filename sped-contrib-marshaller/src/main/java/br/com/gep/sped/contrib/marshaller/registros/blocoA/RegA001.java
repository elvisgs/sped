package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Abertura do Bloco A
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "A001"),
    @Field(at = 3, name = "fimLinha")
})
public class RegA001 extends RegistroAberturaBloco {
    
}