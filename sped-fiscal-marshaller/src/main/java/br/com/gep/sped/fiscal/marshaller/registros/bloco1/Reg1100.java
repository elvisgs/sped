package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Exportação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1100"),
    @Field(at = 13, name = "fimLinha", literal = "")
})
public class Reg1100 extends Registro {
    
    @Field(at = 2)
    private String indDoc;
    
    @Field(at = 3)
    private String nroDe;
    
    @Field(at = 4)
    private Date dtDe;
    
    @Field(at = 5)
    private String natExp;
    
    @Field(at = 6)
    private String nroRe;
    
    @Field(at = 7)
    private Date dtRe;
    
    @Field(at = 8)
    private String chcEmb;
    
    @Field(at = 9)
    private Date dtChc;
    
    @Field(at = 10)
    private Date dtAvb;
    
    @Field(at = 11)
    private String tpChc;
    
    @Field(at = 12)
    private String pais;
    
    /**
     * Obtém Tipo de documento
     */
    public String getIndDoc() {
        return indDoc;
    }

    /**
     * Seta Tipo de documento
     * <p>0=Declaração de Exportação;1=Declaração Simplificada de Exportação</p>
     */
    public void setIndDoc(String indDoc) {
        this.indDoc = indDoc;
    }
    
    /**
     * Obtém Número da declaração
     */
    public String getNroDe() {
        return nroDe;
    }

    /**
     * Seta Número da declaração
     */
    public void setNroDe(String nroDe) {
        this.nroDe = nroDe;
    }
    
    /**
     * Obtém Data da Declaração
     */
    public Date getDtDe() {
        return dtDe;
    }

    /**
     * Seta Data da Declaração
     */
    public void setDtDe(Date dtDe) {
        this.dtDe = dtDe;
    }
    
    /**
     * Obtém Tipo de exportação
     */
    public String getNatExp() {
        return natExp;
    }

    /**
     * Seta Tipo de exportação
     * <p>0=Exportação Direta;1=Exportação Indireta</p>
     */
    public void setNatExp(String natExp) {
        this.natExp = natExp;
    }
    
    /**
     * Obtém Nº do registro
     */
    public String getNroRe() {
        return nroRe;
    }

    /**
     * Seta Nº do registro
     */
    public void setNroRe(String nroRe) {
        this.nroRe = nroRe;
    }
    
    /**
     * Obtém Data de exportação
     */
    public Date getDtRe() {
        return dtRe;
    }

    /**
     * Seta Data de exportação
     */
    public void setDtRe(Date dtRe) {
        this.dtRe = dtRe;
    }
    
    /**
     * Obtém Nº do conhecimento de embarque
     */
    public String getChcEmb() {
        return chcEmb;
    }

    /**
     * Seta Nº do conhecimento de embarque
     */
    public void setChcEmb(String chcEmb) {
        this.chcEmb = chcEmb;
    }
    
    /**
     * Obtém Data conhecimento embarque
     */
    public Date getDtChc() {
        return dtChc;
    }

    /**
     * Seta Data conhecimento embarque
     */
    public void setDtChc(Date dtChc) {
        this.dtChc = dtChc;
    }
    
    /**
     * Obtém Data da averbação
     */
    public Date getDtAvb() {
        return dtAvb;
    }

    /**
     * Seta Data da averbação
     */
    public void setDtAvb(Date dtAvb) {
        this.dtAvb = dtAvb;
    }
    
    /**
     * Obtém Tipo de conhecimento de transporte
     */
    public String getTpChc() {
        return tpChc;
    }

    /**
     * Seta Tipo de conhecimento de transporte
     */
    public void setTpChc(String tpChc) {
        this.tpChc = tpChc;
    }
    
    /**
     * Obtém Código do país de destino
     */
    public String getPais() {
        return pais;
    }

    /**
     * Seta Código do país de destino
     */
    public void setPais(String pais) {
        this.pais = pais;
    }
    
}