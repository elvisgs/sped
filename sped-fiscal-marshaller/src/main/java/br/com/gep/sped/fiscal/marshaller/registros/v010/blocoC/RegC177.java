package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Selo de Controle de IPI
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C177"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC177 extends Registro {

    /**
     * Código do selo do IPI
     */
    @Field(at = 2)
    private String codSeloIpi;

    /**
     * Quantidade de selo do IPI
     */
    @Field(at = 3)
    private String qtSeloIpi;


}
