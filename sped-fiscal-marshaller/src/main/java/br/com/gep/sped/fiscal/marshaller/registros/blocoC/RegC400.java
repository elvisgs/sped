package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Equipamento ECF
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C400"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegC400 extends Registro {

    /**
     * Código do modelo
     * <p>02=Nota Fiscal de Venda a Consumidor;2D=Cupom Fiscal emitido por ECF;60=CF-e-ECF</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Modelo do equipamento
     */
    @Field(at = 3)
    private String ecfMod;

    /**
     * Número de série
     */
    @Field(at = 4)
    private String ecfFab;

    /**
     * Número do caixa
     */
    @Field(at = 5)
    private String ecfCx;


}