package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período de Apuração do ICMS/IPI
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K100"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegK100 extends Registro {

    /**
     * Data inicial
     */
    @Field(at = 2)
    private Date dtIni;

    /**
     * Data final
     */
    @Field(at = 3)
    private Date dtFin;


}