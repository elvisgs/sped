package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M620 - Ajustes da COFINS Apurada
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M620"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegM620 {
    
    @Field(at = 2)
    private String indAj;
    
    @Field(at = 3)
    private Double vlAj;
    
    @Field(at = 4)
    private String codAj;
    
    @Field(at = 5)
    private String numDoc;
    
    @Field(at = 6)
    private String descrAj;
    
    @Field(at = 7)
    private Date dtRef;
    
    
    /**
     * Obtém Indicador do tipo de ajuste.
     */
    public String getIndAj() {
        return indAj;
    }

    /**
     * Seta Indicador do tipo de ajuste.
     */
    public void setIndAj(String indAj) {
        this.indAj = indAj;
    }
    
    /**
     * Obtém Valor do ajuste
     */
    public Double getVlAj() {
        return vlAj;
    }

    /**
     * Seta Valor do ajuste
     */
    public void setVlAj(Double vlAj) {
        this.vlAj = vlAj;
    }
    
    /**
     * Obtém Código do ajuste, conforme a Tabela indicada no item 4.3.8.
     */
    public String getCodAj() {
        return codAj;
    }

    /**
     * Seta Código do ajuste, conforme a Tabela indicada no item 4.3.8.
     */
    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }
    
    /**
     * Obtém Número do documento / processo / declaração ao qual o ajuste está vinculado, se houver
     */
    public String getNumDoc() {
        return numDoc;
    }

    /**
     * Seta Número do documento / processo / declaração ao qual o ajuste está vinculado, se houver
     */
    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }
    
    /**
     * Obtém Descrição resumida do ajuste.
     */
    public String getDescrAj() {
        return descrAj;
    }

    /**
     * Seta Descrição resumida do ajuste.
     */
    public void setDescrAj(String descrAj) {
        this.descrAj = descrAj;
    }
    
    /**
     * Obtém Data de referência do ajuste (ddmmaaaa)
     */
    public Date getDtRef() {
        return dtRef;
    }

    /**
     * Seta Data de referência do ajuste (ddmmaaaa)
     */
    public void setDtRef(Date dtRef) {
        this.dtRef = dtRef;
    }
    
    
}