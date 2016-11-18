package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Resumo diário de CF-e por equipamento SAT-CF-e
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C890"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC890 extends Registro {

    /**
     * Código da situação Tributária
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
     * Valor da Operação
     */
    @Field(at = 5)
    private Double vlOpr;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 6)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 6)
    private Double vlIcms;

    /**
     * Código da observação do Lançamento Fiscal
     */
    @Field(at = 6)
    private String codObs;


}