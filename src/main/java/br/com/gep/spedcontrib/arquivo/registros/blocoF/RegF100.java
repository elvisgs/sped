package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F100 - Demais Documentos e Operações Geradoras de Contribuição e Créditos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F100"),
    @Field(at = 20, name = "fimLinha", literal = "")
})
public class RegF100 extends Registro {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String codPart;
    
    @Field(at = 4)
    private String codItem;
    
    @Field(at = 5)
    private Date dtOper;
    
    @Field(at = 6)
    private Double vlOper;
    
    @Field(at = 7)
    private String cstPis;
    
    @Field(at = 8)
    private Double vlBcPis;
    
    @Field(at = 9)
    private Double aliqPis;
    
    @Field(at = 10)
    private Double vlPis;
    
    @Field(at = 11)
    private String cstCofins;
    
    @Field(at = 12)
    private Double vlBcCofins;
    
    @Field(at = 13)
    private Double aliqCofins;
    
    @Field(at = 14)
    private Double vlCofins;
    
    @Field(at = 15)
    private String natBcCred;
    
    @Field(at = 16)
    private String indOrigCred;
    
    @Field(at = 17)
    private String codCta;
    
    @Field(at = 18)
    private String codCcus;
    
    @Field(at = 19)
    private String descDocOper;
    
    
    /**
     * Obtém Indicador do Tipo da Operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Indicador do Tipo da Operação
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Código do participante (Campo 02 do Registro 0150)
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do participante (Campo 02 do Registro 0150)
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Código do item (campo 02 do Registro 0200)
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item (campo 02 do Registro 0200)
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Data da Operação (ddmmaaaa)
     */
    public Date getDtOper() {
        return dtOper;
    }

    /**
     * Seta Data da Operação (ddmmaaaa)
     */
    public void setDtOper(Date dtOper) {
        this.dtOper = dtOper;
    }
    
    /**
     * Obtém Valor da Operação
     */
    public Double getVlOper() {
        return vlOper;
    }

    /**
     * Seta Valor da Operação
     */
    public void setVlOper(Double vlOper) {
        this.vlOper = vlOper;
    }
    
    /**
     * Obtém Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3 (IN RFB nº 1.009, de 2010)
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta Código da Situação Tributária referente ao PIS/PASEP, conforme a Tabela indicada no item 4.3.3 (IN RFB nº 1.009, de 2010)
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Base de Cálculo do PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de Cálculo do PIS/PASEP
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
     * Obtém Valor do PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4 (IN RFB nº 1.009, de 2010)
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código da Situação Tributária referente a COFINS, conforme a Tabela indicada no item 4.3.4 (IN RFB nº 1.009, de 2010)
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Base de Cálculo da COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de Cálculo da COFINS
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
     * Obtém Valor da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7 (Lei nº 12.058/09. art. 35).
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Código da Natureza da Base de Cálculo do Crédito, conforme a Tabela indicada no item 4.3.7 (Lei nº 12.058/09. art. 35).
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Indicador da origem do crédito
     */
    public String getIndOrigCred() {
        return indOrigCred;
    }

    /**
     * Seta Indicador da origem do crédito
     */
    public void setIndOrigCred(String indOrigCred) {
        this.indOrigCred = indOrigCred;
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
     * Obtém Descrição do Documento/Operação
     */
    public String getDescDocOper() {
        return descDocOper;
    }

    /**
     * Seta Descrição do Documento/Operação
     */
    public void setDescDocOper(String descDocOper) {
        this.descDocOper = descDocOper;
    }
    
    
}