package br.com.gep.sped.fiscal.marshaller.registros.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Insumos Consumidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K235"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegK235 extends Registro {

    /**
     * Data de saída
     */
    @Field(at = 2)
    private Date dtSaida;

    /**
     * Código do item componente/insumo
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade consumida do item
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Código do insumo que foi substituído
     */
    @Field(at = 5)
    private String codInsSubst;


}