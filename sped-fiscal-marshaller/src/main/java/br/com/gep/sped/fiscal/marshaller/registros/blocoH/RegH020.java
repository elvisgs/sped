package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * INFORMAÇÃO COMPLEMENTAR DO INVENTÁRIO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "H020"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegH020 extends Registro {

    /**
     * Código da Situação Tributária
     */
    @Field(at = 2)
    private String cstIcms;

    /**
     * Informe a base de cálculo do ICMS
     */
    @Field(at = 3)
    private Double blIcms;

    /**
     * Informe o valor do ICMS a ser debitado ou creditado
     */
    @Field(at = 4)
    private Double vlIcms;


}