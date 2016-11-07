package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Informações Adicionais da Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E112"),
    @Field(at = 7, name = "fimLinha")
})
public class RegE112 extends Registro {
    
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
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    public void setIndProc(String indProc) {
        this.indProc = indProc;
    }
    
    /**
     * Obtém Descrição resumida do processo
     */
    public String getProc() {
        return proc;
    }

    /**
     * Seta Descrição resumida do processo
     */
    public void setProc(String proc) {
        this.proc = proc;
    }
    
    /**
     * Obtém Descrição complementar
     */
    public String getTxtCompl() {
        return txtCompl;
    }

    /**
     * Seta Descrição complementar
     */
    public void setTxtCompl(String txtCompl) {
        this.txtCompl = txtCompl;
    }
    
}