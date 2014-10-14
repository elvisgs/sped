package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "E520"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class RegE520 extends Registro {
    
    @Field(at = 2)
    private Double vlSdAntIpi;
    
    @Field(at = 3)
    private Double vlDebIpi;
    
    @Field(at = 4)
    private Double vlCredIpi;
    
    @Field(at = 5)
    private Double vlOdIpi;
    
    @Field(at = 6)
    private Double vlOcIpi;
    
    @Field(at = 7)
    private Double vlScIpi;
    
    @Field(at = 8)
    private Double vlSdIpi;
    
    /**
     * Obtém Saldo credor do período anterior
     */
    public Double getVlSdAntIpi() {
        return vlSdAntIpi;
    }

    /**
     * Seta Saldo credor do período anterior
     */
    public void setVlSdAntIpi(Double vlSdAntIpi) {
        this.vlSdAntIpi = vlSdAntIpi;
    }
    
    /**
     * Obtém Valor dos débitos do IPI
     */
    public Double getVlDebIpi() {
        return vlDebIpi;
    }

    /**
     * Seta Valor dos débitos do IPI
     */
    public void setVlDebIpi(Double vlDebIpi) {
        this.vlDebIpi = vlDebIpi;
    }
    
    /**
     * Obtém Valor dos créditos do IPI
     */
    public Double getVlCredIpi() {
        return vlCredIpi;
    }

    /**
     * Seta Valor dos créditos do IPI
     */
    public void setVlCredIpi(Double vlCredIpi) {
        this.vlCredIpi = vlCredIpi;
    }
    
    /**
     * Obtém Valor outros débitos do IPI
     */
    public Double getVlOdIpi() {
        return vlOdIpi;
    }

    /**
     * Seta Valor outros débitos do IPI
     */
    public void setVlOdIpi(Double vlOdIpi) {
        this.vlOdIpi = vlOdIpi;
    }
    
    /**
     * Obtém Valor outros créditos do IPI
     */
    public Double getVlOcIpi() {
        return vlOcIpi;
    }

    /**
     * Seta Valor outros créditos do IPI
     */
    public void setVlOcIpi(Double vlOcIpi) {
        this.vlOcIpi = vlOcIpi;
    }
    
    /**
     * Obtém Valor saldo credor no período
     */
    public Double getVlScIpi() {
        return vlScIpi;
    }

    /**
     * Seta Valor saldo credor no período
     */
    public void setVlScIpi(Double vlScIpi) {
        this.vlScIpi = vlScIpi;
    }
    
    /**
     * Obtém Valor saldo devedor a recolher
     */
    public Double getVlSdIpi() {
        return vlSdIpi;
    }

    /**
     * Seta Valor saldo devedor a recolher
     */
    public void setVlSdIpi(Double vlSdIpi) {
        this.vlSdIpi = vlSdIpi;
    }
    
}