package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Desmontagem de Mercadoria - Item de Destino
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K215"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class RegK215 extends Registro {

    /**
     * Código do item de destino (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItemDest;

    /**
     * Quantidade de destino – entrada em estoque
     */
    @Field(at = 3)
    private Double qtdDes;


}
