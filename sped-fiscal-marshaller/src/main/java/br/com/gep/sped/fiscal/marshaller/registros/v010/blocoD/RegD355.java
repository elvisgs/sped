package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Redução Z
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D355"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegD355 extends Registro {

    /**
     * Data da Redução Z
     */
    @Field(at = 2)
    private Date dtDoc;

    /**
     * Posição do CRO
     */
    @Field(at = 3)
    private String cro;

    /**
     * Posição do CRZ
     */
    @Field(at = 4)
    private String crz;

    /**
     * COO da Redução Z
     */
    @Field(at = 5)
    private String numCooFin;

    /**
     * GT final
     */
    @Field(at = 6)
    private Double gtFin;

    /**
     * Valor da venda bruta
     */
    @Field(at = 7)
    private Double vlBrt;


}
