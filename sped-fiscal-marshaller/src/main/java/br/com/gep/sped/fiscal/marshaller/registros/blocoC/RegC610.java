package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C610"),
    @Field(at = 18, name = "fimLinha")
})
public class RegC610 extends Registro {
    
    @Field(at = 2)
    private String codClass;
    
    @Field(at = 3)
    private String codItem;
    
    @Field(at = 4)
    private Double qtd;
    
    @Field(at = 5)
    private String unid;
    
    @Field(at = 6)
    private Double vlItem;
    
    @Field(at = 7)
    private Double vlDesc;
    
    @Field(at = 8)
    private String cstIcms;
    
    @Field(at = 9)
    private String cfop;
    
    @Field(at = 10)
    private Double aliqIcms;
    
    @Field(at = 11)
    private Double vlBcIcms;
    
    @Field(at = 12)
    private Double vlIcms;
    
    @Field(at = 13)
    private Double vlBcIcmsSt;
    
    @Field(at = 14)
    private Double vlIcmsSt;
    
    @Field(at = 15)
    private Double vlPis;
    
    @Field(at = 16)
    private Double vlCofins;
    
    @Field(at = 17)
    private String codCta;
    
    /**
     * Obtém Código de classificação
     */
    public String getCodClass() {
        return codClass;
    }

    /**
     * Seta Código de classificação
     */
    public void setCodClass(String codClass) {
        this.codClass = codClass;
    }
    
    /**
     * Obtém Código do item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Quantidade acumulada
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade acumulada
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
    
    /**
     * Obtém Unidade do item
     */
    public String getUnid() {
        return unid;
    }

    /**
     * Seta Unidade do item
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }
    
    /**
     * Obtém Valor acumulado do item
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor acumulado do item
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Valor acumulado dos descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor acumulado dos descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém CST/ICMS
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta CST/ICMS
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
     * Obtém Alíquota do ICMS(%)
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Alíquota do ICMS(%)
     */
    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
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
     * Obtém Valor do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
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
     * Obtém Código da conta analítica
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}