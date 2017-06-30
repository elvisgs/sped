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
    @Field(at = 1, name = "reg", rid = true, literal = "D150"),
    @Field(at = 12, name = "fimLinha")
})
@Getter
@Setter
public class RegD150 extends Registro {

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
     * Identificação da aeronave
     */
    @Field(at = 4)
    private String veicId;

    /**
     * Número do vôo
     */
    @Field(at = 5)
    private Integer viagem;

    /**
     * Tipo de tarifa aplicada
     * <p>0=Exp;1=Enc;2=CI;9=Outra</p>
     */
    @Field(at = 6)
    private String indTfa;

    /**
     * Peso taxado
     */
    @Field(at = 7)
    private Double vlPesoTx;

    /**
     * Valor da taxa terrestre
     */
    @Field(at = 8)
    private Double vlTxTerr;

    /**
     * Valor da taxa de redespacho
     */
    @Field(at = 9)
    private Double vlTxRed;

    /**
     * Outros valores
     */
    @Field(at = 10)
    private Double vlOut;

    /**
     * Valor da taxa 'ad valorem'
     */
    @Field(at = 11)
    private Double vlTxAdv;


}
