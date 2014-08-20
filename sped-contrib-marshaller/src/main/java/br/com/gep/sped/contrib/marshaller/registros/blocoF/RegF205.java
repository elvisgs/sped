package br.com.gep.sped.contrib.marshaller.registros.blocoF;

import br.com.gep.sped.contrib.marshaller.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * F205 - Custo Incorrido da Unidade Imobiliária Vendida
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F205"),
    @Field(at = 19, name = "fimLinha", literal = "")
})
public class RegF205 extends Registro {
    
    @Field(at = 2)
    private Double vlCusIncAcumAnt;
    
    @Field(at = 3)
    private Double vlCusIncPerEsc;
    
    @Field(at = 4)
    private Double vlCusIncAcum;
    
    @Field(at = 5)
    private Double vlExcBcCusIncAcum;
    
    @Field(at = 6)
    private Double vlBcCusInc;
    
    @Field(at = 7)
    private String cstPis;
    
    @Field(at = 8)
    private Double aliqPis;
    
    @Field(at = 9)
    private Double vlCredPisAcum;
    
    @Field(at = 10)
    private Double vlCredPisDescAnt;
    
    @Field(at = 11)
    private Double vlCredPisDesc;
    
    @Field(at = 12)
    private Double vlCredPisDescFut;
    
    @Field(at = 13)
    private String cstCofins;
    
    @Field(at = 14)
    private Double aliqCofins;
    
    @Field(at = 15)
    private Double vlCredCofinsAcum;
    
    @Field(at = 16)
    private Double vlCredCofinsDescAnt;
    
    @Field(at = 17)
    private Double vlCredCofinsDesc;
    
    @Field(at = 18)
    private Double vlCredCofinsDescFut;
    
    
    /**
     * Obtém Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês anterior ao da escrituração
     */
    public Double getVlCusIncAcumAnt() {
        return vlCusIncAcumAnt;
    }

    /**
     * Seta Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês anterior ao da escrituração
     */
    public void setVlCusIncAcumAnt(Double vlCusIncAcumAnt) {
        this.vlCusIncAcumAnt = vlCusIncAcumAnt;
    }
    
    /**
     * Obtém Valor Total do Custo Incorrido da unidade imobiliária no mês da escrituração
     */
    public Double getVlCusIncPerEsc() {
        return vlCusIncPerEsc;
    }

    /**
     * Seta Valor Total do Custo Incorrido da unidade imobiliária no mês da escrituração
     */
    public void setVlCusIncPerEsc(Double vlCusIncPerEsc) {
        this.vlCusIncPerEsc = vlCusIncPerEsc;
    }
    
    /**
     * Obtém Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês da escrituração
     */
    public Double getVlCusIncAcum() {
        return vlCusIncAcum;
    }

    /**
     * Seta Valor Total do Custo Incorrido da unidade imobiliária acumulado até o mês da escrituração
     */
    public void setVlCusIncAcum(Double vlCusIncAcum) {
        this.vlCusIncAcum = vlCusIncAcum;
    }
    
    /**
     * Obtém Parcela do Custo Incorrido sem direito ao crédito da atividade imobiliária, acumulado até o período
     */
    public Double getVlExcBcCusIncAcum() {
        return vlExcBcCusIncAcum;
    }

    /**
     * Seta Parcela do Custo Incorrido sem direito ao crédito da atividade imobiliária, acumulado até o período
     */
    public void setVlExcBcCusIncAcum(Double vlExcBcCusIncAcum) {
        this.vlExcBcCusIncAcum = vlExcBcCusIncAcum;
    }
    
    /**
     * Obtém Valor da Base de Cálculo do Crédito sobre o Custo Incorrido, acumulado até o período da escrituração
     */
    public Double getVlBcCusInc() {
        return vlBcCusInc;
    }

    /**
     * Seta Valor da Base de Cálculo do Crédito sobre o Custo Incorrido, acumulado até o período da escrituração
     */
    public void setVlBcCusInc(Double vlBcCusInc) {
        this.vlBcCusInc = vlBcCusInc;
    }
    
    /**
     * Obtém CST do PIS/PASEP
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta CST do PIS/PASEP
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Alíquota do PIS/PASEP
     */
    public Double getAliqPis() {
        return aliqPis;
    }

    /**
     * Seta Alíquota do PIS/PASEP
     */
    public void setAliqPis(Double aliqPis) {
        this.aliqPis = aliqPis;
    }
    
