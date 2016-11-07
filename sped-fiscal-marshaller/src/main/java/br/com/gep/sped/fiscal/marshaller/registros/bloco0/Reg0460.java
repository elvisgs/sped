package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Observação do Lanc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0460"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg0460 extends Registro {
    
    @Field(at = 2)
    private String codObs;
    
    @Field(at = 3)
    private String txt;
    
    /**
     * Obtém Código observação lançamento
     */
    public String getCodObs() {
        return codObs;
    }

    /**
     * Seta Código observação lançamento
     */
    public void setCodObs(String codObs) {
        this.codObs = codObs;
    }
    
    /**
     * Obtém Descrição da observação
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Seta Descrição da observação
     */
    public void setTxt(String txt) {
        this.txt = txt;
    }
    
}