package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F205 - Custo Incorrido da Unidade Imobiliária Vendida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F205"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class RegF205 extends Registro {

    /**
     * Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês anterior ao da escrituração
     */
    @Field(at = 2)
    private Double vlCusIncAcumAnt;

    /**
     * Valor Total do Custo Incorrido da unidade imobiliária no mês da escrituração
     */
    @Field(at = 3)
    private Double vlCusIncPerEsc;

    /**
     * Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês da escrituração (Campo 02 + 03)
     */
    @Field(at = 4)
    private Double vlCusIncAcum;

    /**
     * Parcela do Custo Incorrido sem direito ao crédito da atividade imobiliária, acumulado até o período
     */
    @Field(at = 5)
    private Double vlExcBcCusIncAcum;

    /**
     * Valor da Base de Cálculo do Crédito sobre o Custo Incorrido, acumulado até o período da escrituração (Campo 04 - 05)
     */
    @Field(at = 6)
    private Double vlBcCusInc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3
     */
    @Field(at = 7)
    private String cstPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 8)
    private Double aliqPis;

    /**
     * Valor Total do Crédito Acumulado sobre o custo incorrido - PIS/PASEP (Campo 06 x 08)
     */
    @Field(at = 9)
    private Double vlCredPisAcum;

    /**
     * Parcela do crédito descontada até o período anterior da escrituração – PIS/PASEP (proporcional à receita recebida até o mês anterior)
     */
    @Field(at = 10)
    private Double vlCredPisDescAnt;

    /**
     * Parcela a descontar no período da escrituração  – PIS/PASEP (proporcional à receita recebida no mês)
     */
    @Field(at = 11)
    private Double vlCredPisDesc;

    /**
     * Parcela a descontar em períodos futuros - PIS/PASEP (Campo 09 - 10 - 11)
     */
    @Field(at = 12)
    private Double vlCredPisDescFut;

    /**
     * Código da Situação Tributária referente ao COFINS, conforme a Tabela indicada no item 4.3.4
     */
    @Field(at = 13)
    private String cstCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 14)
    private Double aliqCofins;

    /**
     * Valor Total do Crédito Acumulado sobre o custo incorrido - COFINS (Campo 06 x 14)
     */
    @Field(at = 15)
    private Double vlCredCofinsAcum;

    /**
     * Parcela do crédito descontada até o período anterior da escrituração - COFINS (proporcional à receita recebida até o mês anterior)
     */
    @Field(at = 16)
    private Double vlCredCofinsDescAnt;

    /**
     * Parcela a descontar no período da escrituração - COFINS (proporcional à receita recebida no mês)
     */
    @Field(at = 17)
    private Double vlCredCofinsDesc;

    /**
     * Parcela a descontar em períodos futuros - COFINS (Campo 15 - 16 - 17)
     */
    @Field(at = 18)
    private Double vlCredCofinsDescFut;


}