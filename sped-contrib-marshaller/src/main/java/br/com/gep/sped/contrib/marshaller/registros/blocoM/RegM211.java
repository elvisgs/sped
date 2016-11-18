package br.com.gep.sped.contrib.marshaller.registros.blocoM;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

/**
 * M211 - Sociedades Cooperativas - Composição Da Base De Calculo
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "M211"),
    @Field(at = 7, name = "fimLinha")
})
@Getter
@Setter
public class RegM211 extends Registro {

    /**
     * Indicador do Tipo de Sociedade Cooperativa.
     * <p>01=Cooperativa de Produção Agropecuária;02=Cooperativa de Consumo;03=Cooperativa de Crédito;04=Cooperativa de Eletrificação Rural;05=Cooperativa de Transporte Rodoviário  de Cargas;06=Cooperativa de Médicos;99=Outras</p>
     */
    @Field(at = 2)
    private String indTipCoop;

    /**
     * Valor da Base de Cálculo da Contribuição, conforme Registros escriturados nos Blocos A, C, D e F, antes das Exclusões das Cooperativas
     */
    @Field(at = 3)
    private Double vlBcContAntExcCoop;

    /**
     * Valor de Exclusão Especifica das Cooperativas em Geral, decorrente das Sobras Apuradas na DRE, destinadas a constituição do Fundo de Reserva e do FATES.
     */
    @Field(at = 4)
    private Double vlExcCoopGer;

    /**
     * Valor das Exclusões da Base de Cálculo Especifica do Tipo da Sociedade Cooperativa, conforme Campo 02 (IND_TIP_COOP)
     */
    @Field(at = 5)
    private Double vlExcEspCoop;

    /**
     * Valor da Base de Cálculo, após as Exclusões Especificas da Sociedade Cooperativa (03 - 04 - 05) - Transportar para M210
     */
    @Field(at = 6)
    private Double vlBcCont;


}