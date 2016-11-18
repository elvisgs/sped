package br.com.gep.sped.marshaller.common;

import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;

@Getter
@Setter
public abstract class RegistroEncerramentoBloco extends Registro {

    /**
     * Quantidade de linhas no bloco
     */
    @Field(at = 2)
    private int qtdLin;
}
