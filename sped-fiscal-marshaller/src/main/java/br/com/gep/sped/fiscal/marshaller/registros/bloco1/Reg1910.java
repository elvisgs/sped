package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período da Sub-apuração do ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1910"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg1910 extends Registro {
    
    @Field(at = 2)
    private Date dtIni;
    
    @Field(at = 2)
    private Date dtFin;
    
    /**
     * Obtém Data Inicial da sub-apuração
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Data Inicial da sub-apuração
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    
    /**
     * Obtém Data final da sub-apuração
     */
    public Date getDtFin() {
        return dtFin;
    }

    /**
     * Seta Data final da sub-apuração
     */
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
    
}