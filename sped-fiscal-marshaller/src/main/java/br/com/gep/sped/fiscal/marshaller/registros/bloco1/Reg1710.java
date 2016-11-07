package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * DOCUMENTOS FISCAIS CANCELADOS/INUTILIZADOS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1710"),
    @Field(at = 4, name = "fimLinha")
})
public class Reg1710 extends Registro {
    
    @Field(at = 6)
    private String numDocIni;
    
    @Field(at = 7)
    private String numDocFin;
    
    /**
     * Obtém Dispositivo autorizado inicial
     */
    public String getNumDocIni() {
        return numDocIni;
    }

    /**
     * Seta Dispositivo autorizado inicial
     */
    public void setNumDocIni(String numDocIni) {
        this.numDocIni = numDocIni;
    }
    
    /**
     * Obtém Dispositivo autorizado final
     */
    public String getNumDocFin() {
        return numDocFin;
    }

    /**
     * Seta Dispositivo autorizado final
     */
    public void setNumDocFin(String numDocFin) {
        this.numDocFin = numDocFin;
    }
    
}