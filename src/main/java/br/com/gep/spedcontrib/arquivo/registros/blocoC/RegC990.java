package br.com.gep.spedcontrib.arquivo.registros.blocoC;

import br.com.gep.spedcontrib.arquivo.registros.RegBase;
import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco C
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "C990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegC990 extends RegEncerramentoBlocoBase {
}