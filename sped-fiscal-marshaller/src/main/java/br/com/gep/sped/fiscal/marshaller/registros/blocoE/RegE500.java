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
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "E500"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegE500 extends Registro {
    
    @Field(at = 2)
    private String indApur;
    
    @Field(at = 3)
    private Date dtIni;
    
    @Field(at = 4)
    private Date dtFin;
    
    /**
     * Obtém Indicador de período
     */
    public String getIndApur() {
        return indApur;
    }

    /**
     * Seta Indicador de período
     * <p>0=Mensal;1=Decendial</p>
     */
    public void setIndApur(String indApur) {
        this.indApur = indApur;
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