package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * A120 - Operações de Importação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A120"),
    @Field(at = 10, name = "fimLinha", literal = "")
})
public class RegA120 {
    
    @Field(at = 2)
    private Double vlTotServ;
    
    @Field(at = 3)
    private Double vlBcPis;
    
    @Field(at = 4)
    private Double vlPisImp;
    
    @Field(at = 5)
    private Date dtPagPis;
    
    @Field(at = 6)
    private Double vlBcCofins;
    
    @Field(at = 7)
    private Double vlCofinsImp;
    
    @Field(at = 8)
    private Date dtPagCofins;
    
    @Field(at = 9)
    private String locExeServ;
    
    
    /**
     * Obtém Valor total do serviço
     */
    public Double getVlTotServ() {
        return vlTotServ;
    }

    /**
     * Seta Valor total do serviço
     */
    public void setVlTotServ(Double vlTotServ) {
        this.vlTotServ = vlTotServ;
    }
    
    /**
     * Obtém Base de cálculo PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de cálculo PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Valor recolhido de PIS/PASEP
     */
    public Double getVlPisImp() {
        return vlPisImp;
    }

    /**
     * Seta Valor recolhido de PIS/PASEP
     */
    public void setVlPisImp(Double vlPisImp) {
        this.vlPisImp = vlPisImp;
    }
    
    /**
     * Obtém Data de pagamento do PIS/PASEP
     */
    public Date getDtPagPis() {
        return dtPagPis;
    }

    /**
     * Seta Data de pagamento do PIS/PASEP
     */
    public void setDtPagPis(Date dtPagPis) {
        this.dtPagPis = dtPagPis;
    }
    
    /**
     * Obtém Base de cálculo COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Base de cálculo COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Valor recolhido de COFINS
     */
    public Double getVlCofinsImp() {
        return vlCofinsImp;
    }

    /**
     * Seta Valor recolhido de COFINS
     */
    public void setVlCofinsImp(Double vlCofinsImp) {
        this.vlCofinsImp = vlCofinsImp;
    }
    
    /**
     * Obtém Data de pagamento do COFINS
     */
    public Date getDtPagCofins() {
        return dtPagCofins;
    }

    /**
     * Seta Data de pagamento do COFINS
     */
    public void setDtPagCofins(Date dtPagCofins) {
        this.dtPagCofins = dtPagCofins;
    }
    
    /**
     * Obtém Local da execução do serviço
     */
    public String getLocExeServ() {
        return locExeServ;
    }

    /**
     * Seta Local da execução do serviço
     */
    public void setLocExeServ(String locExeServ) {
        this.locExeServ = locExeServ;
    }
    
    
}