package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * A170 - Itens do Documento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "A170"),
    @Field(at = 19, name = "fimLinha")
})
@Getter
@Setter
public class RegA170 extends Registro {

    /**
     * Número sequencial do item no documento fiscal
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do item (campo 02 do Registro 0200)
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Descrição complementar do item como adotado no documento fiscal
     */
    @Field(at = 4)
    private String descrCompl;

    /**
     * Valor total do item (mercadorias ou serviços)
     */
    @Field(at = 5)
    private Double vlItem;

    /**
     * Valor do desconto do item / Exclusão
     */
    @Field(at = 6)
    private Double vlDesc;

    /**
     * Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7, caso seja informado código representativo de crédito no Campo CST_PIS ou CST_COFINS
     * <p>03=Aquisição de serviços utilizados como insumo;05=Aluguéis de prédios;06=Aluguéis de máquinas e equipamentos;07=Armazenagem de mercadoria e frete na operação de venda;13=Outras Operações com Direito a Crédito;15=Atividade Imobiliária - Custo Incorrido de Unidade Imobiliária</p>
     */
    @Field(at = 7)
    private String natBcCred;

    /**
     * Indicador da origem do crédito
     * <p>0=Operação no Mercado Interno;1=Operação de Importação</p>
     */
    @Field(at = 8)
    private String indOrigCred;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP - Tabela 4.3.3
     */
    @Field(at = 9)
    private String cstPis;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 10)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 11)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 12)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente ao COFINS - Tabela 4.3.4
     */
    @Field(at = 13)
    private String cstCofins;

    /**
     * Valor da base de cálculo da COFINS
     */
    @Field(at = 14)
    private Double vlBcCofins;

    /**
     * Alíquota do COFINS (em percentual)
     */
    @Field(at = 15)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 16)
    private Double vlCofins;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 17)
    private String codCta;

    /**
     * Código do centro de custos
     */
    @Field(at = 18)
    private String codCcus;


}