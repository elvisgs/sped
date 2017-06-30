package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Identificação do item
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G140"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegG140 extends Registro {

    /**
     * Número seqüencial
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;


}
