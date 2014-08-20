package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.contrib.marshaller.registros.RegEncerramentoBlocoBase;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Registro de Encerramento do Bloco M
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha", literal = ""),
    @Field(at = 1, name = "reg", rid = true, literal = "M990"),
    @Field(at = 3, name = "fimLinha", literal = "")
})
public class RegM990 extends RegEncerramentoBlocoBase {
}