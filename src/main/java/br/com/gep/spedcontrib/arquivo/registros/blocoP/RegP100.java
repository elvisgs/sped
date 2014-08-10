package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * P100 - Contribuição Previdenciária sobre o valor da receita bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "P100")
})
public class RegP100 {
    
    @Field(at = 1)
    private Date dtIni;
    
    @Field(at = 2)
    private Date dtFim;
    
    @Field(at = 3)
    private Double vlRecTotEst;
    
    @Field(at = 4)
    private String codAtivEcon;
    
    @Field(at = 5)
    private Double vlRecAtivEstab;
    
    @Field(at = 6)
    private Double vlExc;
    
    @Field(at = 7)
    private Double vlBcCont;
    
    @Field(at = 8)
    private Double aliqCont;
    
    @Field(at = 9)
    private Double vlContApu;
    
    @Field(at = 10)
    private String codCta;
    
    @Field(at = 11)
    private String infoCompl;
    
    
    /**
     * Obtém Período de referencia da escrituração (MMAAAA)
     */
    public Date getDtIni() {
        return dtIni;
    }

    /**
     * Seta Período de referencia da escrituração (MMAAAA)
     */
    public void setDtIni(Date dtIni) {
        this.dtIni = dtIni;
    }
    
    /**
     * Obtém Período de referencia da escrituração (MMAAAA)
     */
    public Date getDtFim() {
        return dtFim;
    }

    /**
     * Seta Período de referencia da escrituração (MMAAAA)
     */
    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }
    
    /**
     * Obtém Valor da Receita Bruta Total do Estabelecimento no Período
     */
    public Double getVlRecTotEst() {
        return vlRecTotEst;
    }

    /**
     * Seta Valor da Receita Bruta Total do Estabelecimento no Período
     */
    public void setVlRecTotEst(Double vlRecTotEst) {
        this.vlRecTotEst = vlRecTotEst;
    }
    
    /**
     * Obtém Código indicador correspondente à atividade sujeita a incidência da Contribuição Previdenciária sobre a Receita Bruta
     */
    public String getCodAtivEcon() {
        return codAtivEcon;
    }

    /**
     * Seta Código indicador correspondente à atividade sujeita a incidência da Contribuição Previdenciária sobre a Receita Bruta
     */
    public void setCodAtivEcon(String codAtivEcon) {
        this.codAtivEcon = codAtivEcon;
    }
    
    /**
     * Obtém Valor da Receita Bruta Total do Estabelecimento Vinculada ao Código de Atividade
     */
    public Double getVlRecAtivEstab() {
        return vlRecAtivEstab;
    }

    /**
     * Seta Valor da Receita Bruta Total do Estabelecimento Vinculada ao Código de Atividade
     */
    public void setVlRecAtivEstab(Double vlRecAtivEstab) {
        this.vlRecAtivEstab = vlRecAtivEstab;
    }
    
    /**
     * Obtém Valor das Exclusões da Receita Bruta
     */
    public Double getVlExc() {
        return vlExc;
    }

    /**
     * Seta Valor das Exclusões da Receita Bruta
     */
    public void setVlExc(Double vlExc) {
        this.vlExc = vlExc;
    }
    
    /**
     * Obtém Valor da Base de Cálculo da Contribuição sobre o valor da Receita Bruta
     */
    public Double getVlBcCont() {
        return vlBcCont;
    }

    /**
     * Seta Valor da Base de Cálculo da Contribuição sobre o valor da Receita Bruta
     */
    public void setVlBcCont(Double vlBcCont) {
        this.vlBcCont = vlBcCont;
    }
    
    /**
     * Obtém Alíquota da Contribuição Previdenciária sobre a Receita Bruta
     */
    public Double getAliqCont() {
        return aliqCont;
    }

    /**
     * Seta Alíquota da Contribuição Previdenciária sobre a Receita Bruta
     */
    public void setAliqCont(Double aliqCont) {
        this.aliqCont = aliqCont;
    }
    
    /**
     * Obtém Valor da Contribuição Previdenciária corresponde à Receita Bruta da atividade/produto informado
     */
    public Double getVlContApu() {
        return vlContApu;
    }

    /**
     * Seta Valor da Contribuição Previdenciária corresponde à Receita Bruta da atividade/produto informado
     */
    public void setVlContApu(Double vlContApu) {
        this.vlContApu = vlContApu;
    }
    
    /**
     * Obtém Código da conta analítica contábil referente à Contribuição Previdenciária sobre o valor da Receita Bruta
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica contábil referente à Contribuição Previdenciária sobre o valor da Receita Bruta
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Informação complementar
     */
    public String getInfoCompl() {
        return infoCompl;
    }

    /**
     * Seta Informação complementar
     */
    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }
    
    
}