package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * A100 - NF de Serviços
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A100"),
    @Field(at = 22, name = "fimLinha", literal = "")
})
public class RegA100 extends RegBase {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String indEmit;
    
    @Field(at = 4)
    private String codPart;
    
    @Field(at = 5)
    private String codSit;
    
    @Field(at = 6)
    private String ser;
    
    @Field(at = 7)
    private String sub;
    
    @Field(at = 8)
    private String numDoc;
    
    @Field(at = 9)
    private String chvNfse;
    
    @Field(at = 10)
    private Date dtDoc;
    
    @Field(at = 11)
    private Date dtExeServ;
    
    @Field(at = 12)
    private Double vlDoc;
    
    @Field(at = 13)
    private String indPgto;
    
    @Field(at = 14)
    private Double vlDesc;
    
    @Field(at = 15)
    private Double vlBcPis;
    
    @Field(at = 16)
    private Double vlPis;
    
    @Field(at = 17)
    private Double vlBcCofins;
    
    @Field(at = 18)
    private Double vlCofins;
    
    @Field(at = 19)
    private Double vlPisRet;
    
    @Field(at = 20)
    private Double vlCofinsRet;
    
    @Field(at = 21)
    private Double vlIss;
    
    
    /**
     * Obtém Tipo de operação
     */
    public String getIndOper() {
        return indOper;
    }

    /**
     * Seta Tipo de operação
     */
    public void setIndOper(String indOper) {
        this.indOper = indOper;
    }
    
    /**
     * Obtém Indicador de Emitente
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Indicador de Emitente
     */
    public void setIndEmit(String indEmit) {
        this.indEmit = indEmit;
    }
    
    /**
     * Obtém Participante
     */
    public String getCodPart() {
        return codPart;
    }

    /**
     * Seta Participante
     */
    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }
    
    /**
     * Obtém Situação do documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Situação do documento
     */
    public void setCodSit(String codSit) {
        this.codSit = codSit;
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
     * Obtém Chave da NFS-e
     */
    public String getChvNfse() {
        return chvNfse;
    }

    /**
     * Seta Chave da NFS-e
     */
    public void setChvNfse(String chvNfse) {
        this.chvNfse = chvNfse;
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
     * Obtém Data de execução/conclusão do serviço
     */
    public Date getDtExeServ() {
        return dtExeServ;
    }

    /**
     * Seta Data de execução/conclusão do serviço
     */
    public void setDtExeServ(Date dtExeServ) {
        this.dtExeServ = dtExeServ;
    }
    
    /**
     * Obtém Valor total do Documento
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total do Documento
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Tipo de pagamento
     */
    public String getIndPgto() {
        return indPgto;
    }

    /**
     * Seta Tipo de pagamento
     */
    public void setIndPgto(String indPgto) {
        this.indPgto = indPgto;
    }
    
    /**
     * Obtém Valor total do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor total do desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Base de cálculo do PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de cálculo do PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Valor do PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Base de cálculo do COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de cálculo do COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Valor da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    /**
     * Obtém Valor do PIS/PASEP retido na fonte
     */
    public Double getVlPisRet() {
        return vlPisRet;
    }

    /**
     * Seta Valor do PIS/PASEP retido na fonte
     */
    public void setVlPisRet(Double vlPisRet) {
        this.vlPisRet = vlPisRet;
    }
    
    /**
     * Obtém Valor da COFINS retida na fonte
     */
    public Double getVlCofinsRet() {
        return vlCofinsRet;
    }

    /**
     * Seta Valor da COFINS retida na fonte
     */
    public void setVlCofinsRet(Double vlCofinsRet) {
        this.vlCofinsRet = vlCofinsRet;
    }
    
    /**
     * Obtém Valor do ISS
     */
    public Double getVlIss() {
        return vlIss;
    }

    /**
     * Seta Valor do ISS
     */
    public void setVlIss(Double vlIss) {
        this.vlIss = vlIss;
    }
    
    
}