package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Vencimento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C141"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC141 extends Registro {

    /**
     * Número da parcela
     */
    @Field(at = 2)
    private String numParc;

    /**
     * Data de vencimento
     */
    @Field(at = 3)
    private Date dtVcto;

    /**
     * Valor da parcela
     */
    @Field(at = 4)
    private Double vlParc;


}
