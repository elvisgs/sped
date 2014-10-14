package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M800 - Receitas Isentas ou Não Alcançadas pela Incidência da Contribuição ou Sujeitas à Alíquota Zero ou com Suspensão - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M800"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class RegM800 extends Registro {
    
    @Field(at = 2)
    private String cstCofins;
    
    @Field(at = 3)
    private Double vlTotRec;
    
    @Field(at = 4)
    private String codCta;
    
    @Field(at = 5)
    private String descCompl;
    
    
    /**
     * Obtém Código de Situação Tributária - CST das demais receitas auferidas no período, sem incidência da contribuição, ou sem contribuição apurada a pagar, conforme a Tabela 4.3.4.
     */
    public String getCstCofins() {
        return cstCofins;
    }

    /**
     * Seta Código de Situação Tributária - CST das demais receitas auferidas no período, sem incidência da contribuição, ou sem contribuição apurada a pagar, conforme a Tabela 4.3.4.
     */
    public void setCstCofins(String cstCofins) {
        this.cstCofins = cstCofins;
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