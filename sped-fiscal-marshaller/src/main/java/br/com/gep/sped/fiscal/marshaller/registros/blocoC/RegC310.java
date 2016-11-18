package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Documentos Cancelados
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C310"),
    @Field(at = 3, name = "fimLinha")
})
@Getter
@Setter
public class RegC310 extends Registro {

    /**
     * Número do documento fiscal
     */
    @Field(at = 2)
    private String numDocCanc;


}