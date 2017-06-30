package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D110"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegD110 extends Registro {

    /**
     * Número seqüencial do item
     */
    @Field(at = 2)
    private String numItem;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Valor do serviço
     */
    @Field(at = 4)
    private Double vlServ;

    /**
     * Outros valores
     */
    @Field(at = 5)
    private Double vlOut;


}
