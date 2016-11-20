package br.com.gep.sped.marshaller.common.bloco9;

import br.com.gep.sped.marshaller.common.RegistroEncerramentoBloco;
import lombok.NoArgsConstructor;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco 9
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "9990"),
    @Field(at = 3, name = "fimLinha")
})
@NoArgsConstructor
public class Reg9990 extends RegistroEncerramentoBloco {

    public Reg9990(int qtdLin) {
        super(qtdLin);
    }
}
