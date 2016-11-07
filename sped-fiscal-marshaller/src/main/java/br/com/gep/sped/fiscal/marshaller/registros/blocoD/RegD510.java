package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D510"),
    @Field(at = 21, name = "fimLinha")
})
public class RegD510 extends Registro {
    
    @Field(at = 2)
    private String numItem;
    
    @Field(at = 3)
    private String codItem;
    
    @Field(at = 4)
    private String codClass;
    
    @Field(at = 5)
    private Double qtd;
    
    @Field(at = 6)
    private String unid;
    
    @Field(at = 7)
    private Double vlItem;
    
    @Field(at = 8)
    private Double vlDesc;
    
    @Field(at = 9)
    private String cstIcms;
    
    @Field(at = 10)
    private String cfop;
    
    @Field(at = 11)
    private Double vlBcIcms;
    
    @Field(at = 12)
    private Double aliqIcms;
    
    @Field(at = 13)
    private Double vlIcms;
    
    @Field(at = 14)
    private Double vlBcIcmsSt;
    
    @Field(at = 15)
    private Double vlIcmsSt;
    
    @Field(at = 16)
    private String indRec;
    
    @Field(at = 17)
    private String codPart;
    
    @Field(at = 18)
    private Double vlPis;
    
    @Field(at = 19)
    private Double vlCofins;
    
    @Field(at = 20)
    private String codCta;
    
    /**
     * Obtém Número seqüencial do item
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Seta Número seqüencial do item
     */
    public void setNumItem(String numItem) {
        this.numItem = numItem;
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
     * Obtém Quantidade do item
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade do item
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
     * Obtém Valor do item
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor do item
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém Valor total do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor total do desconto
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
     * Obtém Base de cálculo do ICMS de outras UFs
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS de outras UFs
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS retido por outras UFs
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS retido por outras UFs
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Tipo de receita
     */
    public String getIndRec() {
        return indRec;
    }

    /**
     * Seta Tipo de receita
     * <p>0=Receita própria - serviços prestados;1=Receita própria - cobrança de débitos;2=Receita própria - venda de mercadorias;3=Receita própria - venda de serviço pré-pago;4=Outras receitas próprias;5Receitas de terceiros (co-faturamento);9=Outras receitas de terceiros</p>
     */
    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }
    
    /**
     * Obtém Código do participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
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