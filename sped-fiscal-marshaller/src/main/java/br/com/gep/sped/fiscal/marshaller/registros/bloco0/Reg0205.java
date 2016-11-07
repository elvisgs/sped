package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Alterações
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0205"),
    @Field(at = 6, name = "fimLinha")
})
public class Reg0205 extends Registro {
    
    @Field(at = 2)
    private String descrAntItem;
    
    @Field(at = 3)
    private Date dtIni;
    
    @Field(at = 4)
    private Date dtFim;
    
    @Field(at = 5)
    private String codAntItem;
    
    /**
     * Obtém Descrição anterior do item
     */
    public String getDescrAntItem() {
        return descrAntItem;
    }

    /**
     * Seta Descrição anterior do item
     */
    public void setDescrAntItem(String descrAntItem) {
        this.descrAntItem = descrAntItem;
    }
    
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
    public Date getDtFim() {
        return dtFim;
    }

    /**
     * Seta Data final
     */
    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }
    
    /**
     * Obtém Código anterior do item
     */
    public String getCodAntItem() {
        return codAntItem;
    }

    /**
     * Seta Código anterior do item
     */
    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }
    
}