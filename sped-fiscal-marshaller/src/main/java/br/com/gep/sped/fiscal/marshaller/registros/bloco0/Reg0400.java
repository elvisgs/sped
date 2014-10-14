package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Natureza da Operação/Prestação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0400"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg0400 extends Registro {
    
    @Field(at = 2)
    private String codNat;
    
    @Field(at = 3)
    private String descrNat;
    
    /**
     * Obtém Código da natureza da operação
     */
    public String getCodNat() {
        return codNat;
    }

    /**
     * Seta Código da natureza da operação
     */
    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }
    
    /**
     * Obtém Descrição da natureza
     */
    public String getDescrNat() {
        return descrNat;
    }

    /**
     * Seta Descrição da natureza
     */
    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
    }
    
}