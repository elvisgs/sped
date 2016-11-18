package br.com.gep.sped.contrib.marshaller.registros.bloco0;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * 0145 - Regime de Apuração da Contribuiçao Previdenciária sobre a Receita Bruta
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "0145"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class Reg0145 extends Registro {

    /**
     * Código indicador da incidência tributária no período
     * <p>1=Contribuição Previdenciária apurada no período, exclusivamente com base na Receita Bruta;2=Contribuição Previdenciária apurada no período, com base na Receita Bruta e nas Remunerações pagas, conforme incisos I e III do art. 22 da Lei 8.212, de 1991</p>
     */
    @Field(at = 2)
    private String codIncTrib;

    /**
     * Valor da Receita Bruta Total da Pessoa Jurídica no Período
     */
    @Field(at = 3)
    private Double vlRecTot;

    /**
     * Valor da Receita Bruta da(s) Atividade(s) Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta
     */
    @Field(at = 4)
    private Double vlRecAtiv;

    /**
     * Valor da Receita Bruta da(s) Atividade(s) não Sujeita(s) à Contribuição Previdenciária sobre a Receita Bruta
     */
    @Field(at = 5)
    private Double vlRecDemaisAtiv;

    /**
     * Informação complementar
     */
    @Field(at = 6)
    private String infoCompl;


}