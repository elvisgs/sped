package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Informação Adicional da Sub-apuração do ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1922"),
    @Field(at = 7, name = "fimLinha")
})
public class Reg1922 extends Registro {
    
    @Field(at = 2)
    private String numDa;
    
    @Field(at = 3)
    private String numProc;
    
    @Field(at = 4)
    private String indProc;
    
    @Field(at = 5)
    private String proc;
    
    @Field(at = 6)
    private String txtCompl;
    
    /**
     * Obtém Número doc arrecadação
     */
    public String getNumDa() {
        return numDa;
    }

    /**
     * Seta Número doc arrecadação
     */
    public void setNumDa(String numDa) {
        this.numDa = numDa;
    }
    
    /**
     * Obtém Número do processo
     */
    public String getNumProc() {
        return numProc;
    }

    /**
     * Seta Número do processo
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
     * <p>0=SEFAZ;1=Justiça Federal;2= Justiça Estadual;9= Outros</p>
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    /**
     * Obtém Descrição resumida
     */
    public String getProc() {
        return proc;
    }

    /**
     * Seta Descrição resumida
     */
    public void setProc(String proc) {
        this.proc = proc;
    }
    
    /**
     * Obtém Descrição Complementar
     */
    public String getTxtCompl() {
        return txtCompl;
    }

    /**
     * Seta Descrição Complementar
     */
    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
}