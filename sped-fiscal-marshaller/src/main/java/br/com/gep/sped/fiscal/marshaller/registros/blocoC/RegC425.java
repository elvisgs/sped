package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Resumo dos Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C425"),
    @Field(at = 8, name = "fimLinha")
})
public class RegC425 extends Registro {
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private Double qtd;
    
    @Field(at = 4)
    private String unid;
    
    @Field(at = 5)
    private Double vlItem;
    
    @Field(at = 6)
    private Double vlPis;
    
    @Field(at = 7)
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
     * Obtém Quantidade acumulada do item
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade acumulada do item
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