    /**
     * Obtém Valor Total do Crédito Acumulado sobre o custo incorrido - PIS/PASEP
     */
    public Double getVlCredPisAcum() {
        return vlCredPisAcum;
    }

    /**
     * Seta Valor Total do Crédito Acumulado sobre o custo incorrido - PIS/PASEP
     */
    public void setVlCredPisAcum(Double vlCredPisAcum) {
        this.vlCredPisAcum = vlCredPisAcum;
    }
    
    /**
     * Obtém Parcela do crédito descontada até o período anterior da escrituração – PIS/PASEP (proporcional à receita recebida até o mês anterior)
     */
    public Double getVlCredPisDescAnt() {
        return vlCredPisDescAnt;
    }

    /**
     * Seta Parcela do crédito descontada até o período anterior da escrituração – PIS/PASEP (proporcional à receita recebida até o mês anterior)
     */
    public void setVlCredPisDescAnt(Double vlCredPisDescAnt) {
        this.vlCredPisDescAnt = vlCredPisDescAnt;
    }
    
    /**
     * Obtém Parcela a descontar no período da escrituração  – PIS/PASEP (proporcional à receita recebida no mês)
     */
    public Double getVlCredPisDesc() {
        return vlCredPisDesc;
    }

    /**
     * Seta Parcela a descontar no período da escrituração  – PIS/PASEP (proporcional à receita recebida no mês)
     */
    public void setVlCredPisDesc(Double vlCredPisDesc) {
        this.vlCredPisDesc = vlCredPisDesc;
    }
    
    /**
     * Obtém Parcela a descontar em períodos futuros - PIS/PASEP
     */
    public Double getVlCredPisDescFut() {
        return vlCredPisDescFut;
    }

    /**
     * Seta Parcela a descontar em períodos futuros - PIS/PASEP
     */
    public void setVlCredPisDescFut(Double vlCredPisDescFut) {
        this.vlCredPisDescFut = vlCredPisDescFut;
    }
    
    /**
     * Obtém CST da COFINS
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta CST da COFINS
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
    }
    
    /**
     * Obtém Alíquota da COFINS
     */
    public Double getAliqCofins() {
        return aliqCofins;
    }

    /**
     * Seta Alíquota da COFINS
     */
    public void setAliqCofins(Double aliqCofins) {
        this.aliqCofins = aliqCofins;
    }
    
    /**
     * Obtém Valor Total do Crédito Acumulado sobre o custo incorrido - COFINS
     */
    public Double getVlCredCofinsAcum() {
        return vlCredCofinsAcum;
    }

    /**
     * Seta Valor Total do Crédito Acumulado sobre o custo incorrido - COFINS
     */
    public void setVlCredCofinsAcum(Double vlCredCofinsAcum) {
        this.vlCredCofinsAcum = vlCredCofinsAcum;
    }
    
    /**
     * Obtém Parcela do crédito descontada até o período anterior da escrituração - COFINS (proporcional à receita recebida até o mês anterior)
     */
    public Double getVlCredCofinsDescAnt() {
        return vlCredCofinsDescAnt;
    }

    /**
     * Seta Parcela do crédito descontada até o período anterior da escrituração - COFINS (proporcional à receita recebida até o mês anterior)
     */
    public void setVlCredCofinsDescAnt(Double vlCredCofinsDescAnt) {
        this.vlCredCofinsDescAnt = vlCredCofinsDescAnt;
    }
    
    /**
     * Obtém Parcela a descontar no período da escrituração - COFINS (proporcional à receita recebida no mês)
     */
    public Double getVlCredCofinsDesc() {
        return vlCredCofinsDesc;
    }

    /**
     * Seta Parcela a descontar no período da escrituração - COFINS (proporcional à receita recebida no mês)
     */
    public void setVlCredCofinsDesc(Double vlCredCofinsDesc) {
        this.vlCredCofinsDesc = vlCredCofinsDesc;
    }
    
    /**
     * Obtém Parcela a descontar em períodos futuros - COFINS
     */
    public Double getVlCredCofinsDescFut() {
        return vlCredCofinsDescFut;
    }

    /**
     * Seta Parcela a descontar em períodos futuros - COFINS
     */
    public void setVlCredCofinsDescFut(Double vlCredCofinsDescFut) {
        this.vlCredCofinsDescFut = vlCredCofinsDescFut;
    }
    
    
}