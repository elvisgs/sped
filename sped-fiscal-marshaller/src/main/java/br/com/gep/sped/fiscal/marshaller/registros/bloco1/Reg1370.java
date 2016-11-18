package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Bicos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1370"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg1370 extends Registro {

    /**
     * Bico ligado à bomba
     */
    @Field(at = 2)
    private String numBico;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Número do tanque
     */
    @Field(at = 4)
    private String numTanque;


}