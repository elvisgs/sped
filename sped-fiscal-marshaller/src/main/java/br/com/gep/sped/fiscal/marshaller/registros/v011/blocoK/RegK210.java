package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Desmontagem de Mercadoria - Item de Origem
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K210"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegK210 extends Registro {

    /**
     * Data de início da ordem de serviço
     */
    @Field(at = 2)
    private Date dtIniOs;

    /**
     * Data de conclusão da ordem de serviço
     */
    @Field(at = 3)
    private Date dtFinOs;

    /**
     * Código de identificação da ordem de serviço
     */
    @Field(at = 4)
    private String codDocOs;

    /**
     * Código do item de origem (campo 02 do Registro 0200)
     */
    @Field(at = 5)
    private String codItemOri;

    /**
     * Quantidade de origem - saída do estoque
     */
    @Field(at = 6)
    private Double qtdOri;


}
