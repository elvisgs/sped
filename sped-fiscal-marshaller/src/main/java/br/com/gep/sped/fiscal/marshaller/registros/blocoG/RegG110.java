package br.com.gep.sped.fiscal.marshaller.registros.blocoG;

import br.com.gep.sped.marshaller.common.Registro;
import lombok.Getter;
import lombok.Setter;
import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

import java.util.Date;

/**
 * ICMS – Ativo Permanente – CIAP
 */
@Record
@Fields({
    @Field(at = 0, name = "inicioLinha"),
    @Field(at = 1, name = "reg", rid = true, literal = "G110"),
    @Field(at = 11, name = "fimLinha")
})
@Getter
@Setter
public class RegG110 extends Registro {

    /**
     * Data inicial apuração
     */
    @Field(at = 2)
    private Date dtIni;

    /**
     * Data final apuração
     */
    @Field(at = 3)
    private Date dtFin;

    /**
     * Saldo inicial de ICMS do CIAP
     */
    @Field(at = 4)
    private Double saldoInIcms;

    /**
     * Somatório das parcelas de ICMS
     */
    @Field(at = 5)
    private Double somParc;

    /**
     * Valor do somatório das saídas tributadas/exportação
     */
    @Field(at = 6)
    private Double vlTribExp;

    /**
     * Valor total de saídas
     */
    @Field(at = 7)
    private Double vlTotal;

    /**
     * Índice de participação do somatório das saídas tributadas/exportação
     */
    @Field(at = 8)
    private Double indPerSai;

    /**
     * Parcela de ICMS a ser apropriada
     */
    @Field(at = 9)
    private Double icmsAprop;

    /**
     * Valor de outras parcelas
     */
    @Field(at = 10)
    private Double somIcmsOc;


}