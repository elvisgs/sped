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
    @Field(at = 1, name = "reg", rid = true, literal = "C465"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC465 extends Registro {

    /**
     * Chave do CFe
     */
    @Field(at = 2)
    private String chvCfe;

    /**
     * Número do Contador do Cupom Fiscal
     */
    @Field(at = 3)
    private String numCcf;


}
