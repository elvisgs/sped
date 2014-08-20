package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I100 - Consolidação das Operações do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "I100"),
    @Field(at = 13, name = "fimLinha", literal = "")
})
public class RegI100 extends Registro {
    
    @Field(at = 2)
    private Double vlRecFin;
    
    @Field(at = 3)
    private String cst;
    
    @Field(at = 4)
    private Double vlTotDedGer;
    
    @Field(at = 5)
    private Double vlTotDedEsp;
    
    @Field(at = 6)
    private Double vlBcPis;
    
    @Field(at = 7)
    private Double aliqPis;
    
    @Field(at = 8)
    private Double vlPis;
    
    @Field(at = 9)
    private Double vlBcCofins;
    
    @Field(at = 10)
    private Double aliqCofins;
    
    @Field(at = 11)
    private Double vlCofins;
    
    @Field(at = 12)
    private String infComp;
    
    
    /**
     * Obtém Valor Total do Faturamento/Receita Bruta no Período
     */
    public Double getVlRecFin() {
        return vlRecFin;
    }

    /**
     * Seta Valor Total do Faturamento/Receita Bruta no Período
     */
    public void setVlRecFin(Double vlRecFin) {
        this.vlRecFin = vlRecFin;
    }
    
    /**
     * Obtém Código de Situação Tributária referente à Receita informada no Campo 02
     */
    public String getCst() {
        return cst;
    }

    /**
     * Seta Código de Situação Tributária referente à Receita informada no Campo 02
     */
    public void setCst(String cst) {
        this.cst = cst;
    }
    
    /**
     * Obtém Valor Total das Deduções e Exclusões de Caráter Geral
     */
    public Double getVlTotDedGer() {
        return vlTotDedGer;
    }

    /**
     * Seta Valor Total das Deduções e Exclusões de Caráter Geral
     */
    public void setVlTotDedGer(Double vlTotDedGer) {
        this.vlTotDedGer = vlTotDedGer;
    }
    
    /**
     * Obtém Valor Total das Deduções e Exclusões de Caráter Específico
     */
    public Double getVlTotDedEsp() {
        return vlTotDedEsp;
    }

    /**
     * Seta Valor Total das Deduções e Exclusões de Caráter Específico
     */
    public void setVlTotDedEsp(Double vlTotDedEsp) {
        this.vlTotDedEsp = vlTotDedEsp;
    }
    
    /**
     * Obtém Valor da base de cálculo do PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Valor da base de cálculo do PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP (em percentual)
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP (em percentual)
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
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
     * Obtém Valor da base de cálculo da COFINS
     */
    public Double getVlBcCofins() {
        return vlBcCofins;
    }

    /**
     * Seta Valor da base de cálculo da COFINS
     */
    public void setVlBcCofins(Double vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS (em percentual)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS (em percentual)
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
     * Obtém Informações Complementares
     */
    public String getInfComp() {
        return infComp;
    }

    /**
     * Seta Informações Complementares
     */
    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
    
}