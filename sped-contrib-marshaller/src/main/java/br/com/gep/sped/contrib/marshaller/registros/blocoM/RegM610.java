package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M610 - Detalhamento da Contribuição para a Seguridade Social
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M610"),
    @Field(at = 14, name = "fimLinha")
})
public class RegM610 extends Registro {
    
    @Field(at = 2)
    private String codCont;
    
    @Field(at = 3)
    private Double vlRecBrt;
    
    @Field(at = 4)
    private Double vlBcCont;
    
    @Field(at = 5)
    private Double aliqCofins;
    
    @Field(at = 6)
    private Double quantBcCofins;
    
    @Field(at = 7)
    private Double aliqCofinsQuant;
    
    @Field(at = 8)
    private Double vlContApur;
    
    @Field(at = 9)
    private Double vlAjusAcres;
    
    @Field(at = 10)
    private Double vlAjusReduc;
    
    @Field(at = 11)
    private Double vlContDifer;
    
    @Field(at = 12)
    private Double vlContDiferAnt;
    
    @Field(at = 13)
    private Double vlContPer;
    
    
    /**
     * Obtém Código da contribuição social apurada no período, conforme a Tabela 4.3.5.
     */
    public String getCodCont() {
        return codCont;
    }

    /**
     * Seta Código da contribuição social apurada no período, conforme a Tabela 4.3.5.
     */
    public void setCodCont(String codCont) {
        this.codCont = codCont;
    }
    
    /**
     * Obtém Valor da Receita Bruta
     */
    public Double getVlRecBrt() {
        return vlRecBrt;
    }

    /**
     * Seta Valor da Receita Bruta
     */
    public void setVlRecBrt(Double vlRecBrt) {
        this.vlRecBrt = vlRecBrt;
    }
    
    /**
     * Obtém Valor da Base de Cálculo da Contribuição
     */
    public Double getVlBcCont() {
        return vlBcCont;
    }

    /**
     * Seta Valor da Base de Cálculo da Contribuição
     */
    public void setVlBcCont(Double vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    
    /**
     * Obtém Alíquota do COFINS (em percentual)
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota do COFINS (em percentual)
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
     * Obtém Alíquota do COFINS (em reais)
     */
    public Double getAliqCofinsQuant() {
        return aliqCofinsQuant;
    }

    /**
     * Seta Alíquota do COFINS (em reais)
     */
    public void setAliqCofinsQuant(Double aliqCofinsQuant) {
        this.aliqCofinsQuant = aliqCofinsQuant;
    }
    
    /**
     * Obtém Valor total da contribuição social apurada
     */
    public Double getVlContApur() {
        return vlContApur;
    }

    /**
     * Seta Valor total da contribuição social apurada
     */
    public void setVlContApur(Double vlContApur) {
        this.vlContApur = vlContApur;
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
     * Obtém Valor total da contribuição a diferir no período
     */
    public Double getVlContDifer() {
        return vlContDifer;
    }

    /**
     * Seta Valor total da contribuição a diferir no período
     */
    public void setVlContDifer(Double vlContDifer) {
        this.vlContDifer = vlContDifer;
    }
    
    /**
     * Obtém Valor da contribuição diferida em períodos anteriores
     */
    public Double getVlContDiferAnt() {
        return vlContDiferAnt;
    }

    /**
     * Seta Valor da contribuição diferida em períodos anteriores
     */
    public void setVlContDiferAnt(Double vlContDiferAnt) {
        this.vlContDiferAnt = vlContDiferAnt;
    }
    
    /**
     * Obtém Valor Total da Contribuição  do Período ( 08 + 09 - 10 - 11 + 12)
     */
    public Double getVlContPer() {
        return vlContPer;
    }

    /**
     * Seta Valor Total da Contribuição  do Período ( 08 + 09 - 10 - 11 + 12)
     */
    public void setVlContPer(Double vlContPer) {
        this.vlContPer = vlContPer;
    }
    
    
}