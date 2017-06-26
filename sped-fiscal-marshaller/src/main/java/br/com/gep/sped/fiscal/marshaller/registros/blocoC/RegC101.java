package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Valor da obrigação recolhida ou a recolher - diferencial de alíquota - UF origem/destino EC87/15
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C101"),
    @Field(at = 5, name = "fimLinha")
})
@Getter
@Setter
public class RegC101 extends Registro {

    /**
     * Valor total relativo ao Fundo de Combate à Pobreza (FCP) da UF de destino se for operação de entrada ou da UF de origem de se for operação de saída
     */
    @Field(at = 2)
    private Double vlFcpUfDest;

    /**
     * Valor total do ICMS interestadual para a UF de destino
     */
    @Field(at = 3)
    private Double vlIcmsUfDest;

    /**
     * Valor total do ICMS interestadual para a UF do remetente
     */
    @Field(at = 4)
    private Double vlIcmsUfRem;


}