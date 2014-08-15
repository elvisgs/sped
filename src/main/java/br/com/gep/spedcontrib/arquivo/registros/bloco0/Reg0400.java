package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0400 - Natureza da Operação/Prestação
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
     * Obtém Código
     */
    public String getCodNat() {
        return codNat;
    }

    /**
     * Seta Código
     */
    public void setCodNat(String codNat) {
        this.codNat = codNat;
    }
    
    /**
     * Obtém Descrição
     */
    public String getDescrNat() {
        return descrNat;
    }

    /**
     * Seta Descrição
     */
    public void setDescrNat(String descrNat) {
        this.descrNat = descrNat;
    }
    
    
}