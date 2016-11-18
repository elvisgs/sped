package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0400 - Natureza da Operação/Prestação
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
     * Código da natureza da operação/prestação
     */
    @Field(at = 2)
    private String codNat;

    /**
     * Descrição da natureza da operação/prestação
     */
    @Field(at = 3)
    private String descrNat;


}