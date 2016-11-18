package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0450 - Informação Complementar do DF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0450"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg0450 extends Registro {

    /**
     * Código da informação complementar do documento fiscal
     */
    @Field(at = 2)
    private String codInf;

    /**
     * Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo
     */
    @Field(at = 3)
    private String txt;


}