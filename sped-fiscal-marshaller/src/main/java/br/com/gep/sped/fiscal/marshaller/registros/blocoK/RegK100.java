package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período de Apuração do ICMS/IPI
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "K100"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegK100 extends Registro {

    @Field(at = 2)
    private Date dtIni;

    @Field(at = 3)
    private Date dtFin;

    /**
     * Obtém Data inicial
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Data inicial
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    /**
     * Obtém Data final
     */
    public Date getDtFin() {
        return dtFin;
    }

    /**
     * Seta Data final
     */
    public void setDtFin(Date dtFin) {
        this.dtFin = dtFin;
    }
}
