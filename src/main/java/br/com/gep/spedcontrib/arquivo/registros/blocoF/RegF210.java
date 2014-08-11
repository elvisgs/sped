package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F210 - Custo Orçado da Unidade Imobiliária Vendida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F210"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegF210 {
    
    @Field(at = 2)
    private Double vlCusOrc;
    
    @Field(at = 3)
    private Double vlExc;
    
    @Field(at = 4)
    private Double vlCusOrcAju;
    
    @Field(at = 5)
    private Double vlBcCred;
    
    @Field(at = 6)
    private String cstPis;
    
    @Field(at = 7)
    private Double aliqPis;
    
    @Field(at = 8)
    private Double vlCredPisUtil;
    
    @Field(at = 9)
    private String cstCofins;
    
    @Field(at = 10)
    private Double aliqCofins;
    
    @Field(at = 11)
    private Double vlCredCofinsUtil;
    
    
    /**
     * Obtém Valor Total do Custo Orçado para Conclusão da Unidade Vendida
     */
    public Double getVlCusOrc() {
        return vlCusOrc;
    }

    /**
     * Seta Valor Total do Custo Orçado para Conclusão da Unidade Vendida
     */
    public void setVlCusOrc(Double vlCusOrc) {
        this.vlCusOrc = vlCusOrc;
    }
    
    /**
     * Obtém Valores Referentes a Pagamentos a Pessoas Físicas, Encargos Trabalhistas, Sociais e Previdenciários e à aquisição de bens e serviços não sujeitos ao pagamento das contribuições
     */
    public Double getVlExc() {
        return vlExc;
    }

    /**
     * Seta Valores Referentes a Pagamentos a Pessoas Físicas, Encargos Trabalhistas, Sociais e Previdenciários e à aquisição de bens e serviços não sujeitos ao pagamento das contribuições
     */
    public void setVlExc(Double vlExc) {
        this.vlExc = vlExc;
    }
    
    /**
     * Obtém Valor da Base de Calculo do Crédito sobre o Custo Orçado Ajustado (Campo 02 - 03).
     */
    public Double getVlCusOrcAju() {
        return vlCusOrcAju;
    }

    /**
     * Seta Valor da Base de Calculo do Crédito sobre o Custo Orçado Ajustado (Campo 02 - 03).
     */
    public void setVlCusOrcAju(Double vlCusOrcAju) {
        this.vlCusOrcAju = vlCusOrcAju;
    }
    
    /**
     * Obtém Valor da Base de Cálculo do Crédito sobre o Custo Orçado no Período
     */
    public Double getVlBcCred() {
        return vlBcCred;
    }

    /**
     * Seta Valor da Base de Cálculo do Crédito sobre o Custo Orçado no Período
     */
    public void setVlBcCred(Double vlBcCred) {
        this.vlBcCred = vlBcCred;
    }
    
    /**
     * Obtém Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3.
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP (em percentual)
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP (em percentual)
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    
    /**
     * Obtém Valor do Crédito sobre o custo orçado a ser utilizado no período da escrituração - PIS/PASEP
     */
    public Double getVlCredPisUtil() {
        return vlCredPisUtil;
    }

    /**
     * Seta Valor do Crédito sobre o custo orçado a ser utilizado no período da escrituração - PIS/PASEP
     */
    public void setVlCredPisUtil(Double vlCredPisUtil) {
        this.vlCredPisUtil = vlCredPisUtil;
    }
    
    /**
     * Obtém Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4.
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS (em percentual)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS (em percentual)
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Valor do Crédito sobre o custo orçado a ser utilizado no período da escrituração - COFINS
     */
    public Double getVlCredCofinsUtil() {
        return vlCredCofinsUtil;
    }

    /**
     * Seta Valor do Crédito sobre o custo orçado a ser utilizado no período da escrituração - COFINS
     */
    public void setVlCredCofinsUtil(Double vlCredCofinsUtil) {
        this.vlCredCofinsUtil = vlCredCofinsUtil;
    }
    
    
}