package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Ajustes
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "E530"),
    @Field(at = 8, name = "fimLinha", literal = "")
})
public class RegE530 extends Registro {
    
    @Field(at = 2)
    private String indAj;
    
    @Field(at = 3)
    private Double vlAj;
    
    @Field(at = 4)
    private String codAj;
    
    @Field(at = 5)
    private String indDoc;
    
    @Field(at = 6)
    private String numDoc;
    
    @Field(at = 7)
    private String descrAj;
    
    /**
     * Obtém Tipo de ajuste
     */
    public String getIndAj() {
        return indAj;
    }

    /**
     * Seta Tipo de ajuste
     * <p>0=Ajuste a débito;1=Ajuste a crédito</p>
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
     * Obtém Código do ajuste da apuração
     */
    public String getCodAj() {
        return codAj;
    }

    /**
     * Seta Código do ajuste da apuração
     */
    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }
    
    /**
     * Obtém Origem do documento
     */
    public String getIndDoc() {
        return indDoc;
    }

    /**
     * Seta Origem do documento
     * <p>0=Processo Judicial;1=Processo Administrativo;2=PER/DCOMP;9=Outros</p>
     */
    public void setIndDoc(String indDoc) {
        this.indDoc = indDoc;
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
     * Obtém Descrição resumida
     */
    public String getDescrAj() {
        return descrAj;
    }

    /**
     * Seta Descrição resumida
     */
    public void setDescrAj(String descrAj) {
        this.descrAj = descrAj;
    }
    
}