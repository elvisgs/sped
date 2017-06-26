package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Informações adicionais dos ajustes da apuração do ICMS diferencial de alíquota – UF origem/destino EC 87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E312"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegE312 extends Registro {

    /**
     * Número do documento de arrecadação estadual, se houver
     */
    @Field(at = 2)
    private String numDa;

    /**
     * Número do processo ao qual o ajuste está vinculado, se houver
     */
    @Field(at = 3)
    private String numProc;

    /**
     * Indicador da origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    @Field(at = 4)
    private String indProc;

    /**
     * Descrição resumida do processo que embasou o lançamento
     */
    @Field(at = 5)
    private String proc;

    /**
     * Descrição complementar
     */
    @Field(at = 6)
    private String txtCompl;


}