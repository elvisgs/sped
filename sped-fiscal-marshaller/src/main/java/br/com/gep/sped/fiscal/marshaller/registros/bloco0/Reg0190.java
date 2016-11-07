package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Unidade de Medida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0190"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg0190 extends Registro {
    
    @Field(at = 2)
    private String unid;
    
    @Field(at = 3)
    private String descr;
    
    /**
     * Obtém Código da unidade de medida
     */
    public String getUnid() {
        return unid;
    }

    /**
     * Seta Código da unidade de medida
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }
    
    /**
     * Obtém Descrição da unidade de medida
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Seta Descrição da unidade de medida
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }
    
}