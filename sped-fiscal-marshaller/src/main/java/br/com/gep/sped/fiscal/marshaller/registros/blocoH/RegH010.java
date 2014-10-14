package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * INVENTÁRIO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "H010"),
    @Field(at = 11, name = "fimLinha", literal = "")
})
public class RegH010 extends Registro {
    
    @Field(at = 2)
    private String codItem;
    
    @Field(at = 3)
    private String unid;
    
    @Field(at = 4)
    private Double qtd;
    
    @Field(at = 5)
    private Double vlUnit;
    
    @Field(at = 6)
    private Double vlItem;
    
    @Field(at = 7)
    private String indProp;
    
    @Field(at = 8)
    private String codPart;
    
    @Field(at = 9)
    private String txtCompl;
    
    @Field(at = 10)
    private String codCta;
    
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
     * Obtém Valor unitário do item
     */
    public Double getVlUnit() {
        return vlUnit;
    }

    /**
     * Seta Valor unitário do item
     */
    public void setVlUnit(Double vlUnit) {
        this.vlUnit = vlUnit;
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
     * Obtém Indicador de propriedade/posse
     */
    public String getIndProp() {
        return indProp;
    }

    /**
     * Seta Indicador de propriedade/posse
     * <p>0=Item de propriedade do informante e em seu poder;1=Item de propriedade do informante em posse de terceiros;2=Item de propriedade de terceiros em posse do informante</p>
     */
    public void setIndProp(String indProp) {
        this.indProp = indProp;
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
     * Obtém Descrição complementar
     */
    public String getTxtCompl() {
        return txtCompl;
    }

    /**
     * Seta Descrição complementar
     */
    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
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