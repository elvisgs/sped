package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M800 - Receitas Isentas ou Não Alcançadas pela Incidência da Contribuição ou Sujeitas à Alíquota Zero ou com Suspensão - COFINS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M800"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegM800 extends Registro {

    /**
     * Código de Situação Tributária - CST das demais receitas auferidas no período, sem incidência da contribuição, ou sem contribuição apurada a pagar, conforme a Tabela 4.3.4.
     */
    @Field(at = 2)
    private String cstCofins;

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
