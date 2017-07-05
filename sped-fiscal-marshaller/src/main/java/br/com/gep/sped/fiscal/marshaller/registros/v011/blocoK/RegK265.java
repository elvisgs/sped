package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Reprocessamento/Reparo - mercadorias consumidas e/ou retornadas
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K265"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegK265 extends Registro {

    /**
     * Código do produto/insumo a ser reprocessado/reparado ou já reprocessado/reparado (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Quantidade consumida – saída do estoque
     */
    @Field(at = 3)
    private Double qtdCons;

    /**
     * Quantidade retornada – entrada em estoque
     */
    @Field(at = 4)
    private Double qtdRet;


}
