package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Apuração do Fundo de Combate à Pobreza e do ICMS diferencial de alíquota – UF origem/destino EC 87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E310"),
    @Field(at = 23, name = "fimLinha")
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
     * Valor total dos débitos por saídas e prestações com débito do ICMS referente ao diferencial de alíquota devido à UF de Origem/Destino
     */
    @Field(at = 4)
    private Double vlTotDebitosDifal;

    /**
     * Valor total dos ajustes outros débitos ICMS diferencial de alíquota da UF de origem/destino e estorno de créditos ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 5)
    private Double vlOutDebDifal;

    /**
     * Valor total dos créditos do ICMS referente ao diferencial de alíquota devido à UF de Origem/Destino
     */
    @Field(at = 6)
    private Double vlTotCreditosDifal;

    /**
     * Valor total de ajustes outros créditos ICMS diferencial de alíquota da UF de origem/destino e estorno de débitos ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 7)
    private Double vlOutCredDifal;

    /**
     * Valor total de saldo devedor ICMS diferencial de alíquota da UF de origem/destino antes das deduções
     */
    @Field(at = 8)
    private Double vlSldDevAntDifal;

    /**
     * Valor total dos ajustes Deduções ICMS diferencial de alíquota da UF de origem/destino
     */
    @Field(at = 9)
    private Double vlDeducoesDifal;

    /**
     * Valor recolhido ou a recolher referente ao ICMS Diferencial de Alíquota da UF de Origem/Destino (08-09)
     */
    @Field(at = 10)
    private Double vlRecol;

    /**
     * Saldo credor a transportar para o período seguinte referente ao ICMS Diferencial de Alíquota da UF de Origem/Destino
     */
    @Field(at = 11)
    private Double vlSldCredTransportar;

    /**
     * Valores recolhidos ou a recolher, extraapuração - ICMS Diferencial de Alíquota da UF de Origem/Destino
     */
    @Field(at = 12)
    private Double debEspDifal;

    /**
     * Valor do Saldo credor de período anterior – FCP
     */
    @Field(at = 13)
    private Double vlSldCredAntFcp;

    /**
     * Valor total dos débitos FCP por saídas e prestações
     */
    @Field(at = 14)
    private Double vlTotDebFcp;

    /**
     * Valor total dos ajustes Outros débitos FCP e Estorno de créditos FCP
     */
    @Field(at = 15)
    private Double vlOutDebFcp;

    /**
     * Valor total dos créditos FCP por Entradas
     */
    @Field(at = 16)
    private Double vlTotCredFcp;

    /**
     * Valor total de ajustes Outros Créditos FCP e Estorno de Débitos FCP
     */
    @Field(at = 17)
    private Double vlOutCredFcp;

    /**
     * Valor total de Saldo devedor FCP antes das deduções
     */
    @Field(at = 18)
    private Double vlSldDevAntFcp;

    /**
     * Valor total das deduções FCP
     */
    @Field(at = 19)
    private Double vlDeducoesFcp;

    /**
     * Valor recolhido ou a recolher referente ao FCP (18–19)
     */
    @Field(at = 20)
    private Double vlRecolFcp;

    /**
     * Saldo credor a transportar para o período seguinte referente ao FCP
     */
    @Field(at = 21)
    private Double vlSldCredTransportarFcp;

    /**
     * Valores recolhidos ou a recolher, extra-apuração FCP
     */
    @Field(at = 22)
    private Double debEspFcp;


}
