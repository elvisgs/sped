package br.com.gep.sped.contrib.marshaller.registros.bloco9;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registros do Arquivo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "9900"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg9900 extends RegBase {
    
    @Field(at = 2)
    private String regBlc;
    
    @Field(at = 3)
    private Integer qtdRegBlc;
    
    
    /**
     * Obtém Registro que será totalizado no próximo campo
     */
    public String getRegBlc() {
        return regBlc;
    }

    /**
     * Seta Registro que será totalizado no próximo campo
     */
    public void setRegBlc(String regBlc) {
        this.regBlc = regBlc;
    }
    
    /**
     * Obtém Total de registros do tipo informado no campo anterior
     */
    public Integer getQtdRegBlc() {
        return qtdRegBlc;
    }

    /**
     * Seta Total de registros do tipo informado no campo anterior
     */
    public void setQtdRegBlc(Integer qtdRegBlc) {
        this.qtdRegBlc = qtdRegBlc;
    }
    
    
}