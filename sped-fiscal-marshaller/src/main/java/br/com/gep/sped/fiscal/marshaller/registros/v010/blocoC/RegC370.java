package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C370"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegC370 extends Registro {

    /**
     * Número Sequencial
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do Item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Unidade do item
     */
    @Field(at = 5)
    private String unid;

    /**
     * Valor total do item
     */
    @Field(at = 6)
    private Double vlItem;

    /**
     * Valor do desconto
     */
    @Field(at = 7)
    private Double vlDesc;


}
