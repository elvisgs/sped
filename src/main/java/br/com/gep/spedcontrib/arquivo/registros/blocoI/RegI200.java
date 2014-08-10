package br.com.gep.spedcontrib.arquivo.registros.blocoI;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * I200 - Detalhamento das Receitas, Deduções e/ou Exclusões do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "I200")
})
public class RegI200 {
    
    @Field(at = 1)
    private String numCampo;
    
    @Field(at = 2)
    private String codDet;
    
    @Field(at = 3)
    private Double vlDet;
    
    @Field(at = 4)
    private String codCta;
    
    @Field(at = 5)
    private String infComp;
    
    
    /**
     * Obtém Número do Campo do registro I100 objeto de detalhamento
     */
    public String getNumCampo() {
        return numCampo;
    }

    /**
     * Seta Número do Campo do registro I100 objeto de detalhamento
     */
    public void setNumCampo(String numCampo) {
        this.numCampo = numCampo;
    }
    
    /**
     * Obtém Código do Tipo de Detalhamento
     */
    public String getCodDet() {
        return codDet;
    }

    /**
     * Seta Código do Tipo de Detalhamento
     */
    public void setCodDet(String codDet) {
        this.codDet = codDet;
    }
    
    /**
     * Obtém Valor detalhado referente ao campo 02 deste registro
     */
    public Double getVlDet() {
        return vlDet;
    }

    /**
     * Seta Valor detalhado referente ao campo 02 deste registro
     */
    public void setVlDet(Double vlDet) {
        this.vlDet = vlDet;
    }
    
    /**
     * Obtém Código da conta contábil referente ao valor informado no campo 04
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta contábil referente ao valor informado no campo 04
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Informações Complementares
     */
    public String getInfComp() {
        return infComp;
    }

    /**
     * Seta Informações Complementares
     */
    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
    
}