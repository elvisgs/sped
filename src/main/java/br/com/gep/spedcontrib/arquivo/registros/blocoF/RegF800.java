package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * F800 - Créditos Decorrentes de Eventos de Incorporação, Fusão e Cisão
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "F800")
})
public class RegF800 {
    
    @Field(at = 1)
    private String indNatEven;
    
    @Field(at = 2)
    private Date dtEven;
    
    @Field(at = 3)
    private String cnpjSuced;
    
    @Field(at = 4)
    private String paContCred;
    
    @Field(at = 5)
    private String codCred;
    
    @Field(at = 6)
    private Double vlCredPis;
    
    @Field(at = 7)
    private Double vlCredCofins;
    
    @Field(at = 8)
    private Double perCredCis;
    
    
    /**
     * Obtém Indicador da Natureza do Evento de Sucessão
     */
    public String getIndNatEven() {
        return indNatEven;
    }

    /**
     * Seta Indicador da Natureza do Evento de Sucessão
     */
    public void setIndNatEven(String indNatEven) {
        this.indNatEven = indNatEven;
    }
    
    /**
     * Obtém Data do Evento
     */
    public Date getDtEven() {
        return dtEven;
    }

    /**
     * Seta Data do Evento
     */
    public void setDtEven(Date dtEven) {
        this.dtEven = dtEven;
    }
    
    /**
     * Obtém CNPJ da Pessoa Jurídica Sucedida
     */
    public String getCnpjSuced() {
        return cnpjSuced;
    }

    /**
     * Seta CNPJ da Pessoa Jurídica Sucedida
     */
    public void setCnpjSuced(String cnpjSuced) {
        this.cnpjSuced = cnpjSuced;
    }
    
    /**
     * Obtém Período de Apuração do Crédito - Mês/Ano (MM/AAAA)
     */
    public String getPaContCred() {
        return paContCred;
    }

    /**
     * Seta Período de Apuração do Crédito - Mês/Ano (MM/AAAA)
     */
    public void setPaContCred(String paContCred) {
        this.paContCred = paContCred;
    }
    
    /**
     * Obtém Código do crédito transferido, conforme Tabela 4.3.6
     */
    public String getCodCred() {
        return codCred;
    }

    /**
     * Seta Código do crédito transferido, conforme Tabela 4.3.6
     */
    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }
    
    /**
     * Obtém Valor do Crédito Transferido de PIS/PASEP
     */
    public Double getVlCredPis() {
        return vlCredPis;
    }

    /**
     * Seta Valor do Crédito Transferido de PIS/PASEP
     */
    public void setVlCredPis(Double vlCredPis) {
        this.vlCredPis = vlCredPis;
    }
    
    /**
     * Obtém Valor do Crédito Transferido de Cofins
     */
    public Double getVlCredCofins() {
        return vlCredCofins;
    }

    /**
     * Seta Valor do Crédito Transferido de Cofins
     */
    public void setVlCredCofins(Double vlCredCofins) {
        this.vlCredCofins = vlCredCofins;
    }
    
    /**
     * Obtém Percentual do crédito original transferido, no caso de evento de Cisão.
     */
    public Double getPerCredCis() {
        return perCredCis;
    }

    /**
     * Seta Percentual do crédito original transferido, no caso de evento de Cisão.
     */
    public void setPerCredCis(Double perCredCis) {
        this.perCredCis = perCredCis;
    }
    
    
}