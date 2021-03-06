package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Documentos Cancelado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C601"),
    @Field(at = 3, name = "fimLinha")
})
@Getter
@Setter
public class RegC601 extends Registro {

    /**
     * Número do doc cancelado
     */
    @Field(at = 2)
    private String numDocCanc;


}
