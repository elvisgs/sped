package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Selo de Controle de IPI
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C177"),
    @Field(at = 4, name = "fimLinha")
})
public class RegC177 extends Registro {
    
    @Field(at = 2)
    private String codSeloIpi;
    
    @Field(at = 3)
    private String qtSeloIpi;
    
    /**
     * Obtém Código do selo do IPI
     */
    public String getCodSeloIpi() {
        return codSeloIpi;
    }

    /**
     * Seta Código do selo do IPI
     */
    public void setCodSeloIpi(String codSeloIpi) {
        this.codSeloIpi = codSeloIpi;
    }
    
    /**
     * Obtém Quantidade de selo do IPI
     */
    public String getQtSeloIpi() {
        return qtSeloIpi;
    }

    /**
     * Seta Quantidade de selo do IPI
     */
    public void setQtSeloIpi(String qtSeloIpi) {
        this.qtSeloIpi = qtSeloIpi;
    }
    
}