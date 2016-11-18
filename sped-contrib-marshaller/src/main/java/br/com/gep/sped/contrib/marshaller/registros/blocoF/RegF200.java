package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F200 - Operações da Atividade Imobiliária - Unidade Imobiliária Vendida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "F200"),
    @Field(at = 23, name = "fimLinha")
})
@Getter
@Setter
public class RegF200 extends Registro {

    /**
     * Indicador do Tipo da Operação
     * <p>01=Venda a Vista de Unidade Concluída;02=Venda a Prazo de Unidade Concluída;03=Venda a Vista de Unidade em Construção;04=Venda a Prazo de Unidade em Construção;05=Outras</p>
     */
    @Field(at = 2)
    private String indOper;

    /**
     * Indicador do tipo de unidade imobiliária Vendida.
     * <p>01=Terreno adquirido para venda;02=Terreno decorrente de loteamento;03=Lote oriundo de desmembramento de terreno;04=Unidade resultante de incorporação imobiliária;05=Prédio construído/em construção para venda;06=Outras</p>
     */
    @Field(at = 3)
    private String unidImob;

    /**
     * Identificação/Nome do Empreendimento
     */
    @Field(at = 4)
    private String identEmp;

    /**
     * Descrição Resumida da Unidade Imobiliária Vendida
     */
    @Field(at = 5)
    private String descUnidImob;

    /**
     * Número do Contrato de Venda da Unidade Imobiliária
     */
    @Field(at = 6)
    private String numCont;

    /**
     * Identificação da pessoa  física (CPF) ou da pessoa jurídica (CNPJ) adquirente da unidade imobiliária
     */
    @Field(at = 7)
    private String cpfCnpjAdqu;

    /**
     * Data da operação de venda da Unidade Imobiliária
     */
    @Field(at = 8)
    private Date dtOper;

    /**
     * Valor total da unidade imobiliária vendida
     */
    @Field(at = 9)
    private Double vlTotVend;

    /**
     * Valor recebido, acumulado até o mês anterior ao da escrituração.
     */
    @Field(at = 10)
    private Double vlRecAcum;

    /**
     * Valor total recebido no mês da escrituração
     */
    @Field(at = 11)
    private Double vlTotRec;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3 (IN RFB nº 1.009, de 2010)
     */
    @Field(at = 12)
    private String cstPis;

    /**
     * Base de Cálculo do PIS/PASEP
     */
    @Field(at = 13)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 14)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 15)
    private Double vlPis;

    /**
     * Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4 (IN RFB nº 1.009, de 2010)
     */
    @Field(at = 16)
    private String cstCofins;

    /**
     * Base de Cálculo da COFINS
     */
    @Field(at = 17)
    private Double vlBcCofins;

    /**
     * Alíquota da COFINS (em percentual)
     */
    @Field(at = 18)
    private Double aliqCofins;

    /**
     * Valor da COFINS
     */
    @Field(at = 19)
    private Double vlCofins;

    /**
     * Percentual da receita total recebida até o mês, da unidade imobiliária vendida ((Campo 10 + Campo 11) / Campo 09)
     */
    @Field(at = 20)
    private Double percRecReceb;

    /**
     * Indicador da Natureza Específica do Empreendimento
     * <p>1=Consórcio;2=SCP;3=Incorporação em Condomínio;4=Outras</p>
     */
    @Field(at = 21)
    private String indNatEmp;

    /**
     * Informações Complementares
     */
    @Field(at = 22)
    private String infComp;


}