package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F210 - Custo Orçado da Unidade Imobiliária Vendida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F210"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegF210 extends Registro {

    /**
     * Valor Total do Custo Orçado para Conclusão da Unidade Vendida
     */
    @Field(at = 2)
    private Double vlCusOrc;

    /**
     * Valores Referentes a Pagamentos a Pessoas Físicas, Encargos Trabalhistas, Sociais e Previdenciários e à aquisição de bens e serviços não sujeitos ao pagamento das contribuições
     */
    @Field(at = 3)
    private Double vlExc;

    /**
     * Valor da Base de Calculo do Crédito sobre o Custo Orçado Ajustado (Campo 02 - 03).
     */
    @Field(at = 4)
    private Double vlCusOrcAju;

    /**
     * Valor da Base de Cálculo do Crédito sobre o Custo Orçado no Período
     */
    @Field(at = 5)
    private Double vlBcCred;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
     */
    @Field(at = 6)
    private String cstPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 7)
    private Double aliqPis;

    /**
     * Valor do Crédito sobre o custo orçado a ser utilizado no período da escrituração - PIS/PASEP
     */
    @Field(at = 8)
    private Double vlCredPisUtil;

    /**
     * Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
     */
    @Field(at = 9)
    private String cstCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 10)
    private Double aliqCofins;

    /**
     * Valor do Crédito sobre o custo orçado a ser utilizado no período da escrituração - COFINS
     */
    @Field(at = 11)
    private Double vlCredCofinsUtil;


}