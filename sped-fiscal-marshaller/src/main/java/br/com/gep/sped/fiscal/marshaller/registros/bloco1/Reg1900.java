package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Indicador de Sub-apuração do ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1900"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg1900 extends Registro {
    
    @Field(at = 2)
    private String indApurIcms;
    
    @Field(at = 3)
    private String descrComplOutApur;
    
    /**
     * Obtém Indicador de apuração do ICMS
     */
    public String getIndApurIcms() {
        return indApurIcms;
    }

    /**
     * Seta Indicador de apuração do ICMS
     * <p>3=APURAÇÃO 1;4=APURAÇÃO 2;5=APURAÇÃO 3;6=APURAÇÃO 4;7=APURAÇÃO 5;8=APURAÇÃO 6</p>
     */
    public void setIndApurIcms(String indApurIcms) {
        this.indApurIcms = indApurIcms;
    }
    
    /**
     * Obtém Descrição complementar de Outra Apuração do ICMS
     */
    public String getDescrComplOutApur() {
        return descrComplOutApur;
    }

    /**
     * Seta Descrição complementar de Outra Apuração do ICMS
     */
    public void setDescrComplOutApur(String descrComplOutApur) {
        this.descrComplOutApur = descrComplOutApur;
    }
    
}