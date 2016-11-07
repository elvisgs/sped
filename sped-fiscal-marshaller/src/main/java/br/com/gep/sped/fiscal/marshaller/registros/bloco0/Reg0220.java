package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Fatores de Conversão de Unidades
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0220"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg0220 extends Registro {
    
    @Field(at = 2)
    private String unidConv;
    
    @Field(at = 3)
    private Double fatConv;
    
    /**
     * Obtém Unidade comercial
     */
    public String getUnidConv() {
        return unidConv;
    }

    /**
     * Seta Unidade comercial
     */
    public void setUnidConv(String unidConv) {
        this.unidConv = unidConv;
    }
    
    /**
     * Obtém Fator de conversão
     */
    public Double getFatConv() {
        return fatConv;
    }

    /**
     * Seta Fator de conversão
     */
    public void setFatConv(Double fatConv) {
        this.fatConv = fatConv;
    }
    
}