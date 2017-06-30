package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Período de apuração do ICMS diferencial de alíquota – UF origem/destino EC 87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E300"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegE300 extends Registro {

    /**
     * Sigla da unidade da federação a que se refere a apuração do ICMS DIFAL
     */
    @Field(at = 2)
    private String uf;

    /**
     * Data inicial a que a apuração se refere
     */
    @Field(at = 3)
    private Date dtIni;

    /**
     * Data final a que a apuração se refere
     */
    @Field(at = 4)
    private Date dtFin;


}
