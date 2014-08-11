package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C170 - Itens do Documento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C170"),
    @Field(at = 38, name = "fimLinha", literal = "")
})
public class RegC170 {
    
    @Field(at = 2)
    private String numItem;
    
    @Field(at = 3)
    private String codItem;
    
    @Field(at = 4)
    private String descrCompl;
    
    @Field(at = 5)
    private Double qtd;
    
    @Field(at = 6)
    private String unid;
    
    @Field(at = 7)
    private Double vlItem;
    
    @Field(at = 8)
    private Double vlDesc;
    
    @Field(at = 9)
    private String indMov;
    
    @Field(at = 10)
    private String cstIcms;
    
    @Field(at = 11)
    private String cfop;
    
    @Field(at = 12)
    private String codNat;
    
    @Field(at = 13)
    private Double vlBcIcms;
    
    @Field(at = 14)
    private Double aliqIcms;
    
    @Field(at = 15)
    private Double vlIcms;
    
    @Field(at = 16)
    private Double vlBcIcmsSt;
    
    @Field(at = 17)
    private Double aliqSt;
    
    @Field(at = 18)
    private Double vlIcmsSt;
    
    @Field(at = 19)
    private String indApur;
    
    @Field(at = 20)
    private String cstIpi;
    
    @Field(at = 21)
    private String codEnq;
    
    @Field(at = 22)
    private Double vlBcIpi;
    
    @Field(at = 23)
    private Double aliqIpi;
    
    @Field(at = 24)
    private Double vlIpi;
    
    @Field(at = 25)
    private String cstPis;
    
    @Field(at = 26)
    private Double vlBcPis;
    
    @Field(at = 27)
    private Double aliqPis;
    
    @Field(at = 28)
    private Double quantBcPis;
    
    @Field(at = 29)
    private Double aliqPisQuant;
    
    @Field(at = 30)
    private Double vlPis;
    
    @Field(at = 31)
    private String cstCofins;
    
    @Field(at = 32)
    private Double vlBcCofins;
    
    @Field(at = 33)
    private Double aliqCofins;
    
    @Field(at = 34)
    private Double quantBcCofins;
    
    @Field(at = 35)
    private Double aliqCofinsQuant;
    
    @Field(at = 36)
    private Double vlCofins;
    
    @Field(at = 37)
    private String codCta;
    
    
    /**
     * Obtém Número sequencial
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Seta Número sequencial
     */
    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }
    
    /**
     * Obtém Item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getDescrCompl() {
        return descrCompl;
    }

    /**
     * Seta Descrição complementar
     */
    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }
    
    /**
     * Obtém Quantidade
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
    
    /**
     * Obtém Unidade
     */
    public String getUnid() {
        return unid;
    }

    /**
     * Seta Unidade
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }
    
    /**
     * Obtém Valor total
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor total
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Valor do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor do desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Movimentação física
     */
    public String getIndMov() {
        return indMov;
    }

    /**
     * Seta Movimentação física
     */
    public void setIndMov(String indMov) {
        this.indMov = indMov;
    }
    
    /**
     * Obtém CST ICMS
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta CST ICMS
     */
    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }
    
    /**
     * Obtém CFOP
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta CFOP
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }
    
    /**
     * Obtém Natureza da operação
     */
    public String getCodNat() {
        return codNat;
    }

    /**
     * Seta Natureza da operação
     */
    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }
    
    /**
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Alíquota do ICMS
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Alíquota do ICMS
     */
    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Base de cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Alíquota do ICMS ST
     */
    public Double getAliqSt() {
        return aliqSt;
    }

    /**
     * Seta Alíquota do ICMS ST
     */
    public void setAliqSt(Double aliqSt) {
        this.aliqSt = aliqSt;
    }
    
    /**
     * Obtém Valor do ICMS ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Período de apuração do IPI
     */
    public String getIndApur() {
        return indApur;
    }

    /**
     * Seta Período de apuração do IPI
     */
    public void setIndApur(String indApur) {
        this.indApur = indApur;
    }
    
    /**
     * Obtém CST IPI
     */
    public String getCstIpi() {
        return cstIpi;
    }

    /**
     * Seta CST IPI
     */
    public void setCstIpi(String cstIpi) {
        this.cstIpi = cstIpi;
    }
    
    /**
     * Obtém Código de enquadramento do IPI
     */
    public String getCodEnq() {
        return codEnq;
    }

    /**
     * Seta Código de enquadramento do IPI
     */
    public void setCodEnq(String codEnq) {
        this.codEnq = codEnq;
    }
    
    /**
     * Obtém Base de cálculo do IPI
     */
    public Double getVlBcIpi() {
        return vlBcIpi;
    }

    /**
     * Seta Base de cálculo do IPI
     */
    public void setVlBcIpi(Double vlBcIpi) {
        this.vlBcIpi = vlBcIpi;
    }
    
    /**
     * Obtém Alíquota do IPI
     */
    public Double getAliqIpi() {
        return aliqIpi;
    }

    /**
     * Seta Alíquota do IPI
     */
    public void setAliqIpi(Double aliqIpi) {
        this.aliqIpi = aliqIpi;
    }
    
    /**
     * Obtém Valor do IPI
     */
    public Double getVlIpi() {
        return vlIpi;
    }

    /**
     * Seta Valor do IPI
     */
    public void setVlIpi(Double vlIpi) {
        this.vlIpi = vlIpi;
    }
    
    /**
     * Obtém CST PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Base de cálculo PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de cálculo PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota PIS/PASEP
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota PIS/PASEP
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    
    /**
     * Obtém Base de cálculo em quantidade PIS/PASEP
     */
    public Double getQuantBcPis() {
        return quantBcPis;
    }

    /**
     * Seta Base de cálculo em quantidade PIS/PASEP
     */
    public void setQuantBcPis(Double quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    
    /**
     * Obtém Alíquota PIS/PASEP (em reais)
     */
    public Double getAliqPisQuant() {
        return aliqPisQuant;
    }

    /**
     * Seta Alíquota PIS/PASEP (em reais)
     */
    public void setAliqPisQuant(Double aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    
    /**
     * Obtém Valor PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém CST COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Base de cálculo COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de cálculo COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota COFINS
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota COFINS
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Base de cálculo em quantidade COFINS
     */
    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    /**
     * Seta Base de cálculo em quantidade COFINS
     */
    public void setQuantBcCofins(Double quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    
    /**
     * Obtém Alíquota COFINS (em reais)
     */
    public Double getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    /**
     * Seta Alíquota COFINS (em reais)
     */
    public void setAliqCofinsQuant(Double aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    
    /**
     * Obtém Valor COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém Conta analítica contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta analítica contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}