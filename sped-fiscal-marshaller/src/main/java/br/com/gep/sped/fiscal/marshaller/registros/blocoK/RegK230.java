package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Itens Produzidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "K230"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegK230 extends Registro {

    @Field(at = 2)
    private Date dtIniOp;

    @Field(at = 3)
    private Date dtFinOp;

    @Field(at = 4)
    private String codDocOp;

    @Field(at = 5)
    private String codItem;

    @Field(at = 6)
    private Double qtdEnc;

    /**
     * Obtém Data de início da ordem de produção
     */
    public Date getDtIniOp() {
        return dtIniOp;
    }

    /**
     * Seta Data de início da ordem de produção
     */
    public void setDtIniOp(Date dtIniOp) {
        this.dtIniOp = dtIniOp;
    }
    /**
     * Obtém Data de conclusão da ordem de produção
     */
    public Date getDtFinOp() {
        return dtFinOp;
    }

    /**
     * Seta Data de conclusão da ordem de produção
     */
    public void setDtFinOp(Date dtFinOp) {
        this.dtFinOp = dtFinOp;
    }
    /**
     * Obtém Código de identificação da ordem de produção
     */
    public String getCodDocOp() {
        return codDocOp;
    }

    /**
     * Seta Código de identificação da ordem de produção
     */
    public void setCodDocOp(String codDocOp) {
        this.codDocOp = codDocOp;
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
     * Obtém Quantidade de produção acabada
     */
    public Double getQtdEnc() {
        return qtdEnc;
    }

    /**
     * Seta Quantidade de produção acabada
     */
    public void setQtdEnc(Double qtdEnc) {
        this.qtdEnc = qtdEnc;
    }
}
