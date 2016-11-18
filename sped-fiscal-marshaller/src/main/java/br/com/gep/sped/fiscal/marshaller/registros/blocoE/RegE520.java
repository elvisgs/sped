package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E520"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegE520 extends Registro {

    /**
     * Saldo credor do período anterior
     */
    @Field(at = 2)
    private Double vlSdAntIpi;

    /**
     * Valor dos débitos do IPI
     */
    @Field(at = 3)
    private Double vlDebIpi;

    /**
     * Valor dos créditos do IPI
     */
    @Field(at = 4)
    private Double vlCredIpi;

    /**
     * Valor outros débitos do IPI
     */
    @Field(at = 5)
    private Double vlOdIpi;

    /**
     * Valor outros créditos do IPI
     */
    @Field(at = 6)
    private Double vlOcIpi;

    /**
     * Valor saldo credor no período
     */
    @Field(at = 7)
    private Double vlScIpi;

    /**
     * Valor saldo devedor a recolher
     */
    @Field(at = 8)
    private Double vlSdIpi;


}