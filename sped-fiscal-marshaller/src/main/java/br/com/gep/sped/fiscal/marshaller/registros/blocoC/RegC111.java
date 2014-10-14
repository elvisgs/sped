package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Processo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C111"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class RegC111 extends Registro {
    
    @Field(at = 2)
    private String numProc;
    
    @Field(at = 3)
    private String indProc;
    
    /**
     * Obtém Identificação do processo
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Identificação do processo
     */
    public void setNumProc(String numProc) {
        this.numProc = numProc;
    }
    
    /**
     * Obtém Origem do processo
     */
    public String getIndProc() {
        return indProc;
    }

    /**
     * Seta Origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;3=Secex/SRF;9=Outros</p>
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
}