package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Centro de Custos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0600"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class Reg0600 extends Registro {
    
    @Field(at = 2)
    private Date dtAlt;
    
    @Field(at = 3)
    private String codCcus;
    
    @Field(at = 4)
    private String ccus;
    
    /**
     * Obtém Data da inclusão/alteração
     */
    public Date getDtAlt() {
        return dtAlt;
    }

    /**
     * Seta Data da inclusão/alteração
     */
    public void setDtAlt(Date dtAlt) {
        this.dtAlt = dtAlt;
    }
    
    /**
     * Obtém Código do centro de custos
     */
    public String getCodCcus() {
        return codCcus;
    }

    /**
     * Seta Código do centro de custos
     */
    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    
    /**
     * Obtém Nome do centro de custos
     */
    public String getCcus() {
        return ccus;
    }

    /**
     * Seta Nome do centro de custos
     */
    public void setCcus(String ccus) {
        this.ccus = ccus;
    }
    
}