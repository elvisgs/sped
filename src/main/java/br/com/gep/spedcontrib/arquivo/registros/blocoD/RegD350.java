package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * D350 - Resumo Diário de Cupom Fiscal Emitido por ECF - Prestação de Serviço
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D350"),
    @Field(at = 24, name = "fimLinha", literal = "")
})
public class RegD350 {
    
    @Field(at = 2)
    private String codMod;
    
    @Field(at = 3)
    private String ecfMod;
    
    @Field(at = 4)
    private String ecfFab;
    
    @Field(at = 5)
    private Date dtDoc;
    
    @Field(at = 6)
    private String cro;
    
    @Field(at = 7)
    private String crz;
    
    @Field(at = 8)
    private String numCooFin;
    
    @Field(at = 9)
    private Double gtFin;
    
    @Field(at = 10)
    private Double vlBrt;
    
    @Field(at = 11)
    private String cstPis;
    
    @Field(at = 12)
    private Double vlBcPis;
    
    @Field(at = 13)
    private Double aliqPis;
    
    @Field(at = 14)
    private Double quantBcPis;
    
    @Field(at = 15)
    private Double aliqPisQuant;
    
    @Field(at = 16)
    private Double vlPis;
    
    @Field(at = 17)
    private String cstCofins;
    
    @Field(at = 18)
    private Double vlBcCofins;
    
    @Field(at = 19)
    private Double aliqCofins;
    
    @Field(at = 20)
    private Double quantBcCofins;
    
    @Field(at = 21)
    private Double aliqCofinsQuant;
    
    @Field(at = 22)
    private Double vlCofins;
    
    @Field(at = 23)
    private String codCta;
    
    
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
     * Obtém Modelo do equipamento
     */
    public String getEcfMod() {
        return ecfMod;
    }

    /**
     * Seta Modelo do equipamento
     */
    public void setEcfMod(String ecfMod) {
        this.ecfMod = ecfMod;
    }
    
    /**
     * Obtém Número de série de fabricação do ECF
     */
    public String getEcfFab() {
        return ecfFab;
    }

    /**
     * Seta Número de série de fabricação do ECF
     */
    public void setEcfFab(String ecfFab) {
        this.ecfFab = ecfFab;
    }
    
    /**
     * Obtém Data da Redução Z
     */
    public Date getDtDoc() {
        return dtDoc;
    }

    /**
     * Seta Data da Redução Z
     */
    public void setDtDoc(Date dtDoc) {
        this.dtDoc = dtDoc;
    }
    
    /**
     * Obtém Posição do CRO
     */
    public String getCro() {
        return cro;
    }

    /**
     * Seta Posição do CRO
     */
    public void setCro(String cro) {
        this.cro = cro;
    }
    
    /**
     * Obtém Posição do CRZ
     */
    public String getCrz() {
        return crz;
    }

    /**
     * Seta Posição do CRZ
     */
    public void setCrz(String crz) {
        this.crz = crz;
    }
    
    /**
     * Obtém Número do COO na Redução Z
     */
    public String getNumCooFin() {
        return numCooFin;
    }

    /**
     * Seta Número do COO na Redução Z
     */
    public void setNumCooFin(String numCooFin) {
        this.numCooFin = numCooFin;
    }
    
    /**
     * Obtém Valor do Grande Total Final
     */
    public Double getGtFin() {
        return gtFin;
    }

    /**
     * Seta Valor do Grande Total Final
     */
    public void setGtFin(Double gtFin) {
        this.gtFin = gtFin;
    }
    
    /**
     * Obtém Valor da Venda Bruta
     */
    public Double getVlBrt() {
        return vlBrt;
    }

    /**
     * Seta Valor da Venda Bruta
     */
    public void setVlBrt(Double vlBrt) {
        this.vlBrt = vlBrt;
    }
    
    /**
     * Obtém CST do PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST do PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Base de Cálculo do PIS/PASEP
     */
    public Double getVlBcPis() {
        return vlBcPis;
    }

    /**
     * Seta Base de Cálculo do PIS/PASEP
     */
    public void setVlBcPis(Double vlBcPis) {
        this.vlBcPis = vlBcPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    
    /**
     * Obtém Base de cálculo em quantidade PIS/PASEP
     */
    public Double getQuantBcPis() {
        return quantBcPis;
    }

    /**
     * Seta Base de cálculo em quantidade PIS/PASEP
     */
    public void setQuantBcPis(Double quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP (em reais)
     */
    public Double getAliqPisQuant() {
        return aliqPisQuant;
    }

    /**
     * Seta Alíquota do PIS/PASEP (em reais)
     */
    public void setAliqPisQuant(Double aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
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
     * Obtém Base de cálculo em quantidade COFINS
     */
    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    /**
     * Seta Base de cálculo em quantidade COFINS
     */
    public void setQuantBcCofins(Double quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS (em reais)
     */
    public Double getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    /**
     * Seta Alíquota da COFINS (em reais)
     */
    public void setAliqCofinsQuant(Double aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
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