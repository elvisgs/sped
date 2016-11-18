package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F150 - Crédito Presumido sobre Estoque de Abertura
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F150"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegF150 extends Registro {

    /**
     * Texto fixo contendo 18 Código da Base de Cálculo do Crédito sobre Estoque de Abertura, conforme a Tabela indicada no item 4.3.7.
     * <p>18=Estoque de abertura de bens</p>
     */
    @Field(at = 2)
    private String natBcCred;

    /**
     * Valor Total do Estoque de Abertura
     */
    @Field(at = 3)
    private Double vlTotEst;

    /**
     * Parcela do estoque de abertura referente a bens, produtos e mercadorias importados, ou adquiridas no mercado interno sem direito ao crédito
     */
    @Field(at = 4)
    private Double estImp;

    /**
     * Valor da Base de Cálculo do Crédito sobre o Estoque de Abertura (03 - 04)
     */
    @Field(at = 5)
    private Double vlBcEst;

    /**
     * Valor da Base de Cálculo Mensal do Crédito sobre o Estoque de Abertura (1/12 avos do campo 05)
     */
    @Field(at = 6)
    private Double vlBcMenEst;

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
     * Valor Mensal do Crédito Presumido Apurado -  PIS/PASEP  (06 x 08)
     */
    @Field(at = 9)
    private Double vlCredPis;

    /**
     * Código da Situação Tributária referente ao COFINS, conforme a Tabela indicada no item 4.3.4
     */
    @Field(at = 10)
    private String cstCofins;

    /**
     * Alíquota do COFINS (em percentual)
     */
    @Field(at = 11)
    private Double aliqCofins;

    /**
     * Valor Mensal do Crédito Presumido Apurado -  COFINS (06 x 11)
     */
    @Field(at = 12)
    private Double vlCredCofins;

    /**
     * Descrição do estoque
     */
    @Field(at = 13)
    private String descEst;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 14)
    private String codCta;


}