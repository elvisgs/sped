package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Estoque Escriturado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K200"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegK200 extends Registro {

    /**
     * Data do estoque final
     */
    @Field(at = 2)
    private Date dtEst;

    /**
     * Código do item
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade em estoque
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Indicador do tipo de estoque
     * <p>0=Estoque de propriedade do informante e em seu poder;1=Estoque de propriedade do informante e em posse de terceiros;2=Estoque de propriedade de terceiros e em posse do informante</p>
     */
    @Field(at = 5)
    private String indEst;

    /**
     * Código do participante
     */
    @Field(at = 6)
    private String codPart;


}
