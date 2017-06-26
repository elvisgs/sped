package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Apuração do ICMS diferencial de alíquota – UF origem/destino EC 87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E310"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegE310 extends Registro {

    /**
     * Indicador de movimento:
     * <p>0=Sem operações com ICMS diferencial de alíquota da UF de origem/destino;1=Com operações de ICMS diferencial de alíquota da UF de origem/destino</p>
     */
    @Field(at = 2)
    private String indMovDifal;

    /**
     * Valor do saldo credor de período anterior – ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 3)
    private Double vlSldCredAntDifal;

    /**
     * Valor total dos débitos por saídas e prestações com débito do ICMS referente ao diferencial de alíquota devido à UF do remetente/destinatário
     */
    @Field(at = 4)
    private Double vlTotDebitosDifal;

    /**
     * Valor total dos ajustes outros débitos ICMS diferencial de alíquota da UF de origem/destino e estorno de créditos ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 5)
    private Double vlOutDebDifal;

    /**
     * Valor total dos débitos FCP por saídas e prestações
     */
    @Field(at = 6)
    private Double vlTotDebFcp;

    /**
     * Valor total dos créditos do ICMS referente ao diferencial de alíquota devido à UF dos remetente/destinatário
     */
    @Field(at = 7)
    private Double vlTotCreditosDifal;

    /**
     * Valor total dos créditos FCP por entradas
     */
    @Field(at = 8)
    private Double vlTotCredFcp;

    /**
     * Valor total de ajustes outros créditos ICMS diferencial de alíquota da UF de origem/destino e estorno de débitos ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 9)
    private Double vlOutCredDifal;

    /**
     * Valor total de saldo devedor ICMS diferencial de alíquota da UF de origem/destino antes das deduções
     */
    @Field(at = 10)
    private Double vlSldDevAntDifal;

    /**
     * Valor total dos ajustes deduções ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 11)
    private Double vlDeducoesDifal;

    /**
     * Valor recolhido ou a recolher referente a FCP e imposto do diferencial de alíquota da UF de origem/destino (10-11)
     */
    @Field(at = 12)
    private Double vlRecol;

    /**
     * Saldo credor a transportar para o período seguinte referente a FCP e imposto do diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 13)
    private Double vlSldCredTransportar;

    /**
     * Valores recolhidos ou a recolher, extra-apuração
     */
    @Field(at = 14)
    private Double debEspDifal;


}