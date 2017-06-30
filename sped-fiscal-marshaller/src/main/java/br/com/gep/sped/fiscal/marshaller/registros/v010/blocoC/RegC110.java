package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C110"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC110 extends Registro {

    /**
     * Código inf complementar (doc fiscal)
     */
    @Field(at = 2)
    private String codInf;

    /**
     * Descrição complementar
     */
    @Field(at = 3)
    private String txtCompl;


}
