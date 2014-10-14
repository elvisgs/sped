package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Modais
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D180"),
    @Field(at = 18, name = "fimLinha", literal = "")
})
public class RegD180 extends Registro {
    
    @Field(at = 2)
    private Integer numSeq;
    
    @Field(at = 3)
    private String indEmit;
    
    @Field(at = 4)
    private String cnpjCpfEmit;
    
    @Field(at = 5)
    private String ufEmit;
    
    @Field(at = 6)
    private String ieEmit;
    
    @Field(at = 7)
    private String codMunOrig;
    
    @Field(at = 8)
    private String cnpjCpfTom;
    
    @Field(at = 9)
    private String ufTom;
    
    @Field(at = 10)
    private String ieTom;
    
    @Field(at = 11)
    private String codMunDest;
    
    @Field(at = 12)
    private String codMod;
    
    @Field(at = 13)
    private String ser;
    
    @Field(at = 14)
    private String sub;
    
    @Field(at = 15)
    private String numDoc;
    
    @Field(at = 16)
    private Date dtDoc;
    
    @Field(at = 17)
    private Double vlDoc;
    
    /**
     * Obtém Número de ordem seqüencial
     */
    public Integer getNumSeq() {
        return numSeq;
    }

    /**
     * Seta Número de ordem seqüencial
     */
    public void setNumSeq(Integer numSeq) {
        this.numSeq = numSeq;
    }
    
    /**
     * Obtém Emitente
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente
     * <p>0=Emissão própria;1=Terceiros</p>
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém CNPJ/CPF do emitente
     */
    public String getCnpjCpfEmit() {
        return cnpjCpfEmit;
    }

    /**
     * Seta CNPJ/CPF do emitente
     */
    public void setCnpjCpfEmit(String cnpjCpfEmit) {
        this.cnpjCpfEmit = cnpjCpfEmit;
    }
    
    /**
     * Obtém UF do emitente
     */
    public String getUfEmit() {
        return ufEmit;
    }

    /**
     * Seta UF do emitente
     */
    public void setUfEmit(String ufEmit) {
        this.ufEmit = ufEmit;
    }
    
    /**
     * Obtém Inscrição Estadual emitente
     */
    public String getIeEmit() {
        return ieEmit;
    }

    /**
     * Seta Inscrição Estadual emitente
     */
    public void setIeEmit(String ieEmit) {
        this.ieEmit = ieEmit;
    }
    
    /**
     * Obtém Código do município de origem
     */
    public String getCodMunOrig() {
        return codMunOrig;
    }

    /**
     * Seta Código do município de origem
     */
    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }
    
    /**
     * Obtém CNPJ/CPF do tomador do serviço
     */
    public String getCnpjCpfTom() {
        return cnpjCpfTom;
    }

    /**
     * Seta CNPJ/CPF do tomador do serviço
     */
    public void setCnpjCpfTom(String cnpjCpfTom) {
        this.cnpjCpfTom = cnpjCpfTom;
    }
    
    /**
     * Obtém UF do tomador do serviço
     */
    public String getUfTom() {
        return ufTom;
    }

    /**
     * Seta UF do tomador do serviço
     */
    public void setUfTom(String ufTom) {
        this.ufTom = ufTom;
    }
    
    /**
     * Obtém Inscrição Estadual tomador
     */
    public String getIeTom() {
        return ieTom;
    }

    /**
     * Seta Inscrição Estadual tomador
     */
    public void setIeTom(String ieTom) {
        this.ieTom = ieTom;
    }
    
    /**
     * Obtém Código do município de destino
     */
    public String getCodMunDest() {
        return codMunDest;
    }

    /**
     * Seta Código do município de destino
     */
    public void setCodMunDest(String codMunDest) {
        this.codMunDest = codMunDest;
    }
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
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
    
    /**
     * Obtém Valor total do doc fiscal
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total do doc fiscal
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
}