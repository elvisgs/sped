package br.com.gep.spedcontrib.arquivo.registros.bloco1;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1800 - Incorporação Imobiliária - RET
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "1800")
})
public class Reg1800 {
    
    @Field(at = 1)
    private String incImob;
    
    @Field(at = 2)
    private Double recRecebRet;
    
    @Field(at = 3)
    private Double recFinRet;
    
    @Field(at = 4)
    private Double bcRet;
    
    @Field(at = 5)
    private Double aliqRet;
    
    @Field(at = 6)
    private Double vlRecUni;
    
    @Field(at = 7)
    private Date dtRecUni;
    
    @Field(at = 8)
    private String codRec;
    
    
    /**
     * Obtém Empreendimento objeto de Incorporação Imobiliária, optante pelo RET.
     */
    public String getIncImob() {
        return incImob;
    }

    /**
     * Seta Empreendimento objeto de Incorporação Imobiliária, optante pelo RET.
     */
    public void setIncImob(String incImob) {
        this.incImob = incImob;
    }
    
    /**
     * Obtém Receitas recebidas pela incorporadora na venda das unidades imobiliárias que compõem a incorporação.
     */
    public Double getRecRecebRet() {
        return recRecebRet;
    }

    /**
     * Seta Receitas recebidas pela incorporadora na venda das unidades imobiliárias que compõem a incorporação.
     */
    public void setRecRecebRet(Double recRecebRet) {
        this.recRecebRet = recRecebRet;
    }
    
    /**
     * Obtém Receitas Financeiras e Variações Monetárias decorrentes das vendas submetidas ao RET.
     */
    public Double getRecFinRet() {
        return recFinRet;
    }

    /**
     * Seta Receitas Financeiras e Variações Monetárias decorrentes das vendas submetidas ao RET.
     */
    public void setRecFinRet(Double recFinRet) {
        this.recFinRet = recFinRet;
    }
    
    /**
     * Obtém Base de Cálculo do Recolhimento Unificado
     */
    public Double getBcRet() {
        return bcRet;
    }

    /**
     * Seta Base de Cálculo do Recolhimento Unificado
     */
    public void setBcRet(Double bcRet) {
        this.bcRet = bcRet;
    }
    
    /**
     * Obtém Alíquota do Recolhimento Unificado
     */
    public Double getAliqRet() {
        return aliqRet;
    }

    /**
     * Seta Alíquota do Recolhimento Unificado
     */
    public void setAliqRet(Double aliqRet) {
        this.aliqRet = aliqRet;
    }
    
    /**
     * Obtém Valor do Recolhimento Unificado.
     */
    public Double getVlRecUni() {
        return vlRecUni;
    }

    /**
     * Seta Valor do Recolhimento Unificado.
     */
    public void setVlRecUni(Double vlRecUni) {
        this.vlRecUni = vlRecUni;
    }
    
    /**
     * Obtém Data do recolhimento unificado
     */
    public Date getDtRecUni() {
        return dtRecUni;
    }

    /**
     * Seta Data do recolhimento unificado
     */
    public void setDtRecUni(Date dtRecUni) {
        this.dtRecUni = dtRecUni;
    }
    
    /**
     * Obtém Código da Receita
     */
    public String getCodRec() {
        return codRec;
    }

    /**
     * Seta Código da Receita
     */
    public void setCodRec(String codRec) {
        this.codRec = codRec;
    }
    
    
}