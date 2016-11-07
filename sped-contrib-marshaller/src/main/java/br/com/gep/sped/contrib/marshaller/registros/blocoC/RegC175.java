package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro Analítico da NFC-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C175"),
    @Field(at = 19, name = "fimLinha")
})
public class RegC175 extends Registro {

    @Field(at = 2)
    private String cfop;

    @Field(at = 3)
    private Double vlOper;

    @Field(at = 4)
    private Double vlDesc;

    @Field(at = 5)
    private String cstPis;

    @Field(at = 6)
    private Double vlBcPis;

    @Field(at = 7)
    private Double aliqPis;

    @Field(at = 8)
    private Double quantBcPis;

    @Field(at = 9)
    private Double aliqPisQuant;

    @Field(at = 10)
    private Double vlPis;

    @Field(at = 11)
    private String cstCofins;

    @Field(at = 12)
    private Double vlBcCofins;

    @Field(at = 13)
    private Double aliqCofins;

    @Field(at = 14)
    private Double quantBcCofins;

    @Field(at = 15)
    private Double aliqCofinsQuant;

    @Field(at = 16)
    private Double vlCofins;

    @Field(at = 17)
    private String codCta;

    @Field(at = 18)
    private String infoCompl;

    /**
     * Obtém Código fiscal de operação e prestação
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta Código fiscal de operação e prestação
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }
    /**
     * Obtém Valor da operação
     */
    public Double getVlOper() {
        return vlOper;
    }

    /**
     * Seta Valor da operação
     */
    public void setVlOper(Double vlOper) {
        this.vlOper = vlOper;
    }
    /**
     * Obtém Valor do desconto Comercial/Exclusão
     */
    public Double getVlDesc() {
        return vlDesc;
    }

    /**
     * Seta Valor do desconto Comercial/Exclusão
     */
    public void setVlDesc(Double vlDesc) {
        this.vlDesc = vlDesc;
    }
    /**
     * Obtém CST PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
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
     * Obtém Alíquota PIS/PASEP (%)
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota PIS/PASEP (%)
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    /**
     * Obtém Base de Cálculo - Quantidade PIS/PASEP
     */
    public Double getQuantBcPis() {
        return quantBcPis;
    }

    /**
     * Seta Base de Cálculo - Quantidade PIS/PASEP
     */
    public void setQuantBcPis(Double quantBcPis) {
        this.quantBcPis = quantBcPis;
    }
    /**
     * Obtém Alíquota PIS/PASEP (em Reais)
     */
    public Double getAliqPisQuant() {
        return aliqPisQuant;
    }

    /**
     * Seta Alíquota PIS/PASEP (em Reais)
     */
    public void setAliqPisQuant(Double aliqPisQuant) {
        this.aliqPisQuant = aliqPisQuant;
    }
    /**
     * Obtém Valor PIS/PASEP
     */
    public Double getVlPis() {
        return vlPis;
    }

    /**
     * Seta Valor PIS/PASEP
     */
    public void setVlPis(Double vlPis) {
        this.vlPis = vlPis;
    }
    /**
     * Obtém CST COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
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
     * Obtém Alíquota COFINS (%)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota COFINS (%)
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    /**
     * Obtém Base de Cálculo - Quantidade COFINS
     */
    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    /**
     * Seta Base de Cálculo - Quantidade COFINS
     */
    public void setQuantBcCofins(Double quantBcCofins) {
        this.quantBcCofins = quantBcCofins;
    }
    /**
     * Obtém Alíquota COFINS (em Reais)
     */
    public Double getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    /**
     * Seta Alíquota COFINS (em Reais)
     */
    public void setAliqCofinsQuant(Double aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    /**
     * Obtém Valor COFINS
     */
    public Double getVlCofins() {
        return vlCofins;
    }

    /**
     * Seta Valor COFINS
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
    /**
     * Obtém Informação Complementar
     */
    public String getInfoCompl() {
        return infoCompl;
    }

    /**
     * Seta Informação Complementar
     */
    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
}
