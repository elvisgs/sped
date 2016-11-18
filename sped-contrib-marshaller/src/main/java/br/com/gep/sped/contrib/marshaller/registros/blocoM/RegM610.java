package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M610 - Detalhamento por Código de Contribuição (Tabela 4.3.5)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M610"),
    @Field(at = 14, name = "fimLinha")
})
@Getter
@Setter
public class RegM610 extends Registro {

    /**
     * Código da contribuição social apurada no período, conforme a Tabela 4.3.5.
     */
    @Field(at = 2)
    private String codCont;

    /**
     * Valor da Receita Bruta
     */
    @Field(at = 3)
    private Double vlRecBrt;

    /**
     * Valor da Base de Cálculo da Contribuição
     */
    @Field(at = 4)
    private Double vlBcCont;

    /**
     * Alíquota do COFINS (em percentual)
     */
    @Field(at = 5)
    private Double aliqCofins;

    /**
     * Base de cálculo em quantidade COFINS
     */
    @Field(at = 6)
    private Double quantBcCofins;

    /**
     * Alíquota do COFINS (em reais)
     */
    @Field(at = 7)
    private Double aliqCofinsQuant;

    /**
     * Valor total da contribuição social apurada
     */
    @Field(at = 8)
    private Double vlContApur;

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
     * Valor total da contribuição a diferir no período
     */
    @Field(at = 11)
    private Double vlContDifer;

    /**
     * Valor da contribuição diferida em períodos anteriores
     */
    @Field(at = 12)
    private Double vlContDiferAnt;

    /**
     * Valor Total da Contribuição  do Período ( 08 + 09 - 10 - 11 + 12)
     */
    @Field(at = 13)
    private Double vlContPer;


}