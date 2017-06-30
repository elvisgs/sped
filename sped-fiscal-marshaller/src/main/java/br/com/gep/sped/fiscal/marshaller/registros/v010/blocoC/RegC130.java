package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * ISS, IR e Previdência
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C130"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC130 extends Registro {

    /**
     * Valor dos serviços NT
     */
    @Field(at = 2)
    private Double vlServNt;

    /**
     * Base cálculo do ISSQN
     */
    @Field(at = 3)
    private Double vlBcIssqn;

    /**
     * Valor do ISSQN
     */
    @Field(at = 4)
    private Double vlIssqn;

    /**
     * Base cálculo do IRRF
     */
    @Field(at = 5)
    private Double vlBcIrrf;

    /**
     * Valor do IRRF
     */
    @Field(at = 6)
    private Double vlIrrf;

    /**
     * Base cálculo Previdência Social
     */
    @Field(at = 7)
    private Double vlBcPrev;

    /**
     * Valor retido Previdência Social
     */
    @Field(at = 8)
    private Double vlPrev;


}
