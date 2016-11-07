package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Utilização
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0305"),
    @Field(at = 5, name = "fimLinha")
})
public class Reg0305 extends Registro {
    
    @Field(at = 2)
    private String codCcus;
    
    @Field(at = 3)
    private String func;
    
    @Field(at = 4)
    private String vidaUtil;
    
    /**
     * Obtém Código do centro de custo
     */
    public String getCodCcus() {
        return codCcus;
    }

    /**
     * Seta Código do centro de custo
     */
    public void setCodCcus(String codCcus) {
        this.codCcus = codCcus;
    }
    
    /**
     * Obtém função do bem
     */
    public String getFunc() {
        return func;
    }

    /**
     * Seta função do bem
     */
    public void setFunc(String func) {
        this.func = func;
    }
    
    /**
     * Obtém Vida útil
     */
    public String getVidaUtil() {
        return vidaUtil;
    }

    /**
     * Seta Vida útil
     */
    public void setVidaUtil(String vidaUtil) {
        this.vidaUtil = vidaUtil;
    }
    
}