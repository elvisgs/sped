package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * IPI por Unidade ou Qtde
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C178"),
    @Field(at = 5, name = "fimLinha")
})
public class RegC178 extends Registro {
    
    @Field(at = 2)
    private String clEnq;
    
    @Field(at = 3)
    private Double vlUnid;
    
    @Field(at = 4)
    private Double quantPad;
    
    /**
     * Obtém Classe de enquadramento do IPI
     */
    public String getClEnq() {
        return clEnq;
    }

    /**
     * Seta Classe de enquadramento do IPI
     */
    public void setClEnq(String clEnq) {
        this.clEnq = clEnq;
    }
    
    /**
     * Obtém Valor por unidade padrão
     */
    public Double getVlUnid() {
        return vlUnid;
    }

    /**
     * Seta Valor por unidade padrão
     */
    public void setVlUnid(Double vlUnid) {
        this.vlUnid = vlUnid;
    }
    
    /**
     * Obtém Quantidade total na unidade padrão
     */
    public Double getQuantPad() {
        return quantPad;
    }

    /**
     * Seta Quantidade total na unidade padrão
     */
    public void setQuantPad(Double quantPad) {
        this.quantPad = quantPad;
    }
    
}