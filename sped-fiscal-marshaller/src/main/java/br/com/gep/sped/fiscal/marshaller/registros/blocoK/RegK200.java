package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Estoque Escriturado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "K200"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegK200 extends Registro {

    @Field(at = 2)
    private Date dtEst;

    @Field(at = 3)
    private String codItem;

    @Field(at = 4)
    private Double qtd;

    @Field(at = 5)
    private String indEst;

    @Field(at = 6)
    private String codPart;

    /**
     * Obtém Data do estoque final
     */
    public Date getDtEst() {
        return dtEst;
    }

    /**
     * Seta Data do estoque final
     */
    public void setDtEst(Date dtEst) {
        this.dtEst = dtEst;
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
     * Obtém Quantidade em estoque
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade em estoque
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
    /**
     * Obtém Indicador do tipo de estoque
     */
    public String getIndEst() {
        return indEst;
    }

    /**
     * Seta Indicador do tipo de estoque
     * <p>0&#x3D;Estoque de propriedade do informante e em seu poder;1&#x3D;Estoque de propriedade do informante e em posse de terceiros;2&#x3D;Estoque de propriedade de terceiros e em posse do informante</p>
     */
    public void setIndEst(String indEst) {
        this.indEst = indEst;
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
}
