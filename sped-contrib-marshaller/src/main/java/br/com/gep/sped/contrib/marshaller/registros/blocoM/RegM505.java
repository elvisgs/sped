package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M505 - Detalhamento da Base de Cálculo do Crédito
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M505"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegM505 extends Registro {

    /**
     * Código da Natureza da Base de Cálculo do Crédito apurado no período, conforme a Tabela 4.3.7
     */
    @Field(at = 2)
    private String natBcCred;

    /**
     * Código da Situação Tributária referente ao crédito de COFINS (Tabela 4.3.4) - Códigos 50 a 56 (créditos Básicos) e de 60 a 66 (Créditos Presumidos).
     */
    @Field(at = 3)
    private String cstCofins;

    /**
     * Valor Total da Base de Cálculo escriturada nos documentos e operações (Blocos “A”, “C”, “D” e “F”), referente ao CST_COFINS informado no Campo 03
     */
    @Field(at = 4)
    private Double vlBcCofinsTot;

    /**
     * Parcela do Valor Total da Base de Cálculo informada no Campo 04, vinculada a receitas com incidência cumulativa. Campo de preenchimento específico para a pessoa jurídica sujeita ao regime cumulativo e não-cumulativo da contribuição (COD_INC_TRIB = 3 do Registro 0110)
     */
    @Field(at = 5)
    private Double vlBcCofinsCum;

    /**
     * Valor Total da Base de Cálculo do Crédito, vinculada a receitas com incidência não-cumulativa (Campo 04 - Campo 05)
     */
    @Field(at = 6)
    private Double vlBcCofinsNc;

    /**
     * Valor da Base de Cálculo do Crédito, vinculada ao tipo de Crédito escriturado em M500.
     */
    @Field(at = 7)
    private Double vlBcCofins;

    /**
     * Quantidade Total da Base de Cálculo do Crédito apurado em Unidade de Medida de Produto, escriturada nos documentos e operações (Bloco “C”), referente ao CST_COFINS informado no Campo 03
     */
    @Field(at = 8)
    private Double quantBcCofinsTot;

    /**
     * Parcela da base de cálculo do crédito em quantidade (campo 08) vinculada ao tipo de crédito escriturado em M500.
     */
    @Field(at = 9)
    private Double quantBcCofins;

    /**
     * Descrição do crédito
     */
    @Field(at = 10)
    private String descCred;


}