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
    @Field(at = 1, name = "reg", rid = true, literal = "D130"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegD130 extends Registro {

    /**
     * Código do participante consignatário
     */
    @Field(at = 2)
    private String codPartConsg;

    /**
     * Código do participante redespachante
     */
    @Field(at = 3)
    private String codPartRed;

    /**
     * Tipo do frete - redespacho
     * <p>0=Sem redespacho;1=Por conta do emitente;2=Por conta do destinatário;9=Outros</p>
     */
    @Field(at = 4)
    private String indFrtRed;

    /**
     * Código do município de origem
     */
    @Field(at = 5)
    private String codMunOrig;

    /**
     * Código do município de destino
     */
    @Field(at = 6)
    private String codMunDest;

    /**
     * Placa do veículo
     */
    @Field(at = 7)
    private String veicId;

    /**
     * Valor líquido do frete
     */
    @Field(at = 8)
    private Double vlLiqFrt;

    /**
     * Soma de valores de SEC/CAT
     */
    @Field(at = 9)
    private Double vlSecCat;

    /**
     * Soma de valores de despacho
     */
    @Field(at = 10)
    private Double vlDesp;

    /**
     * Soma dos valores de pedágio
     */
    @Field(at = 11)
    private Double vlPedg;

    /**
     * Outros valores
     */
    @Field(at = 12)
    private Double vlOut;

    /**
     * Valor total do frete
     */
    @Field(at = 13)
    private Double vlFrt;

    /**
     * Sigla da UF da placa do veículo
     */
    @Field(at = 14)
    private String ufId;


}
