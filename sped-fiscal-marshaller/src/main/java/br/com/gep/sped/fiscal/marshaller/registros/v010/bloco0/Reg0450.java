package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Informação Complementar
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0450"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg0450 extends Registro {

    /**
     * Código da informação complementar
     */
    @Field(at = 2)
    private String codInf;

    /**
     * Texto da informação complementar
     */
    @Field(at = 3)
    private String txt;


}
