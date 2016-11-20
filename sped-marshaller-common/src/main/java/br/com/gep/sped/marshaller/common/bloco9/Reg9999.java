package br.com.gep.sped.marshaller.common.bloco9;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import lombok.NoArgsConstructor;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Arquivo Digital
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "9999"),
    @Field(at = 3, name = "fimLinha")
})
@NoArgsConstructor
public class Reg9999 extends RegistroEncerramentoBloco {

    public Reg9999(int qtdLin) {
        super(qtdLin);
    }
}
