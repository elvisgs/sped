package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Informações Adicionais – Valores Declaratórios
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "E115"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class RegE115 extends Registro {
    
    @Field(at = 2)
    private String codInfAdic;
    
    @Field(at = 3)
    private Double vlInfAdic;
    
    @Field(at = 4)
    private String descrComplAj;
    
    /**
     * Obtém Código informação adicional
     */
    public String getCodInfAdic() {
        return codInfAdic;
    }

    /**
     * Seta Código informação adicional
     */
    public void setCodInfAdic(String codInfAdic) {
        this.codInfAdic = codInfAdic;
    }
    
    /**
     * Obtém Valor informação adicional
     */
    public Double getVlInfAdic() {
        return vlInfAdic;
    }

    /**
     * Seta Valor informação adicional
     */
    public void setVlInfAdic(Double vlInfAdic) {
        this.vlInfAdic = vlInfAdic;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getDescrComplAj() {
        return descrComplAj;
    }

    /**
     * Seta Descrição complementar
     */
    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }
    
}