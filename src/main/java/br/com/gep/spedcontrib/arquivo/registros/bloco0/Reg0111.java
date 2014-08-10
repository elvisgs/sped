package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0111 - Rateio de Créditos Comuns
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0111")
})
public class Reg0111 {
    
    @Field(at = 1)
    private Double recBruNcumTribMi;
    
    @Field(at = 2)
    private Double recBruNcumNtMi;
    
    @Field(at = 3)
    private Double recBruNcumExp;
    
    @Field(at = 4)
    private Double recBruCum;
    
    @Field(at = 5)
    private Double recBruTotal;
    
    
    /**
     * Obtém Receita Bruta Não-Cumulativa - Tributada no Mercado Interno
     */
    public Double getRecBruNcumTribMi() {
        return recBruNcumTribMi;
    }

    /**
     * Seta Receita Bruta Não-Cumulativa - Tributada no Mercado Interno
     */
    public void setRecBruNcumTribMi(Double recBruNcumTribMi) {
        this.recBruNcumTribMi = recBruNcumTribMi;
    }
    
    /**
     * Obtém Receita Bruta Não-Cumulativa - Não Tributada no Mercado Interno
     */
    public Double getRecBruNcumNtMi() {
        return recBruNcumNtMi;
    }

    /**
     * Seta Receita Bruta Não-Cumulativa - Não Tributada no Mercado Interno
     */
    public void setRecBruNcumNtMi(Double recBruNcumNtMi) {
        this.recBruNcumNtMi = recBruNcumNtMi;
    }
    
    /**
     * Obtém Receita Bruta Não-Cumulativa - Exportação
     */
    public Double getRecBruNcumExp() {
        return recBruNcumExp;
    }

    /**
     * Seta Receita Bruta Não-Cumulativa - Exportação
     */
    public void setRecBruNcumExp(Double recBruNcumExp) {
        this.recBruNcumExp = recBruNcumExp;
    }
    
    /**
     * Obtém Receita Bruta Cumulativa
     */
    public Double getRecBruCum() {
        return recBruCum;
    }

    /**
     * Seta Receita Bruta Cumulativa
     */
    public void setRecBruCum(Double recBruCum) {
        this.recBruCum = recBruCum;
    }
    
    /**
     * Obtém Receita Bruta Total
     */
    public Double getRecBruTotal() {
        return recBruTotal;
    }

    /**
     * Seta Receita Bruta Total
     */
    public void setRecBruTotal(Double recBruTotal) {
        this.recBruTotal = recBruTotal;
    }
    
    
}