package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Identificação de Períodos Dispensados da Escrituração Fiscal Digital das Contribuições
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0120"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg0120 extends Registro {

    /**
     * Mês de referência do ano-calendário da escrituração, dispensada da entrega
     */
    @Field(at = 2)
    private String mesDispensa;

    /**
     * Informação complementar do registro
     */
    @Field(at = 3)
    private String infComp;


}