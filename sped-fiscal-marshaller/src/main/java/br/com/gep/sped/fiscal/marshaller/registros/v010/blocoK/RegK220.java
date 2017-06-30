package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Outras Movimentações Internas entre Mercadorias
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K220"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegK220 extends Registro {

    /**
     * Data da movimentação interna
     */
    @Field(at = 2)
    private Date dtMov;

    /**
     * Código do item de origem
     */
    @Field(at = 3)
    private String codItemOri;

    /**
     * Código do item de destino
     */
    @Field(at = 4)
    private String codItemDest;

    /**
     * Quantidade movimentadado item de origem
     */
    @Field(at = 5)
    private Double qtd;


}
