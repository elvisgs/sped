package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Exportação Indireta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1110"),
    @Field(at = 11, name = "fimLinha")
})
public class Reg1110 extends Registro {
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private String codMod;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String numDoc;
    
    @Field(at = 6)
    private Date dtDoc;
    
    @Field(at = 7)
    private String chvNfe;
    
    @Field(at = 8)
    private Integer nrMemo;
    
    @Field(at = 9)
    private Double qtd;
    
    @Field(at = 10)
    private String unid;
    
    /**
     * Obtém Código do participante-fornecedor
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Código do participante-fornecedor
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>01=Nota Fiscal;1B=Nota Fiscal Avulsa;04=Nota Fiscal de Produtor;55=Nota Fiscal Eletrônica</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série do documento fiscal
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série do documento fiscal
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Número do documento fiscal
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento fiscal
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Data da emissão
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da emissão
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Chave da NFe
     */
    public String getChvNfe() {
        return chvNfe;
    }

    /**
     * Seta Chave da NFe
     */
    public void setChvNfe(String chvNfe) {
        this.chvNfe = chvNfe;
    }
    
    /**
     * Obtém Número do Memorando Exp
     */
    public Integer getNrMemo() {
        return nrMemo;
    }

    /**
     * Seta Número do Memorando Exp
     */
    public void setNrMemo(Integer nrMemo) {
        this.nrMemo = nrMemo;
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
    
}