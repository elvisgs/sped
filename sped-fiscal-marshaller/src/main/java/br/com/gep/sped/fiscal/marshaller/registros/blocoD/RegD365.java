package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Totalizador Parcial
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D365"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegD365 extends Registro {

    /**
     * Código do totalizador
     */
    @Field(at = 2)
    private String codTotPar;

    /**
     * Valor acumulado no totalizador
     */
    @Field(at = 3)
    private Double vlrAcumTot;

    /**
     * Número do totalizador
     */
    @Field(at = 4)
    private String nrTot;

    /**
     * Descrição da situação tributária
     */
    @Field(at = 5)
    private String descrNrTot;


}