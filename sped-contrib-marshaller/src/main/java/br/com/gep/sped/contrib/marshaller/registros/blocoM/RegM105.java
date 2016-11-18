package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M105 - Detalhamento da Base de Cálculo do Crédito
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M105"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegM105 extends Registro {

    /**
     * Código da Natureza da Base de Cálculo do Crédito apurado no período, conforme a Tabela 4.3.7
     */
    @Field(at = 2)
    private String natBcCred;

    /**
     * Código da Situação Tributária referente ao crédito de PIS/PASEP (Tabela 4.3.3) - Códigos 50 a 56 (créditos Básicos) e de 60 a 66 (Créditos Presumidos).
     */
    @Field(at = 3)
    private String cstPis;

    /**
     * Valor Total da Base de Cálculo escriturada nos documentos e operações (Blocos “A”, “C”, “D” e “F”), referente ao CST_PIS informado no Campo 03
     */
    @Field(at = 4)
    private Double vlBcPisTot;

    /**
     * Parcela do Valor Total da Base de Cálculo informada no Campo 04, vinculada a receitas com incidência cumulativa. Campo de preenchimento específico para a pessoa jurídica sujeita ao regime cumulativo e não-cumulativo da contribuição (COD_INC_TRIB = 3 do Registro 0110)
     */
    @Field(at = 5)
    private Double vlBcPisCum;

    /**
     * Valor Total da Base de Cálculo do Crédito, vinculada a receitas com incidência não-cumulativa (Campo 04 - Campo 05).
     */
    @Field(at = 6)
    private Double vlBcPisNc;

    /**
     * Valor da Base de Cálculo do Crédito, vinculada ao tipo de Crédito escriturado em M100. Para os CST_PIS = “50”, “51”, “52”, “60”, “61” e “62”: Informar o valor do Campo 06 (VL_BC_PIS_NC); para os CST_PIS = “53”, “54”, “55”, “56”, “63”, “64” “65” e “66” (Crédito sobre operações vinculadas a mais de um tipo de receita): Informar a parcela do valor do Campo 06 (VL_BC_PIS_NC) vinculada especificamente ao tipo de crédito escriturado em M100
     */
    @Field(at = 7)
    private Double vlBcPis;

    /**
     * Quantidade Total da Base de Cálculo do Crédito apurado em Unidade de Medida de Produto, escriturada nos documentos e operações (Bloco “C”), referente ao CST_PIS informado no Campo 03
     */
    @Field(at = 8)
    private Double quantBcPisTot;

    /**
     * Parcela da base de cálculo do crédito em quantidade (campo 08) vinculada ao tipo de crédito escriturado em M100.
     */
    @Field(at = 9)
    private Double quantBcPis;

    /**
     * Descrição do crédito
     */
    @Field(at = 10)
    private String descCred;


}