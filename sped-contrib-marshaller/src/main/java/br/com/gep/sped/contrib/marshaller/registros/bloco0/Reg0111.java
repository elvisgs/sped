package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0111 - Rateio de Créditos Comuns
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0111"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class Reg0111 extends Registro {

    /**
     * Receita Bruta Não-Cumulativa - Tributada no Mercado Interno
     */
    @Field(at = 2)
    private Double recBruNcumTribMi;

    /**
     * Receita Bruta Não-Cumulativa - Não Tributada no Mercado Interno
     */
    @Field(at = 3)
    private Double recBruNcumNtMi;

    /**
     * Receita Bruta Não Cumulativa - Exportação
     */
    @Field(at = 4)
    private Double recBruNcumExp;

    /**
     * Receita Bruta Cumulativa
     */
    @Field(at = 5)
    private Double recBruCum;

    /**
     * Receita Bruta Total
     */
    @Field(at = 6)
    private Double recBruTotal;


}