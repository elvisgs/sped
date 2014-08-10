package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M400 - Receitas Isentas ou Não Alcançadas pela Incidência da Contribuição ou Sujeitas a Alíquota Zero ou com Suspensão - PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "reg", rid = true, literal = "M400")
})
public class RegM400 {
    
    @Field(at = 1)
    private String cstPis;
    
    @Field(at = 2)
    private Double vlTotRec;
    
    @Field(at = 3)
    private String codCta;
    
    @Field(at = 4)
    private String descCompl;
    
    
    /**
     * Obtém Código de Situação Tributária - CST das demais receitas auferidas no período, sem incidência da contribuição, ou sem contribuição apurada a pagar, conforme a Tabela 4.3.3.
     */
    public String getCstPis() {
        return cstPis;
    }

    /**
     * Seta Código de Situação Tributária - CST das demais receitas auferidas no período, sem incidência da contribuição, ou sem contribuição apurada a pagar, conforme a Tabela 4.3.3.
     */
    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }
    
    /**
     * Obtém Valor total da receita bruta no período.
     */
    public Double getVlTotRec() {
        return vlTotRec;
    }

    /**
     * Seta Valor total da receita bruta no período.
     */
    public void setVlTotRec(Double vlTotRec) {
        this.vlTotRec = vlTotRec;
    }
    
    /**
     * Obtém Código da conta analítica contábil debitada/creditada
     */
    public String getCodCta() {
        return codCta;
    }

    /**
     * Seta Código da conta analítica contábil debitada/creditada
     */
    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }
    
    /**
     * Obtém Descrição Complementar da Natureza da Receita
     */
    public String getDescCompl() {
        return descCompl;
    }

    /**
     * Seta Descrição Complementar da Natureza da Receita
     */
    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
    }
    
    
}