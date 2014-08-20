package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C100 - NF, NF Avulsa, NF de Produtor e NF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C100"),
    @Field(at = 30, name = "fimLinha", literal = "")
})
public class RegC100 extends RegBase {
    
    @Field(at = 2)
    private String indOper;
    
    @Field(at = 3)
    private String indEmit;
    
    @Field(at = 4)
    private String codPart;
    
    @Field(at = 5)
    private String codMod;
    
    @Field(at = 6)
    private String codSit;
    
    @Field(at = 7)
    private String ser;
    
    @Field(at = 8)
    private String numDoc;
    
    @Field(at = 9)
    private String chvNfe;
    
    @Field(at = 10)
    private Date dtDoc;
    
    @Field(at = 11)
    private Date dtES;
    
    @Field(at = 12)
    private Double vlDoc;
    
    @Field(at = 13)
    private String indPgto;
    
    @Field(at = 14)
    private Double vlDesc;
    
    @Field(at = 15)
    private Double vlAbatNt;
    
    @Field(at = 16)
    private Double vlMerc;
    
    @Field(at = 17)
    private String indFrt;
    
    @Field(at = 18)
    private Double vlFrt;
    
    @Field(at = 19)
    private Double vlSeg;
    
    @Field(at = 20)
    private Double vlOutDa;
    
    @Field(at = 21)
    private Double vlBcIcms;
    
    @Field(at = 22)
    private Double vlIcms;
    
    @Field(at = 23)
    private Double vlBcIcmsSt;
    
    @Field(at = 24)
    private Double vlIcmsSt;
    
    @Field(at = 25)
    private Double vlIpi;
    
    @Field(at = 26)
    private Double vlPis;
    
    @Field(at = 27)
    private Double vlCofins;
    
    @Field(at = 28)
    private Double vlPisSt;
    
    @Field(at = 29)
    private Double vlCofinsSt;
    
    
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
     * Obtém Emitente
     */
    public String getIndEmit() {
        return indEmit;
    }

    /**
     * Seta Emitente
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
     * Obtém Modelo
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Modelo
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Situação
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Situação
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
     * Obtém Chave NF-e
     */
    public String getChvNfe() {
        return chvNfe;
    }

    /**
     * Seta Chave NF-e
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
     * Obtém Data da entrada ou da saída
     */
    public Date getDtES() {
        return dtES;
    }

    /**
     * Seta Data da entrada ou da saída
     */
    public void setDtES(Date dtES) {
        this.dtES = dtES;
    }
    
    /**
     * Obtém Valor total do documento
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total do documento
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
     * Obtém Valor do desconto
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor do desconto
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Abatimento não tributado e não comercial
     */
    public Double getVlAbatNt() {
        return vlAbatNt;
    }

    /**
     * Seta Abatimento não tributado e não comercial
     */
    public void setVlAbatNt(Double vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }
    
    /**
     * Obtém Valor total das mercadorias e serviços
     */
    public Double getVlMerc() {
        return vlMerc;
    }

    /**
     * Seta Valor total das mercadorias e serviços
     */
    public void setVlMerc(Double vlMerc) {
        this.vlMerc = vlMerc;
    }
    
    /**
     * Obtém Tipo do frete
     */
    public String getIndFrt() {
        return indFrt;
    }

    /**
     * Seta Tipo do frete
     */
    public void setIndFrt(String indFrt) {
        this.indFrt = indFrt;
    }
    
    /**
     * Obtém Valor do frete
     */
    public Double getVlFrt() {
        return vlFrt;
    }

    /**
     * Seta Valor do frete
     */
    public void setVlFrt(Double vlFrt) {
        this.vlFrt = vlFrt;
    }
    
    /**
     * Obtém Valor do seguro
     */
    public Double getVlSeg() {
        return vlSeg;
    }

    /**
     * Seta Valor do seguro
     */
    public void setVlSeg(Double vlSeg) {
        this.vlSeg = vlSeg;
    }
    
    /**
     * Obtém Valor de outras despesas
     */
    public Double getVlOutDa() {
        return vlOutDa;
    }

    /**
     * Seta Valor de outras despesas
     */
    public void setVlOutDa(Double vlOutDa) {
        this.vlOutDa = vlOutDa;
    }
    
    /**
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Base de cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Base de cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor do ICMS ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor do ICMS ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Valor do IPI
     */
    public Double getVlIpi() {
        return vlIpi;
    }

    /**
     * Seta Valor do IPI
     */
    public void setVlIpi(Double vlIpi) {
        this.vlIpi = vlIpi;
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
     * Obtém Valor do PIS/PASEP ST
     */
    public Double getVlPisSt() {
        return vlPisSt;
    }

    /**
     * Seta Valor do PIS/PASEP ST
     */
    public void setVlPisSt(Double vlPisSt) {
        this.vlPisSt = vlPisSt;
    }
    
    /**
     * Obtém Valor da COFINS ST
     */
    public Double getVlCofinsSt() {
        return vlCofinsSt;
    }

    /**
     * Seta Valor da COFINS ST
     */
    public void setVlCofinsSt(Double vlCofinsSt) {
        this.vlCofinsSt = vlCofinsSt;
    }
    
    
}