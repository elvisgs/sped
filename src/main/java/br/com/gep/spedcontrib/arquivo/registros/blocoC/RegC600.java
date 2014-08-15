package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * C600 - Consolidação de NF de Energia Elétrica, Água e Gás
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C600"),
    @Field(at = 23, name = "fimLinha", literal = "")
})
public class RegC600 extends Registro {
    
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
    private Integer qtdCanc;
    
    @Field(at = 9)
    private Date dtDoc;
    
    @Field(at = 10)
    private Double vlDoc;
    
    @Field(at = 11)
    private Double vlDesc;
    
    @Field(at = 12)
    private Integer cons;
    
    @Field(at = 13)
    private Double vlForn;
    
    @Field(at = 14)
    private Double vlServNt;
    
    @Field(at = 15)
    private Double vlTerc;
    
    @Field(at = 16)
    private Double vlDa;
    
    @Field(at = 17)
    private Double vlBcIcms;
    
    @Field(at = 18)
    private Double vlIcms;
    
    @Field(at = 19)
    private Double vlBcIcmsSt;
    
    @Field(at = 20)
    private Double vlIcmsSt;
    
    @Field(at = 21)
    private Double vlPis;
    
    @Field(at = 22)
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
     * Obtém Município dos Pontos de Consumo
     */
    public String getCodMun() {
        return codMun;
    }

    /**
     * Seta Município dos Pontos de Consumo
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
     * Obtém Classe de Consumo
     */
    public String getCodCons() {
        return codCons;
    }

    /**
     * Seta Classe de Consumo
     */
    public void setCodCons(String codCons) {
        this.codCons = codCons;
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
     * Obtém Quantidade de Documentos Cancelados
     */
    public Integer getQtdCanc() {
        return qtdCanc;
    }

    /**
     * Seta Quantidade de Documentos Cancelados
     */
    public void setQtdCanc(Integer qtdCanc) {
        this.qtdCanc = qtdCanc;
    }
    
    /**
     * Obtém Data dos Documentos Consolidados
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data dos Documentos Consolidados
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Valor Total dos Documentos
     */
    public Double getVlDoc() {
        return vlDoc;
    }

    /**
     * Seta Valor Total dos Documentos
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
     * Obtém Consumo Total Acumulado
     */
    public Integer getCons() {
        return cons;
    }

    /**
     * Seta Consumo Total Acumulado
     */
    public void setCons(Integer cons) {
        this.cons = cons;
    }
    
    /**
     * Obtém Valor Acumulado do Fornecimento
     */
    public Double getVlForn() {
        return vlForn;
    }

    /**
     * Seta Valor Acumulado do Fornecimento
     */
    public void setVlForn(Double vlForn) {
        this.vlForn = vlForn;
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
     * Obtém Valor Acumulado da Base de Cálculo do ICMS ST
     */
    public Double getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }

    /**
     * Seta Valor Acumulado da Base de Cálculo do ICMS ST
     */
    public void setVlBcIcmsSt(Double vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }
    
    /**
     * Obtém Valor Acumulado do ICMS ST
     */
    public Double getVlIcmsSt() {
        return vlIcmsSt;
    }

    /**
     * Seta Valor Acumulado do ICMS ST
     */
    public void setVlIcmsSt(Double vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }
    
    /**
     * Obtém Valor Acumulado do PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor Acumulado do PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    
    /**
     * Obtém Valor Acumulado da COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor Acumulado da COFINS
     */
    public void setVlCofins(Double vlCofins) {
        this.vlCofins = vlCofins;
    }
    
    
}