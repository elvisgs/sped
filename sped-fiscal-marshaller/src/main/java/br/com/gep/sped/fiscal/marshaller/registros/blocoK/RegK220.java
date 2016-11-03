package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Outras Movimentações Internas entre Mercadorias
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "K220"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class RegK220 extends Registro {

    @Field(at = 2)
    private Date dtMov;

    @Field(at = 3)
    private String codItemOri;

    @Field(at = 4)
    private String codItemDest;

    @Field(at = 5)
    private Double qtd;

    /**
     * Obtém Data da movimentação interna
     */
    public Date getDtMov() {
        return dtMov;
    }

    /**
     * Seta Data da movimentação interna
     */
    public void setDtMov(Date dtMov) {
        this.dtMov = dtMov;
    }
    /**
     * Obtém Código do item de origem
     */
    public String getCodItemOri() {
        return codItemOri;
    }

    /**
     * Seta Código do item de origem
     */
    public void setCodItemOri(String codItemOri) {
        this.codItemOri = codItemOri;
    }
    /**
     * Obtém Código do item de destino
     */
    public String getCodItemDest() {
        return codItemDest;
    }

    /**
     * Seta Código do item de destino
     */
    public void setCodItemDest(String codItemDest) {
        this.codItemDest = codItemDest;
    }
    /**
     * Obtém Quantidade movimentadado item de origem
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade movimentadado item de origem
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
