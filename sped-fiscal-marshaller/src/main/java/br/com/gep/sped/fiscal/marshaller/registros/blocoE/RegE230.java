package br.com.gep.sped.fiscal.marshaller.registros.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Informação Adicional da Apuração ICMS-ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E230"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegE230 extends Registro {

    /**
     * Número doc arrecadação
     */
    @Field(at = 2)
    private String numDa;

    /**
     * Número do processo
     */
    @Field(at = 3)
    private String numProc;

    /**
     * Origem do processo
     * <p>0=Sefaz;1=Justiça Federal;2=Justiça Estadual;9=Outros</p>
     */
    @Field(at = 4)
    private String indProc;

    /**
     * Descrição resumida
     */
    @Field(at = 5)
    private String proc;

    /**
     * Descrição complementar
     */
    @Field(at = 6)
    private String txtCompl;


}