package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Código de Produto, Conforme Tabela Publicada Pela ANP (COMBUSTÍVEIS)
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
     * Código do combustível
     */
    @Field(at = 2)
    private String codComb;


}