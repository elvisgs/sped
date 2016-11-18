package br.com.gep.sped.fiscal.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Consumo Específico Padronizado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0210"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg0210 extends Registro {

    /**
     * Código do item componente/insumo
     */
    @Field(at = 2)
    private String codItemComp;

    /**
     * Quantidade do item componente/insumo
     */
    @Field(at = 3)
    private Double qtdComp;

    /**
     * Perda/Quebra
     */
    @Field(at = 4)
    private Double perda;


}
