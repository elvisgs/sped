package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I100 - Consolidação das Operações do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "I100"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class RegI100 extends Registro {

    /**
     * Valor Total do Faturamento/Receita Bruta no Período
     */
    @Field(at = 2)
    private Double vlRecFin;

    /**
     * Código de Situação Tributária referente à Receita informada no Campo 02
     */
    @Field(at = 3)
    private String cst;

    /**
     * Valor Total das Deduções e Exclusões de Caráter Geral
     */
    @Field(at = 4)
    private Double vlTotDedGer;

    /**
     * Valor Total das Deduções e Exclusões de Caráter Específico
     */
    @Field(at = 5)
    private Double vlTotDedEsp;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 6)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 7)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP 
     */
    @Field(at = 8)
    private Double vlPis;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 9)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 10)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 11)
    private Double vlCofins;

    /**
     * Informações Complementares
     */
    @Field(at = 12)
    private String infComp;


}