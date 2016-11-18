package br.com.gep.sped.fiscal.marshaller.registros.blocoD;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Complemento
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "D120"),
    @Field(at = 6, name = "fimLinha")
})
@Getter
@Setter
public class RegD120 extends Registro {

    /**
     * Código do município de origem
     */
    @Field(at = 2)
    private String codMunOrig;

    /**
     * Código do município de destino
     */
    @Field(at = 3)
    private String codMunDest;

    /**
     * Placa do veículo
     */
    @Field(at = 4)
    private String veicId;

    /**
     * Sigla da UF da placa do veículo
     */
    @Field(at = 5)
    private String ufId;


}