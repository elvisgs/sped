package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Industrialização Efetuada por Terceiros – Itens Produzidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "K250"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegK250 extends Registro {

    @Field(at = 2)
    private Date dtProd;

    @Field(at = 3)
    private String codItem;

    @Field(at = 4)
    private Double qtd;

    /**
     * Obtém Data do reconhecimento da produção ocorrida no terceiro
     */
    public Date getDtProd() {
        return dtProd;
    }

    /**
     * Seta Data do reconhecimento da produção ocorrida no terceiro
     */
    public void setDtProd(Date dtProd) {
        this.dtProd = dtProd;
    }
    /**
     * Obtém Código do item produzido
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item produzido
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    /**
     * Obtém Quantidade produzida
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade produzida
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
}
