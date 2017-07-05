package br.com.gep.sped.fiscal.marshaller.registros.v011.blocoK;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Correção de apontamento e retorno de insumos dos registros K215, K220, K235, K255 e K265
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "K275"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegK275 extends Registro {

    /**
     * Código da mercadoria (campo 02 do Registro 0200)
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Quantidade de correção positiva de apontamento ocorrido em período de apuração anterior
     */
    @Field(at = 3)
    private Double qtdCorPos;

    /**
     * Quantidade de correção negativa de apontamento ocorrido em período de apuração anterior
     */
    @Field(at = 4)
    private Double qtdCorNeg;

    /**
     * Código do insumo que foi substituído, caso ocorra a substituição, relativo aos Registros K235/K255 (campo 02 do Registro 0200)
     */
    @Field(at = 5)
    private String codInsSubst;


}
