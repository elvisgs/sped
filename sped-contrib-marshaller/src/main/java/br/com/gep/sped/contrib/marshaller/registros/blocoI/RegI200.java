package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I200 - Detalhamento das Receitas, Deduções e/ou Exclusões do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "I200"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegI200 extends Registro {
    
    @Field(at = 2)
    private String numCampo;
    
    @Field(at = 3)
    private String codDet;
    
    @Field(at = 4)
    private Double vlDet;
    
    @Field(at = 5)
    private String codCta;
    
    @Field(at = 6)
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