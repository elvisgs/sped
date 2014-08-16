package br.com.gep.spedcontrib.arquivo.registros.blocoA;

import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco A
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "A990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegA990 extends RegEncerramentoBlocoBase {
}