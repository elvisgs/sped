package br.com.gep.sped.contrib.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 1800 - Incorporação Imobiliária - RET
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1800"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class Reg1800 extends Registro {

    /**
     * Empreendimento objeto de Incorporação Imobiliária, optante pelo RET.
     */
    @Field(at = 2)
    private String incImob;

    /**
     * Receitas recebidas pela incorporadora na venda das unidades imobiliárias que compõem a incorporação.
     */
    @Field(at = 3)
    private Double recRecebRet;

    /**
     * Receitas Financeiras e Variações Monetárias decorrentes das vendas submetidas ao RET.
     */
    @Field(at = 4)
    private Double recFinRet;

    /**
     * Base de Cálculo do Recolhimento Unificado
     */
    @Field(at = 5)
    private Double bcRet;

    /**
     * Alíquota do Recolhimento Unificado
     */
    @Field(at = 6)
    private Double aliqRet;

    /**
     * Valor do Recolhimento Unificado.
     */
    @Field(at = 7)
    private Double vlRecUni;

    /**
     * Data do recolhimento unificado
     */
    @Field(at = 8)
    private Date dtRecUni;

    /**
     * Código da Receita
     */
    @Field(at = 9)
    private String codRec;


}