package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M300 - Contribuição de PIS/PASEP Diferida em Períodos Anteriores - Valores a Pagar no Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M300"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegM300 extends RegBase {
    
    @Field(at = 2)
    private String codCont;
    
    @Field(at = 3)
    private Double vlContApurDifer;
    
    @Field(at = 4)
    private String natCredDesc;
    
    @Field(at = 5)
    private Double vlCredDescDifer;
    
    @Field(at = 6)
    private Double vlContDiferAnt;
    
    @Field(at = 7)
    private String perApur;
    
    @Field(at = 8)
    private Date dtReceb;
    
    
    /**
     * Obtém Código da contribuição  social diferida em períodos anteriores , conforme a Tabela 4.3.5
     */
    public String getCodCont() {
        return codCont;
    }

    /**
     * Seta Código da contribuição  social diferida em períodos anteriores , conforme a Tabela 4.3.5
     */
    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }
    
    /**
     * Obtém Valor da Contribuição Apurada, diferida em períodos anteriores
     */
    public Double getVlContApurDifer() {
        return vlContApurDifer;
    }

    /**
     * Seta Valor da Contribuição Apurada, diferida em períodos anteriores
     */
    public void setVlContApurDifer(Double vlContApurDifer) {
        this.vlContApurDifer = vlContApurDifer;
    }
    
    /**
     * Obtém Natureza do Crédito Diferido, vinculado a receita tributada no mercado interno, a descontar:01 - Crédito a Alíquota Básica;02 - Crédito a Alíquota Diferenciada;03 - Crédito a Alíquota por Unidade de Produto;04 Crédito Presumido da Agroindústria.
     */
    public String getNatCredDesc() {
        return natCredDesc;
    }

    /**
     * Seta Natureza do Crédito Diferido, vinculado a receita tributada no mercado interno, a descontar:01 - Crédito a Alíquota Básica;02 - Crédito a Alíquota Diferenciada;03 - Crédito a Alíquota por Unidade de Produto;04 Crédito Presumido da Agroindústria.
     */
    public void setNatCredDesc(String natCredDesc) {
        this.natCredDesc = natCredDesc;
    }
    
    /**
     * Obtém Valor do Crédito a Descontar vinculado à contribuição diferida
     */
    public Double getVlCredDescDifer() {
        return vlCredDescDifer;
    }

    /**
     * Seta Valor do Crédito a Descontar vinculado à contribuição diferida
     */
    public void setVlCredDescDifer(Double vlCredDescDifer) {
        this.vlCredDescDifer = vlCredDescDifer;
    }
    
    /**
     * Obtém Valor da Contribuição a Recolher, diferida em períodos anteriores (Campo 03 – Campo 05)
     */
    public Double getVlContDiferAnt() {
        return vlContDiferAnt;
    }

    /**
     * Seta Valor da Contribuição a Recolher, diferida em períodos anteriores (Campo 03 – Campo 05)
     */
    public void setVlContDiferAnt(Double vlContDiferAnt) {
        this.vlContDiferAnt = vlContDiferAnt;
    }
    
    /**
     * Obtém Período de apuração da contribuição social e dos créditos diferidos (MMAAAA)
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Seta Período de apuração da contribuição social e dos créditos diferidos (MMAAAA)
     */
    public void setPerApur(String perApur) {
        this.perApur = perApur;
    }
    
    /**
     * Obtém Data de recebimento da receita, objeto de diferimento
     */
    public Date getDtReceb() {
        return dtReceb;
    }

    /**
     * Seta Data de recebimento da receita, objeto de diferimento
     */
    public void setDtReceb(Date dtReceb) {
        this.dtReceb = dtReceb;
    }
    
    
}