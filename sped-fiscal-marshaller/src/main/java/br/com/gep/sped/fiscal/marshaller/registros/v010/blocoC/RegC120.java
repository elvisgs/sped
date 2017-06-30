package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Importação
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C120"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegC120 extends Registro {

    /**
     * Documento de importação
     * <p>0=Declaração de Importação;1=Declaração Simplificada de Importação</p>
     */
    @Field(at = 2)
    private String codDocImp;

    /**
     * Número do documento
     */
    @Field(at = 3)
    private String numDocImp;

    /**
     * Valor pago de PIS
     */
    @Field(at = 4)
    private Double pisImp;

    /**
     * Valor pago de COFINS
     */
    @Field(at = 5)
    private Double cofinsImp;

    /**
     * Número do Ato Concessório do regime Drawback
     */
    @Field(at = 6)
    private String numAcdraw;


}
