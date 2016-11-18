package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M200 - Contribuição para o PIS/PASEP do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M200"),
    @Field(at = 14, name = "fimLinha")
})
@Getter
@Setter
public class RegM200 extends Registro {

    /**
     * Valor Total da Contribuição Não Cumulativa do Período (recuperado do campo 13 do Registro M210, quando o campo COD_CONT for igual a 01, 02, 03, 04, 32 e 71)
     */
    @Field(at = 2)
    private Double vlTotContNcPer;

    /**
     * Valor do Crédito Descontado, Apurado no Próprio Período da Escrituração (recuperado do campo 14 do Registro M100)
     */
    @Field(at = 3)
    private Double vlTotCredDesc;

    /**
     * Valor do Crédito Descontado, Apurado em Período de Apuração Anterior (recuperado do campo 13 do Registro 1100)
     */
    @Field(at = 4)
    private Double vlTotCredDescAnt;

    /**
     * Valor Total da Contribuição Não Cumulativa Devida (02 - 03 - 04)
     */
    @Field(at = 5)
    private Double vlTotContNcDev;

    /**
     * Valor Retido na Fonte Deduzido no Período (Não Cumulativo)
     */
    @Field(at = 6)
    private Double vlRetNc;

    /**
     * Outras Deduções do Regime Não Cumulativo no Período
     */
    @Field(at = 7)
    private Double vlOutDedNc;

    /**
     * Valor da Contribuição Não Cumulativa a Recolher/Pagar (05 - 06 - 07)
     */
    @Field(at = 8)
    private Double vlContNcRec;

    /**
     * Valor Total da Contribuição Cumulativa do Período (recuperado do campo 13 do Registro M210, quando o campo COD_CONT for igual a 31, 32, 51, 52, 53, 54 e 72)
     */
    @Field(at = 9)
    private Double vlTotContCumPer;

    /**
     * Valor Retido na Fonte Deduzido no Período (Cumulativo)
     */
    @Field(at = 10)
    private Double vlRetCum;

    /**
     * Outras Deduções do Regime Cumulativo no Período
     */
    @Field(at = 11)
    private Double vlOutDedCum;

    /**
     * Valor da Contribuição Cumulativa a Recolher/Pagar (09 - 10 - 11)
     */
    @Field(at = 12)
    private Double vlContCumRec;

    /**
     * Valor Total da Contribuição a Recolher/Pagar no Período (08 + 12)
     */
    @Field(at = 13)
    private Double vlTotContRec;


}