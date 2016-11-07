package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ENCERRAMENTO DO BLOCO D
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D990"),
    @Field(at = 3, name = "fimLinha")
})
public class RegD990 extends RegistroEncerramentoBloco {
    
}