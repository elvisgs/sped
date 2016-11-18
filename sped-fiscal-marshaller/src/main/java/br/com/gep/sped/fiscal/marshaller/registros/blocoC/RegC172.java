package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * ISSQN
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C172"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC172 extends Registro {

    /**
     * Base de cálculo do ISSQN
     */
    @Field(at = 2)
    private Double vlBcIssqn;

    /**
     * Alíquota do ISSQN(%)
     */
    @Field(at = 3)
    private Double aliqIssqn;

    /**
     * Valor do ISSQN
     */
    @Field(at = 4)
    private Double vlIssqn;


}