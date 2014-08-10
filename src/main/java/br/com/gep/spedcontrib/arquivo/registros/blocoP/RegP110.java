package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * P110 - Complemento da Escrituração - detalhamento da apuração da contribuição
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "P110")
})
public class RegP110 {
    
    @Field(at = 1)
    private String numCampo;
    
    @Field(at = 2)
    private String codDet;
    
    @Field(at = 3)
    private Double detValor;
    
    @Field(at = 4)
    private String infCompl;
    
    
    /**
     * Obtém Informar o número do campo do registro “P100”
     */
    public String getNumCampo() {
        return numCampo;
    }

    /**
     * Seta Informar o número do campo do registro “P100”
     */
    public void setNumCampo(String numCampo) {
        this.numCampo = numCampo;
    }
    
    /**
     * Obtém Código do tipo de detalhamento
     */
    public String getCodDet() {
        return codDet;
    }

    /**
     * Seta Código do tipo de detalhamento
     */
    public void setCodDet(String codDet) {
        this.codDet = codDet;
    }
    
    /**
     * Obtém Valor detalhado
     */
    public Double getDetValor() {
        return detValor;
    }

    /**
     * Seta Valor detalhado
     */
    public void setDetValor(Double detValor) {
        this.detValor = detValor;
    }
    
    /**
     * Obtém Informação Complementar
     */
    public String getInfCompl() {
        return infCompl;
    }

    /**
     * Seta Informação Complementar
     */
    public void setInfCompl(String infCompl) {
        this.infCompl = infCompl;
    }
    
    
}