package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Outras Obrigações
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D197"),
    @Field(at = 9, name = "fimLinha")
})
public class RegD197 extends Registro {
    
    @Field(at = 2)
    private String codAj;
    
    @Field(at = 3)
    private String descrComplAj;
    
    @Field(at = 4)
    private String codItem;
    
    @Field(at = 5)
    private Double vlBcIcms;
    
    @Field(at = 6)
    private Double aliqIcms;
    
    @Field(at = 7)
    private Double vlIcms;
    
    @Field(at = 8)
    private Double vlOutros;
    
    /**
     * Obtém Código do Ajuste
     */
    public String getCodAj() {
        return codAj;
    }

    /**
     * Seta Código do Ajuste
     */
    public void setCodAj(String codAj) {
        this.codAj = codAj;
    }
    
    /**
     * Obtém Descrição complementar do ajuste do documento fiscal
     */
    public String getDescrComplAj() {
        return descrComplAj;
    }

    /**
     * Seta Descrição complementar do ajuste do documento fiscal
     */
    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }
    
    /**
     * Obtém Código do item
     */
    public String getCodItem() {
        return codItem;
    }

    /**
     * Seta Código do item
     */
    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }
    
    /**
     * Obtém Base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Alíquota do ICMS(%)
     */
    public Double getAliqIcms() {
        return aliqIcms;
    }

    /**
     * Seta Alíquota do ICMS(%)
     */
    public void setAliqIcms(Double aliqIcms) {
        this.aliqIcms = aliqIcms;
    }
    
    /**
     * Obtém Valor do ICMS
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Valor do ICMS
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
    /**
     * Obtém Outros valores
     */
    public Double getVlOutros() {
        return vlOutros;
    }

    /**
     * Seta Outros valores
     */
    public void setVlOutros(Double vlOutros) {
        this.vlOutros = vlOutros;
    }
    
}