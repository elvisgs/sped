package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D310"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegD310 extends Registro {

    /**
     * Código do município de origem
     */
    @Field(at = 2)
    private String codMunOrig;

    /**
     * Valor da prestação de serviço
     */
    @Field(at = 3)
    private Double vlServ;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 4)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 5)
    private Double vlIcms;


}
