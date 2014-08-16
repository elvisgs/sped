package br.com.gep.spedcontrib.arquivo.registros.blocoD;

import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Encerramento do Bloco D
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "D990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegD990 extends RegEncerramentoBlocoBase {
}