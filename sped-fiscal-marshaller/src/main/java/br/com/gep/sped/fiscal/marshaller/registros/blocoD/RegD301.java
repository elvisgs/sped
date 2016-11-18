package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D301"),
    @Field(at = 3, name = "fimLinha")
})
@Getter
@Setter
public class RegD301 extends Registro {

    /**
     * Número do doc cancelado
     */
    @Field(at = 2)
    private Integer numDocCanc;


}