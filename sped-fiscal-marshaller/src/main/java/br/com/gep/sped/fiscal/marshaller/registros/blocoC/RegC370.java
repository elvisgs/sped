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
    @Field(at = 1, name = "reg", rid = true, literal = "C370"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegC370 extends Registro {
    
    @Field(at = 2)
    private String numItem;
    
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
    
    /**
     * Obtém Número Sequencial
     */
    public String getNumItem() {
        return numItem;
    }

    /**
     * Seta Número Sequencial
     */
    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }
    
    /**
     * Obtém Código do Item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do Item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
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
     * Obtém Valor total do item
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor total do item
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
    
}