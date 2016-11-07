package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Arma de fogo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C174"),
    @Field(at = 5, name = "fimLinha")
})
public class RegC174 extends Registro {
    
    @Field(at = 2)
    private String indArm;
    
    @Field(at = 3)
    private String numArm;
    
    @Field(at = 4)
    private String descrCompl;
    
    /**
     * Obtém Tipo da arma
     */
    public String getIndArm() {
        return indArm;
    }

    /**
     * Seta Tipo da arma
     * <p>0=Uso permitido;1=Uso restrito</p>
     */
    public void setIndArm(String indArm) {
        this.indArm = indArm;
    }
    
    /**
     * Obtém Número de Série
     */
    public String getNumArm() {
        return numArm;
    }

    /**
     * Seta Número de Série
     */
    public void setNumArm(String numArm) {
        this.numArm = numArm;
    }
    
    /**
     * Obtém Descrição da arma
     */
    public String getDescrCompl() {
        return descrCompl;
    }

    /**
     * Seta Descrição da arma
     */
    public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
    }
    
}