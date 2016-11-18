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
    @Field(at = 1, name = "reg", rid = true, literal = "C470"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegC470 extends Registro {

    /**
     * Código do item
     */
    @Field(at = 2)
    private String codItem;

    /**
     * Quantidade do item
     */
    @Field(at = 3)
    private Double qtd;

    /**
     * Quantidade cancelada
     */
    @Field(at = 4)
    private Double qtdCanc;

    /**
     * Unidade do item
     */
    @Field(at = 5)
    private String unid;

    /**
     * Valor do item
     */
    @Field(at = 6)
    private Double vlItem;

    /**
     * CST/ICMS
     */
    @Field(at = 7)
    private String cstIcms;

    /**
     * CFOP
     */
    @Field(at = 8)
    private String cfop;

    /**
     * Carga tributária ICMS(%)
     */
    @Field(at = 9)
    private Double aliqIcms;

    /**
     * Valor do PIS
     */
    @Field(at = 10)
    private Double vlPis;

    /**
     * Valor da COFINS
     */
    @Field(at = 11)
    private Double vlCofins;


}