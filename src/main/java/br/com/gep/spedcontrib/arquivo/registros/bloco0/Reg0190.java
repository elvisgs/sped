package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0190 - Unidade de Medida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0190"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg0190 extends Registro {
    
    @Field(at = 2)
    private String unid;
    
    @Field(at = 3)
    private String descr;
    
    
    /**
     * Obtém Código
     */
    public String getUnid() {
        return unid;
    }

    /**
     * Seta Código
     */
    public void setUnid(String unid) {
        this.unid = unid;
    }
    
    /**
     * Obtém Descrição
     */
    public String getDescr() {
        return descr;
    }

    /**
     * Seta Descrição
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }
    
    
}