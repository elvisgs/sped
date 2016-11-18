package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * SUB-APURAÇÃO DO ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1920"),
    @Field(at = 14, name = "fimLinha")
})
@Getter
@Setter
public class Reg1920 extends Registro {

    /**
     * Valor total dos débitos por 'Saídas e Prestações com débito do imposto'
     */
    @Field(at = 2)
    private Double vlTotTransfDebitosOa;

    /**
     * Valor total de 'Ajustes a débito'
     */
    @Field(at = 3)
    private Double vlTotAjDebitosOa;

    /**
     * Valor total de Ajustes 'Estornos de créditos'
     */
    @Field(at = 4)
    private Double vlEstornosCredOa;

    /**
     * Valor total dos créditos por 'Entradas e aquisições com crédito do imposto'
     */
    @Field(at = 5)
    private Double vlTotTransfCreditosOa;

    /**
     * Valor total de 'Ajustes a crédito'
     */
    @Field(at = 6)
    private Double vlTotAjCreditosOa;

    /**
     * Valor total de Ajustes 'Estornos de Débitos'
     */
    @Field(at = 7)
    private Double vlEstornosDebOa;

    /**
     * Valor total de 'Saldo credor do período anterior'
     */
    @Field(at = 8)
    private Double vlSldCredorAntOa;

    /**
     * Valor do saldo devedor apurado
     */
    @Field(at = 9)
    private Double vlSldApuradoOa;

    /**
     * Valor total de 'Deduções'
     */
    @Field(at = 10)
    private Double vlTotDed;

    /**
     * Valor total de 'ICMS a recolher'
     */
    @Field(at = 11)
    private Double vlIcmsRecolherOa;

    /**
     * Valor total de 'Saldo credor a transportar para o período seguinte'
     */
    @Field(at = 12)
    private Double vlSldCredorTranspOa;

    /**
     * Valores recolhidos ou a recolher, extra-apuração
     */
    @Field(at = 13)
    private Double debEspOa;


}