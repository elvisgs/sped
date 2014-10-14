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
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C470"),
    @Field(at = 12, name = "fimLinha", literal = "")
})
public class RegC470 extends Registro {
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private Double qtd;
    
    @Field(at = 4)
    private Double qtdCanc;
    
    @Field(at = 5)
    private String unid;
    
    @Field(at = 6)
    private Double vlItem;
    
    @Field(at = 7)
    private String cstIcms;
    
    @Field(at = 8)
    private String cfop;
    
    @Field(at = 9)
    private Double aliqIcms;
    
    @Field(at = 10)
    private Double vlPis;
    
    @Field(at = 11)
    private Double vlCofins;
    
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
     * Obtém Quantidade cancelada
     */
    public Double getQtdCanc() {
        return qtdCanc;
    }

    /**
     * Seta Quantidade cancelada
     */
    public void setQtdCanc(Double qtdCanc) {
        this.qtdCanc = qtdCanc;
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
     * Obtém Carga tributária ICMS(%)
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Carga tributária ICMS(%)
     */
    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
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
    
}