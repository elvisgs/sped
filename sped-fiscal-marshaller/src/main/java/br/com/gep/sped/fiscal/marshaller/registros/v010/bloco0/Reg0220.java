package br.com.gep.sped.fiscal.marshaller.registros.v010.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Fatores de Conversão de Unidades
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0220"),
    @Field(at = 4, name = "fimLinha")
})
@Getter
@Setter
public class Reg0220 extends Registro {

    /**
     * Unidade comercial
     */
    @Field(at = 2)
    private String unidConv;

    /**
     * Fator de conversão
     */
    @Field(at = 3)
    private Double fatConv;


}
