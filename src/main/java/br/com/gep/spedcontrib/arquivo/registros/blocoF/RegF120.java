package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F120 - Bens Incorporados ao Ativo Imobilizado - Operações Geradoras de Créditos - Encargos de Depreciação/Amortização
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F120"),
    @Field(at = 19, name = "fimLinha", literal = "")
})
public class RegF120 extends RegBase {
    
    @Field(at = 2)
    private String natBcCred;
    
    @Field(at = 3)
    private String identBemImob;
    
    @Field(at = 4)
    private String indOrigCred;
    
    @Field(at = 5)
    private String indUtilBemImob;
    
    @Field(at = 6)
    private Double vlOperDep;
    
    @Field(at = 7)
    private Double parcOperNaoBcCred;
    
    @Field(at = 8)
    private String cstPis;
    
    @Field(at = 9)
    private Double vlBcPis;
    
    @Field(at = 10)
    private Double aliqPis;
    
    @Field(at = 11)
    private Double vlPis;
    
    @Field(at = 12)
    private String cstCofins;
    
    @Field(at = 13)
    private Double vlBcCofins;
    
    @Field(at = 14)
    private Double aliqCofins;
    
    @Field(at = 15)
    private Double vlCofins;
    
    @Field(at = 16)
    private String codCta;
    
    @Field(at = 17)
    private String codCcus;
    
    @Field(at = 18)
    private String descBemImob;
    
    
    /**
     * Obtém Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Identificação dos Bens Incorporados ao Ativo Imobilizado
     */
    public String getIdentBemImob() {
        return identBemImob;
    }

    /**
     * Seta Identificação dos Bens Incorporados ao Ativo Imobilizado
     */
    public void setIdentBemImob(String identBemImob) {
        this.identBemImob = identBemImob;
    }
    
    /**
     * Obtém Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito
     */
    public String getIndOrigCred() {
        return indOrigCred;
    }

    /**
     * Seta Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito
     */
    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    
    /**
     * Obtém Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado
     */
    public String getIndUtilBemImob() {
        return indUtilBemImob;
    }

    /**
     * Seta Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado
     */
    public void setIndUtilBemImob(String indUtilBemImob) {
        this.indUtilBemImob = indUtilBemImob;
    }
    
    /**
     * Obtém Valor do Encargo de Depreciação/Amortização Incorrido no Período
     */
    public Double getVlOperDep() {
        return vlOperDep;
    }

    /**
     * Seta Valor do Encargo de Depreciação/Amortização Incorrido no Período
     */
    public void setVlOperDep(Double vlOperDep) {
        this.vlOperDep = vlOperDep;
    }
    
    /**
     * Obtém Parcela do Valor do Encargo de Depreciação/Amortização a excluir da base de cálculo de Crédito
     */
    public Double getParcOperNaoBcCred() {
        return parcOperNaoBcCred;
    }

    /**
     * Seta Parcela do Valor do Encargo de Depreciação/Amortização a excluir da base de cálculo de Crédito
     */
    public void setParcOperNaoBcCred(Double parcOperNaoBcCred) {
        this.parcOperNaoBcCred = parcOperNaoBcCred;
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
     * Obtém Base de Cálculo do Crédito de PIS/PASEP no período (06 - 07)
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de Cálculo do Crédito de PIS/PASEP no período (06 - 07)
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
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
     * Obtém Valor do Crédito de PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do Crédito de PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Base de Cálculo do Crédito da COFINS no período
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de Cálculo do Crédito da COFINS no período
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
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
     * Obtém Valor do Crédito da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor do Crédito da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
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
    
    /**
     * Obtém Código do Centro de Custos
     */
    public String getCodCcus() {
        return codCcus;
    }

    /**
     * Seta Código do Centro de Custos
     */
    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    
    /**
     * Obtém Descrição complementar do bem ou grupo de bens, com crédito apurado com base nos encargos de depreciação ou amortização.
     */
    public String getDescBemImob() {
        return descBemImob;
    }

    /**
     * Seta Descrição complementar do bem ou grupo de bens, com crédito apurado com base nos encargos de depreciação ou amortização.
     */
    public void setDescBemImob(String descBemImob) {
        this.descBemImob = descBemImob;
    }
    
    
}