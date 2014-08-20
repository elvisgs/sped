package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D600 - Consolidação de NF de Serviço de Comunicação e Telecomunicação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D600"),
    @Field(at = 20, name = "fimLinha", literal = "")
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
    private String indRec;
    
    @Field(at = 7)
    private Integer qtdCons;
    
    @Field(at = 8)
    private Date dtDocIni;
    
    @Field(at = 9)
    private Date dtDocFin;
    
    @Field(at = 10)
    private Double vlDoc;
    
    @Field(at = 11)
    private Double vlDesc;
    
    @Field(at = 12)
    private Double vlServ;
    
    @Field(at = 13)
    private Double vlServNt;
    
    @Field(at = 14)
    private Double vlTerc;
    
    @Field(at = 15)
    private Double vlDa;
    
    @Field(at = 16)
    private Double vlBcIcms;
    
    @Field(at = 17)
    private Double vlIcms;
    
    @Field(at = 18)
    private Double vlPis;
    
    @Field(at = 19)
    private Double vlCofins;
    
    
    /**
     * Obtém Modelo do Documento
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Modelo do Documento
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém Município dos terminais Faturados
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Município dos terminais Faturados
     */
    public void setCodMun(String codMun) {
        this.codMun = codMun;
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
     * Obtém Indicador do tipo de receita
     */
    public String getIndRec() {
        return indRec;
    }

    /**
     * Seta Indicador do tipo de receita
     */
    public void setIndRec(String indRec) {
        this.indRec = indRec;
    }
    
    /**
     * Obtém Quantidade de Documentos Consolidados
     */
    public Integer getQtdCons() {
        return qtdCons;
    }

    /**
     * Seta Quantidade de Documentos Consolidados
     */
    public void setQtdCons(Integer qtdCons) {
        this.qtdCons = qtdCons;
    }
    
    /**
     * Obtém Data Inicial dos Documentos Consolidados
     */
    public Date getDtDocIni() {
        return dtDocIni;
    }

    /**
     * Seta Data Inicial dos Documentos Consolidados
     */
    public void setDtDocIni(Date dtDocIni) {
        this.dtDocIni = dtDocIni;
    }
    
    /**
     * Obtém Data Final dos Documentos Consolidados
     */
    public Date getDtDocFin() {
        return dtDocFin;
    }

    /**
     * Seta Data Final dos Documentos Consolidados
     */
    public void setDtDocFin(Date dtDocFin) {
        this.dtDocFin = dtDocFin;
    }
    
    /**
     * Obtém Valor Total Acumulado dos Documentos Fiscais
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total Acumulado dos Documentos Fiscais
     */
    public void setVlDoc(Double vlDoc) {
        this.vlDoc = vlDoc;
    }
    
    /**
     * Obtém Valor Acumulado dos Descontos
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor Acumulado dos Descontos
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    
    /**
     * Obtém Valor Acumulado das Prestações de Serviços Tributados pelo ICMS
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor Acumulado das Prestações de Serviços Tributados pelo ICMS
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Valor Acumulado dos Serviços não-tributados pelo ICMS
     */
    public Double getVlServNt() {
        return vlServNt;
    }

    /**
     * Seta Valor Acumulado dos Serviços não-tributados pelo ICMS
     */
    public void setVlServNt(Double vlServNt) {
        this.vlServNt = vlServNt;
    }
    
    /**
     * Obtém Valores Cobrados em Nome de Terceiros
     */
    public Double getVlTerc() {
        return vlTerc;
    }

    /**
     * Seta Valores Cobrados em Nome de Terceiros
     */
    public void setVlTerc(Double vlTerc) {
        this.vlTerc = vlTerc;
    }
    
    /**
     * Obtém Valor Acumulado das Despesas Acessórias
     */
    public Double getVlDa() {
        return vlDa;
    }

    /**
     * Seta Valor Acumulado das Despesas Acessórias
     */
    public void setVlDa(Double vlDa) {
        this.vlDa = vlDa;
    }
    
    /**
     * Obtém Valor Acumulado da Base de Cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Valor Acumulado da Base de Cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor Acumulado do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor Acumulado do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
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
    
    
}