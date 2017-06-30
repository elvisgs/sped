package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Operações com Cartão de Crédito/Débito
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1600"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg1600 extends Registro {

    /**
     * Código do Participante
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Valores recebido com cartões de crédito
     */
    @Field(at = 3)
    private Double totCredito;

    /**
     * Valores recebidos com cartões de débito
     */
    @Field(at = 4)
    private Double totDebito;


}
