package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Resumo de Movimento Diário
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D400"),
    @Field(at = 17, name = "fimLinha")
})
public class RegD400 extends Registro {
    
    @Field(at = 2)
    private String codPart;
    
    @Field(at = 3)
    private String codMod;
    
    @Field(at = 4)
    private String codSit;
    
    @Field(at = 5)
    private String ser;
    
    @Field(at = 6)
    private String sub;
    
    @Field(at = 7)
    private String numDoc;
    
    @Field(at = 8)
    private Date dtDoc;
    
    @Field(at = 9)
    private Double vlDoc;
    
    @Field(at = 10)
    private Double vlDesc;
    
    @Field(at = 11)
    private Double vlServ;
    
    @Field(at = 12)
    private Double vlBcIcms;
    
    @Field(at = 13)
    private Double vlIcms;
    
    @Field(at = 14)
    private Double vlPis;
    
    @Field(at = 15)
    private Double vlCofins;
    
    @Field(at = 16)
    private String codCta;
    
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
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>18=Resumo de Movimento Diário</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código da situação do documento
     */
    public String getCodSit() {
        return codSit;
    }

    /**
     * Seta Código da situação do documento
     * <p>00=Documento regular;01=Documento regular extemporâneo;02=Documento cancelado;03=Documento cancelado extemporâneo;06=Documento Fiscal Complementar;07=Documento Fiscal Complementar extemporâneo;08=Documento Fiscal emitido com base em Regime Especial ou Norma Específica</p>
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
     * Obtém Valor total
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor dos descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor dos descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor da prestação de serviço
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor da prestação de serviço
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
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
     * Obtém Valor do PIS
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor do PIS
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