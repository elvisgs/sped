package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * DEMONSTRATIVO DE CRÉDITO DO ICMS SOBRE TRANSPORTE AÉREO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1800"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class Reg1800 extends Registro {

    /**
     * Valor das prestações cargas (Tributado)
     */
    @Field(at = 2)
    private Double vlCarga;

    /**
     * Vr. das prestações passageiros/cargas (Não Tributado)
     */
    @Field(at = 3)
    private Double vlPass;

    /**
     * Valor total do faturamento
     */
    @Field(at = 4)
    private Double vlFat;

    /**
     * Índice para rateio
     */
    @Field(at = 5)
    private Double indRat;

    /**
     * Valor total dos créditos de ICMS
     */
    @Field(at = 6)
    private Double vlIcmsAnt;

    /**
     * Valor da base de cálculo do ICMS
     */
    @Field(at = 7)
    private Double vlBcIcms;

    /**
     * Valor do ICMS apurado
     */
    @Field(at = 8)
    private Double vlIcmsApur;

    /**
     * Valor da base de cálculo do ICMS apurada
     */
    @Field(at = 9)
    private Double vlBcIcmsApur;

    /**
     * Vr. da diferença a ser levada a estorno de crédito na apuração
     */
    @Field(at = 10)
    private Double vlDif;


}