package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Valores Agregados
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1400"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg1400 extends Registro {

    /**
     * Código do item
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Código do município de origem
     */
    @Field(at = 3)
    private String mun;

    /**
     * Valor mensal
     */
    @Field(at = 4)
    private Double valor;


}
