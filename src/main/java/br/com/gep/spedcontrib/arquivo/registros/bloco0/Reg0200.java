package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0200 - Itens (Produtos e Serviços)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0200"),
    @Field(at = 13, name = "fimLinha", literal = "")
})
public class Reg0200 extends RegBase {
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private String descrItem;
    
    @Field(at = 4)
    private String codBarra;
    
    @Field(at = 5)
    private String codAntItem;
    
    @Field(at = 6)
    private String unidInv;
    
    @Field(at = 7)
    private String tipoItem;
    
    @Field(at = 8)
    private String codNcm;
    
    @Field(at = 9)
    private String exIpi;
    
    @Field(at = 10)
    private String codGen;
    
    @Field(at = 11)
    private String codLst;
    
    @Field(at = 12)
    private Double aliqIcms;
    
    
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
     * Obtém Descrição do Item
     */
    public String getDescrItem() {
        return descrItem;
    }

    /**
     * Seta Descrição do Item
     */
    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }
    
    /**
     * Obtém Código de barra
     */
    public String getCodBarra() {
        return codBarra;
    }

    /**
     * Seta Código de barra
     */
    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
    
    /**
     * Obtém Código anterior do Item
     */
    public String getCodAntItem() {
        return codAntItem;
    }

    /**
     * Seta Código anterior do Item
     */
    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }
    
    /**
     * Obtém Unidade de medida
     */
    public String getUnidInv() {
        return unidInv;
    }

    /**
     * Seta Unidade de medida
     */
    public void setUnidInv(String unidInv) {
        this.unidInv = unidInv;
    }
    
    /**
     * Obtém Tipo do Item
     */
    public String getTipoItem() {
        return tipoItem;
    }

    /**
     * Seta Tipo do Item
     */
    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }
    
    /**
     * Obtém Código NCM
     */
    public String getCodNcm() {
        return codNcm;
    }

    /**
     * Seta Código NCM
     */
    public void setCodNcm(String codNcm) {
        this.codNcm = codNcm;
    }
    
    /**
     * Obtém Código EX
     */
    public String getExIpi() {
        return exIpi;
    }

    /**
     * Seta Código EX
     */
    public void setExIpi(String exIpi) {
        this.exIpi = exIpi;
    }
    
    /**
     * Obtém Código do gênero
     */
    public String getCodGen() {
        return codGen;
    }

    /**
     * Seta Código do gênero
     */
    public void setCodGen(String codGen) {
        this.codGen = codGen;
    }
    
    /**
     * Obtém Código do serviço
     */
    public String getCodLst() {
        return codLst;
    }

    /**
     * Seta Código do serviço
     */
    public void setCodLst(String codLst) {
        this.codLst = codLst;
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
    
    
}