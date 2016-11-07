package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Valores de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E110"),
    @Field(at = 16, name = "fimLinha")
})
public class RegE110 extends Registro {
    
    @Field(at = 2)
    private Double vlTotDebitos;
    
    @Field(at = 3)
    private Double vlAjDebitos;
    
    @Field(at = 4)
    private Double vlTotAjDebitos;
    
    @Field(at = 5)
    private Double vlEstornosCred;
    
    @Field(at = 6)
    private Double vlTotCreditos;
    
    @Field(at = 7)
    private Double vlAjCreditos;
    
    @Field(at = 8)
    private Double vlTotAjCreditos;
    
    @Field(at = 9)
    private Double vlEstornosDeb;
    
    @Field(at = 10)
    private Double vlSldCredorAnt;
    
    @Field(at = 11)
    private Double vlSldApurado;
    
    @Field(at = 12)
    private Double vlTotDed;
    
    @Field(at = 13)
    private Double vlIcmsRecolher;
    
    @Field(at = 14)
    private Double vlSldCredorTransportar;
    
    @Field(at = 15)
    private Double debEsp;
    
    /**
     * Obtém Valor total dos débitos do imposto
     */
    public Double getVlTotDebitos() {
        return vlTotDebitos;
    }

    /**
     * Seta Valor total dos débitos do imposto
     */
    public void setVlTotDebitos(Double vlTotDebitos) {
        this.vlTotDebitos = vlTotDebitos;
    }
    
    /**
     * Obtém Valor total ajustes a débito (doc fiscal)
     */
    public Double getVlAjDebitos() {
        return vlAjDebitos;
    }

    /**
     * Seta Valor total ajustes a débito (doc fiscal)
     */
    public void setVlAjDebitos(Double vlAjDebitos) {
        this.vlAjDebitos = vlAjDebitos;
    }
    
    /**
     * Obtém Valor total dos ajustes a débito
     */
    public Double getVlTotAjDebitos() {
        return vlTotAjDebitos;
    }

    /**
     * Seta Valor total dos ajustes a débito
     */
    public void setVlTotAjDebitos(Double vlTotAjDebitos) {
        this.vlTotAjDebitos = vlTotAjDebitos;
    }
    
    /**
     * Obtém Valor total dos estornos de créditos
     */
    public Double getVlEstornosCred() {
        return vlEstornosCred;
    }

    /**
     * Seta Valor total dos estornos de créditos
     */
    public void setVlEstornosCred(Double vlEstornosCred) {
        this.vlEstornosCred = vlEstornosCred;
    }
    
    /**
     * Obtém Valor total dos créditos do imposto
     */
    public Double getVlTotCreditos() {
        return vlTotCreditos;
    }

    /**
     * Seta Valor total dos créditos do imposto
     */
    public void setVlTotCreditos(Double vlTotCreditos) {
        this.vlTotCreditos = vlTotCreditos;
    }
    
    /**
     * Obtém Valor total ajustes a crédito (doc fiscal)
     */
    public Double getVlAjCreditos() {
        return vlAjCreditos;
    }

    /**
     * Seta Valor total ajustes a crédito (doc fiscal)
     */
    public void setVlAjCreditos(Double vlAjCreditos) {
        this.vlAjCreditos = vlAjCreditos;
    }
    
    /**
     * Obtém Valor total dos ajustes a crédito
     */
    public Double getVlTotAjCreditos() {
        return vlTotAjCreditos;
    }

    /**
     * Seta Valor total dos ajustes a crédito
     */
    public void setVlTotAjCreditos(Double vlTotAjCreditos) {
        this.vlTotAjCreditos = vlTotAjCreditos;
    }
    
    /**
     * Obtém Valor total dos estornos de débitos
     */
    public Double getVlEstornosDeb() {
        return vlEstornosDeb;
    }

    /**
     * Seta Valor total dos estornos de débitos
     */
    public void setVlEstornosDeb(Double vlEstornosDeb) {
        this.vlEstornosDeb = vlEstornosDeb;
    }
    
    /**
     * Obtém Saldo credor do período anterior
     */
    public Double getVlSldCredorAnt() {
        return vlSldCredorAnt;
    }

    /**
     * Seta Saldo credor do período anterior
     */
    public void setVlSldCredorAnt(Double vlSldCredorAnt) {
        this.vlSldCredorAnt = vlSldCredorAnt;
    }
    
    /**
     * Obtém Valor do saldo devedor
     */
    public Double getVlSldApurado() {
        return vlSldApurado;
    }

    /**
     * Seta Valor do saldo devedor
     */
    public void setVlSldApurado(Double vlSldApurado) {
        this.vlSldApurado = vlSldApurado;
    }
    
    /**
     * Obtém Valor total das deduções
     */
    public Double getVlTotDed() {
        return vlTotDed;
    }

    /**
     * Seta Valor total das deduções
     */
    public void setVlTotDed(Double vlTotDed) {
        this.vlTotDed = vlTotDed;
    }
    
    /**
     * Obtém Valor total do ICMS a recolher
     */
    public Double getVlIcmsRecolher() {
        return vlIcmsRecolher;
    }

    /**
     * Seta Valor total do ICMS a recolher
     */
    public void setVlIcmsRecolher(Double vlIcmsRecolher) {
        this.vlIcmsRecolher = vlIcmsRecolher;
    }
    
    /**
     * Obtém Valor do saldo credor do ICMS
     */
    public Double getVlSldCredorTransportar() {
        return vlSldCredorTransportar;
    }

    /**
     * Seta Valor do saldo credor do ICMS
     */
    public void setVlSldCredorTransportar(Double vlSldCredorTransportar) {
        this.vlSldCredorTransportar = vlSldCredorTransportar;
    }
    
    /**
     * Obtém Valores recolhidos ou a recolher, extra-apuração
     */
    public Double getDebEsp() {
        return debEsp;
    }

    /**
     * Seta Valores recolhidos ou a recolher, extra-apuração
     */
    public void setDebEsp(Double debEsp) {
        this.debEsp = debEsp;
    }
    
}