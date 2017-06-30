package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Complemento Doc. Fiscal
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D370"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegD370 extends Registro {

    /**
     * Codigo do município de origem
     */
    @Field(at = 2)
    private String codMunOrig;

    /**
     * Valor da prestação de serviço
     */
    @Field(at = 3)
    private Double vlServ;

    /**
     * Quantidade de bilhetes
     */
    @Field(at = 4)
    private Integer qtdBilh;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 5)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 6)
    private Double vlIcms;


}
