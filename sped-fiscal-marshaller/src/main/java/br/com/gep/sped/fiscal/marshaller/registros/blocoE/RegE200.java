package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E200"),
    @Field(at = 5, name = "fimLinha")
})
public class RegE200 extends Registro {
    
    @Field(at = 2)
    private String uf;
    
    @Field(at = 3)
    private Date dtIni;
    
    @Field(at = 4)
    private Date dtFin;
    
    /**
     * Obtém Sigla da UF
     */
    public String getUf() {
        return uf;
    }

    /**
     * Seta Sigla da UF
     */
    public void setUf(String uf) {
        this.uf = uf;
    }
    
    /**
     * Obtém Data inicial apuração
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Data inicial apuração
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    
    /**
     * Obtém Data final apuração
     */
    public Date getDtFin() {
        return dtFin;
    }

    /**
     * Seta Data final apuração
     */
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
    
}