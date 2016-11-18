package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D350"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegD350 extends Registro {

    /**
     * Código do modelo
     * <p>2E=Bilhete de Passagem emitido por ECF;13=Bilhete de Passagem Rodoviário;14=Bilhete de Passagem Aquaviário;15=Bilhete de Passagem e Nota de Bagagem;16=Bilhete de Passagem Ferroviário</p>
     */
    @Field(at = 2)
    private String codMod;

    /**
     * Modelo do equipamento
     */
    @Field(at = 3)
    private String ecfMod;

    /**
     * Número série de fabricação
     */
    @Field(at = 4)
    private String ecfFab;

    /**
     * Número do caixa
     */
    @Field(at = 5)
    private String ecfCx;


}