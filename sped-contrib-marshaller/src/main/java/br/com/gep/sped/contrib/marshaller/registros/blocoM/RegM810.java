package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M810 - Detalhamento das Receitas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M810"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegM810 extends Registro {

    /**
     * <html>Natureza da Receita, conforme relação constante nas Tabelas de Detalhamento da Natureza da Receita por Situação Tributária abaixo:<br/>- Tabela 4.3.10: Produtos Sujeitos à Incidência Monofásica da Contribuição Social - Alíquotas Diferenciadas (CST 04);<br/>- Tabela 4.3.12: Produtos Sujeitos à Substituição Tributária da Contribuição Social (CST 05);<br/>- Tabela 4.3.13: Produtos Sujeitos à Alíquota Zero da Contribuição Social (CST 06);<br/>- Tabela 4.3.14: Operações com Isenção da Contribuição Social (CST 07);<br/>- Tabela 4.3.15: Operações sem Incidência da Contribuição Social (CST 08);<br/>- Tabela 4.3.16: Operações com Suspensão da Contribuição Social (CST 09).</html>
     */
    @Field(at = 2)
    private String natRec;

    /**
     * Valor da receita bruta no período, relativo a natureza da receita (NAT_REC)
     */
    @Field(at = 3)
    private Double vlRec;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 4)
    private String codCta;

    /**
     * Descrição Complementar da Natureza da Receita
     */
    @Field(at = 5)
    private String descCompl;


}