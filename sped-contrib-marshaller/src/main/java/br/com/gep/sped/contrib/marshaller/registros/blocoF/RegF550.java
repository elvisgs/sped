package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F550 - Regime de Competência - Escrituração consolidada das receitas auferidas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F550"),
    @Field(at = 17, name = "fimLinha", literal = "")
})
public class RegF550 extends RegBase {
    
    @Field(at = 2)
    private Double vlRecComp;
    
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
     * Obtém Valor total da receita auferida, referente à combinação de CST e Alíquota
     */
    public Double getVlRecComp() {
        return vlRecComp;
    }

    /**
     * Seta Valor total da receita auferida, referente à combinação de CST e Alíquota
     */
    public void setVlRecComp(Double vlRecComp) {
        this.vlRecComp = vlRecComp;
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
     * Obtém Valor do desconto / exclusão da base de cálculo
     */
    public Double getVlDescPis() {
        return vlDescPis;
    }

    /**
     * Seta Valor do desconto / exclusão da base de cálculo
     */
    public void setVlDescPis(Double vlDescPis) {
        this.vlDescPis = vlDescPis;
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
     * Obtém Alíquota do PIS/PASEP (%)
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP (%)
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
     * Obtém Valor do desconto / exclusão da base de cálculo
     */
    public Double getVlDescCofins() {
        return vlDescCofins;
    }

    /**
     * Seta Valor do desconto / exclusão da base de cálculo
     */
    public void setVlDescCofins(Double vlDescCofins) {
        this.vlDescCofins = vlDescCofins;
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
     * Obtém Alíquota da COFINS (%)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS (%)
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