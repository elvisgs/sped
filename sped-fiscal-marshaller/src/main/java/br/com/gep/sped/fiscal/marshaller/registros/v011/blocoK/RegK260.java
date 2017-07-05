package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Reprocessamento/Reparo de produto/insumo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K260"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegK260 extends Registro {

    /**
     * Código de identificação da ordem de produção, no reprocessamento, ou da ordem de serviço, no reparo
     */
    @Field(at = 2)
    private String codOpOs;

    /**
     * Código do produto/insumo a ser reprocessado/reparado ou já reprocessado/reparado (campo 02 do Registro 0200)
     */
    @Field(at = 3)
    private String codItem;

    /**
     * Data de saída do estoque
     */
    @Field(at = 4)
    private Date dtSaida;

    /**
     * Quantidade de saída do estoque
     */
    @Field(at = 5)
    private Double qtdSaida;

    /**
     * Data de retorno ao estoque (entrada)
     */
    @Field(at = 6)
    private Date dtRet;

    /**
     * Quantidade de retorno ao estoque (entrada)
     */
    @Field(at = 7)
    private Double qtdRet;


}
