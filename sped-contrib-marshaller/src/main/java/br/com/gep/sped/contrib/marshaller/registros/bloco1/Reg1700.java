package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.contrib.marshaller.registros.RegBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 1700 - Controle dos Valores Retidos na Fonte - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "1700"),
    @Field(at = 9, name = "fimLinha", literal = "")
})
public class Reg1700 extends RegBase {
    
    @Field(at = 2)
    private String indNatRet;
    
    @Field(at = 3)
    private String prRecRet;
    
    @Field(at = 4)
    private Double vlRetApu;
    
    @Field(at = 5)
    private Double vlRetDed;
    
    @Field(at = 6)
    private Double vlRetPer;
    
    @Field(at = 7)
    private Double vlRetDcomp;
    
    @Field(at = 8)
    private Double sldRet;
    
    
    /**
     * Obtém Indicador de Natureza da Retenção na Fonte
     */
    public String getIndNatRet() {
        return indNatRet;
    }

    /**
     * Seta Indicador de Natureza da Retenção na Fonte
     */
    public void setIndNatRet(String indNatRet) {
        this.indNatRet = indNatRet;
    }
    
    /**
     * Obtém Período do Recebimento e da Retenção(MM/AAAA)
     */
    public String getPrRecRet() {
        return prRecRet;
    }

    /**
     * Seta Período do Recebimento e da Retenção(MM/AAAA)
     */
    public void setPrRecRet(String prRecRet) {
        this.prRecRet = prRecRet;
    }
    
    /**
     * Obtém Valor Total da Retenção
     */
    public Double getVlRetApu() {
        return vlRetApu;
    }

    /**
     * Seta Valor Total da Retenção
     */
    public void setVlRetApu(Double vlRetApu) {
        this.vlRetApu = vlRetApu;
    }
    
    /**
     * Obtém Valor da Retenção deduzida da Contribuição Devida
     */
    public Double getVlRetDed() {
        return vlRetDed;
    }

    /**
     * Seta Valor da Retenção deduzida da Contribuição Devida
     */
    public void setVlRetDed(Double vlRetDed) {
        this.vlRetDed = vlRetDed;
    }
    
    /**
     * Obtém Valor da Retenção utilizada mediante Pedido de Ressarcimento.
     */
    public Double getVlRetPer() {
        return vlRetPer;
    }

    /**
     * Seta Valor da Retenção utilizada mediante Pedido de Ressarcimento.
     */
    public void setVlRetPer(Double vlRetPer) {
        this.vlRetPer = vlRetPer;
    }
    
    /**
     * Obtém Valor da Retenção utilizada mediante Declaração de Compensação.
     */
    public Double getVlRetDcomp() {
        return vlRetDcomp;
    }

    /**
     * Seta Valor da Retenção utilizada mediante Declaração de Compensação.
     */
    public void setVlRetDcomp(Double vlRetDcomp) {
        this.vlRetDcomp = vlRetDcomp;
    }
    
    /**
     * Obtém Saldo de Retenção a Utilizar em Períodos de Apuração Futuros.
     */
    public Double getSldRet() {
        return sldRet;
    }

    /**
     * Seta Saldo de Retenção a Utilizar em Períodos de Apuração Futuros.
     */
    public void setSldRet(Double sldRet) {
        this.sldRet = sldRet;
    }
    
    
}