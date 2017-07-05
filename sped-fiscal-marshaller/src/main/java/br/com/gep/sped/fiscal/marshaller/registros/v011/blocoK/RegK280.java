package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Correção de Apontamento - Estoque Escriturado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K280"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegK280 extends Registro {

    /**
     * Data do estoque final escriturado que está sendo corrigido
     */
    @Field(at = 2)
    private Date dtEst;

    /**
     * Código do produto/insumo a ser reprocessado/reparado ou já reprocessado/reparado (campo 02 do Registro 0200)
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Quantidade de correção positiva de apontamento ocorrido em período de apuração anterior
     */
    @Field(at = 4)
    private Double qtdCorPos;

    /**
     * Quantidade de correção negativa de apontamento ocorrido em período de apuração anterior
     */
    @Field(at = 5)
    private Double qtdCorNeg;

    /**
     * Indicador do tipo de estoque
     * <p>0=Estoque de propriedade do informante e em seu poder;1=Estoque de propriedade do informante e em posse de terceiros;2=Estoque de propriedade de terceiros e em posse do informante</p>
     */
    @Field(at = 6)
    private String indEst;

    /**
     * Código do participante-fornecedor da mercadoria destinada à exportação (campo 02 do Registro 0150)
     */
    @Field(at = 7)
    private String codPart;


}
