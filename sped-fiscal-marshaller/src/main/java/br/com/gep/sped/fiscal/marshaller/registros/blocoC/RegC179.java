package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Complemento ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C179"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegC179 extends Registro {
    
    @Field(at = 2)
    private Double bcStOrigDest;
    
    @Field(at = 3)
    private Double icmsStRep;
    
    @Field(at = 4)
    private Double icmsStCompl;
    
    @Field(at = 5)
    private Double bcRet;
    
    @Field(at = 6)
    private Double icmsRet;
    
    /**
     * Obtém Base de cálculo ST
     */
    public Double getBcStOrigDest() {
        return bcStOrigDest;
    }

    /**
     * Seta Base de cálculo ST
     */
    public void setBcStOrigDest(Double bcStOrigDest) {
        this.bcStOrigDest = bcStOrigDest;
    }
    
    /**
     * Obtém Valor ICMS ST a repassar/deduzir
     */
    public Double getIcmsStRep() {
        return icmsStRep;
    }

    /**
     * Seta Valor ICMS ST a repassar/deduzir
     */
    public void setIcmsStRep(Double icmsStRep) {
        this.icmsStRep = icmsStRep;
    }
    
    /**
     * Obtém Valor ICMS ST a complementar
     */
    public Double getIcmsStCompl() {
        return icmsStCompl;
    }

    /**
     * Seta Valor ICMS ST a complementar
     */
    public void setIcmsStCompl(Double icmsStCompl) {
        this.icmsStCompl = icmsStCompl;
    }
    
    /**
     * Obtém Valor da BC de retenção
     */
    public Double getBcRet() {
        return bcRet;
    }

    /**
     * Seta Valor da BC de retenção
     */
    public void setBcRet(Double bcRet) {
        this.bcRet = bcRet;
    }
    
    /**
     * Obtém Valor parcela ICMS ST retido
     */
    public Double getIcmsRet() {
        return icmsRet;
    }

    /**
     * Seta Valor parcela ICMS ST retido
     */
    public void setIcmsRet(Double icmsRet) {
        this.icmsRet = icmsRet;
    }
    
}