package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Importação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C120"),
    @Field(at = 7, name = "fimLinha", literal = "")
})
public class RegC120 extends Registro {
    
    @Field(at = 2)
    private String codDocImp;
    
    @Field(at = 3)
    private String numDocImp;
    
    @Field(at = 4)
    private Double pisImp;
    
    @Field(at = 5)
    private Double cofinsImp;
    
    @Field(at = 6)
    private String numAcdraw;
    
    /**
     * Obtém Documento de importação
     */
    public String getCodDocImp() {
        return codDocImp;
    }

    /**
     * Seta Documento de importação
     * <p>0=Declaração de Importação;1=Declaração Simplificada de Importação</p>
     */
    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }
    
    /**
     * Obtém Número do documento
     */
    public String getNumDocImp() {
        return numDocImp;
    }

    /**
     * Seta Número do documento
     */
    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }
    
    /**
     * Obtém Valor pago de PIS
     */
    public Double getPisImp() {
        return pisImp;
    }

    /**
     * Seta Valor pago de PIS
     */
    public void setPisImp(Double pisImp) {
        this.pisImp = pisImp;
    }
    
    /**
     * Obtém Valor pago de COFINS
     */
    public Double getCofinsImp() {
        return cofinsImp;
    }

    /**
     * Seta Valor pago de COFINS
     */
    public void setCofinsImp(Double cofinsImp) {
        this.cofinsImp = cofinsImp;
    }
    
    /**
     * Obtém Número do Ato Concessório do regime Drawback
     */
    public String getNumAcdraw() {
        return numAcdraw;
    }

    /**
     * Seta Número do Ato Concessório do regime Drawback
     */
    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }
    
}