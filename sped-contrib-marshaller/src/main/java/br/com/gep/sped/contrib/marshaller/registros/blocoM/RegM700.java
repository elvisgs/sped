package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M700 - COFINS Diferida em Períodos Anteriores - Valores a Pagar no Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M700"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegM700 extends Registro {
    
    @Field(at = 2)
    private String codCont;
    
    @Field(at = 3)
    private Double vlContApurDifer;
    
    @Field(at = 4)
    private String natBcCredDesc;
    
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
     * Obtém Natureza do Crédito Diferido, vinculado a receita tributada no mercado interno, a descontar.
     */
    public String getNatBcCredDesc() {
        return natBcCredDesc;
    }

    /**
     * Seta Natureza do Crédito Diferido, vinculado a receita tributada no mercado interno, a descontar.
     */
    public void setNatBcCredDesc(String natBcCredDesc) {
        this.natBcCredDesc = natBcCredDesc;
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
     * Obtém Periodo de apuração da contribuição social e dos créditos diferidos (MMAAAA)
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Seta Periodo de apuração da contribuição social e dos créditos diferidos (MMAAAA)
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