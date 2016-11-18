package br.com.gep.sped.contrib.marshaller.registros.blocoI;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * I299 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "I299"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegI299 extends Registro {

    /**
     * Identificação do processo ou ato concessório
     */
    @Field(at = 2)
    private String numProc;

    /**
     * Indicador da origem do processo
     * <p>1=Justiça Federal;3=Secretaria da Receita Federal do Brasil;9=Outros</p>
     */
    @Field(at = 3)
    private String indProc;


}