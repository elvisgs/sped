package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * P100 - Contribuição Previdenciária sobre o valor da receita bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P100"),
    @Field(at = 13, name = "fimLinha")
})
@Getter
@Setter
public class RegP100 extends Registro {

    /**
     * Período de referencia da escrituração (MMAAAA)
     */
    @Field(at = 2)
    private Date dtIni;

    /**
     * Período de referencia da escrituração (MMAAAA)
     */
    @Field(at = 3)
    private Date dtFim;

    /**
     * Valor da Receita Bruta Total do Estabelecimento no Período
     */
    @Field(at = 4)
    private Double vlRecTotEst;

    /**
     * Código indicador correspondente à atividade sujeita a incidência da Contribuição Previdenciária sobre a Receita Bruta
     */
    @Field(at = 5)
    private String codAtivEcon;

    /**
     * Valor da Receita Bruta Total do Estabelecimento Vinculada ao Código de Atividade
     */
    @Field(at = 6)
    private Double vlRecAtivEstab;

    /**
     * Valor das Exclusões da Receita Bruta
     */
    @Field(at = 7)
    private Double vlExc;

    /**
     * Valor da Base de Cálculo da Contribuição sobre o valor da Receita Bruta
     */
    @Field(at = 8)
    private Double vlBcCont;

    /**
     * Alíquota da Contribuição Previdenciária sobre a Receita Bruta
     */
    @Field(at = 9)
    private Double aliqCont;

    /**
     * Valor da Contribuição Previdenciária corresponde à Receita Bruta da atividade/produto informado
     */
    @Field(at = 10)
    private Double vlContApu;

    /**
     * Código da conta analítica contábil referente à Contribuição Previdenciária sobre o valor da Receita Bruta
     */
    @Field(at = 11)
    private String codCta;

    /**
     * Informação complementar
     */
    @Field(at = 12)
    private String infoCompl;


}