package br.com.gep.sped.fiscal.marshaller.registros.v010.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * Outros créditos CIAP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G126"),
    @Field(at = 10, name = "fimLinha")
})
@Getter
@Setter
public class RegG126 extends Registro {

    /**
     * Data inicial da apuração
     */
    @Field(at = 2)
    private Date dtIni;

    /**
     * Data final da apuração
     */
    @Field(at = 3)
    private Date dtFin;

    /**
     * Número da parcela
     */
    @Field(at = 4)
    private String numParc;

    /**
     * Valor da parcela de ICMS passível de apropriação
     */
    @Field(at = 5)
    private Double vlParcPass;

    /**
     * Valor do somatório das saídas tributadas/exportação
     */
    @Field(at = 6)
    private Double vlTribOc;

    /**
     * Valor total de saídas
     */
    @Field(at = 7)
    private Double vlTotal;

    /**
     * Índice de participação do valor do somatório das saídas tributadas/exportação
     */
    @Field(at = 8)
    private Double indPerSai;

    /**
     * Valor da parcela apropriada de ICMS
     */
    @Field(at = 9)
    private Double vlParcAprop;


}
