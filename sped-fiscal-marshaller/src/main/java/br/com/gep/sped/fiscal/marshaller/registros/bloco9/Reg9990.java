package br.com.gep.sped.fiscal.marshaller.registros.bloco9;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ENCERRAMENTO DO BLOCO 9
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "9990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class Reg9990 extends RegistroEncerramentoBloco {
    
}