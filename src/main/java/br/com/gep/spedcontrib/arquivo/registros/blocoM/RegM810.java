package br.com.gep.spedcontrib.arquivo.registros.blocoM;

import br.com.gep.spedcontrib.arquivo.registros.Registro;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M810 - Detalhamento das Receitas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M810"),
    @Field(at = 6, name = "fimLinha", literal = "")
})
public class RegM810 extends Registro {
    
    @Field(at = 2)
    private String natRec;
    
    @Field(at = 3)
    private Double vlRec;
    
    @Field(at = 4)
    private String codCta;
    
    @Field(at = 5)
    private String descCompl;
    
    
    /**
     * Obtém &lt;html&gt;Natureza da Receita, conforme relação constante nas Tabelas de Detalhamento da Natureza da Receita por Situação Tributária abaixo:&lt;br/&gt;- Tabela 4.3.10: Produtos Sujeitos à Incidência Monofásica da Contribuição Social - Alíquotas Diferenciadas (CST 04);&lt;br/&gt;- Tabela 4.3.12: Produtos Sujeitos à Substituição Tributária da Contribuição Social (CST 05);&lt;br/&gt;- Tabela 4.3.13: Produtos Sujeitos à Alíquota Zero da Contribuição Social (CST 06);&lt;br/&gt;- Tabela 4.3.14: Operações com Isenção da Contribuição Social (CST 07);&lt;br/&gt;- Tabela 4.3.15: Operações sem Incidência da Contribuição Social (CST 08);&lt;br/&gt;- Tabela 4.3.16: Operações com Suspensão da Contribuição Social (CST 09).&lt;/html&gt;
     */
    public String getNatRec() {
        return natRec;
    }

    /**
     * Seta &lt;html&gt;Natureza da Receita, conforme relação constante nas Tabelas de Detalhamento da Natureza da Receita por Situação Tributária abaixo:&lt;br/&gt;- Tabela 4.3.10: Produtos Sujeitos à Incidência Monofásica da Contribuição Social - Alíquotas Diferenciadas (CST 04);&lt;br/&gt;- Tabela 4.3.12: Produtos Sujeitos à Substituição Tributária da Contribuição Social (CST 05);&lt;br/&gt;- Tabela 4.3.13: Produtos Sujeitos à Alíquota Zero da Contribuição Social (CST 06);&lt;br/&gt;- Tabela 4.3.14: Operações com Isenção da Contribuição Social (CST 07);&lt;br/&gt;- Tabela 4.3.15: Operações sem Incidência da Contribuição Social (CST 08);&lt;br/&gt;- Tabela 4.3.16: Operações com Suspensão da Contribuição Social (CST 09).&lt;/html&gt;
     */
    public void setNatRec(String natRec) {
        this.natRec = natRec;
    }
    
    /**
     * Obtém Valor da receita bruta no período, relativo a natureza da receita (NAT_REC)
     */
    public Double getVlRec() {
        return vlRec;
    }

    /**
     * Seta Valor da receita bruta no período, relativo a natureza da receita (NAT_REC)
     */
    public void setVlRec(Double vlRec) {
        this.vlRec = vlRec;
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