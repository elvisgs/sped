package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * INFORMAÇÃO COMPLEMENTAR DO INVENTÁRIO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "H020"),
    @Field(at = 5, name = "fimLinha")
})
public class RegH020 extends Registro {
    
    @Field(at = 2)
    private String cstIcms;
    
    @Field(at = 3)
    private Double blIcms;
    
    @Field(at = 4)
    private Double vlIcms;
    
    /**
     * Obtém Código da Situação Tributária
     */
    public String getCstIcms() {
        return cstIcms;
    }

    /**
     * Seta Código da Situação Tributária
     */
    public void setCstIcms(String cstIcms) {
        this.cstIcms = cstIcms;
    }
    
    /**
     * Obtém Informe a base de cálculo do ICMS
     */
    public Double getBlIcms() {
        return blIcms;
    }

    /**
     * Seta Informe a base de cálculo do ICMS
     */
    public void setBlIcms(Double blIcms) {
        this.blIcms = blIcms;
    }
    
    /**
     * Obtém Informe o valor do ICMS a ser debitado ou creditado
     */
    public Double getVlIcms() {
        return vlIcms;
    }

    /**
     * Seta Informe o valor do ICMS a ser debitado ou creditado
     */
    public void setVlIcms(Double vlIcms) {
        this.vlIcms = vlIcms;
    }
    
}