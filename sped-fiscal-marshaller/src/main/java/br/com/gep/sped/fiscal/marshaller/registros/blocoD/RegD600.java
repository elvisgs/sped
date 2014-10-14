package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * NF de Comunicação e de Telecomunicação - Consolidadas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D600"),
    @Field(at = 19, name = "fimLinha", literal = "")
})
public class RegD600 extends Registro {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String codMun;
    
    @Field(at = 4)
    private String ser;
    
    @Field(at = 5)
    private String sub;
    
    @Field(at = 6)
    private String codCons;
    
    @Field(at = 7)
    private Integer qtdCons;
    
    @Field(at = 8)
    private Date dtDoc;
    
    @Field(at = 9)
    private Double vlDoc;
    
    @Field(at = 10)
    private Double vlDesc;
    
    @Field(at = 11)
    private Double vlServ;
    
    @Field(at = 12)
    private Double vlServNt;
    
    @Field(at = 13)
    private Double vlTerc;
    
    @Field(at = 14)
    private Double vlDa;
    
    @Field(at = 15)
    private Double vlBcIcms;
    
    @Field(at = 16)
    private Double vlIcms;
    
    @Field(at = 17)
    private Double vlPis;
    
    @Field(at = 18)
    private Double vlCofins;
    
    /**
     * Obtém Código do modelo do documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento
     * <p>21=Nota Fiscal de Serviço de Comunicação;22=Nota Fiscal de Serviço de Telecomunicação</p>
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Código do município
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Código do município
     */
    public void setCodMun(String codMun) {
        this.codMun = codMun;
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
     * Obtém Código de classe de consumo
     */
    public String getCodCons() {
        return codCons;
    }

    /**
     * Seta Código de classe de consumo
     */
    public void setCodCons(String codCons) {
        this.codCons = codCons;
    }
    
    /**
     * Obtém Quantidade doc consolidados
     */
    public Integer getQtdCons() {
        return qtdCons;
    }

    /**
     * Seta Quantidade doc consolidados
     */
    public void setQtdCons(Integer qtdCons) {
        this.qtdCons = qtdCons;
    }
    
    /**
     * Obtém Data dos documentos
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data dos documentos
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Valor total dos doc fiscais
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor total dos doc fiscais
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
     * Obtém Valor tributado pelo ICMS
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor tributado pelo ICMS
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Valor não-tributado pelo ICMS
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor não-tributado pelo ICMS
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Valores cobrados para terceiros
     */
    public Double getVlTerc() {
        return vlTerc;
    }

    /**
     * Seta Valores cobrados para terceiros
     */
    public void setVlTerc(Double vlTerc) {
        this.vlTerc = vlTerc;
    }
    
    /**
     * Obtém Valor despesas acessórias
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor despesas acessórias
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
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
    
}