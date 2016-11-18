package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Ressarcimento em ST
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C176"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegC176 extends Registro {

    /**
     * Código do modelo do documento
     * <p>01=Nota Fiscal;55=Nota Fiscal Eletrônica</p>
     */
    @Field(at = 2)
    private String codModUltE;

    /**
     * Número do documento
     */
    @Field(at = 3)
    private String numDocUltE;

    /**
     * Série
     */
    @Field(at = 4)
    private String serUltE;

    /**
     * Data da última entrada
     */
    @Field(at = 5)
    private Date dtUltE;

    /**
     * Código do participante
     */
    @Field(at = 6)
    private String codPartUltE;

    /**
     * Quantidade do item
     */
    @Field(at = 7)
    private Double quantUltE;

    /**
     * Valor unitário da mercadoria
     */
    @Field(at = 8)
    private Double vlUnitUltE;

    /**
     * Vr. unitário b. cálculo ICMS ST
     */
    @Field(at = 9)
    private Double vlUnitBcSt;


}