package br.com.gep.sped.marshaller.common.bloco9;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registros do Arquivo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "9900"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reg9900 extends Registro {

    /**
     * Registro que será totalizado
     */
    @Field(at = 2)
    private String regBlc;

    /**
     * Total de registros do tipo informado
     */
    @Field(at = 3)
    private Integer qtdRegBlc;
}
