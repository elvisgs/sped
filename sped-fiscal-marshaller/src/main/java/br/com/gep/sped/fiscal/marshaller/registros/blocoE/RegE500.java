package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período de Apuração
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E500"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegE500 extends Registro {

    /**
     * Indicador de período
     * <p>0=Mensal;1=Decendial</p>
     */
    @Field(at = 2)
    private String indApur;

    /**
     * Data inicial apuração
     */
    @Field(at = 3)
    private Date dtIni;

    /**
     * Data final apuração
     */
    @Field(at = 4)
    private Date dtFin;


}