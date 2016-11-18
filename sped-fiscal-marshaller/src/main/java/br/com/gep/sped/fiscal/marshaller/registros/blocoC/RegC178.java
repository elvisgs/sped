package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * IPI por Unidade ou Qtde
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C178"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC178 extends Registro {

    /**
     * Classe de enquadramento do IPI
     */
    @Field(at = 2)
    private String clEnq;

    /**
     * Valor por unidade padrão
     */
    @Field(at = 3)
    private Double vlUnid;

    /**
     * Quantidade total na unidade padrão
     */
    @Field(at = 4)
    private Double quantPad;


}