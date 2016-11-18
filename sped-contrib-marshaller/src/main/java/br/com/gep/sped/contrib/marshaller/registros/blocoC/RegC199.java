package br.com.gep.sped.contrib.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * C199 - Operações de Importação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C199"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegC199 extends Registro {

    /**
     * Documento de importação
     * <p>0=Declaração de Importação;1=Declaração Simplificada de Importação</p>
     */
    @Field(at = 2)
    private String codDocImp;

    /**
     * Número do documento de Importação
     */
    @Field(at = 3)
    private String numDocImp;

    /**
     * Valor pago de PIS na importação
     */
    @Field(at = 4)
    private Double vlPisImp;

    /**
     * Valor pago de COFINS na importação
     */
    @Field(at = 5)
    private Double vlCofinsImp;

    /**
     * Número do Ato Concessório do regime Drawback
     */
    @Field(at = 6)
    private String numAcdraw;


}