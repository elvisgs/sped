package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.contrib.marshaller.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco I
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "I990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegI990 extends RegEncerramentoBlocoBase {
}