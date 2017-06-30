package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Industrialização em Terceiros – Insumos Consumidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K255"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegK255 extends Registro {

    /**
     * Data do reconhecimento do consumo do insumo
     */
    @Field(at = 2)
    private Date dtCons;

    /**
     * Código do insumo
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade de consumo do insumo
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Código do insumo que foi substituído, caso ocorra a substituição
     */
    @Field(at = 5)
    private String codInsSubst;


}
