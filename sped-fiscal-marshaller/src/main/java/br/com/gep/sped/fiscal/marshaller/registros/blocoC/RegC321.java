package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Itens
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C321"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegC321 extends Registro {

    /**
     * Código do item
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Quantidade acumulada do item
     */
    @Field(at = 3)
    private Double qtd;

    /**
     * Unidade do item
     */
    @Field(at = 4)
    private String unid;

    /**
     * Valor acumulado do item
     */
    @Field(at = 5)
    private Double vlItem;

    /**
     * Valor do desconto
     */
    @Field(at = 6)
    private Double vlDesc;

    /**
     * Base de cálculo do ICMS
     */
    @Field(at = 7)
    private Double vlBcIcms;

    /**
     * Valor do ICMS
     */
    @Field(at = 8)
    private Double vlIcms;

    /**
     * Valor do PIS
     */
    @Field(at = 9)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 10)
    private Double vlCofins;


}