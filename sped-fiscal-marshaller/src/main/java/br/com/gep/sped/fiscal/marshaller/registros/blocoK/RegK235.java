package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Insumos Consumidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K235"),
    @Field(at = 6, name = "fimLinha")
})
public class RegK235 extends Registro {

    @Field(at = 2)
    private Date dtSaida;

    @Field(at = 3)
    private String codItem;

    @Field(at = 4)
    private Double qtd;

    @Field(at = 5)
    private String codInsSubst;

    /**
     * Obtém Data de saída
     */
    public Date getDtSaida() {
        return dtSaida;
    }

    /**
     * Seta Data de saída
     */
    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }
    /**
     * Obtém Código do item componente/insumo
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item componente/insumo
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    /**
     * Obtém Quantidade consumida do item
     */
    public Double getQtd() {
        return qtd;
    }

    /**
     * Seta Quantidade consumida do item
     */
    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }
    /**
     * Obtém Código do insumo que foi substituído
     */
    public String getCodInsSubst() {
        return codInsSubst;
    }

    /**
     * Seta Código do insumo que foi substituído
     */
    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
    }
}
