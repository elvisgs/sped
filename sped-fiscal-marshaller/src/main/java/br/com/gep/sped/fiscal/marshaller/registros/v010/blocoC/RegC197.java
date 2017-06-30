package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Outras Obrigações
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C197"),
    @Field(at = 9, name = "fimLinha")
})
@Getter
@Setter
public class RegC197 extends Registro {

    /**
     * Código do Ajuste
     */
    @Field(at = 2)
    private String codAj;

    /**
     * Descrição complementar do ajuste do documento fiscal
     */
    @Field(at = 3)
    private String descrComplAj;

    /**
     * Código do item
     */
    @Field(at = 4)
    private String codItem;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 5)
    private Double vlBcIcms;

    /**
     * Alíquota do ICMS(%)
     */
    @Field(at = 6)
    private Double aliqIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 7)
    private Double vlIcms;

    /**
     * Outros valores
     */
    @Field(at = 8)
    private Double vlOutros;


}
