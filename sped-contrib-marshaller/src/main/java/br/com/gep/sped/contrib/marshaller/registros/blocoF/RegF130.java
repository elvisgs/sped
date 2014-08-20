package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F130 - Bens Incorporados ao Ativo Imobilizado - Operações Geradoras de Créditos - Valor de Aquisição
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F130"),
    @Field(at = 22, name = "fimLinha", literal = "")
})
public class RegF130 extends RegBase {
    
    @Field(at = 2)
    private String natBcCred;
    
    @Field(at = 3)
    private String identBemImob;
    
    @Field(at = 4)
    private String indOrigCred;
    
    @Field(at = 5)
    private String indUtilBemImob;
    
    @Field(at = 6)
    private String mesOperAquis;
    
    @Field(at = 7)
    private Double vlOperAquis;
    
    @Field(at = 8)
    private Double parcOperNaoBcCred;
    
    @Field(at = 9)
    private Double vlBcCred;
    
    @Field(at = 10)
    private String indNrParc;
    
    @Field(at = 11)
    private String cstPis;
    
    @Field(at = 12)
    private Double vlBcPis;
    
    @Field(at = 13)
    private Double aliqPis;
    
    @Field(at = 14)
    private Double vlPis;
    
    @Field(at = 15)
    private String cstCofins;
    
    @Field(at = 16)
    private Double vlBcCofins;
    
    @Field(at = 17)
    private Double aliqCofins;
    
    @Field(at = 18)
    private Double vlCofins;
    
    @Field(at = 19)
    private String codCta;
    
    @Field(at = 20)
    private String codCcus;
    
    @Field(at = 21)
    private String descBemImob;
    
    
    /**
     * Obtém Texto fixo contendo 10 Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7.
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Texto fixo contendo 10 Código da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado, conforme a Tabela indicada no item 4.3.7.
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Identificação dos Bens Incorporados ao Ativo Imobilizado: 01 = Edificações e Benfeitorias; 03 = Instalações; 04 = Máquinas; 05 = Equipamentos; 06 = Veículos; 99 = Outras Situações
     */
    public String getIdentBemImob() {
        return identBemImob;
    }

    /**
     * Seta Identificação dos Bens Incorporados ao Ativo Imobilizado: 01 = Edificações e Benfeitorias; 03 = Instalações; 04 = Máquinas; 05 = Equipamentos; 06 = Veículos; 99 = Outras Situações
     */
    public void setIdentBemImob(String identBemImob) {
        this.identBemImob = identBemImob;
    }
    
    /**
     * Obtém Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito: 0 - Aquisição no Mercado Interno 1 - Aquisição no Mercado Externo (Importação)
     */
    public String getIndOrigCred() {
        return indOrigCred;
    }

    /**
     * Seta Indicador da origem do bem incorporado ao ativo imobilizado, gerador de crédito: 0 - Aquisição no Mercado Interno 1 - Aquisição no Mercado Externo (Importação)
     */
    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
    }
    
    /**
     * Obtém Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado: 1 - Produção de Bens Destinados a Venda; 2 - Prestação de Serviços; 3 - Locação a Terceiros; 9 - Outros.
     */
    public String getIndUtilBemImob() {
        return indUtilBemImob;
    }

    /**
     * Seta Indicador da Utilização dos Bens Incorporados ao Ativo Imobilizado: 1 - Produção de Bens Destinados a Venda; 2 - Prestação de Serviços; 3 - Locação a Terceiros; 9 - Outros.
     */
    public void setIndUtilBemImob(String indUtilBemImob) {
        this.indUtilBemImob = indUtilBemImob;
    }
    
    /**
     * Obtém Mês/Ano de Aquisição dos Bens Incorporados ao Ativo Imobilizado, com apuração de crédito com base no valor de aquisição.
     */
    public String getMesOperAquis() {
        return mesOperAquis;
    }

    /**
     * Seta Mês/Ano de Aquisição dos Bens Incorporados ao Ativo Imobilizado, com apuração de crédito com base no valor de aquisição.
     */
    public void setMesOperAquis(String mesOperAquis) {
        this.mesOperAquis = mesOperAquis;
    }
    
    /**
     * Obtém Valor de Aquisição dos Bens Incorporados ao Ativo Imobilizado - Crédito com base no valor de aquisição.
     */
    public Double getVlOperAquis() {
        return vlOperAquis;
    }

    /**
     * Seta Valor de Aquisição dos Bens Incorporados ao Ativo Imobilizado - Crédito com base no valor de aquisição.
     */
    public void setVlOperAquis(Double vlOperAquis) {
        this.vlOperAquis = vlOperAquis;
    }
    
    /**
     * Obtém Parcela do Valor de Aquisição a excluir da base de cálculo de Crédito
     */
    public Double getParcOperNaoBcCred() {
        return parcOperNaoBcCred;
    }

    /**
     * Seta Parcela do Valor de Aquisição a excluir da base de cálculo de Crédito
     */
    public void setParcOperNaoBcCred(Double parcOperNaoBcCred) {
        this.parcOperNaoBcCred = parcOperNaoBcCred;
    }
    
    /**
     * Obtém Valor da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado (07 - 08)
     */
    public Double getVlBcCred() {
        return vlBcCred;
    }

    /**
     * Seta Valor da Base de Cálculo do Crédito sobre Bens Incorporados ao Ativo Imobilizado (07 - 08)
     */
    public void setVlBcCred(Double vlBcCred) {
        this.vlBcCred = vlBcCred;
    }
    
    /**
     * Obtém Indicador do Número de Parcelas a serem apropriadas (Crédito sobre Valor de Aquisição): 1 - Integral (Mês de Aquisição); 2 - 12 Meses; 3 - 24 Meses; 4 - 48 Meses; 5 - Outra periodicidade definida em Lei.
     */
    public String getIndNrParc() {
        return indNrParc;
    }

    /**
     * Seta Indicador do Número de Parcelas a serem apropriadas (Crédito sobre Valor de Aquisição): 1 - Integral (Mês de Aquisição); 2 - 12 Meses; 3 - 24 Meses; 4 - 48 Meses; 5 - Outra periodicidade definida em Lei.
     */
    public void setIndNrParc(String indNrParc) {
        this.indNrParc = indNrParc;
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
     * Obtém Base de cálculo Mensal do Crédito de PIS/PASEP, conforme indicador informado no campo 10.
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de cálculo Mensal do Crédito de PIS/PASEP, conforme indicador informado no campo 10.
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP
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
     * Obtém Base de Cálculo Mensal do Crédito da COFINS, conforme indicador informado no campo 10.
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de Cálculo Mensal do Crédito da COFINS, conforme indicador informado no campo 10.
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Valor do crédito da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor do crédito da COFINS
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
     * Obtém Descrição complementar do bem ou grupo de bens, com crédito apurado com base no valor de aquisição.
     */
    public String getDescBemImob() {
        return descBemImob;
    }

    /**
     * Seta Descrição complementar do bem ou grupo de bens, com crédito apurado com base no valor de aquisição.
     */
    public void setDescBemImob(String descBemImob) {
        this.descBemImob = descBemImob;
    }
    
    
}