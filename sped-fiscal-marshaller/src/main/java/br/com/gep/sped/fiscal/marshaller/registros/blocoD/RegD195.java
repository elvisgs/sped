package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Obs. Lanc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D195"),
    @Field(at = 4, name = "fimLinha")
})
public class RegD195 extends Registro {
    
    @Field(at = 2)
    private String codObs;
    
    @Field(at = 3)
    private String txtCompl;
    
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