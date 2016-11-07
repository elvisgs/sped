package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro de Abertura do Bloco P
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P001"),
    @Field(at = 3, name = "fimLinha")
})
public class RegP001 extends RegistroAberturaBloco {
    
}