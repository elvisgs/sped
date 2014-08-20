package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0600 - Centro de Custos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0600"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class Reg0600 extends RegBase {
    
    @Field(at = 2)
    private Date dtAlt;
    
    @Field(at = 3)
    private String codCcus;
    
    @Field(at = 4)
    private String ccus;
    
    
    /**
     * Obtém Data da inclusão ou alteração
     */
    public Date getDtAlt() {
        return dtAlt;
    }

    /**
     * Seta Data da inclusão ou alteração
     */
    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    
    /**
     * Obtém Código
     */
    public String getCodCcus() {
        return codCcus;
    }

    /**
     * Seta Código
     */
    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    
    /**
     * Obtém Nome
     */
    public String getCcus() {
        return ccus;
    }

    /**
     * Seta Nome
     */
    public void setCcus(String ccus) {
        this.ccus = ccus;
    }
    
    
}