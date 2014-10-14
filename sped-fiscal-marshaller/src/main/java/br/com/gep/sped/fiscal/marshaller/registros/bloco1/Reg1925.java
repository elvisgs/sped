package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Valores Declaratórios
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1925"),
    @Field(at = 5, name = "fimLinha", literal = "")
})
public class Reg1925 extends Registro {
    
    @Field(at = 2)
    private String codInfAdic;
    
    @Field(at = 3)
    private Double vlInfAdic;
    
    @Field(at = 4)
    private String descComplAj;
    
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
     * Obtém Valor referente à informação adicional
     */
    public Double getVlInfAdic() {
        return vlInfAdic;
    }

    /**
     * Seta Valor referente à informação adicional
     */
    public void setVlInfAdic(Double vlInfAdic) {
        this.vlInfAdic = vlInfAdic;
    }
    
    /**
     * Obtém Descrição complementar do ajuste
     */
    public String getDescComplAj() {
        return descComplAj;
    }

    /**
     * Seta Descrição complementar do ajuste
     */
    public void setDescComplAj(String descComplAj) {
        this.descComplAj = descComplAj;
    }
    
}