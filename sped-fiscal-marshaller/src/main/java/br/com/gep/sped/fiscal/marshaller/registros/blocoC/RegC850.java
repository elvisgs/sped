package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro Analitico do CF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C850"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC850 extends Registro {

    /**
     * Código da Situação Tributária
     */
    @Field(at = 2)
    private String cstIcms;

    /**
     * Código Fiscal de Operação e Prestação
     */
    @Field(at = 3)
    private String cfop;

    /**
     * Alíquota do ICMS
     */
    @Field(at = 4)
    private Double aliqIcms;

    /**
     * Valor da operação
     */
    @Field(at = 5)
    private Double vlOpr;

    /**
     * Base de Cálculo do ICMS
     */
    @Field(at = 6)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 7)
    private Double vlIcms;

    /**
     * Código da observação do lançamento fiscal (Campo 02 do regisro 0460)
     */
    @Field(at = 8)
    private String codObs;


}