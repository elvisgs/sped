package br.com.gep.sped.contrib.marshaller.registros.blocoP;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * P110 - Complemento da Escrituração - detalhamento da apuração da contribuição
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "P110"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegP110 extends Registro {

    /**
     * Informar o número do campo do registro “P100”
     * <p>04=Valor da Receita Bruta Total do Estabelecimento no Período;06=Valor da Receita Bruta Total do Estabelecimento;07=Valor das Exclusões da Receita Bruta;08=Valor da Base de Cálculo da Contribuição sobre o valor da Receita Bruta;10=Valor da Contribuição Previdenciária Devida sobre o valor da Receita Bruta</p>
     */
    @Field(at = 2)
    private String numCampo;

    /**
     * Código do tipo de detalhamento
     */
    @Field(at = 3)
    private String codDet;

    /**
     * Valor detalhado
     */
    @Field(at = 4)
    private Double detValor;

    /**
     * Informação Complementar
     */
    @Field(at = 5)
    private String infCompl;


}