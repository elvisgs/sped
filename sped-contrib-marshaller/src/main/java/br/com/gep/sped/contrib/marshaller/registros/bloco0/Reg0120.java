package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Identificação de Períodos Dispensados da Escrituração Fiscal Digital das Contribuições
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "0120"),
    @Field(at = 4, name = "fimLinha", literal = "")
})
public class Reg0120 extends Registro {
    
    @Field(at = 2)
    private String mesDispensa;
    
    @Field(at = 3)
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