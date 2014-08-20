package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F150 - Crédito Presumido sobre Estoque de Abertura
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F150"),
    @Field(at = 15, name = "fimLinha", literal = "")
})
public class RegF150 extends RegBase {
    
    @Field(at = 2)
    private String natBcCred;
    
    @Field(at = 3)
    private Double vlTotEst;
    
    @Field(at = 4)
    private Double estImp;
    
    @Field(at = 5)
    private Double vlBcEst;
    
    @Field(at = 6)
    private Double vlBcMenEst;
    
    @Field(at = 7)
    private String cstPis;
    
    @Field(at = 8)
    private Double aliqPis;
    
    @Field(at = 9)
    private Double vlCredPis;
    
    @Field(at = 10)
    private String cstCofins;
    
    @Field(at = 11)
    private Double aliqCofins;
    
    @Field(at = 12)
    private Double vlCredCofins;
    
    @Field(at = 13)
    private String descEst;
    
    @Field(at = 14)
    private String codCta;
    
    
    /**
     * Obtém Texto fixo contendo 18 Código da Base de Cálculo do Crédito sobre Estoque de Abertura, conforme a Tabela indicada no item 4.3.7.
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Texto fixo contendo 18 Código da Base de Cálculo do Crédito sobre Estoque de Abertura, conforme a Tabela indicada no item 4.3.7.
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Valor Total do Estoque de Abertura
     */
    public Double getVlTotEst() {
        return vlTotEst;
    }

    /**
     * Seta Valor Total do Estoque de Abertura
     */
    public void setVlTotEst(Double vlTotEst) {
        this.vlTotEst = vlTotEst;
    }
    
    /**
     * Obtém Parcela do estoque de abertura referente a bens, produtos e mercadorias importados, ou adquiridas no mercado interno sem direito ao crédito
     */
    public Double getEstImp() {
        return estImp;
    }

    /**
     * Seta Parcela do estoque de abertura referente a bens, produtos e mercadorias importados, ou adquiridas no mercado interno sem direito ao crédito
     */
    public void setEstImp(Double estImp) {
        this.estImp = estImp;
    }
    
    /**
     * Obtém Valor da Base de Cálculo do Crédito sobre o Estoque de Abertura (03 - 04)
     */
    public Double getVlBcEst() {
        return vlBcEst;
    }

    /**
     * Seta Valor da Base de Cálculo do Crédito sobre o Estoque de Abertura (03 - 04)
     */
    public void setVlBcEst(Double vlBcEst) {
        this.vlBcEst = vlBcEst;
    }
    
    /**
     * Obtém Valor da Base de Cálculo Mensal do Crédito sobre o Estoque de Abertura (1/12 avos do campo 05)
     */
    public Double getVlBcMenEst() {
        return vlBcMenEst;
    }

    /**
     * Seta Valor da Base de Cálculo Mensal do Crédito sobre o Estoque de Abertura (1/12 avos do campo 05)
     */
    public void setVlBcMenEst(Double vlBcMenEst) {
        this.vlBcMenEst = vlBcMenEst;
    }
    
    /**
     * Obtém Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3
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
     * Obtém Valor Mensal do Crédito Presumido Apurado -  PIS/PASEP  (06 x 08)
     */
    public Double getVlCredPis() {
        return vlCredPis;
    }

    /**
     * Seta Valor Mensal do Crédito Presumido Apurado -  PIS/PASEP  (06 x 08)
     */
    public void setVlCredPis(Double vlCredPis) {
        this.vlCredPis = vlCredPis;
    }
    
    /**
     * Obtém Código da Situação Tributária referente ao COFINS, conforme a Tabela indicada no item 4.3.4
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código da Situação Tributária referente ao COFINS, conforme a Tabela indicada no item 4.3.4
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Alíquota do COFINS (em percentual)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota do COFINS (em percentual)
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Valor Mensal do Crédito Presumido Apurado -  COFINS (06 x 11)
     */
    public Double getVlCredCofins() {
        return vlCredCofins;
    }

    /**
     * Seta Valor Mensal do Crédito Presumido Apurado -  COFINS (06 x 11)
     */
    public void setVlCredCofins(Double vlCredCofins) {
        this.vlCredCofins = vlCredCofins;
    }
    
    /**
     * Obtém Descrição do estoque
     */
    public String getDescEst() {
        return descEst;
    }

    /**
     * Seta Descrição do estoque
     */
    public void setDescEst(String descEst) {
        this.descEst = descEst;
    }
    
    /**
     * Obtém Código da conta analítica contábil debitada/creditada
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica contábil debitada/creditada
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}