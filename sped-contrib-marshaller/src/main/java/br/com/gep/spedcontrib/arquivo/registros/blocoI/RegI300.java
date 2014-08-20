package br.com.gep.spedcontrib.arquivo.registros.blocoI;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I300 - Complemento das Operações - Informações Complementares de Receitas, Deduções e/ou Exclusões
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "I300"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class RegI300 extends RegBase {
    
    @Field(at = 2)
    private String codComp;
    
    @Field(at = 3)
    private Double vlComp;
    
    @Field(at = 4)
    private String codCta;
    
    @Field(at = 5)
    private String infComp;
    
    
    /**
     * Obtém Código do Complemento
     */
    public String getCodComp() {
        return codComp;
    }

    /**
     * Seta Código do Complemento
     */
    public void setCodComp(String codComp) {
        this.codComp = codComp;
    }
    
    /**
     * Obtém Valor detalhado referente ao campo 02 deste registro
     */
    public Double getVlComp() {
        return vlComp;
    }

    /**
     * Seta Valor detalhado referente ao campo 02 deste registro
     */
    public void setVlComp(Double vlComp) {
        this.vlComp = vlComp;
    }
    
    /**
     * Obtém Conta Contábil
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Conta Contábil
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