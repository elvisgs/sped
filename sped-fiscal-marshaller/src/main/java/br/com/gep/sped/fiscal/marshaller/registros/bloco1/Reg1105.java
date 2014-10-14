package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc Fiscal de Exportação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1105"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class Reg1105 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private String numDoc;
    
    @Field(at = 5)
    private String chvNfe;
    
    @Field(at = 6)
    private Date dtDoc;
    
    @Field(at = 7)
    private String codItem;
    
    /**
     * Obtém Código do modelo da NF
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo da NF
     * <p>01=Nota Fiscal;55=Nota Fiscal Eletrônica</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série da Nota Fiscal
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série da Nota Fiscal
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Número da Nota Fiscal
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número da Nota Fiscal
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
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
    
}