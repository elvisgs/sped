package br.com.gep.sped.fiscal.marshaller.registros.bloco1;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Valores Declaratórios
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "1925"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class Reg1925 extends Registro {

    /**
     * Código informação adicional
     */
    @Field(at = 2)
    private String codInfAdic;

    /**
     * Valor referente à informação adicional
     */
    @Field(at = 3)
    private Double vlInfAdic;

    /**
     * Descrição complementar do ajuste
     */
    @Field(at = 4)
    private String descComplAj;


}