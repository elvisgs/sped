package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * UTILIZAÇÃO DE CRÉDITOS FISCAIS - ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1210"),
    @Field(at = 5, name = "fimLinha")
})
public class Reg1210 extends Registro {
    
    @Field(at = 2)
    private String tipoUtil;
    
    @Field(at = 3)
    private String nrDoc;
    
    @Field(at = 4)
    private Double vlCredUtil;
    
    /**
     * Obtém Tipo de utilização
     */
    public String getTipoUtil() {
        return tipoUtil;
    }

    /**
     * Seta Tipo de utilização
     */
    public void setTipoUtil(String tipoUtil) {
        this.tipoUtil = tipoUtil;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNrDoc() {
        return nrDoc;
    }

    /**
     * Seta Número do documento
     */
    public void setNrDoc(String nrDoc) {
        this.nrDoc = nrDoc;
    }
    
    /**
     * Obtém Total de crédito utilizado
     */
    public Double getVlCredUtil() {
        return vlCredUtil;
    }

    /**
     * Seta Total de crédito utilizado
     */
    public void setVlCredUtil(Double vlCredUtil) {
        this.vlCredUtil = vlCredUtil;
    }
    
}