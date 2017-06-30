package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoD;

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
    @Field(at = 1, name = "reg", rid = true, literal = "D140"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegD140 extends Registro {

    /**
     * Código do participante consignatário
     */
    @Field(at = 2)
    private String codPartConsg;

    /**
     * Código do município de origem
     */
    @Field(at = 3)
    private String codMunOrig;

    /**
     * Código do município de destino
     */
    @Field(at = 4)
    private String codMunDest;

    /**
     * Tipo do veículo
     * <p>0=Embarcação;1=Empurrador/rebocador</p>
     */
    @Field(at = 5)
    private String indVeic;

    /**
     * Identificação da embarcação
     */
    @Field(at = 6)
    private String veicId;

    /**
     * Tipo da navegação
     * <p>0=Interior;1=Cabotagem</p>
     */
    @Field(at = 7)
    private String indNav;

    /**
     * Número da viagem
     */
    @Field(at = 8)
    private Integer viagem;

    /**
     * Valor líquido do frete
     */
    @Field(at = 9)
    private Double vlFrtLiq;

    /**
     * Valor das despesas portuárias
     */
    @Field(at = 10)
    private Double vlDespPort;

    /**
     * Valor despesas carga/descarga
     */
    @Field(at = 11)
    private Double vlDespCarDesc;

    /**
     * Outros valores
     */
    @Field(at = 12)
    private Double vlOut;

    /**
     * Valor bruto do frete
     */
    @Field(at = 13)
    private Double vlFrtBrt;

    /**
     * Valor adicional do frete - MM
     */
    @Field(at = 14)
    private Double vlFrtMm;


}
