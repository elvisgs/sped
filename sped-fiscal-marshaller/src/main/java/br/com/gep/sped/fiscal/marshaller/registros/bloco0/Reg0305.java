package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Utilização
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0305"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg0305 extends Registro {

    /**
     * Código do centro de custo
     */
    @Field(at = 2)
    private String codCcus;

    /**
     * função do bem
     */
    @Field(at = 3)
    private String func;

    /**
     * Vida útil
     */
    @Field(at = 4)
    private String vidaUtil;


}