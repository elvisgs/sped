package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Inscrição ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0015"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg0015 extends Registro {
    
    @Field(at = 2)
    private String ufSt;
    
    @Field(at = 3)
    private String ieSt;
    
    /**
     * Obtém UF
     */
    public String getUfSt() {
        return ufSt;
    }

    /**
     * Seta UF
     */
    public void setUfSt(String ufSt) {
        this.ufSt = ufSt;
    }
    
    /**
     * Obtém Inscrição Estadual
     */
    public String getIeSt() {
        return ieSt;
    }

    /**
     * Seta Inscrição Estadual
     */
    public void setIeSt(String ieSt) {
        this.ieSt = ieSt;
    }
    
}