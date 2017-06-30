package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Ajuste/Benefício/Incentivo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1921"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg1921 extends Registro {

    /**
     * Código do ajustes da Sub-apuração e dedução
     */
    @Field(at = 2)
    private String codAjApur;

    /**
     * Descrição complementar do ajuste da apuração
     */
    @Field(at = 3)
    private String descrComplAj;

    /**
     * Valor ajuste da apuração
     */
    @Field(at = 4)
    private Double vlAjApur;


}
