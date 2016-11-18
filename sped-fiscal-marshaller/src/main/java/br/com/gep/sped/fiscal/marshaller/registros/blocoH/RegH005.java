package br.com.gep.sped.fiscal.marshaller.registros.blocoH;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * TOTAIS DO INVENTÁRIO
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "H005"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegH005 extends Registro {

    /**
     * Data do inventário
     */
    @Field(at = 2)
    private Date dtInv;

    /**
     * Valor total do estoque
     */
    @Field(at = 3)
    private Double vlInv;

    /**
     * Informe o motivo do inventário
     * <p>01=No final no período;02=Na mudança de forma de tributação da mercadoria (ICMS);03=Na solicitação da baixa cadastral, paralisação temporária;04=Na alteração de regime de pagamento – condição do contribuinte;05=Por determinação dos fiscos</p>
     */
    @Field(at = 4)
    private String motInv;


}