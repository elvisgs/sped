package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M600 - Contribuição para a Seguridade Social - COFINS do Período
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M600"),
    @Field(at = 14, name = "fimLinha", literal = "")
})
public class RegM600 extends RegBase {
    
    @Field(at = 2)
    private Double vlTotContNcPer;
    
    @Field(at = 3)
    private Double vlTotCredDesc;
    
    @Field(at = 4)
    private Double vlTotCredDescAnt;
    
    @Field(at = 5)
    private Double vlTotContNcDev;
    
    @Field(at = 6)
    private Double vlRetNc;
    
    @Field(at = 7)
    private Double vlOutDedNc;
    
    @Field(at = 8)
    private Double vlContNcRec;
    
    @Field(at = 9)
    private Double vlTotContCumPer;
    
    @Field(at = 10)
    private Double vlRetCum;
    
    @Field(at = 11)
    private Double vlOutDedCum;
    
    @Field(at = 12)
    private Double vlContCumRec;
    
    @Field(at = 13)
    private Double vlTotContRec;
    
    
    /**
     * Obtém Valor Total da Contribuição Não Cumulativa do Período  (recuperado do campo 13 do Registro M610, quando o campo COD_CONT for igual a 01, 02, 03, 04, 32 e 71)
     */
    public Double getVlTotContNcPer() {
        return vlTotContNcPer;
    }

    /**
     * Seta Valor Total da Contribuição Não Cumulativa do Período  (recuperado do campo 13 do Registro M610, quando o campo COD_CONT for igual a 01, 02, 03, 04, 32 e 71)
     */
    public void setVlTotContNcPer(Double vlTotContNcPer) {
        this.vlTotContNcPer = vlTotContNcPer;
    }
    
    /**
     * Obtém Valor do Crédito Descontado, Apurado no Próprio Período da Escrituração (recuperado do campo 14 do Registro M500)
     */
    public Double getVlTotCredDesc() {
        return vlTotCredDesc;
    }

    /**
     * Seta Valor do Crédito Descontado, Apurado no Próprio Período da Escrituração (recuperado do campo 14 do Registro M500)
     */
    public void setVlTotCredDesc(Double vlTotCredDesc) {
        this.vlTotCredDesc = vlTotCredDesc;
    }
    
    /**
     * Obtém Valor do Crédito Descontado, Apurado em Período de Apuração Anterior (recuperado do campo 13 do Registro 1500)
     */
    public Double getVlTotCredDescAnt() {
        return vlTotCredDescAnt;
    }

    /**
     * Seta Valor do Crédito Descontado, Apurado em Período de Apuração Anterior (recuperado do campo 13 do Registro 1500)
     */
    public void setVlTotCredDescAnt(Double vlTotCredDescAnt) {
        this.vlTotCredDescAnt = vlTotCredDescAnt;
    }
    
    /**
     * Obtém Valor Total da Contribuição Não Cumulativa Devida (02  03  04)
     */
    public Double getVlTotContNcDev() {
        return vlTotContNcDev;
    }

    /**
     * Seta Valor Total da Contribuição Não Cumulativa Devida (02  03  04)
     */
    public void setVlTotContNcDev(Double vlTotContNcDev) {
        this.vlTotContNcDev = vlTotContNcDev;
    }
    
    /**
     * Obtém Valor Retido na Fonte Deduzido no Período (Não Cumulativo)
     */
    public Double getVlRetNc() {
        return vlRetNc;
    }

    /**
     * Seta Valor Retido na Fonte Deduzido no Período (Não Cumulativo)
     */
    public void setVlRetNc(Double vlRetNc) {
        this.vlRetNc = vlRetNc;
    }
    
    /**
     * Obtém Outras Deduções do Regime Não Cumulativo no Período
     */
    public Double getVlOutDedNc() {
        return vlOutDedNc;
    }

    /**
     * Seta Outras Deduções do Regime Não Cumulativo no Período
     */
    public void setVlOutDedNc(Double vlOutDedNc) {
        this.vlOutDedNc = vlOutDedNc;
    }
    
    /**
     * Obtém Valor da Contribuição Não Cumulativa a Recolher/Pagar (05  06  07)
     */
    public Double getVlContNcRec() {
        return vlContNcRec;
    }

    /**
     * Seta Valor da Contribuição Não Cumulativa a Recolher/Pagar (05  06  07)
     */
    public void setVlContNcRec(Double vlContNcRec) {
        this.vlContNcRec = vlContNcRec;
    }
    
    /**
     * Obtém Valor Total da Contribuição Cumulativa  do Período (recuperado do campo 13 do Registro M610, quando o campo COD_CONT for igual a 31, 32, 51, 52, 53, 54 e 72)
     */
    public Double getVlTotContCumPer() {
        return vlTotContCumPer;
    }

    /**
     * Seta Valor Total da Contribuição Cumulativa  do Período (recuperado do campo 13 do Registro M610, quando o campo COD_CONT for igual a 31, 32, 51, 52, 53, 54 e 72)
     */
    public void setVlTotContCumPer(Double vlTotContCumPer) {
        this.vlTotContCumPer = vlTotContCumPer;
    }
    
    /**
     * Obtém Valor Retido na Fonte Deduzido no Período (Cumulativo)
     */
    public Double getVlRetCum() {
        return vlRetCum;
    }

    /**
     * Seta Valor Retido na Fonte Deduzido no Período (Cumulativo)
     */
    public void setVlRetCum(Double vlRetCum) {
        this.vlRetCum = vlRetCum;
    }
    
    /**
     * Obtém Outras Deduções do Regime Cumulativo no Período
     */
    public Double getVlOutDedCum() {
        return vlOutDedCum;
    }

    /**
     * Seta Outras Deduções do Regime Cumulativo no Período
     */
    public void setVlOutDedCum(Double vlOutDedCum) {
        this.vlOutDedCum = vlOutDedCum;
    }
    
    /**
     * Obtém Valor da Contribuição Cumulativa a Recolher/Pagar (09  10  11)
     */
    public Double getVlContCumRec() {
        return vlContCumRec;
    }

    /**
     * Seta Valor da Contribuição Cumulativa a Recolher/Pagar (09  10  11)
     */
    public void setVlContCumRec(Double vlContCumRec) {
        this.vlContCumRec = vlContCumRec;
    }
    
    /**
     * Obtém Valor Total da Contribuição  a Recolher/Pagar no Período (08 + 12)
     */
    public Double getVlTotContRec() {
        return vlTotContRec;
    }

    /**
     * Seta Valor Total da Contribuição  a Recolher/Pagar no Período (08 + 12)
     */
    public void setVlTotContRec(Double vlTotContRec) {
        this.vlTotContRec = vlTotContRec;
    }
    
    
}