package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Ajuste/Benefício/Incentivo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E220"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegE220 extends Registro {

    /**
     * Código ajuste da apuração/dedução
     */
    @Field(at = 2)
    private String codAjApur;

    /**
     * Descrição complementar
     */
    @Field(at = 3)
    private String descrComplAj;

    /**
     * Valor do ajuste da apuração
     */
    @Field(at = 4)
    private Double vlAjApur;


}