package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0205 - Alterações nos Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0205"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class Reg0205 extends RegBase {
    
    @Field(at = 2)
    private String descrAntItem;
    
    @Field(at = 3)
    private Date dtIni;
    
    @Field(at = 4)
    private Date dtFim;
    
    @Field(at = 5)
    private String codAntItem;
    
    
    /**
     * Obtém Descrição Anterior do Item
     */
    public String getDescrAntItem() {
        return descrAntItem;
    }

    /**
     * Seta Descrição Anterior do Item
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
     * Obtém Código anterior do Item
     */
    public String getCodAntItem() {
        return codAntItem;
    }

    /**
     * Seta Código anterior do Item
     */
    public void setCodAntItem(String codAntItem) {
        this.codAntItem = codAntItem;
    }
    
    
}