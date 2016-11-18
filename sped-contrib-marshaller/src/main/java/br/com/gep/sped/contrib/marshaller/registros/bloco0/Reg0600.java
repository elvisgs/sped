package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * 0600 - Centro de Custos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0600"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg0600 extends Registro {

    /**
     * Data da inclusão/alteração
     */
    @Field(at = 2)
    private Date dtAlt;

    /**
     * Código do centro de custos
     */
    @Field(at = 3)
    private String codCcus;

    /**
     * Nome do centro de custos
     */
    @Field(at = 4)
    private String ccus;


}