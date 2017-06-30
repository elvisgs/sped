package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Valores de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E110"),
    @Field(at = 16, name = "fimLinha")
})
@Getter
@Setter
public class RegE110 extends Registro {

    /**
     * Valor total dos débitos do imposto
     */
    @Field(at = 2)
    private Double vlTotDebitos;

    /**
     * Valor total ajustes a débito (doc fiscal)
     */
    @Field(at = 3)
    private Double vlAjDebitos;

    /**
     * Valor total dos ajustes a débito
     */
    @Field(at = 4)
    private Double vlTotAjDebitos;

    /**
     * Valor total dos estornos de créditos
     */
    @Field(at = 5)
    private Double vlEstornosCred;

    /**
     * Valor total dos créditos do imposto
     */
    @Field(at = 6)
    private Double vlTotCreditos;

    /**
     * Valor total ajustes a crédito (doc fiscal)
     */
    @Field(at = 7)
    private Double vlAjCreditos;

    /**
     * Valor total dos ajustes a crédito
     */
    @Field(at = 8)
    private Double vlTotAjCreditos;

    /**
     * Valor total dos estornos de débitos
     */
    @Field(at = 9)
    private Double vlEstornosDeb;

    /**
     * Saldo credor do período anterior
     */
    @Field(at = 10)
    private Double vlSldCredorAnt;

    /**
     * Valor do saldo devedor
     */
    @Field(at = 11)
    private Double vlSldApurado;

    /**
     * Valor total das deduções
     */
    @Field(at = 12)
    private Double vlTotDed;

    /**
     * Valor total do ICMS a recolher
     */
    @Field(at = 13)
    private Double vlIcmsRecolher;

    /**
     * Valor do saldo credor do ICMS
     */
    @Field(at = 14)
    private Double vlSldCredorTransportar;

    /**
     * Valores recolhidos ou a recolher, extra-apuração
     */
    @Field(at = 15)
    private Double debEsp;


}
