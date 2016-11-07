package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * DEMONSTRATIVO DE CRÉDITO DO ICMS SOBRE TRANSPORTE AÉREO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1800"),
    @Field(at = 11, name = "fimLinha")
})
public class Reg1800 extends Registro {
    
    @Field(at = 2)
    private Double vlCarga;
    
    @Field(at = 3)
    private Double vlPass;
    
    @Field(at = 4)
    private Double vlFat;
    
    @Field(at = 5)
    private Double indRat;
    
    @Field(at = 6)
    private Double vlIcmsAnt;
    
    @Field(at = 7)
    private Double vlBcIcms;
    
    @Field(at = 8)
    private Double vlIcmsApur;
    
    @Field(at = 9)
    private Double vlBcIcmsApur;
    
    @Field(at = 10)
    private Double vlDif;
    
    /**
     * Obtém Valor das prestações cargas (Tributado)
     */
    public Double getVlCarga() {
        return vlCarga;
    }

    /**
     * Seta Valor das prestações cargas (Tributado)
     */
    public void setVlCarga(Double vlCarga) {
        this.vlCarga = vlCarga;
    }
    
    /**
     * Obtém Vr. das prestações passageiros/cargas (Não Tributado)
     */
    public Double getVlPass() {
        return vlPass;
    }

    /**
     * Seta Vr. das prestações passageiros/cargas (Não Tributado)
     */
    public void setVlPass(Double vlPass) {
        this.vlPass = vlPass;
    }
    
    /**
     * Obtém Valor total do faturamento
     */
    public Double getVlFat() {
        return vlFat;
    }

    /**
     * Seta Valor total do faturamento
     */
    public void setVlFat(Double vlFat) {
        this.vlFat = vlFat;
    }
    
    /**
     * Obtém Índice para rateio
     */
    public Double getIndRat() {
        return indRat;
    }

    /**
     * Seta Índice para rateio
     */
    public void setIndRat(Double indRat) {
        this.indRat = indRat;
    }
    
    /**
     * Obtém Valor total dos créditos de ICMS
     */
    public Double getVlIcmsAnt() {
        return vlIcmsAnt;
    }

    /**
     * Seta Valor total dos créditos de ICMS
     */
    public void setVlIcmsAnt(Double vlIcmsAnt) {
        this.vlIcmsAnt = vlIcmsAnt;
    }
    
    /**
     * Obtém Valor da base de cálculo do ICMS
     */
    public Double getVlBcIcms() {
        return vlBcIcms;
    }

    /**
     * Seta Valor da base de cálculo do ICMS
     */
    public void setVlBcIcms(Double vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }
    
    /**
     * Obtém Valor do ICMS apurado
     */
    public Double getVlIcmsApur() {
        return vlIcmsApur;
    }

    /**
     * Seta Valor do ICMS apurado
     */
    public void setVlIcmsApur(Double vlIcmsApur) {
        this.vlIcmsApur = vlIcmsApur;
    }
    
    /**
     * Obtém Valor da base de cálculo do ICMS apurada
     */
    public Double getVlBcIcmsApur() {
        return vlBcIcmsApur;
    }

    /**
     * Seta Valor da base de cálculo do ICMS apurada
     */
    public void setVlBcIcmsApur(Double vlBcIcmsApur) {
        this.vlBcIcmsApur = vlBcIcmsApur;
    }
    
    /**
     * Obtém Vr. da diferença a ser levada a estorno de crédito na apuração
     */
    public Double getVlDif() {
        return vlDif;
    }

    /**
     * Seta Vr. da diferença a ser levada a estorno de crédito na apuração
     */
    public void setVlDif(Double vlDif) {
        this.vlDif = vlDif;
    }
    
}