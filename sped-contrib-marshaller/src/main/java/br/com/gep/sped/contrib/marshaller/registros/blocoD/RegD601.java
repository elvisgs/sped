package br.com.gep.sped.contrib.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * D601 - Complemento da Operação - PIS/PASEP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D601"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegD601 extends Registro {

    /**
     * Código de classificação do item do serviço de comunicação ou de telecomunicação, conforme a Tabela 4.4.1
     */
    @Field(at = 2)
    private String codClass;

    /**
     * Valor acumulado do item
     */
    @Field(at = 3)
    private Double vlItem;

    /**
     * Valor acumulado dos descontos
     */
    @Field(at = 4)
    private Double vlDesc;

    /**
     * Código da Situação Tributária referente ao PIS/PASEP
     */
    @Field(at = 5)
    private String cstPis;

    /**
     * Valor da base de cálculo do PIS/PASEP
     */
    @Field(at = 6)
    private Double vlBcPis;

    /**
     * Alíquota do PIS/PASEP (em percentual)
     */
    @Field(at = 7)
    private Double aliqPis;

    /**
     * Valor do PIS/PASEP
     */
    @Field(at = 8)
    private Double vlPis;

    /**
     * Código da conta analítica contábil debitada/creditada
     */
    @Field(at = 9)
    private String codCta;


}