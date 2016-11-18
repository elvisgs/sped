package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * DOCUMENTOS FISCAIS CANCELADOS/INUTILIZADOS
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1710"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg1710 extends Registro {

    /**
     * Dispositivo autorizado inicial
     */
    @Field(at = 2)
    private String numDocIni;

    /**
     * Dispositivo autorizado final
     */
    @Field(at = 3)
    private String numDocFin;


}
