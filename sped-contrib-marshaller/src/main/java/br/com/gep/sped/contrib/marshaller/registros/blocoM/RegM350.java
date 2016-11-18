package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M350 - PIS/PASEP - Folha de Salários
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M350"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegM350 extends Registro {

    /**
     * Valor Total da Folha de Salários
     */
    @Field(at = 2)
    private Double vlTotFol;

    /**
     * Valor Total das Exclusões à Base de Cálculo
     */
    @Field(at = 3)
    private Double vlExcBc;

    /**
     * Valor Total da Base de Cálculo
     */
    @Field(at = 4)
    private Double vlTotBc;

    /**
     * Alíquota do PIS/PASEP - Folha de Salários
     */
    @Field(at = 5)
    private Double aliqPisFol;

    /**
     * Valor Total da Contribuição Social sobre a Folha de Salários
     */
    @Field(at = 6)
    private Double vlTotContFol;


}