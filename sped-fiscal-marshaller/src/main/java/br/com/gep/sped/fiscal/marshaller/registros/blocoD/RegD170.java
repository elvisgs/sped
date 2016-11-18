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
    @Field(at = 1, name = "reg", rid = true, literal = "D170"),
    @Field(at = 15, name = "fimLinha")
})
@Getter
@Setter
public class RegD170 extends Registro {

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
     * Código do município de origem
     */
    @Field(at = 4)
    private String codMunOrig;

    /**
     * Código do município de destino
     */
    @Field(at = 5)
    private String codMunDest;

    /**
     * Registro do operador
     */
    @Field(at = 6)
    private String otm;

    /**
     * Natureza do frete
     * <p>0=Negociável;1=Não negociável</p>
     */
    @Field(at = 7)
    private String indNatFrt;

    /**
     * Valor líquido do frete
     */
    @Field(at = 8)
    private Double vlLiqFrt;

    /**
     * Valor do GRIS
     */
    @Field(at = 9)
    private Double vlGris;

    /**
     * Somatório valores de pedágio
     */
    @Field(at = 10)
    private Double vlPdg;

    /**
     * Outros valores
     */
    @Field(at = 11)
    private Double vlOut;

    /**
     * Valor total do frete
     */
    @Field(at = 12)
    private Double vlFrt;

    /**
     * Placa do veículo
     */
    @Field(at = 13)
    private String veicId;

    /**
     * Sigla da UF da placa do veículo
     */
    @Field(at = 14)
    private String ufId;


}