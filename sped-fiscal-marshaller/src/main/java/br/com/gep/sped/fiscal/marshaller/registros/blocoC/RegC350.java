package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de venda a consumidor
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C350"),
    @Field(at = 13, name = "fimLinha")
})
public class RegC350 extends Registro {
    
    @Field(at = 2)
    private String ser;
    
    @Field(at = 3)
    private String subSer;
    
    @Field(at = 4)
    private String numDoc;
    
    @Field(at = 5)
    private Date dtDoc;
    
    @Field(at = 6)
    private String cnpjCpf;
    
    @Field(at = 7)
    private Double vlMerc;
    
    @Field(at = 8)
    private Double vlDoc;
    
    @Field(at = 9)
    private Double vlDesc;
    
    @Field(at = 10)
    private Double vlPis;
    
    @Field(at = 11)
    private Double vlCofis;
    
    @Field(at = 12)
    private String codCta;
    
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
    public String getSubSer() {
        return subSer;
    }

    /**
     * Seta Subsérie
     */
    public void setSubSer(String subSer) {
        this.subSer = subSer;
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
     * Obtém Data da emissão do documento fiscal
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da emissão do documento fiscal
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém CNPJ ou CPF do destinatário
     */
    public String getCnpjCpf() {
        return cnpjCpf;
    }

    /**
     * Seta CNPJ ou CPF do destinatário
     */
    public void setCnpjCpf(String cnpjCpf) {
        this.cnpjCpf = cnpjCpf;
    }
    
    /**
     * Obtém Valor das mercadorias
     */
    public Double getVlMerc() {
        return vlMerc;
    }

    /**
     * Seta Valor das mercadorias
     */
    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }
    
    /**
     * Obtém Valor Total do Documento Fiscal
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total do Documento Fiscal
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor Total do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor Total do desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor Total do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor Total do PIS
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor Total da COFIS
     */
    public Double getVlCofis() {
        return vlCofis;
    }

    /**
     * Seta Valor Total da COFIS
     */
    public void setVlCofis(Double vlCofis) {
        this.vlCofis = vlCofis;
    }
    
    /**
     * Obtém Código da Conta Analítica
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da Conta Analítica
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}