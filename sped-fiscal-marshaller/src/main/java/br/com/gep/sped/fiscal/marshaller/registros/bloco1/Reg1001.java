package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.RegistroAberturaBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ABERTURA DO BLOCO 1
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1001"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg1001 extends RegistroAberturaBloco {
    
}