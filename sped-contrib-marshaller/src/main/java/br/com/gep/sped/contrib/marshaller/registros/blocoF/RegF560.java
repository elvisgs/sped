package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F560 - Incidência do Pis/Pasep e da Cofins pelo regime de competência (apuração da contribuição por unidade de medida de produto - alíquota em reais)
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F560"),
    @Field(at = 17, name = "fimLinha", literal = "")
})
public class RegF560 extends Registro {
    
    @Field(at = 2)
    private Double vlRecComp;
    
    @Field(at = 3)
    private String cstPis;
    
    @Field(at = 4)
    private Double vlDescPis;
    
    @Field(at = 5)
    private Double quantBcPis;
    
    @Field(at = 6)
    private Double aliqPisQuant;
    
    @Field(at = 7)
    private Double vlPis;
    
    @Field(at = 8)
    private String cstCofins;
    
    @Field(at = 9)
    private Double vlDescCofins;
    
    @Field(at = 10)
    private Double quantBcCofins;
    
    @Field(at = 11)
    private Double aliqCofinsQuant;
    
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
     * Obtém Valor total da receita auferida
     */
    public Double getVlRecComp() {
        return vlRecComp;
    }

    /**
     * Seta Valor total da receita auferida
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
     * Obtém Base de cálculo em quantidade - PIS/PASEP
     */
    public Double getQuantBcPis() {
        return quantBcPis;
    }

    /**
     * Seta Base de cálculo em quantidade - PIS/PASEP
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
     * Obtém Base de cálculo em quantidade - COFINS
     */
    public Double getQuantBcCofins() {
        return quantBcCofins;
    }

    /**
     * Seta Base de cálculo em quantidade - COFINS
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