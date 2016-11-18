package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * INVENTÁRIO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "H010"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegH010 extends Registro {

    /**
     * Código do item
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Unidade do item
     */
    @Field(at = 3)
    private String unid;

    /**
     * Quantidade do item
     */
    @Field(at = 4)
    private Double qtd;

    /**
     * Valor unitário do item
     */
    @Field(at = 5)
    private Double vlUnit;

    /**
     * Valor do item
     */
    @Field(at = 6)
    private Double vlItem;

    /**
     * Indicador de propriedade/posse
     * <p>0=Item de propriedade do informante e em seu poder;1=Item de propriedade do informante em posse de terceiros;2=Item de propriedade de terceiros em posse do informante</p>
     */
    @Field(at = 7)
    private String indProp;

    /**
     * Código do participante
     */
    @Field(at = 8)
    private String codPart;

    /**
     * Descrição complementar
     */
    @Field(at = 9)
    private String txtCompl;

    /**
     * Código da conta analítica
     */
    @Field(at = 10)
    private String codCta;

    /**
     * Valor do item para efeitos do Imposto de Renda
     */
    @Field(at = 11)
    private Double vlItemIr;


}
