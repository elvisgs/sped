package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M100 - Crédito de PIS/PASEP Relativo ao Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M100"),
    @Field(at = 16, name = "fimLinha")
})
@Getter
@Setter
public class RegM100 extends Registro {

    /**
     * Código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6
     */
    @Field(at = 2)
    private String codCred;

    /**
     * Indicador de Crédito Oriundo de
     * <p>0=Operações próprias;1=Evento de incorporação, cisão ou fusão</p>
     */
    @Field(at = 3)
    private String indCredOri;

    /**
     * Valor da Base de Cálculo do Crédito
     */
    @Field(at = 4)
    private Double vlBcCred;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 5)
    private Double aliqPis;

    /**
     * Base de cálculo em quantidade PIS/PASEP
     */
    @Field(at = 6)
    private Double quantBcPis;

    /**
     * Alíquota do PIS (em reais)
     */
    @Field(at = 7)
    private Double aliqPisQuant;

    /**
     * Valor total do crédito apurado no período
     */
    @Field(at = 8)
    private Double vlCred;

    /**
     * Valor total dos ajustes de acréscimo
     */
    @Field(at = 9)
    private Double vlAjusAcres;

    /**
     * Valor total dos ajustes de redução
     */
    @Field(at = 10)
    private Double vlAjusReduc;

    /**
     * Valor total do crédito diferido no período
     */
    @Field(at = 11)
    private Double vlCredDif;

    /**
     * Valor Total do Crédito Disponível relativo ao Período (07 + 08 - 09 - 10)
     */
    @Field(at = 12)
    private Double vlCredDisp;

    /**
     * Indicador de utilização do crédito disponível no período.
     * <p>0=Utilização do valor total para desconto da contribuição apurada, no Registro M200;1=Utilização de valor parcial para desconto da contribuição apurada, no Registro M200.</p>
     */
    @Field(at = 13)
    private String indDescCred;

    /**
     * Valor do Crédito disponível, descontado da contribuição apurada no próprio período
     */
    @Field(at = 14)
    private Double vlCredDesc;

    /**
     * Saldo de créditos a utilizar em períodos futuros (12 - 14)
     */
    @Field(at = 15)
    private Double sldCred;


}