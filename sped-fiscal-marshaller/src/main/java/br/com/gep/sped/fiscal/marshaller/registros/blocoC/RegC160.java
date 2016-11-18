package br.com.gep.sped.fiscal.marshaller.registros.blocoC;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * Vol. Transportado
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "C160"),
    @Field(at = 8, name = "fimLinha")
})
@Getter
@Setter
public class RegC160 extends Registro {

    /**
     * Código do participante
     */
    @Field(at = 2)
    private String codPart;

    /**
     * Placa do veículo
     */
    @Field(at = 3)
    private String veicId;

    /**
     * Quantidade de volumes
     */
    @Field(at = 4)
    private Integer qtdVol;

    /**
     * Peso bruto
     */
    @Field(at = 5)
    private Double pesoBrt;

    /**
     * Peso líquido
     */
    @Field(at = 6)
    private Double pesoLiq;

    /**
     * Sigla da UF da placa do veículo
     */
    @Field(at = 7)
    private String ufId;


}