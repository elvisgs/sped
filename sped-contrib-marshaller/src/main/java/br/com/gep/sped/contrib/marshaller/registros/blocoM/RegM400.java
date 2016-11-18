package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M400 - Receitas Isentas ou Não Alcançadas pela Incidência da Contribuição ou Sujeitas a Alíquota Zero ou com Suspensão - PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M400"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegM400 extends Registro {

    /**
     * Código de Situação Tributária - CST das demais receitas auferidas no período, sem incidência da contribuição, ou sem contribuição apurada a pagar, conforme a Tabela 4.3.3.
     */
    @Field(at = 2)
    private String cstPis;

    /**
     * Valor total da receita bruta no período.
     */
    @Field(at = 3)
    private Double vlTotRec;

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