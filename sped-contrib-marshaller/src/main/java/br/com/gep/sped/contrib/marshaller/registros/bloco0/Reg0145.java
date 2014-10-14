package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0145 - Regime de Apuração da Contribuiçao Previdenciária sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0145"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class Reg0145 extends Registro {
    
    @Field(at = 2)
    private String codIncTrib;
    
    @Field(at = 3)
    private Double vlRecTot;
    
    @Field(at = 4)
    private Double vlRecAtiv;
    
    @Field(at = 5)
    private Double vlRecDemaisAtiv;
    
    @Field(at = 6)
    private String infoCompl;
    
    
    /**
     * Obtém Incidência tributária no período
     */
    public String getCodIncTrib() {
        return codIncTrib;
    }

    /**
     * Seta Incidência tributária no período
     */
    public void setCodIncTrib(String codIncTrib) {
        this.codIncTrib = codIncTrib;
    }
    
    /**
     * Obtém Valor da Receita Bruta Total da Pessoa Jurídica no Período
     */
    public Double getVlRecTot() {
        return vlRecTot;
    }

    /**
     * Seta Valor da Receita Bruta Total da Pessoa Jurídica no Período
     */
    public void setVlRecTot(Double vlRecTot) {
        this.vlRecTot = vlRecTot;
    }
    
    /**
     * Obtém Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta
     */
    public Double getVlRecAtiv() {
        return vlRecAtiv;
    }

    /**
     * Seta Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta
     */
    public void setVlRecAtiv(Double vlRecAtiv) {
        this.vlRecAtiv = vlRecAtiv;
    }
    
    /**
     * Obtém Valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta
     */
    public Double getVlRecDemaisAtiv() {
        return vlRecDemaisAtiv;
    }

    /**
     * Seta Valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta
     */
    public void setVlRecDemaisAtiv(Double vlRecDemaisAtiv) {
        this.vlRecDemaisAtiv = vlRecDemaisAtiv;
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