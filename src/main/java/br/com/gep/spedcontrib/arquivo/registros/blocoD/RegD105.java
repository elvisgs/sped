package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D105 - Complemento do Documento COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D105"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class RegD105 extends Registro {
    
    @Field(at = 2)
    private String indNatFrt;
    
    @Field(at = 3)
    private Double vlItem;
    
    @Field(at = 4)
    private String cstCofins;
    
    @Field(at = 5)
    private String natBcCred;
    
    @Field(at = 6)
    private Double vlBcCofins;
    
    @Field(at = 7)
    private Double aliqCofins;
    
    @Field(at = 8)
    private Double vlCofins;
    
    @Field(at = 9)
    private String codCta;
    
    
    /**
     * Obtém Natureza do Frete
     */
    public String getIndNatFrt() {
        return indNatFrt;
    }

    /**
     * Seta Natureza do Frete
     */
    public void setIndNatFrt(String indNatFrt) {
        this.indNatFrt = indNatFrt;
    }
    
    /**
     * Obtém Valor Total dos Itens
     */
    public Double getVlItem() {
        return vlItem;
    }

    /**
     * Seta Valor Total dos Itens
     */
    public void setVlItem(Double vlItem) {
        this.vlItem = vlItem;
    }
    
    /**
     * Obtém CST da COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST da COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Natureza da Base de Cálculo do Crédito
     */
    public String getNatBcCred() {
        return natBcCred;
    }

    /**
     * Seta Natureza da Base de Cálculo do Crédito
     */
    public void setNatBcCred(String natBcCred) {
        this.natBcCred = natBcCred;
    }
    
    /**
     * Obtém Base de Cálculo da COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de Cálculo da COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
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
     * Obtém Conta Analítica Contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta Analítica Contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    
}