package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Industrialização em Terceiros – Insumos Consumidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "K255"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class RegK255 extends Registro {

    @Field(at = 2)
    private Date dtCons;

    @Field(at = 3)
    private String codItem;

    @Field(at = 4)
    private Double qtd;

    @Field(at = 5)
    private String codInsSubst;

    /**
     * Obtém Data do reconhecimento do consumo do insumo
     */
    public Date getDtCons() {
        return dtCons;
    }

    /**
     * Seta Data do reconhecimento do consumo do insumo
     */
    public void setDtCons(Date dtCons) {
        this.dtCons = dtCons;
    }
    /**
     * Obtém Código do insumo
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do insumo
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    /**
     * Obtém Quantidade de consumo do insumo
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade de consumo do insumo
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
    /**
     * Obtém Código do insumo que foi substituído, caso ocorra a substituição
     */
    public String getCodInsSubst() {
        return codInsSubst;
    }

    /**
     * Seta Código do insumo que foi substituído, caso ocorra a substituição
     */
    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
    }
}
