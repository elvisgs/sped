package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Doc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C113"),
    @Field(at = 10, name = "fimLinha")
})
public class RegC113 extends Registro {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String indEmit;
    
    @Field(at = 4)
    private String codPart;
    
    @Field(at = 5)
    private String codMod;
    
    @Field(at = 6)
    private String ser;
    
    @Field(at = 7)
    private String sub;
    
    @Field(at = 8)
    private String numDoc;
    
    @Field(at = 9)
    private Date dtDoc;
    
    /**
     * Obtém Tipo de operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Tipo de operação
     * <p>0=Entrada;1=Saída</p>
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Emitente do título
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente do título
     * <p>0=Emissão Própria;1=Terceiros</p>
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
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
     * Obtém Código do documento fiscal
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do documento fiscal
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Série
     */
    public String getSer() {
        return ser;
    }

    /**
     * Seta Série
     */
    public void setSer(String ser) {
        this.ser = ser;
    }
    
    /**
     * Obtém Subsérie
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento
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
    
}