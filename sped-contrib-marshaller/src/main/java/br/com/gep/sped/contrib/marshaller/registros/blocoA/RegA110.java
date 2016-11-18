package br.com.gep.sped.contrib.marshaller.registros.blocoA;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * A110 - Informação Complementar da NF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "A110"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegA110 extends Registro {

    /**
     * Codigo da informação complementar do documento fiscal (Campo 02 do Registro 0450)
     */
    @Field(at = 2)
    private String codInf;

    /**
     * Informação Complementar do Documento Fiscal
     */
    @Field(at = 3)
    private String txtCompl;


}