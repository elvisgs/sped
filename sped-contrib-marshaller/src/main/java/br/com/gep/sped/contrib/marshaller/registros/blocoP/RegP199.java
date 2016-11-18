package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * P199 - Processo Referenciado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P199"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegP199 extends Registro {

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