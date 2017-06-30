package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Natureza da Operação/Prestação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0400"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg0400 extends Registro {

    /**
     * Código da natureza da operação
     */
    @Field(at = 2)
    private String codNat;

    /**
     * Descrição da natureza
     */
    @Field(at = 3)
    private String descrNat;


}
