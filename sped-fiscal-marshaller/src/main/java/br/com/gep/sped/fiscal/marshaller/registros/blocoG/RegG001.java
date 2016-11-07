package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Abertura do Bloco G
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G001"),
    @Field(at = 3, name = "fimLinha")
})
public class RegG001 extends RegistroAberturaBloco {
    
}