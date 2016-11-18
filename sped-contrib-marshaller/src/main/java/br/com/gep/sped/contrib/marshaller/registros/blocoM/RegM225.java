package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * M225 - Detalhamento do Ajuste da Contribuição para o PIS/PASEP Apurada
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M225"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegM225 extends Registro {

    /**
     * Detalhamento do valor da contribuição reduzida ou acrescida,informado no Campo 03 (VL_AJ) do registro M220
     */
    @Field(at = 2)
    private Double detValorAj;

    /**
     * Código de Situação Tributária referente à operação detalhada neste registro
     */
    @Field(at = 3)
    private String cstPis;

    /**
     * Detalhamento da base de cálculo geradora de ajuste de contribuição
     */
    @Field(at = 4)
    private Double detBcCred;

    /**
     * Detalhamento da alíquota a que se refere o ajuste de contribuição
     */
    @Field(at = 5)
    private Double detAliq;

    /**
     * Data da operação a que se refere o ajuste informado neste registro
     */
    @Field(at = 6)
    private Date dtOperAj;

    /**
     * Descrição da(s) operação(ões) a que se refere o valor informado no Campo 02 (DET_VALOR_AJ)
     */
    @Field(at = 7)
    private String descAj;

    /**
     * Código da conta contábil debitada/creditada
     */
    @Field(at = 8)
    private String codCta;

    /**
     * Informação complementar
     */
    @Field(at = 9)
    private String infoCompl;


}