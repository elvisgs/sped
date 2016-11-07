package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Ajuste/Benefício/Incentivo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1921"),
    @Field(at = 5, name = "fimLinha")
})
public class Reg1921 extends Registro {
    
    @Field(at = 2)
    private String codAjApur;
    
    @Field(at = 3)
    private String descrComplAj;
    
    @Field(at = 4)
    private Double vlAjApur;
    
    /**
     * Obtém Código do ajustes da Sub-apuração e dedução
     */
    public String getCodAjApur() {
        return codAjApur;
    }

    /**
     * Seta Código do ajustes da Sub-apuração e dedução
     */
    public void setCodAjApur(String codAjApur) {
        this.codAjApur = codAjApur;
    }
    
    /**
     * Obtém Descrição complementar do ajuste da apuração
     */
    public String getDescrComplAj() {
        return descrComplAj;
    }

    /**
     * Seta Descrição complementar do ajuste da apuração
     */
    public void setDescrComplAj(String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }
    
    /**
     * Obtém Valor ajuste da apuração
     */
    public Double getVlAjApur() {
        return vlAjApur;
    }

    /**
     * Seta Valor ajuste da apuração
     */
    public void setVlAjApur(Double vlAjApur) {
        this.vlAjApur = vlAjApur;
    }
    
}