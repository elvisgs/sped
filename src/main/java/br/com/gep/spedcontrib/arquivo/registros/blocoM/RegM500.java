package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M500 - Crédito de COFINS Relativo ao Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M500"),
    @Field(at = 16, name = "fimLinha", literal = "")
})
public class RegM500 extends Registro {
    
    @Field(at = 2)
    private String codCred;
    
    @Field(at = 3)
    private String indCredOri;
    
    @Field(at = 4)
    private Double vlBcCred;
    
    @Field(at = 5)
    private Double aliqCofins;
    
    @Field(at = 6)
    private Double quantBcCofins;
    
    @Field(at = 7)
    private Double aliqCofinsQuant;
    
    @Field(at = 8)
    private Double vlCred;
    
    @Field(at = 9)
    private Double vlAjusAcres;
    
    @Field(at = 10)
    private Double vlAjusReduc;
    
    @Field(at = 11)
    private Double vlCredDif;
    
    @Field(at = 12)
    private Double vlCredDisp;
    
    @Field(at = 13)
    private String indDescCred;
    
    @Field(at = 14)
    private Double vlCredDesc;
    
    @Field(at = 15)
    private Double sldCred;
    
    
    /**
     * Obtém Código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6
     */
    public String getCodCred() {
        return codCred;
    }

    /**
     * Seta Código de Tipo de Crédito apurado no período, conforme a Tabela 4.3.6
     */
    public void setCodCred(String codCred) {
        this.codCred = codCred;
    }
    
    /**
     * Obtém Indicador de Crédito Oriundo de:
     */
    public String getIndCredOri() {
        return indCredOri;
    }

    /**
     * Seta Indicador de Crédito Oriundo de:
     */
    public void setIndCredOri(String indCredOri) {
        this.indCredOri = indCredOri;
    }
    
    /**
     * Obtém Valor da Base de Cálculo do Crédito
     */
    public Double getVlBcCred() {
        return vlBcCred;
    }

    /**
     * Seta Valor da Base de Cálculo do Crédito
     */
    public void setVlBcCred(Double vlBcCred) {
        this.vlBcCred = vlBcCred;
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
     * Obtém Valor total do crédito apurado no período
     */
    public Double getVlCred() {
        return vlCred;
    }

    /**
     * Seta Valor total do crédito apurado no período
     */
    public void setVlCred(Double vlCred) {
        this.vlCred = vlCred;
    }
    
    /**
     * Obtém Valor total dos ajustes de acréscimo
     */
    public Double getVlAjusAcres() {
        return vlAjusAcres;
    }

    /**
     * Seta Valor total dos ajustes de acréscimo
     */
    public void setVlAjusAcres(Double vlAjusAcres) {
        this.vlAjusAcres = vlAjusAcres;
    }
    
    /**
     * Obtém Valor total dos ajustes de redução
     */
    public Double getVlAjusReduc() {
        return vlAjusReduc;
    }

    /**
     * Seta Valor total dos ajustes de redução
     */
    public void setVlAjusReduc(Double vlAjusReduc) {
        this.vlAjusReduc = vlAjusReduc;
    }
    
    /**
     * Obtém Valor total do crédito diferido no período
     */
    public Double getVlCredDif() {
        return vlCredDif;
    }

    /**
     * Seta Valor total do crédito diferido no período
     */
    public void setVlCredDif(Double vlCredDif) {
        this.vlCredDif = vlCredDif;
    }
    
    /**
     * Obtém Valor Total do Crédito Disponível relativo ao Período (07 + 08 - 09 - 10)
     */
    public Double getVlCredDisp() {
        return vlCredDisp;
    }

    /**
     * Seta Valor Total do Crédito Disponível relativo ao Período (07 + 08 - 09 - 10)
     */
    public void setVlCredDisp(Double vlCredDisp) {
        this.vlCredDisp = vlCredDisp;
    }
    
    /**
     * Obtém Indicador de utilização do crédito disponível no período
     */
    public String getIndDescCred() {
        return indDescCred;
    }

    /**
     * Seta Indicador de utilização do crédito disponível no período
     */
    public void setIndDescCred(String indDescCred) {
        this.indDescCred = indDescCred;
    }
    
    /**
     * Obtém Valor do Crédito disponível, descontado da contribuição apurada no próprio período
     */
    public Double getVlCredDesc() {
        return vlCredDesc;
    }

    /**
     * Seta Valor do Crédito disponível, descontado da contribuição apurada no próprio período
     */
    public void setVlCredDesc(Double vlCredDesc) {
        this.vlCredDesc = vlCredDesc;
    }
    
    /**
     * Obtém Saldo de créditos a utilizar em períodos futuros (12 - 14)
     */
    public Double getSldCred() {
        return sldCred;
    }

    /**
     * Seta Saldo de créditos a utilizar em períodos futuros (12 - 14)
     */
    public void setSldCred(Double sldCred) {
        this.sldCred = sldCred;
    }
    
    
}