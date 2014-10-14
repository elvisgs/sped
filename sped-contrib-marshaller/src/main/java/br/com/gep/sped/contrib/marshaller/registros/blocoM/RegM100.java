package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M100 - Crédito de PIS/PASEP Relativo ao Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M100"),
    @Field(at = 16, name = "fimLinha", literal = "")
})
public class RegM100 extends Registro {
    
    @Field(at = 2)
    private String codCred;
    
    @Field(at = 3)
    private String indCredOri;
    
    @Field(at = 4)
    private Double vlBcCred;
    
    @Field(at = 5)
    private Double aliqPis;
    
    @Field(at = 6)
    private Double quantBcPis;
    
    @Field(at = 7)
    private Double aliqPisQuant;
    
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
     * Obtém Indicador de Crédito Oriundo de
     */
    public String getIndCredOri() {
        return indCredOri;
    }

    /**
     * Seta Indicador de Crédito Oriundo de
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
     * Obtém Alíquota do PIS (em reais)
     */
    public Double getAliqPisQuant() {
        return aliqPisQuant;
    }

    /**
     * Seta Alíquota do PIS (em reais)
     */
    public void setAliqPisQuant(Double aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
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
     * Obtém Indicador de utilização do crédito disponível no período.
     */
    public String getIndDescCred() {
        return indDescCred;
    }

    /**
     * Seta Indicador de utilização do crédito disponível no período.
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