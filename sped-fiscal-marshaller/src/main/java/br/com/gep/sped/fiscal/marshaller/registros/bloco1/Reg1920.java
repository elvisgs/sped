package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * SUB-APURAÇÃO DO ICMS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1920"),
    @Field(at = 14, name = "fimLinha")
})
public class Reg1920 extends Registro {
    
    @Field(at = 2)
    private Double vlTotTransfDebitosOa;
    
    @Field(at = 3)
    private Double vlTotAjDebitosOa;
    
    @Field(at = 4)
    private Double vlEstornosCredOa;
    
    @Field(at = 5)
    private Double vlTotTransfCreditosOa;
    
    @Field(at = 6)
    private Double vlTotAjCreditosOa;
    
    @Field(at = 7)
    private Double vlEstornosDebOa;
    
    @Field(at = 8)
    private Double vlSldCredorAntOa;
    
    @Field(at = 9)
    private Double vlSldApuradoOa;
    
    @Field(at = 10)
    private Double vlTotDed;
    
    @Field(at = 11)
    private Double vlIcmsRecolherOa;
    
    @Field(at = 12)
    private Double vlSldCredorTranspOa;
    
    @Field(at = 13)
    private Double debEspOa;
    
    /**
     * Obtém Valor total dos débitos por &#x27;Saídas e Prestações com débito do imposto&#x27;
     */
    public Double getVlTotTransfDebitosOa() {
        return vlTotTransfDebitosOa;
    }

    /**
     * Seta Valor total dos débitos por &#x27;Saídas e Prestações com débito do imposto&#x27;
     */
    public void setVlTotTransfDebitosOa(Double vlTotTransfDebitosOa) {
        this.vlTotTransfDebitosOa = vlTotTransfDebitosOa;
    }
    
    /**
     * Obtém Valor total de &#x27;Ajustes a débito&#x27;
     */
    public Double getVlTotAjDebitosOa() {
        return vlTotAjDebitosOa;
    }

    /**
     * Seta Valor total de &#x27;Ajustes a débito&#x27;
     */
    public void setVlTotAjDebitosOa(Double vlTotAjDebitosOa) {
        this.vlTotAjDebitosOa = vlTotAjDebitosOa;
    }
    
    /**
     * Obtém Valor total de Ajustes &#x27;Estornos de créditos&#x27;
     */
    public Double getVlEstornosCredOa() {
        return vlEstornosCredOa;
    }

    /**
     * Seta Valor total de Ajustes &#x27;Estornos de créditos&#x27;
     */
    public void setVlEstornosCredOa(Double vlEstornosCredOa) {
        this.vlEstornosCredOa = vlEstornosCredOa;
    }
    
    /**
     * Obtém Valor total dos créditos por &#x27;Entradas e aquisições com crédito do imposto&#x27;
     */
    public Double getVlTotTransfCreditosOa() {
        return vlTotTransfCreditosOa;
    }

    /**
     * Seta Valor total dos créditos por &#x27;Entradas e aquisições com crédito do imposto&#x27;
     */
    public void setVlTotTransfCreditosOa(Double vlTotTransfCreditosOa) {
        this.vlTotTransfCreditosOa = vlTotTransfCreditosOa;
    }
    
    /**
     * Obtém Valor total de &#x27;Ajustes a crédito&#x27;
     */
    public Double getVlTotAjCreditosOa() {
        return vlTotAjCreditosOa;
    }

    /**
     * Seta Valor total de &#x27;Ajustes a crédito&#x27;
     */
    public void setVlTotAjCreditosOa(Double vlTotAjCreditosOa) {
        this.vlTotAjCreditosOa = vlTotAjCreditosOa;
    }
    
    /**
     * Obtém Valor total de Ajustes &#x27;Estornos de Débitos&#x27;
     */
    public Double getVlEstornosDebOa() {
        return vlEstornosDebOa;
    }

    /**
     * Seta Valor total de Ajustes &#x27;Estornos de Débitos&#x27;
     */
    public void setVlEstornosDebOa(Double vlEstornosDebOa) {
        this.vlEstornosDebOa = vlEstornosDebOa;
    }
    
    /**
     * Obtém Valor total de &#x27;Saldo credor do período anterior&#x27;
     */
    public Double getVlSldCredorAntOa() {
        return vlSldCredorAntOa;
    }

    /**
     * Seta Valor total de &#x27;Saldo credor do período anterior&#x27;
     */
    public void setVlSldCredorAntOa(Double vlSldCredorAntOa) {
        this.vlSldCredorAntOa = vlSldCredorAntOa;
    }
    
    /**
     * Obtém Valor do saldo devedor apurado
     */
    public Double getVlSldApuradoOa() {
        return vlSldApuradoOa;
    }

    /**
     * Seta Valor do saldo devedor apurado
     */
    public void setVlSldApuradoOa(Double vlSldApuradoOa) {
        this.vlSldApuradoOa = vlSldApuradoOa;
    }
    
    /**
     * Obtém Valor total de &#x27;Deduções&#x27;
     */
    public Double getVlTotDed() {
        return vlTotDed;
    }

    /**
     * Seta Valor total de &#x27;Deduções&#x27;
     */
    public void setVlTotDed(Double vlTotDed) {
        this.vlTotDed = vlTotDed;
    }
    
    /**
     * Obtém Valor total de &#x27;ICMS a recolher&#x27;
     */
    public Double getVlIcmsRecolherOa() {
        return vlIcmsRecolherOa;
    }

    /**
     * Seta Valor total de &#x27;ICMS a recolher&#x27;
     */
    public void setVlIcmsRecolherOa(Double vlIcmsRecolherOa) {
        this.vlIcmsRecolherOa = vlIcmsRecolherOa;
    }
    
    /**
     * Obtém Valor total de &#x27;Saldo credor a transportar para o período seguinte&#x27;
     */
    public Double getVlSldCredorTranspOa() {
        return vlSldCredorTranspOa;
    }

    /**
     * Seta Valor total de &#x27;Saldo credor a transportar para o período seguinte&#x27;
     */
    public void setVlSldCredorTranspOa(Double vlSldCredorTranspOa) {
        this.vlSldCredorTranspOa = vlSldCredorTranspOa;
    }
    
    /**
     * Obtém Valores recolhidos ou a recolher, extra-apuração
     */
    public Double getDebEspOa() {
        return debEspOa;
    }

    /**
     * Seta Valores recolhidos ou a recolher, extra-apuração
     */
    public void setDebEspOa(Double debEspOa) {
        this.debEspOa = debEspOa;
    }
    
}