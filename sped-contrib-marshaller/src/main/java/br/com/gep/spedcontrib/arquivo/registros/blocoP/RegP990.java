package br.com.gep.spedcontrib.arquivo.registros.blocoP;

import br.com.gep.spedcontrib.arquivo.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro de Encerramento do Bloco P
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "P990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegP990 extends RegEncerramentoBlocoBase {
}