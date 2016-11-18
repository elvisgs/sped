package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C110 - Informação Complementar da NF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C110"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegC110 extends Registro {

    /**
     * Código da informação complementar do documento fiscal (campo 02 do Registro 0450)
     */
    @Field(at = 2)
    private String codInf;

    /**
     * Descrição complementar do código de referência
     */
    @Field(at = 3)
    private String txtCompl;


}