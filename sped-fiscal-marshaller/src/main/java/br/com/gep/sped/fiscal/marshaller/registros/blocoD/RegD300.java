package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Analítico de Bilhetes de Passagem
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D300"),
    @Field(at = 21, name = "fimLinha")
})
public class RegD300 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ser;
    
    @Field(at = 4)
    private String sub;
    
    @Field(at = 5)
    private String numDocIni;
    
    @Field(at = 6)
    private Integer numDocFin;
    
    @Field(at = 7)
    private String cstIcms;
    
    @Field(at = 8)
    private String cfop;
    
    @Field(at = 9)
    private Double aliqIcms;
    
    @Field(at = 10)
    private Date dtDoc;
    
    @Field(at = 11)
    private Double vlOpr;
    
    @Field(at = 12)
    private Double vlDesc;
    
    @Field(at = 13)
    private Double vlServ;
    
    @Field(at = 14)
    private Double vlSeg;
    
    @Field(at = 15)
    private Double vlOutDesp;
    
    @Field(at = 16)
    private Double vlBcIcms;
    
    @Field(at = 17)
    private Double vlIcms;
    
    @Field(at = 18)
    private Double vlRedBc;
    
    @Field(at = 19)
    private String codObs;
    
    @Field(at = 20)
    private String codCta;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>13=Bilhete de Passagem Rodoviário;14=Bilhete de Passagem Aquaviário;15=Bilhete de Passagem e Nota de Bagagem;16=Bilhete de Passagem Ferroviário</p>
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
     * Obtém Subsérie do documento fiscal
     */
    public String getSub() {
        return sub;
    }

    /**
     * Seta Subsérie do documento fiscal
     */
    public void setSub(String sub) {
        this.sub = sub;
    }
    
    /**
     * Obtém Documento fiscal inicial
     */
    public String getNumDocIni() {
        return numDocIni;
    }

    /**
     * Seta Documento fiscal inicial
     */
    public void setNumDocIni(String numDocIni) {
        this.numDocIni = numDocIni;
    }
    
    /**
     * Obtém Documento fiscal final
     */
    public Integer getNumDocFin() {
        return numDocFin;
    }

    /**
     * Seta Documento fiscal final
     */
    public void setNumDocFin(Integer numDocFin) {
        this.numDocFin = numDocFin;
    }
    
    /**
     * Obtém CST/ICMS
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta CST/ICMS
     */
    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }
    
    /**
     * Obtém CFOP
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta CFOP
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }
    
    /**
     * Obtém Alíquota do ICMS(%)
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Alíquota do ICMS(%)
     */
    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
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
     * Obtém Valor da operação
     */
    public Double getVlOpr() {
        return vlOpr;
    }

    /**
     * Seta Valor da operação
     */
    public void setVlOpr(Double vlOpr) {
        this.vlOpr = vlOpr;
    }
    
    /**
     * Obtém Valor total dos descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor total dos descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor total da prestação de serviço
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor total da prestação de serviço
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Valor de seguro
     */
    public Double getVlSeg() {
        return vlSeg;
    }

    /**
     * Seta Valor de seguro
     */
    public void setVlSeg(Double vlSeg) {
        this.vlSeg = vlSeg;
    }
    
    /**
     * Obtém Valor de outras despesas
     */
    public Double getVlOutDesp() {
        return vlOutDesp;
    }

    /**
     * Seta Valor de outras despesas
     */
    public void setVlOutDesp(Double vlOutDesp) {
        this.vlOutDesp = vlOutDesp;
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
     * Obtém Valor não tributado base ICMS
     */
    public Double getVlRedBc() {
        return vlRedBc;
    }

    /**
     * Seta Valor não tributado base ICMS
     */
    public void setVlRedBc(Double vlRedBc) {
        this.vlRedBc = vlRedBc;
    }
    
    /**
     * Obtém Código observação lançamento
     */
    public String getCodObs() {
        return codObs;
    }

    /**
     * Seta Código observação lançamento
     */
    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
    
    /**
     * Obtém Código da conta analítica
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
}