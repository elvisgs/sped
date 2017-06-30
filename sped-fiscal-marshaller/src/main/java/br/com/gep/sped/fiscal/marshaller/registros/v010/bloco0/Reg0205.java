package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Alterações
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0205"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class Reg0205 extends Registro {

    /**
     * Descrição anterior do item
     */
    @Field(at = 2)
    private String descrAntItem;

    /**
     * Data inicial
     */
    @Field(at = 3)
    private Date dtIni;

    /**
     * Data final
     */
    @Field(at = 4)
    private Date dtFim;

    /**
     * Código anterior do item
     */
    @Field(at = 5)
    private String codAntItem;


}
