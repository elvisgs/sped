package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M505 - Detalhamento da Base de Cálculo do Crédito
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M505"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegM505 extends RegBase {
    
    @Field(at = 2)
    private String natBcCred;
    
    @Field(at = 3)
    private String cstCofins;
    
    @Field(at = 4)
    private Double vlBcCofinsTot;
    
    @Field(at = 5)
    private Double vlBcCofinsCum;
    
    @Field(at = 6)
    private Double vlBcCofinsNc;
    
    @Field(at = 7)
    private Double vlBcCofins;
    
    @Field(at = 8)
    private Double quantBcCofinsTot;
    
    @Field(at = 9)
    private Double quantBcCofins;
    
    @Field(at = 10)
    private String descCred;
    
    
    /**
     * Obtém Código da Natureza da Base de Cálculo do Crédito apurado no período, conforme a Tabela 4.3.7
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Código da Natureza da Base de Cálculo do Crédito apurado no período, conforme a Tabela 4.3.7
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Código da Situação Tributária referente ao crédito de COFINS (Tabela 4.3.4) - Códigos 50 a 56 (créditos Básicos) e de 60 a 66 (Créditos Presumidos).
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código da Situação Tributária referente ao crédito de COFINS (Tabela 4.3.4) - Códigos 50 a 56 (créditos Básicos) e de 60 a 66 (Créditos Presumidos).
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Valor Total da Base de Cálculo escriturada nos documentos e operações (Blocos “A”, “C”, “D” e “F”), referente ao CST_COFINS informado no Campo 03
     */
    public Double getVlBcCofinsTot() {
        return vlBcCofinsTot;
    }

    /**
     * Seta Valor Total da Base de Cálculo escriturada nos documentos e operações (Blocos “A”, “C”, “D” e “F”), referente ao CST_COFINS informado no Campo 03
     */
    public void setVlBcCofinsTot(Double vlBcCofinsTot) {
        this.vlBcCofinsTot = vlBcCofinsTot;
    }
    
    /**
     * Obtém Parcela do Valor Total da Base de Cálculo informada no Campo 04, vinculada a receitas com incidência cumulativa. Campo de preenchimento específico para a pessoa jurídica sujeita ao regime cumulativo e não-cumulativo da contribuição (COD_INC_TRIB = 3 do Registro 0110)
     */
    public Double getVlBcCofinsCum() {
        return vlBcCofinsCum;
    }

    /**
     * Seta Parcela do Valor Total da Base de Cálculo informada no Campo 04, vinculada a receitas com incidência cumulativa. Campo de preenchimento específico para a pessoa jurídica sujeita ao regime cumulativo e não-cumulativo da contribuição (COD_INC_TRIB = 3 do Registro 0110)
     */
    public void setVlBcCofinsCum(Double vlBcCofinsCum) {
        this.vlBcCofinsCum = vlBcCofinsCum;
    }
    
    /**
     * Obtém Valor Total da Base de Cálculo do Crédito, vinculada a receitas com incidência não-cumulativa (Campo 04 - Campo 05)
     */
    public Double getVlBcCofinsNc() {
        return vlBcCofinsNc;
    }

    /**
     * Seta Valor Total da Base de Cálculo do Crédito, vinculada a receitas com incidência não-cumulativa (Campo 04 - Campo 05)
     */
    public void setVlBcCofinsNc(Double vlBcCofinsNc) {
        this.vlBcCofinsNc = vlBcCofinsNc;
    }
    
    /**
     * Obtém Valor da Base de Cálculo do Crédito, vinculada ao tipo de Crédito escriturado em M500.
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Valor da Base de Cálculo do Crédito, vinculada ao tipo de Crédito escriturado em M500.
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Quantidade Total da Base de Cálculo do Crédito apurado em Unidade de Medida de Produto, escriturada nos documentos e operações (Bloco “C”), referente ao CST_COFINS informado no Campo 03
     */
    public Double getQuantBcCofinsTot() {
        return quantBcCofinsTot;
    }

    /**
     * Seta Quantidade Total da Base de Cálculo do Crédito apurado em Unidade de Medida de Produto, escriturada nos documentos e operações (Bloco “C”), referente ao CST_COFINS informado no Campo 03
     */
    public void setQuantBcCofinsTot(Double quantBcCofinsTot) {
        this.quantBcCofinsTot = quantBcCofinsTot;
    }
    
    /**
     * Obtém Parcela da base de cálculo do crédito em quantidade (campo 08) vinculada ao tipo de crédito escriturado em M500.
     */
    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    /**
     * Seta Parcela da base de cálculo do crédito em quantidade (campo 08) vinculada ao tipo de crédito escriturado em M500.
     */
    public void setQuantBcCofins(Double quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    
    /**
     * Obtém Descrição do crédito
     */
    public String getDescCred() {
        return descCred;
    }

    /**
     * Seta Descrição do crédito
     */
    public void setDescCred(String descCred) {
        this.descCred = descCred;
    }
    
    
}