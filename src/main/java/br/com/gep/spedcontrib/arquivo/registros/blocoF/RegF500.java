package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Consolidação das operações da pessoa jurídica submetida ao regime de tributação com base no lucro presumido - incidência do Pis/Pasep e da Cofins pelo regime de caixa
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F500"),
    @Field(at = 17, name = "fimLinha", literal = "")
})
public class RegF500 extends RegBase {
    
    @Field(at = 2)
    private Double vlRecCaixa;
    
    @Field(at = 3)
    private String cstPis;
    
    @Field(at = 4)
    private Double vlDescPis;
    
    @Field(at = 5)
    private Double vlBcPis;
    
    @Field(at = 6)
    private Double aliqPis;
    
    @Field(at = 7)
    private Double vlPis;
    
    @Field(at = 8)
    private String cstCofins;
    
    @Field(at = 9)
    private Double vlDescCofins;
    
    @Field(at = 10)
    private Double vlBcCofins;
    
    @Field(at = 11)
    private Double aliqCofins;
    
    @Field(at = 12)
    private Double vlCofins;
    
    @Field(at = 13)
    private String codMod;
    
    @Field(at = 14)
    private String cfop;
    
    @Field(at = 15)
    private String codCta;
    
    @Field(at = 16)
    private String infoCompl;
    
    
    /**
     * Obtém Receita recebida
     */
    public Double getVlRecCaixa() {
        return vlRecCaixa;
    }

    /**
     * Seta Receita recebida
     */
    public void setVlRecCaixa(Double vlRecCaixa) {
        this.vlRecCaixa = vlRecCaixa;
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
     * Obtém Valor do desconto / Exclusão
     */
    public Double getVlDescPis() {
        return vlDescPis;
    }

    /**
     * Seta Valor do desconto / Exclusão
     */
    public void setVlDescPis(Double vlDescPis) {
        this.vlDescPis = vlDescPis;
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
     * Obtém Valor do desconto / Exclusão
     */
    public Double getVlDescCofins() {
        return vlDescCofins;
    }

    /**
     * Seta Valor do desconto / Exclusão
     */
    public void setVlDescCofins(Double vlDescCofins) {
        this.vlDescCofins = vlDescCofins;
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
     * Obtém Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    public String getCodMod() {
        return codMod;
    }

    /**
     * Seta Código do modelo do documento fiscal, conforme a Tabela 4.1.1
     */
    public void setCodMod(String codMod) {
        this.codMod = codMod;
    }
    
    /**
     * Obtém CFOP
     */
    public String getCfop() {
        return cfop;
    }

    /**
     * Seta CFOP
     */
    public void setCfop(String cfop) {
        this.cfop = cfop;
    }
    
    /**
     * Obtém Conta analítica contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta analítica contábil
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Informação complementar
     */
    public String getInfoCompl() {
        return infoCompl;
    }

    /**
     * Seta Informação complementar
     */
    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
    
}