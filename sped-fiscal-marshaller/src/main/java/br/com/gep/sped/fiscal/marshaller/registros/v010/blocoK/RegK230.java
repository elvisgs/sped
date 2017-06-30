package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Itens Produzidos
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K230"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegK230 extends Registro {

    /**
     * Data de início da ordem de produção
     */
    @Field(at = 2)
    private Date dtIniOp;

    /**
     * Data de conclusão da ordem de produção
     */
    @Field(at = 3)
    private Date dtFinOp;

    /**
     * Código de identificação da ordem de produção
     */
    @Field(at = 4)
    private String codDocOp;

    /**
     * Código do item produzido
     */
    @Field(at = 5)
    private String codItem;

    /**
     * Quantidade de produção acabada
     */
    @Field(at = 6)
    private Double qtdEnc;


}
