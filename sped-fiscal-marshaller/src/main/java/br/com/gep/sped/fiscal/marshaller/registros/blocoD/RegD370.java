package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Complemento Doc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D370"),
    @Field(at = 7, name = "fimLinha")
})
public class RegD370 extends Registro {
    
    @Field(at = 2)
    private String codMunOrig;
    
    @Field(at = 3)
    private Double vlServ;
    
    @Field(at = 4)
    private Integer qtdBilh;
    
    @Field(at = 5)
    private Double vlBcIcms;
    
    @Field(at = 6)
    private Double vlIcms;
    
    /**
     * Obtém Codigo do município de origem
     */
    public String getCodMunOrig() {
        return codMunOrig;
    }

    /**
     * Seta Codigo do município de origem
     */
    public void setCodMunOrig(String codMunOrig) {
        this.codMunOrig = codMunOrig;
    }
    
    /**
     * Obtém Valor da prestação de serviço
     */
    public Double getVlServ() {
        return vlServ;
    }

    /**
     * Seta Valor da prestação de serviço
     */
    public void setVlServ(Double vlServ) {
        this.vlServ = vlServ;
    }
    
    /**
     * Obtém Quantidade de bilhetes
     */
    public Integer getQtdBilh() {
        return qtdBilh;
    }

    /**
     * Seta Quantidade de bilhetes
     */
    public void setQtdBilh(Integer qtdBilh) {
        this.qtdBilh = qtdBilh;
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
    
}