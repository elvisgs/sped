package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F700 - Deduções Diversas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F700"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegF700 {
    
    @Field(at = 2)
    private String indOriDed;
    
    @Field(at = 3)
    private String indNatDed;
    
    @Field(at = 4)
    private Double vlDedPis;
    
    @Field(at = 5)
    private Double vlDedCofins;
    
    @Field(at = 6)
    private Double vlBcOper;
    
    @Field(at = 7)
    private String cnpj;
    
    @Field(at = 8)
    private String infComp;
    
    
    /**
     * Obtém Indicador de Origem de Deduções Diversas
     */
    public String getIndOriDed() {
        return indOriDed;
    }

    /**
     * Seta Indicador de Origem de Deduções Diversas
     */
    public void setIndOriDed(String indOriDed) {
        this.indOriDed = indOriDed;
    }
    
    /**
     * Obtém Indicador da Natureza da Dedução
     */
    public String getIndNatDed() {
        return indNatDed;
    }

    /**
     * Seta Indicador da Natureza da Dedução
     */
    public void setIndNatDed(String indNatDed) {
        this.indNatDed = indNatDed;
    }
    
    /**
     * Obtém Valor a Deduzir - PIS/Pasep
     */
    public Double getVlDedPis() {
        return vlDedPis;
    }

    /**
     * Seta Valor a Deduzir - PIS/Pasep
     */
    public void setVlDedPis(Double vlDedPis) {
        this.vlDedPis = vlDedPis;
    }
    
    /**
     * Obtém Valor a Deduzir - COFINS
     */
    public Double getVlDedCofins() {
        return vlDedCofins;
    }

    /**
     * Seta Valor a Deduzir - COFINS
     */
    public void setVlDedCofins(Double vlDedCofins) {
        this.vlDedCofins = vlDedCofins;
    }
    
    /**
     * Obtém Valor da Base de Cálculo da Operação
     */
    public Double getVlBcOper() {
        return vlBcOper;
    }

    /**
     * Seta Valor da Base de Cálculo da Operação
     */
    public void setVlBcOper(Double vlBcOper) {
        this.vlBcOper = vlBcOper;
    }
    
    /**
     * Obtém CNPJ da Pessoa Jurídica relacionada à Operação
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Seta CNPJ da Pessoa Jurídica relacionada à Operação
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    /**
     * Obtém Informações Complementares do Documento/Operação
     */
    public String getInfComp() {
        return infComp;
    }

    /**
     * Seta Informações Complementares do Documento/Operação
     */
    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
    
}