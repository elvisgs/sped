package br.com.gep.spedcontrib.arquivo.registros.bloco0;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Identificação de Períodos Dispensados da Escrituração Fiscal Digital das Contribuições
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "0120")
})
public class Reg0120 {
    
    @Field(at = 1)
    private String mesDispensa;
    
    @Field(at = 2)
    private String infComp;
    
    
    /**
     * Obtém Mês de referência
     */
    public String getMesDispensa() {
        return mesDispensa;
    }

    /**
     * Seta Mês de referência
     */
    public void setMesDispensa(String mesDispensa) {
        this.mesDispensa = mesDispensa;
    }
    
    /**
     * Obtém Informação complementar
     */
    public String getInfComp() {
        return infComp;
    }

    /**
     * Seta Informação complementar
     */
    public void setInfComp(String infComp) {
        this.infComp = infComp;
    }
    
    
}