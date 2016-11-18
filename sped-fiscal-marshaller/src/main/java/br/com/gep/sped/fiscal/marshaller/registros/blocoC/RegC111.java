package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Processo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C111"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC111 extends Registro {

    /**
     * Identificação do processo
     */
    @Field(at = 2)
    private String numProc;

    /**
     * Origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;3=Secex/SRF;9=Outros</p>
     */
    @Field(at = 3)
    private String indProc;


}