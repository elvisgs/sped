package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0110 - Regime de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0110"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class Reg0110 extends Registro {

    /**
     * Código indicador da incidência tributária no período
     * <p>1=Incidência exclusivamente no regime não-cumulativo;2=Incidência exclusivamente no regime cumulativo;3=Incidência nos regimes não-cumulativo e cumulativo</p>
     */
    @Field(at = 2)
    private String codIncTrib;

    /**
     * Código indicador de método de apropriação de créditos comuns, no caso de incidência no regime não-cumulativo (COD_INC_TRIB = 1 ou 3)
     * <p>1=Método de apropriação direta;2=Método de rateio proporcional (Receita Bruta)</p>
     */
    @Field(at = 3)
    private String indAproCred;

    /**
     * Código indicador do Tipo de Contribuição Apurada no Período
     * <p>1=Apuração da Contribuição Exclusivamente a Alíquota Básica;2=Apuração da Contribuição  a Alíquotas Específicas (Diferenciadas e/ou por Unidade de Medida de Produto)</p>
     */
    @Field(at = 4)
    private String codTipoCont;

    /**
     * Código indicador do Tipo de Critério de escrituração e apuração
     * <p>1=Regime de Caixa - Escrituração consolidada (Registro F500);2=Regime de Competência - Escrituração consolidada (Registro F550);9=Regime de Competência - Escrituração detalhada, com base nos registros dos Blocos “A”, “C”, “D” e “F”</p>
     */
    @Field(at = 5)
    private String indRegCum;


}