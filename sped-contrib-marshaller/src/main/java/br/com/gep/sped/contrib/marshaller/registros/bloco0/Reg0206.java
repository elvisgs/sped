package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0206 - Código do Item na ANP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0206"),
    @Field(at = 3, name = "fimLinha")
})
@Getter
@Setter
public class Reg0206 extends Registro {

    /**
     * Código do combustível, conforme tabela publicada pela ANP
     */
    @Field(at = 2)
    private String codComb;


}