package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Lacres
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1360"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg1360 extends Registro {

    /**
     * Número do lacre
     */
    @Field(at = 2)
    private String numLacre;

    /**
     * Data de aplicação
     */
    @Field(at = 3)
    private Date datAplicacao;


}
