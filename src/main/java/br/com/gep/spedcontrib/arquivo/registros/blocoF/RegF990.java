package br.com.gep.spedcontrib.arquivo.registros.blocoF;

import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco F
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "F990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegF990 extends RegEncerramentoBlocoBase {
}