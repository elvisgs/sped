package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoE;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Ajuste/benefício/incentivo da apuração do ICMS diferencial de alíquota – UF origem/destino EC 87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "E311"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegE311 extends Registro {

    /**
     * Código do ajuste da apuração e dedução, conforme a tabela indicada no item 5.1.1
     */
    @Field(at = 2)
    private String codAjApur;

    /**
     * Descrição complementar do ajuste da apuração
     */
    @Field(at = 3)
    private String descrComplAj;

    /**
     * Valor do ajuste da apuração
     */
    @Field(at = 4)
    private Double vlAjApur;


}
